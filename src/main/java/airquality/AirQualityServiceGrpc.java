package airquality;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: airquality.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AirQualityServiceGrpc {

  private AirQualityServiceGrpc() {}

  public static final String SERVICE_NAME = "airquality.AirQualityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Airquality.StartAirQualityDataCollectionRequest,
      Airquality.StartAirQualityDataCollectionResponse> getStartAirQualityDataCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartAirQualityDataCollection",
      requestType = Airquality.StartAirQualityDataCollectionRequest.class,
      responseType = Airquality.StartAirQualityDataCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Airquality.StartAirQualityDataCollectionRequest,
      Airquality.StartAirQualityDataCollectionResponse> getStartAirQualityDataCollectionMethod() {
    io.grpc.MethodDescriptor<Airquality.StartAirQualityDataCollectionRequest, Airquality.StartAirQualityDataCollectionResponse> getStartAirQualityDataCollectionMethod;
    if ((getStartAirQualityDataCollectionMethod = AirQualityServiceGrpc.getStartAirQualityDataCollectionMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getStartAirQualityDataCollectionMethod = AirQualityServiceGrpc.getStartAirQualityDataCollectionMethod) == null) {
          AirQualityServiceGrpc.getStartAirQualityDataCollectionMethod = getStartAirQualityDataCollectionMethod =
              io.grpc.MethodDescriptor.<Airquality.StartAirQualityDataCollectionRequest, Airquality.StartAirQualityDataCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartAirQualityDataCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Airquality.StartAirQualityDataCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Airquality.StartAirQualityDataCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("StartAirQualityDataCollection"))
              .build();
        }
      }
    }
    return getStartAirQualityDataCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Airquality.StopAirQualityDataCollectionRequest,
      Airquality.StopAirQualityDataCollectionResponse> getStopAirQualityDataCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopAirQualityDataCollection",
      requestType = Airquality.StopAirQualityDataCollectionRequest.class,
      responseType = Airquality.StopAirQualityDataCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Airquality.StopAirQualityDataCollectionRequest,
      Airquality.StopAirQualityDataCollectionResponse> getStopAirQualityDataCollectionMethod() {
    io.grpc.MethodDescriptor<Airquality.StopAirQualityDataCollectionRequest, Airquality.StopAirQualityDataCollectionResponse> getStopAirQualityDataCollectionMethod;
    if ((getStopAirQualityDataCollectionMethod = AirQualityServiceGrpc.getStopAirQualityDataCollectionMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getStopAirQualityDataCollectionMethod = AirQualityServiceGrpc.getStopAirQualityDataCollectionMethod) == null) {
          AirQualityServiceGrpc.getStopAirQualityDataCollectionMethod = getStopAirQualityDataCollectionMethod =
              io.grpc.MethodDescriptor.<Airquality.StopAirQualityDataCollectionRequest, Airquality.StopAirQualityDataCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopAirQualityDataCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Airquality.StopAirQualityDataCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Airquality.StopAirQualityDataCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("StopAirQualityDataCollection"))
              .build();
        }
      }
    }
    return getStopAirQualityDataCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Airquality.SendAirQualityDataCollectionRequest,
      Airquality.SendAirQualityDataCollectionResponse> getSendAirQualityDataCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAirQualityDataCollection",
      requestType = Airquality.SendAirQualityDataCollectionRequest.class,
      responseType = Airquality.SendAirQualityDataCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Airquality.SendAirQualityDataCollectionRequest,
      Airquality.SendAirQualityDataCollectionResponse> getSendAirQualityDataCollectionMethod() {
    io.grpc.MethodDescriptor<Airquality.SendAirQualityDataCollectionRequest, Airquality.SendAirQualityDataCollectionResponse> getSendAirQualityDataCollectionMethod;
    if ((getSendAirQualityDataCollectionMethod = AirQualityServiceGrpc.getSendAirQualityDataCollectionMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getSendAirQualityDataCollectionMethod = AirQualityServiceGrpc.getSendAirQualityDataCollectionMethod) == null) {
          AirQualityServiceGrpc.getSendAirQualityDataCollectionMethod = getSendAirQualityDataCollectionMethod =
              io.grpc.MethodDescriptor.<Airquality.SendAirQualityDataCollectionRequest, Airquality.SendAirQualityDataCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendAirQualityDataCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Airquality.SendAirQualityDataCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Airquality.SendAirQualityDataCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("SendAirQualityDataCollection"))
              .build();
        }
      }
    }
    return getSendAirQualityDataCollectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirQualityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AirQualityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AirQualityServiceStub>() {
        @Override
        public AirQualityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AirQualityServiceStub(channel, callOptions);
        }
      };
    return AirQualityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirQualityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AirQualityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AirQualityServiceBlockingStub>() {
        @Override
        public AirQualityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AirQualityServiceBlockingStub(channel, callOptions);
        }
      };
    return AirQualityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirQualityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AirQualityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AirQualityServiceFutureStub>() {
        @Override
        public AirQualityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AirQualityServiceFutureStub(channel, callOptions);
        }
      };
    return AirQualityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void startAirQualityDataCollection(Airquality.StartAirQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Airquality.StartAirQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartAirQualityDataCollectionMethod(), responseObserver);
    }

    /**
     */
    default void stopAirQualityDataCollection(Airquality.StopAirQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Airquality.StopAirQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopAirQualityDataCollectionMethod(), responseObserver);
    }

    /**
     */
    default void sendAirQualityDataCollection(Airquality.SendAirQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Airquality.SendAirQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendAirQualityDataCollectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service airquality.AirQualityService.
   */
  public static abstract class AirQualityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return AirQualityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service airquality.AirQualityService.
   */
  public static final class AirQualityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AirQualityServiceStub> {
    private AirQualityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AirQualityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AirQualityServiceStub(channel, callOptions);
    }

    /**
     */
    public void startAirQualityDataCollection(Airquality.StartAirQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Airquality.StartAirQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartAirQualityDataCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopAirQualityDataCollection(Airquality.StopAirQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Airquality.StopAirQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopAirQualityDataCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendAirQualityDataCollection(Airquality.SendAirQualityDataCollectionRequest request,
        io.grpc.stub.StreamObserver<Airquality.SendAirQualityDataCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendAirQualityDataCollectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service airquality.AirQualityService.
   */
  public static final class AirQualityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AirQualityServiceBlockingStub> {
    private AirQualityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AirQualityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AirQualityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Airquality.StartAirQualityDataCollectionResponse startAirQualityDataCollection(Airquality.StartAirQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartAirQualityDataCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public Airquality.StopAirQualityDataCollectionResponse stopAirQualityDataCollection(Airquality.StopAirQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopAirQualityDataCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public Airquality.SendAirQualityDataCollectionResponse sendAirQualityDataCollection(Airquality.SendAirQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendAirQualityDataCollectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service airquality.AirQualityService.
   */
  public static final class AirQualityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AirQualityServiceFutureStub> {
    private AirQualityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AirQualityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AirQualityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Airquality.StartAirQualityDataCollectionResponse> startAirQualityDataCollection(
        Airquality.StartAirQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartAirQualityDataCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Airquality.StopAirQualityDataCollectionResponse> stopAirQualityDataCollection(
        Airquality.StopAirQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopAirQualityDataCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Airquality.SendAirQualityDataCollectionResponse> sendAirQualityDataCollection(
        Airquality.SendAirQualityDataCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendAirQualityDataCollectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_AIR_QUALITY_DATA_COLLECTION = 0;
  private static final int METHODID_STOP_AIR_QUALITY_DATA_COLLECTION = 1;
  private static final int METHODID_SEND_AIR_QUALITY_DATA_COLLECTION = 2;

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
        case METHODID_START_AIR_QUALITY_DATA_COLLECTION:
          serviceImpl.startAirQualityDataCollection((Airquality.StartAirQualityDataCollectionRequest) request,
              (io.grpc.stub.StreamObserver<Airquality.StartAirQualityDataCollectionResponse>) responseObserver);
          break;
        case METHODID_STOP_AIR_QUALITY_DATA_COLLECTION:
          serviceImpl.stopAirQualityDataCollection((Airquality.StopAirQualityDataCollectionRequest) request,
              (io.grpc.stub.StreamObserver<Airquality.StopAirQualityDataCollectionResponse>) responseObserver);
          break;
        case METHODID_SEND_AIR_QUALITY_DATA_COLLECTION:
          serviceImpl.sendAirQualityDataCollection((Airquality.SendAirQualityDataCollectionRequest) request,
              (io.grpc.stub.StreamObserver<Airquality.SendAirQualityDataCollectionResponse>) responseObserver);
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
          getStartAirQualityDataCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Airquality.StartAirQualityDataCollectionRequest,
              Airquality.StartAirQualityDataCollectionResponse>(
                service, METHODID_START_AIR_QUALITY_DATA_COLLECTION)))
        .addMethod(
          getStopAirQualityDataCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Airquality.StopAirQualityDataCollectionRequest,
              Airquality.StopAirQualityDataCollectionResponse>(
                service, METHODID_STOP_AIR_QUALITY_DATA_COLLECTION)))
        .addMethod(
          getSendAirQualityDataCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Airquality.SendAirQualityDataCollectionRequest,
              Airquality.SendAirQualityDataCollectionResponse>(
                service, METHODID_SEND_AIR_QUALITY_DATA_COLLECTION)))
        .build();
  }

  private static abstract class AirQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirQualityServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Airquality.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("airquality.AirQualityService");
    }
  }

  private static final class AirQualityServiceFileDescriptorSupplier
      extends AirQualityServiceBaseDescriptorSupplier {
    AirQualityServiceFileDescriptorSupplier() {}
  }

  private static final class AirQualityServiceMethodDescriptorSupplier
      extends AirQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirQualityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirQualityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirQualityServiceFileDescriptorSupplier())
              .addMethod(getStartAirQualityDataCollectionMethod())
              .addMethod(getStopAirQualityDataCollectionMethod())
              .addMethod(getSendAirQualityDataCollectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
