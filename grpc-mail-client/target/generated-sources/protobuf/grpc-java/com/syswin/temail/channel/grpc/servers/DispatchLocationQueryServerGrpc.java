package com.syswin.temail.channel.grpc.servers;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 *服务端功能定义
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: loactionQueryServer.proto")
public final class DispatchLocationQueryServerGrpc {

  private DispatchLocationQueryServerGrpc() {}

  public static final String SERVICE_NAME = "channel.DispatchLocationQueryServer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.syswin.temail.channel.grpc.servers.UserAccount,
      com.syswin.temail.channel.grpc.servers.ChannelLocations> METHOD_GET_CHANNEL_LOCATIONS_BY_ACCOUNT =
      io.grpc.MethodDescriptor.<com.syswin.temail.channel.grpc.servers.UserAccount, com.syswin.temail.channel.grpc.servers.ChannelLocations>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "channel.DispatchLocationQueryServer", "getChannelLocationsByAccount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.UserAccount.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.ChannelLocations.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DispatchLocationQueryServerStub newStub(io.grpc.Channel channel) {
    return new DispatchLocationQueryServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DispatchLocationQueryServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DispatchLocationQueryServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DispatchLocationQueryServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DispatchLocationQueryServerFutureStub(channel);
  }

  /**
   * <pre>
   *服务端功能定义
   * </pre>
   */
  public static abstract class DispatchLocationQueryServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *返回指定account的全部channels数据 - 这里只传递string 编译不过去，用包装类型
     * </pre>
     */
    public void getChannelLocationsByAccount(com.syswin.temail.channel.grpc.servers.UserAccount request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.ChannelLocations> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CHANNEL_LOCATIONS_BY_ACCOUNT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_CHANNEL_LOCATIONS_BY_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.syswin.temail.channel.grpc.servers.UserAccount,
                com.syswin.temail.channel.grpc.servers.ChannelLocations>(
                  this, METHODID_GET_CHANNEL_LOCATIONS_BY_ACCOUNT)))
          .build();
    }
  }

  /**
   * <pre>
   *服务端功能定义
   * </pre>
   */
  public static final class DispatchLocationQueryServerStub extends io.grpc.stub.AbstractStub<DispatchLocationQueryServerStub> {
    private DispatchLocationQueryServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DispatchLocationQueryServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DispatchLocationQueryServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DispatchLocationQueryServerStub(channel, callOptions);
    }

    /**
     * <pre>
     *返回指定account的全部channels数据 - 这里只传递string 编译不过去，用包装类型
     * </pre>
     */
    public void getChannelLocationsByAccount(com.syswin.temail.channel.grpc.servers.UserAccount request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.ChannelLocations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CHANNEL_LOCATIONS_BY_ACCOUNT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *服务端功能定义
   * </pre>
   */
  public static final class DispatchLocationQueryServerBlockingStub extends io.grpc.stub.AbstractStub<DispatchLocationQueryServerBlockingStub> {
    private DispatchLocationQueryServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DispatchLocationQueryServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DispatchLocationQueryServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DispatchLocationQueryServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *返回指定account的全部channels数据 - 这里只传递string 编译不过去，用包装类型
     * </pre>
     */
    public com.syswin.temail.channel.grpc.servers.ChannelLocations getChannelLocationsByAccount(com.syswin.temail.channel.grpc.servers.UserAccount request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CHANNEL_LOCATIONS_BY_ACCOUNT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *服务端功能定义
   * </pre>
   */
  public static final class DispatchLocationQueryServerFutureStub extends io.grpc.stub.AbstractStub<DispatchLocationQueryServerFutureStub> {
    private DispatchLocationQueryServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DispatchLocationQueryServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DispatchLocationQueryServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DispatchLocationQueryServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *返回指定account的全部channels数据 - 这里只传递string 编译不过去，用包装类型
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syswin.temail.channel.grpc.servers.ChannelLocations> getChannelLocationsByAccount(
        com.syswin.temail.channel.grpc.servers.UserAccount request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CHANNEL_LOCATIONS_BY_ACCOUNT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CHANNEL_LOCATIONS_BY_ACCOUNT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DispatchLocationQueryServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DispatchLocationQueryServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CHANNEL_LOCATIONS_BY_ACCOUNT:
          serviceImpl.getChannelLocationsByAccount((com.syswin.temail.channel.grpc.servers.UserAccount) request,
              (io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.ChannelLocations>) responseObserver);
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

  private static final class DispatchLocationQueryServerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.syswin.temail.channel.grpc.servers.LocationQuery.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DispatchLocationQueryServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DispatchLocationQueryServerDescriptorSupplier())
              .addMethod(METHOD_GET_CHANNEL_LOCATIONS_BY_ACCOUNT)
              .build();
        }
      }
    }
    return result;
  }
}
