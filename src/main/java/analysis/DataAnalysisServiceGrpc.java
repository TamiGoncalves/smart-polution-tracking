package analysis;
import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.48.1)",
        comments = "Source: analysis.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataAnalysisServiceGrpc {

  private DataAnalysisServiceGrpc() {}

  public static final String SERVICE_NAME = "DataAnalysisService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Analysis.SensorData,
          Analysis.Empty> getReceiveSensorsDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ReceiveSensorsData",
          requestType = Analysis.SensorData.class,
          responseType = Analysis.Empty.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Analysis.SensorData,
          Analysis.Empty> getReceiveSensorsDataMethod() {
    io.grpc.MethodDescriptor<Analysis.SensorData, Analysis.Empty> getReceiveSensorsDataMethod;
    if ((getReceiveSensorsDataMethod = DataAnalysisServiceGrpc.getReceiveSensorsDataMethod) == null) {
      synchronized (DataAnalysisServiceGrpc.class) {
        if ((getReceiveSensorsDataMethod = DataAnalysisServiceGrpc.getReceiveSensorsDataMethod) == null) {
          DataAnalysisServiceGrpc.getReceiveSensorsDataMethod = getReceiveSensorsDataMethod =
                  io.grpc.MethodDescriptor.<Analysis.SensorData, Analysis.Empty>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReceiveSensorsData"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Analysis.SensorData.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Analysis.Empty.getDefaultInstance()))
                          .setSchemaDescriptor(new DataAnalysisServiceMethodDescriptorSupplier("ReceiveSensorsData"))
                          .build();
        }
      }
    }
    return getReceiveSensorsDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Analysis.EnvironmentalData,
          Analysis.Empty> getUpdateEnvironmentalPageMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UpdateEnvironmentalPage",
          requestType = Analysis.EnvironmentalData.class,
          responseType = Analysis.Empty.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Analysis.EnvironmentalData,
          Analysis.Empty> getUpdateEnvironmentalPageMethod() {
    io.grpc.MethodDescriptor<Analysis.EnvironmentalData, Analysis.Empty> getUpdateEnvironmentalPageMethod;
    if ((getUpdateEnvironmentalPageMethod = DataAnalysisServiceGrpc.getUpdateEnvironmentalPageMethod) == null) {
      synchronized (DataAnalysisServiceGrpc.class) {
        if ((getUpdateEnvironmentalPageMethod = DataAnalysisServiceGrpc.getUpdateEnvironmentalPageMethod) == null) {
          DataAnalysisServiceGrpc.getUpdateEnvironmentalPageMethod = getUpdateEnvironmentalPageMethod =
                  io.grpc.MethodDescriptor.<Analysis.EnvironmentalData, Analysis.Empty>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnvironmentalPage"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Analysis.EnvironmentalData.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Analysis.Empty.getDefaultInstance()))
                          .setSchemaDescriptor(new DataAnalysisServiceMethodDescriptorSupplier("UpdateEnvironmentalPage"))
                          .build();
        }
      }
    }
    return getUpdateEnvironmentalPageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Analysis.DataSensor,
          Analysis.SensorStatus> getUpdateSensorStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "UpdateSensorStatus",
          requestType = Analysis.DataSensor.class,
          responseType = Analysis.SensorStatus.class,
          methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Analysis.DataSensor,
          Analysis.SensorStatus> getUpdateSensorStatusMethod() {
    io.grpc.MethodDescriptor<Analysis.DataSensor, Analysis.SensorStatus> getUpdateSensorStatusMethod;
    if ((getUpdateSensorStatusMethod = DataAnalysisServiceGrpc.getUpdateSensorStatusMethod) == null) {
      synchronized (DataAnalysisServiceGrpc.class) {
        if ((getUpdateSensorStatusMethod = DataAnalysisServiceGrpc.getUpdateSensorStatusMethod) == null) {
          DataAnalysisServiceGrpc.getUpdateSensorStatusMethod = getUpdateSensorStatusMethod =
                  io.grpc.MethodDescriptor.<Analysis.DataSensor, Analysis.SensorStatus>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSensorStatus"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Analysis.DataSensor.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Analysis.SensorStatus.getDefaultInstance()))
                          .setSchemaDescriptor(new DataAnalysisServiceMethodDescriptorSupplier("UpdateSensorStatus"))
                          .build();
        }
      }
    }
    return getUpdateSensorStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataAnalysisServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceStub>() {
              @java.lang.Override
              public DataAnalysisServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new DataAnalysisServiceStub(channel, callOptions);
              }
            };
    return DataAnalysisServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataAnalysisServiceBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceBlockingStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceBlockingStub>() {
              @java.lang.Override
              public DataAnalysisServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new DataAnalysisServiceBlockingStub(channel, callOptions);
              }
            };
    return DataAnalysisServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataAnalysisServiceFutureStub newFutureStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceFutureStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceFutureStub>() {
              @java.lang.Override
              public DataAnalysisServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new DataAnalysisServiceFutureStub(channel, callOptions);
              }
            };
    return DataAnalysisServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DataAnalysisServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void receiveSensorsData(Analysis.SensorData request,
                                   io.grpc.stub.StreamObserver<Analysis.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveSensorsDataMethod(), responseObserver);
    }

    /**
     */
    public void updateEnvironmentalPage(Analysis.EnvironmentalData request,
                                        io.grpc.stub.StreamObserver<Analysis.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnvironmentalPageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Analysis.DataSensor> updateSensorStatus(
            io.grpc.stub.StreamObserver<Analysis.SensorStatus> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateSensorStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getReceiveSensorsDataMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      Analysis.SensorData,
                                      Analysis.Empty>(
                                      this, METHODID_RECEIVE_SENSORS_DATA)))
              .addMethod(
                      getUpdateEnvironmentalPageMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      Analysis.EnvironmentalData,
                                      Analysis.Empty>(
                                      this, METHODID_UPDATE_ENVIRONMENTAL_PAGE)))
              .addMethod(
                      getUpdateSensorStatusMethod(),
                      io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
                              new MethodHandlers<
                                      Analysis.DataSensor,
                                      Analysis.SensorStatus>(
                                      this, METHODID_UPDATE_SENSOR_STATUS)))
              .build();
    }
  }

  /**
   */
  public static final class DataAnalysisServiceStub extends io.grpc.stub.AbstractAsyncStub<DataAnalysisServiceStub> {
    private DataAnalysisServiceStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceStub(channel, callOptions);
    }

    /**
     */
    public void receiveSensorsData(Analysis.SensorData request,
                                   io.grpc.stub.StreamObserver<Analysis.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getReceiveSensorsDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnvironmentalPage(Analysis.EnvironmentalData request,
                                        io.grpc.stub.StreamObserver<Analysis.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getUpdateEnvironmentalPageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Analysis.DataSensor> updateSensorStatus(
            io.grpc.stub.StreamObserver<Analysis.SensorStatus> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
              getChannel().newCall(getUpdateSensorStatusMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class DataAnalysisServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataAnalysisServiceBlockingStub> {
    private DataAnalysisServiceBlockingStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceBlockingStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Analysis.Empty receiveSensorsData(Analysis.SensorData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getReceiveSensorsDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public Analysis.Empty updateEnvironmentalPage(Analysis.EnvironmentalData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getUpdateEnvironmentalPageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataAnalysisServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataAnalysisServiceFutureStub> {
    private DataAnalysisServiceFutureStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceFutureStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Analysis.Empty> receiveSensorsData(
            Analysis.SensorData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getReceiveSensorsDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Analysis.Empty> updateEnvironmentalPage(
            Analysis.EnvironmentalData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getUpdateEnvironmentalPageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECEIVE_SENSORS_DATA = 0;
  private static final int METHODID_UPDATE_ENVIRONMENTAL_PAGE = 1;
  private static final int METHODID_UPDATE_SENSOR_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataAnalysisServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataAnalysisServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECEIVE_SENSORS_DATA:
          serviceImpl.receiveSensorsData((Analysis.SensorData) request,
                  (io.grpc.stub.StreamObserver<Analysis.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_ENVIRONMENTAL_PAGE:
          serviceImpl.updateEnvironmentalPage((Analysis.EnvironmentalData) request,
                  (io.grpc.stub.StreamObserver<Analysis.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
            io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_SENSOR_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateSensorStatus(
                  (io.grpc.stub.StreamObserver<Analysis.SensorStatus>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataAnalysisServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataAnalysisServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Analysis.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataAnalysisService");
    }
  }

  private static final class DataAnalysisServiceFileDescriptorSupplier
          extends DataAnalysisServiceBaseDescriptorSupplier {
    DataAnalysisServiceFileDescriptorSupplier() {}
  }

  private static final class DataAnalysisServiceMethodDescriptorSupplier
          extends DataAnalysisServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataAnalysisServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataAnalysisServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new DataAnalysisServiceFileDescriptorSupplier())
                  .addMethod(getReceiveSensorsDataMethod())
                  .addMethod(getUpdateEnvironmentalPageMethod())
                  .addMethod(getUpdateSensorStatusMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
