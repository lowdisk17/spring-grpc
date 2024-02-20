package com.grpc.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: message.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProtoBuffersGrpc {

  private ProtoBuffersGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.grpc.grpc.ProtoBuffers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.grpc.Request,
      com.grpc.grpc.Response> getCommunicateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "communicate",
      requestType = com.grpc.grpc.Request.class,
      responseType = com.grpc.grpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.grpc.Request,
      com.grpc.grpc.Response> getCommunicateMethod() {
    io.grpc.MethodDescriptor<com.grpc.grpc.Request, com.grpc.grpc.Response> getCommunicateMethod;
    if ((getCommunicateMethod = ProtoBuffersGrpc.getCommunicateMethod) == null) {
      synchronized (ProtoBuffersGrpc.class) {
        if ((getCommunicateMethod = ProtoBuffersGrpc.getCommunicateMethod) == null) {
          ProtoBuffersGrpc.getCommunicateMethod = getCommunicateMethod =
              io.grpc.MethodDescriptor.<com.grpc.grpc.Request, com.grpc.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "communicate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.grpc.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.grpc.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProtoBuffersMethodDescriptorSupplier("communicate"))
              .build();
        }
      }
    }
    return getCommunicateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProtoBuffersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtoBuffersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtoBuffersStub>() {
        @java.lang.Override
        public ProtoBuffersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtoBuffersStub(channel, callOptions);
        }
      };
    return ProtoBuffersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProtoBuffersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtoBuffersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtoBuffersBlockingStub>() {
        @java.lang.Override
        public ProtoBuffersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtoBuffersBlockingStub(channel, callOptions);
        }
      };
    return ProtoBuffersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProtoBuffersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtoBuffersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtoBuffersFutureStub>() {
        @java.lang.Override
        public ProtoBuffersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtoBuffersFutureStub(channel, callOptions);
        }
      };
    return ProtoBuffersFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void communicate(com.grpc.grpc.Request request,
        io.grpc.stub.StreamObserver<com.grpc.grpc.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommunicateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProtoBuffers.
   */
  public static abstract class ProtoBuffersImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProtoBuffersGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProtoBuffers.
   */
  public static final class ProtoBuffersStub
      extends io.grpc.stub.AbstractAsyncStub<ProtoBuffersStub> {
    private ProtoBuffersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtoBuffersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtoBuffersStub(channel, callOptions);
    }

    /**
     */
    public void communicate(com.grpc.grpc.Request request,
        io.grpc.stub.StreamObserver<com.grpc.grpc.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommunicateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProtoBuffers.
   */
  public static final class ProtoBuffersBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProtoBuffersBlockingStub> {
    private ProtoBuffersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtoBuffersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtoBuffersBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.grpc.Response communicate(com.grpc.grpc.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommunicateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProtoBuffers.
   */
  public static final class ProtoBuffersFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProtoBuffersFutureStub> {
    private ProtoBuffersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtoBuffersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtoBuffersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.grpc.Response> communicate(
        com.grpc.grpc.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommunicateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMUNICATE = 0;

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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMUNICATE:
          serviceImpl.communicate((com.grpc.grpc.Request) request,
              (io.grpc.stub.StreamObserver<com.grpc.grpc.Response>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCommunicateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.grpc.Request,
              com.grpc.grpc.Response>(
                service, METHODID_COMMUNICATE)))
        .build();
  }

  private static abstract class ProtoBuffersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProtoBuffersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.grpc.Message.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProtoBuffers");
    }
  }

  private static final class ProtoBuffersFileDescriptorSupplier
      extends ProtoBuffersBaseDescriptorSupplier {
    ProtoBuffersFileDescriptorSupplier() {}
  }

  private static final class ProtoBuffersMethodDescriptorSupplier
      extends ProtoBuffersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProtoBuffersMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProtoBuffersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProtoBuffersFileDescriptorSupplier())
              .addMethod(getCommunicateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
