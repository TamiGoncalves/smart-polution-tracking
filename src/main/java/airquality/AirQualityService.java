package airquality;

import airquality.AirQualityServiceGrpc;
import airquality.Airquality;
import io.grpc.stub.StreamObserver;
import session.Session;
import session.SessionManager;

import java.beans.beancontext.BeanContextServicesListener;
import java.util.HashMap;

public class AirQualityService extends AirQualityServiceGrpc.AirQualityServiceImplBase {
    SessionManager sessionManager;
    private ServiceListener serviceListener;


    public void setServiceListener(ServiceListener serviceListener) {
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
        // Generate sensor data

    }


    public AirQualityService() {
        super();
        sessionManager = SessionManager.getInstance();
    }
}
