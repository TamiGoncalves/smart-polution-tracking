package waterquality;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: waterquality.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WaterQualityServiceGrpc {

  private WaterQualityServiceGrpc() {}

  public static final String SERVICE_NAME = "WaterQualityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Waterquality.StartWaterQualityDataCollectionRequest,
      Waterquality.StartWaterQualityDataCollectionResponse> getStartWaterQualityDataCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartWaterQualityDataCollection",
      requestType = Waterquality.StartWaterQualityDataCollectionRequest.class,
      responseType = Waterquality.StartWaterQualityDataCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Waterquality.StartWaterQualityDataCollectionRequest,
      Waterquality.StartWaterQualityDataCollectionResponse> getStartWaterQualityDataCollectionMethod() {
    io.grpc.MethodDescriptor<Waterquality.StartWaterQualityDataCollectionRequest, Waterquality.StartWaterQualityDataCollectionResponse> getStartWaterQualityDataCollectionMethod;
    if ((getStartWaterQualityDataCollectionMethod = WaterQualityServiceGrpc.getStartWaterQualityDataCollectionMethod) == null) {
      synchronized (WaterQualityServiceGrpc.class) {
        if ((getStartWaterQualityDataCollectionMethod = WaterQualityServiceGrpc.getStartWaterQualityDataCollectionMethod) == null) {
          WaterQualityServiceGrpc.getStartWaterQualityDataCollectionMethod = getStartWaterQualityDataCollectionMethod =
              io.grpc.MethodDescriptor.<Waterquality.StartWaterQualityDataCollectionRequest, Waterquality.StartWaterQualityDataCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartWaterQualityDataCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Waterquality.StartWaterQualityDataCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Waterquality.StartWaterQualityDataCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WaterQualityServiceMethodDescriptorSupplier("StartWaterQualityDataCollection"))
              .build();
        }
      }
    }
    return getStartWaterQualityDataCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Waterquality.StopWaterQualityDataCollectionRequest,
      Waterquality.StopWaterQualityDataCollectionResponse> getStopWaterQualityDataCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopWaterQualityDataCollection",
      requestType = Waterquality.StopWaterQualityDataCollectionRequest.class,
      responseType = Waterquality.StopWaterQualityDataCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Waterquality.StopWaterQualityDataCollectionRequest,
      Waterquality.StopWaterQualityDataCollectionResponse> getStopWaterQualityDataCollectionMethod() {
    io.grpc.MethodDescriptor<Waterquality.StopWaterQualityDataCollectionRequest, Waterquality.StopWaterQualityDataCollectionResponse> getStopWaterQualityDataCollectionMethod;
    if ((getStopWaterQualityDataCollectionMethod = WaterQualityServiceGrpc.getStopWaterQualityDataCollectionMethod) == null) {
      synchronized (WaterQualityServiceGrpc.class) {
        if ((getStopWaterQualityDataCollectionMethod = WaterQualityServiceGrpc.getStopWaterQualityDataCollectionMethod) == null) {
          WaterQualityServiceGrpc.getStopWaterQualityDataCollectionMethod = getStopWaterQualityDataCollectionMethod =
              io.grpc.MethodDescriptor.<Waterquality.StopWaterQualityDataCollectionRequest, Waterquality.StopWaterQualityDataCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopWaterQualityDataCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Waterquality.StopWaterQualityDataCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Waterquality.StopWaterQualityDataCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WaterQualityServiceMethodDescriptorSupplier("StopWaterQualityDataCollection"))
              .build();
        }
      }
    }
    return getStopWaterQualityDataCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Waterquality.SendWaterQualityDataCollectionRequest,
      Waterquality.SendWaterQualityDataCollectionResponse> getSendWaterQualityDataCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendWaterQualityDataCollection",
      requestType = Waterquality.SendWaterQualityDataCollectionRequest.class,
      responseType = Waterquality.SendWaterQualityDataCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Waterquality.SendWaterQualityDataCollectionRequest,
      Waterquality.SendWaterQualityDataCollectionResponse> getSendWaterQualityDataCollectionMethod() {
    io.grpc.MethodDescriptor<Waterquality.SendWaterQualityDataCollectionRequest, Waterquality.SendWaterQualityDataCollectionResponse> getSendWaterQualityDataCollectionMethod;
    if ((getSendWaterQualityDataCollectionMethod = WaterQualityServiceGrpc.getSendWaterQualityDataCollectionMethod) == null) {
      synchronized (WaterQualityServiceGrpc.class) {
        if ((getSendWaterQualityDataCollectionMethod = WaterQualityServiceGrpc.getSendWaterQualityDataCollectionMethod) == null) {
          WaterQualityServiceGrpc.getSendWaterQualityDataCollectionMethod = getSendWaterQualityDataCollectionMethod =
              io.grpc.MethodDescriptor.<Waterquality.SendWaterQualityDataCollectionRequest, Waterquality.SendWaterQualityDataCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendWaterQualityDataCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Waterquality.SendWaterQualityDataCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Waterquality.SendWaterQualityDataCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WaterQualityServiceMethodDescriptorSupplier("SendWaterQualityDataCollection"))
              .build();
        }
      }
    }
    return getSendWaterQualityDataCollectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterQualityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterQualityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterQualityServiceStub>() {
        @Override
        public WaterQualityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterQualityServiceStub(channel, callOptions);
        }
      };
    return WaterQualityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterQualityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterQualityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterQualityServiceBlockingStub>() {
        @Override
        public WaterQualityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterQualityServiceBlockingStub(channel, callOptions);
        }
      };
    return WaterQualityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterQualityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterQualityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterQualityServiceFutureStub>() {
        @Override
        public WaterQualityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterQualityServiceFutureStub(channel, callOptions);
        }
      };
    return WaterQualityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * RPC for starting water quality data collection
     * </pre>
     */
    default void startWaterQualityDataCollection(Waterquality.StartWaterQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Waterquality.StartWaterQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartWaterQualityDataCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC for stopping water quality data collection
     * </pre>
     */
    default void stopWaterQualityDataCollection(Waterquality.StopWaterQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Waterquality.StopWaterQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopWaterQualityDataCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC for sending collected water quality data
     * </pre>
     */
    default void sendWaterQualityDataCollection(Waterquality.SendWaterQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Waterquality.SendWaterQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendWaterQualityDataCollectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WaterQualityService.
   */
  public static abstract class WaterQualityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return WaterQualityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WaterQualityService.
   */
  public static final class WaterQualityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WaterQualityServiceStub> {
    private WaterQualityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WaterQualityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterQualityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC for starting water quality data collection
     * </pre>
     */
    public void startWaterQualityDataCollection(Waterquality.StartWaterQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Waterquality.StartWaterQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartWaterQualityDataCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC for stopping water quality data collection
     * </pre>
     */
    public void stopWaterQualityDataCollection(Waterquality.StopWaterQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Waterquality.StopWaterQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopWaterQualityDataCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC for sending collected water quality data
     * </pre>
     */
    public void sendWaterQualityDataCollection(Waterquality.SendWaterQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Waterquality.SendWaterQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendWaterQualityDataCollectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WaterQualityService.
   */
  public static final class WaterQualityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WaterQualityServiceBlockingStub> {
    private WaterQualityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WaterQualityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterQualityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC for starting water quality data collection
     * </pre>
     */
    public Waterquality.StartWaterQualityDataCollectionResponse startWaterQualityDataCollection(Waterquality.StartWaterQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartWaterQualityDataCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC for stopping water quality data collection
     * </pre>
     */
    public Waterquality.StopWaterQualityDataCollectionResponse stopWaterQualityDataCollection(Waterquality.StopWaterQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopWaterQualityDataCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC for sending collected water quality data
     * </pre>
     */
    public Waterquality.SendWaterQualityDataCollectionResponse sendWaterQualityDataCollection(Waterquality.SendWaterQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendWaterQualityDataCollectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WaterQualityService.
   */
  public static final class WaterQualityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WaterQualityServiceFutureStub> {
    private WaterQualityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WaterQualityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterQualityServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC for starting water quality data collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Waterquality.StartWaterQualityDataCollectionResponse> startWaterQualityDataCollection(
        Waterquality.StartWaterQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartWaterQualityDataCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC for stopping water quality data collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Waterquality.StopWaterQualityDataCollectionResponse> stopWaterQualityDataCollection(
        Waterquality.StopWaterQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopWaterQualityDataCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC for sending collected water quality data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Waterquality.SendWaterQualityDataCollectionResponse> sendWaterQualityDataCollection(
        Waterquality.SendWaterQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendWaterQualityDataCollectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_WATER_QUALITY_DATA_COLLECTION = 0;
  private static final int METHODID_STOP_WATER_QUALITY_DATA_COLLECTION = 1;
  private static final int METHODID_SEND_WATER_QUALITY_DATA_COLLECTION = 2;

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
        case METHODID_START_WATER_QUALITY_DATA_COLLECTION:
          serviceImpl.startWaterQualityDataCollection((Waterquality.StartWaterQualityDataCollectionRequest) request,
              (io.grpc.stub.StreamObserver<Waterquality.StartWaterQualityDataCollectionResponse>) responseObserver);
          break;
        case METHODID_STOP_WATER_QUALITY_DATA_COLLECTION:
          serviceImpl.stopWaterQualityDataCollection((Waterquality.StopWaterQualityDataCollectionRequest) request,
              (io.grpc.stub.StreamObserver<Waterquality.StopWaterQualityDataCollectionResponse>) responseObserver);
          break;
        case METHODID_SEND_WATER_QUALITY_DATA_COLLECTION:
          serviceImpl.sendWaterQualityDataCollection((Waterquality.SendWaterQualityDataCollectionRequest) request,
              (io.grpc.stub.StreamObserver<Waterquality.SendWaterQualityDataCollectionResponse>) responseObserver);
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
          getStartWaterQualityDataCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Waterquality.StartWaterQualityDataCollectionRequest,
              Waterquality.StartWaterQualityDataCollectionResponse>(
                service, METHODID_START_WATER_QUALITY_DATA_COLLECTION)))
        .addMethod(
          getStopWaterQualityDataCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Waterquality.StopWaterQualityDataCollectionRequest,
              Waterquality.StopWaterQualityDataCollectionResponse>(
                service, METHODID_STOP_WATER_QUALITY_DATA_COLLECTION)))
        .addMethod(
          getSendWaterQualityDataCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Waterquality.SendWaterQualityDataCollectionRequest,
              Waterquality.SendWaterQualityDataCollectionResponse>(
                service, METHODID_SEND_WATER_QUALITY_DATA_COLLECTION)))
        .build();
  }

  private static abstract class WaterQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterQualityServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Waterquality.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterQualityService");
    }
  }

  private static final class WaterQualityServiceFileDescriptorSupplier
      extends WaterQualityServiceBaseDescriptorSupplier {
    WaterQualityServiceFileDescriptorSupplier() {}
  }

  private static final class WaterQualityServiceMethodDescriptorSupplier
      extends WaterQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterQualityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WaterQualityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterQualityServiceFileDescriptorSupplier())
              .addMethod(getStartWaterQualityDataCollectionMethod())
              .addMethod(getStopWaterQualityDataCollectionMethod())
              .addMethod(getSendWaterQualityDataCollectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
