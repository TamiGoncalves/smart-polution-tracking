package analysis;

import io.grpc.stub.StreamObserver;

public class AnalysisService extends DataAnalysisServiceGrpc.DataAnalysisServiceImplBase {
    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void receiveSensorsData(Analysis.SensorData request, StreamObserver<Analysis.Empty> responseObserver) {
        super.receiveSensorsData(request, responseObserver);
    }

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void updateEnvironmentalPage(Analysis.EnvironmentalData request, StreamObserver<Analysis.Empty> responseObserver) {
        super.updateEnvironmentalPage(request, responseObserver);
    }

    /**
     * @param responseObserver
     */
    @Override
    public StreamObserver<Analysis.DataSensor> updateSensorStatus(StreamObserver<Analysis.SensorStatus> responseObserver) {
        return super.updateSensorStatus(responseObserver);
    }
}
