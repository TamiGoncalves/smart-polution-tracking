package analysis;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

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


    public void startServer(String port) throws Exception{
        this.server = Grpc.newServerBuilderForPort(Integer.parseInt(port), InsecureServerCredentials.create())
                .addService(this)
                .build()
                .start();

    }

    private Server server;



    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
}
