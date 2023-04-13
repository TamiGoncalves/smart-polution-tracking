package analysis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: analysis.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataAnalysisServiceGrpc {

  private DataAnalysisServiceGrpc() {}

  public static final String SERVICE_NAME = "DataAnalysisService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Analysis.SensorData,
      Analysis.AnalysisResult> getReceiveSensorsDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveSensorsData",
      requestType = Analysis.SensorData.class,
      responseType = Analysis.AnalysisResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Analysis.SensorData,
      Analysis.AnalysisResult> getReceiveSensorsDataMethod() {
    io.grpc.MethodDescriptor<Analysis.SensorData, Analysis.AnalysisResult> getReceiveSensorsDataMethod;
    if ((getReceiveSensorsDataMethod = DataAnalysisServiceGrpc.getReceiveSensorsDataMethod) == null) {
      synchronized (DataAnalysisServiceGrpc.class) {
        if ((getReceiveSensorsDataMethod = DataAnalysisServiceGrpc.getReceiveSensorsDataMethod) == null) {
          DataAnalysisServiceGrpc.getReceiveSensorsDataMethod = getReceiveSensorsDataMethod =
              io.grpc.MethodDescriptor.<Analysis.SensorData, Analysis.AnalysisResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReceiveSensorsData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Analysis.SensorData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Analysis.AnalysisResult.getDefaultInstance()))
              .setSchemaDescriptor(new DataAnalysisServiceMethodDescriptorSupplier("ReceiveSensorsData"))
              .build();
        }
      }
    }
    return getReceiveSensorsDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataAnalysisServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceStub>() {
        @Override
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
        @Override
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
        @Override
        public DataAnalysisServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataAnalysisServiceFutureStub(channel, callOptions);
        }
      };
    return DataAnalysisServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void receiveSensorsData(Analysis.SensorData request,
        io.grpc.stub.StreamObserver<Analysis.AnalysisResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveSensorsDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataAnalysisService.
   */
  public static abstract class DataAnalysisServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataAnalysisServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataAnalysisService.
   */
  public static final class DataAnalysisServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataAnalysisServiceStub> {
    private DataAnalysisServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataAnalysisServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceStub(channel, callOptions);
    }

    /**
     */
    public void receiveSensorsData(Analysis.SensorData request,
        io.grpc.stub.StreamObserver<Analysis.AnalysisResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReceiveSensorsDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataAnalysisService.
   */
  public static final class DataAnalysisServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataAnalysisServiceBlockingStub> {
    private DataAnalysisServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataAnalysisServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Analysis.AnalysisResult receiveSensorsData(Analysis.SensorData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiveSensorsDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataAnalysisService.
   */
  public static final class DataAnalysisServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataAnalysisServiceFutureStub> {
    private DataAnalysisServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataAnalysisServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Analysis.AnalysisResult> receiveSensorsData(
        Analysis.SensorData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReceiveSensorsDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECEIVE_SENSORS_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECEIVE_SENSORS_DATA:
          serviceImpl.receiveSensorsData((Analysis.SensorData) request,
              (io.grpc.stub.StreamObserver<Analysis.AnalysisResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReceiveSensorsDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Analysis.SensorData,
              Analysis.AnalysisResult>(
                service, METHODID_RECEIVE_SENSORS_DATA)))
        .build();
  }

  private static abstract class DataAnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataAnalysisServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Analysis.getDescriptor();
    }

    @Override
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

    @Override
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
              .build();
        }
      }
    }
    return result;
  }
}
