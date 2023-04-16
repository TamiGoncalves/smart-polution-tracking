package waterquality;

import hooks.ServiceEventListener;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import session.SessionManager;

import java.util.concurrent.TimeUnit;

public class WaterQualityService extends WaterQualityServiceGrpc.WaterQualityServiceImplBase{
    SessionManager sessionManager;


    private ServiceEventListener serviceListener;

    public void setServiceListener(ServiceEventListener serviceListener) {
        this.serviceListener = serviceListener;
    }
    @Override
    public void startWaterQualityDataCollection(Waterquality.StartWaterQualityDataCollectionRequest request, StreamObserver<Waterquality.StartWaterQualityDataCollectionResponse> responseObserver) {
        super.startWaterQualityDataCollection(request, responseObserver);
        // Generate new session
        String sessionId = sessionManager.generateNewSession(request.getLocationId());
        Waterquality.StartWaterQualityDataCollectionResponse.Builder responseBuilder = Waterquality.StartWaterQualityDataCollectionResponse.newBuilder().setSessionId(sessionId);
        // Serialise data
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void stopWaterQualityDataCollection(Waterquality.StopWaterQualityDataCollectionRequest request, StreamObserver<Waterquality.StopWaterQualityDataCollectionResponse> responseObserver) {
        super.stopWaterQualityDataCollection(request, responseObserver);
        sessionManager.stopSession(request.getSessionId());
        // Get removal status
        boolean statusSuccess = sessionManager.stopSession(request.getSessionId());
        Waterquality.StopWaterQualityDataCollectionResponse.Builder responseBuilder = Waterquality.StopWaterQualityDataCollectionResponse.newBuilder().setSuccess(statusSuccess);
        // Serialise data
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void sendWaterQualityDataCollection(Waterquality.SendWaterQualityDataCollectionRequest request, StreamObserver<Waterquality.SendWaterQualityDataCollectionResponse> responseObserver) {
        super.sendWaterQualityDataCollection(request, responseObserver);
        // Generate sensor data
        Waterquality.SendWaterQualityDataCollectionResponse.Builder responseBuilder = Waterquality.SendWaterQualityDataCollectionResponse.newBuilder().setSuccess(true);
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }


    public WaterQualityService() {
        super();
        sessionManager = SessionManager.getInstance();
    }

    Server server;

    public void startServer(String port) throws Exception{
        this.server = Grpc.newServerBuilderForPort(Integer.parseInt(port), InsecureServerCredentials.create())
                .addService(this)
                .build()
                .start();

    }


    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
}
