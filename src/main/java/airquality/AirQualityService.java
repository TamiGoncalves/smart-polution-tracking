package airquality;

import hooks.ServiceEventListener;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import session.SessionManager;

import java.util.concurrent.TimeUnit;

public class AirQualityService extends AirQualityServiceGrpc.AirQualityServiceImplBase {
    SessionManager sessionManager;
    private ServiceEventListener serviceListener;
    private Server server;


    public void setServiceListener(ServiceEventListener serviceListener) {
        this.serviceListener = serviceListener;
    }

    @Override
    public void startAirQualityDataCollection(Airquality.StartAirQualityDataCollectionRequest request, StreamObserver<Airquality.StartAirQualityDataCollectionResponse> responseObserver) {
        super.startAirQualityDataCollection(request, responseObserver);
        // Generate new session
        String sessionId = sessionManager.generateNewSession(request.getLocationId());
        Airquality.StartAirQualityDataCollectionResponse.Builder responseBuilder = Airquality.StartAirQualityDataCollectionResponse.newBuilder().setSessionId(sessionId);
        // Serialise data
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void stopAirQualityDataCollection(Airquality.StopAirQualityDataCollectionRequest request, StreamObserver<Airquality.StopAirQualityDataCollectionResponse> responseObserver) {
        super.stopAirQualityDataCollection(request, responseObserver);
        sessionManager.stopSession(request.getSessionId());
        // Get removal status
        boolean statusSuccess = sessionManager.stopSession(request.getSessionId());
        Airquality.StopAirQualityDataCollectionResponse.Builder responseBuilder = Airquality.StopAirQualityDataCollectionResponse.newBuilder().setSuccess(statusSuccess);
        // Serialise data
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void sendAirQualityDataCollection(Airquality.SendAirQualityDataCollectionRequest request, StreamObserver<Airquality.SendAirQualityDataCollectionResponse> responseObserver) {
        super.sendAirQualityDataCollection(request, responseObserver);
        // Send data to sensor

    }


    public AirQualityService() {
        super();
        sessionManager = SessionManager.getInstance();
    }

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
