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
    comments = "Source: loactiionSyncServer.proto")
public final class GatewayRegistrySyncServerGrpc {

  private GatewayRegistrySyncServerGrpc() {}

  public static final String SERVICE_NAME = "channel.GatewayRegistrySyncServer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.syswin.temail.channel.grpc.servers.GatewayServer,
      com.syswin.temail.channel.grpc.servers.CommonResponse> METHOD_SERVER_REGISTRY =
      io.grpc.MethodDescriptor.<com.syswin.temail.channel.grpc.servers.GatewayServer, com.syswin.temail.channel.grpc.servers.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "channel.GatewayRegistrySyncServer", "serverRegistry"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.GatewayServer.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.CommonResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.syswin.temail.channel.grpc.servers.GatewayServer,
      com.syswin.temail.channel.grpc.servers.CommonResponse> METHOD_SERVER_HEART_BEAT =
      io.grpc.MethodDescriptor.<com.syswin.temail.channel.grpc.servers.GatewayServer, com.syswin.temail.channel.grpc.servers.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "channel.GatewayRegistrySyncServer", "serverHeartBeat"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.GatewayServer.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.CommonResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.syswin.temail.channel.grpc.servers.ChannelLocations,
      com.syswin.temail.channel.grpc.servers.CommonResponse> METHOD_SYNC_CHANNEL_LOCATIONS =
      io.grpc.MethodDescriptor.<com.syswin.temail.channel.grpc.servers.ChannelLocations, com.syswin.temail.channel.grpc.servers.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "channel.GatewayRegistrySyncServer", "syncChannelLocations"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.ChannelLocations.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.CommonResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.syswin.temail.channel.grpc.servers.ChannelLocations,
      com.syswin.temail.channel.grpc.servers.CommonResponse> METHOD_REMOVE_CHANNEL_LOCATIONS =
      io.grpc.MethodDescriptor.<com.syswin.temail.channel.grpc.servers.ChannelLocations, com.syswin.temail.channel.grpc.servers.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "channel.GatewayRegistrySyncServer", "removeChannelLocations"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.ChannelLocations.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.CommonResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.syswin.temail.channel.grpc.servers.GatewayServer,
      com.syswin.temail.channel.grpc.servers.CommonResponse> METHOD_SERVER_OFF_LINE =
      io.grpc.MethodDescriptor.<com.syswin.temail.channel.grpc.servers.GatewayServer, com.syswin.temail.channel.grpc.servers.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "channel.GatewayRegistrySyncServer", "serverOffLine"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.GatewayServer.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.syswin.temail.channel.grpc.servers.CommonResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GatewayRegistrySyncServerStub newStub(io.grpc.Channel channel) {
    return new GatewayRegistrySyncServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GatewayRegistrySyncServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GatewayRegistrySyncServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GatewayRegistrySyncServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GatewayRegistrySyncServerFutureStub(channel);
  }

  /**
   * <pre>
   *服务端功能定义
   * </pre>
   */
  public static abstract class GatewayRegistrySyncServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *gateserver注册服务
     * </pre>
     */
    public void serverRegistry(com.syswin.temail.channel.grpc.servers.GatewayServer request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SERVER_REGISTRY, responseObserver);
    }

    /**
     * <pre>
     *gateServer心跳处理服务
     * </pre>
     */
    public void serverHeartBeat(com.syswin.temail.channel.grpc.servers.GatewayServer request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SERVER_HEART_BEAT, responseObserver);
    }

    /**
     * <pre>
     *gatesServer上的channel信息同步到存储层
     * </pre>
     */
    public void syncChannelLocations(com.syswin.temail.channel.grpc.servers.ChannelLocations request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SYNC_CHANNEL_LOCATIONS, responseObserver);
    }

    /**
     * <pre>
     *从存储层移除指定的channels信息
     * </pre>
     */
    public void removeChannelLocations(com.syswin.temail.channel.grpc.servers.ChannelLocations request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_CHANNEL_LOCATIONS, responseObserver);
    }

    /**
     * <pre>
     *gateserver注销服务
     * </pre>
     */
    public void serverOffLine(com.syswin.temail.channel.grpc.servers.GatewayServer request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SERVER_OFF_LINE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SERVER_REGISTRY,
            asyncUnaryCall(
              new MethodHandlers<
                com.syswin.temail.channel.grpc.servers.GatewayServer,
                com.syswin.temail.channel.grpc.servers.CommonResponse>(
                  this, METHODID_SERVER_REGISTRY)))
          .addMethod(
            METHOD_SERVER_HEART_BEAT,
            asyncUnaryCall(
              new MethodHandlers<
                com.syswin.temail.channel.grpc.servers.GatewayServer,
                com.syswin.temail.channel.grpc.servers.CommonResponse>(
                  this, METHODID_SERVER_HEART_BEAT)))
          .addMethod(
            METHOD_SYNC_CHANNEL_LOCATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.syswin.temail.channel.grpc.servers.ChannelLocations,
                com.syswin.temail.channel.grpc.servers.CommonResponse>(
                  this, METHODID_SYNC_CHANNEL_LOCATIONS)))
          .addMethod(
            METHOD_REMOVE_CHANNEL_LOCATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.syswin.temail.channel.grpc.servers.ChannelLocations,
                com.syswin.temail.channel.grpc.servers.CommonResponse>(
                  this, METHODID_REMOVE_CHANNEL_LOCATIONS)))
          .addMethod(
            METHOD_SERVER_OFF_LINE,
            asyncUnaryCall(
              new MethodHandlers<
                com.syswin.temail.channel.grpc.servers.GatewayServer,
                com.syswin.temail.channel.grpc.servers.CommonResponse>(
                  this, METHODID_SERVER_OFF_LINE)))
          .build();
    }
  }

  /**
   * <pre>
   *服务端功能定义
   * </pre>
   */
  public static final class GatewayRegistrySyncServerStub extends io.grpc.stub.AbstractStub<GatewayRegistrySyncServerStub> {
    private GatewayRegistrySyncServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GatewayRegistrySyncServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayRegistrySyncServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GatewayRegistrySyncServerStub(channel, callOptions);
    }

    /**
     * <pre>
     *gateserver注册服务
     * </pre>
     */
    public void serverRegistry(com.syswin.temail.channel.grpc.servers.GatewayServer request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SERVER_REGISTRY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *gateServer心跳处理服务
     * </pre>
     */
    public void serverHeartBeat(com.syswin.temail.channel.grpc.servers.GatewayServer request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SERVER_HEART_BEAT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *gatesServer上的channel信息同步到存储层
     * </pre>
     */
    public void syncChannelLocations(com.syswin.temail.channel.grpc.servers.ChannelLocations request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SYNC_CHANNEL_LOCATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *从存储层移除指定的channels信息
     * </pre>
     */
    public void removeChannelLocations(com.syswin.temail.channel.grpc.servers.ChannelLocations request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_CHANNEL_LOCATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *gateserver注销服务
     * </pre>
     */
    public void serverOffLine(com.syswin.temail.channel.grpc.servers.GatewayServer request,
        io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SERVER_OFF_LINE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *服务端功能定义
   * </pre>
   */
  public static final class GatewayRegistrySyncServerBlockingStub extends io.grpc.stub.AbstractStub<GatewayRegistrySyncServerBlockingStub> {
    private GatewayRegistrySyncServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GatewayRegistrySyncServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayRegistrySyncServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GatewayRegistrySyncServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *gateserver注册服务
     * </pre>
     */
    public com.syswin.temail.channel.grpc.servers.CommonResponse serverRegistry(com.syswin.temail.channel.grpc.servers.GatewayServer request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SERVER_REGISTRY, getCallOptions(), request);
    }

    /**
     * <pre>
     *gateServer心跳处理服务
     * </pre>
     */
    public com.syswin.temail.channel.grpc.servers.CommonResponse serverHeartBeat(com.syswin.temail.channel.grpc.servers.GatewayServer request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SERVER_HEART_BEAT, getCallOptions(), request);
    }

    /**
     * <pre>
     *gatesServer上的channel信息同步到存储层
     * </pre>
     */
    public com.syswin.temail.channel.grpc.servers.CommonResponse syncChannelLocations(com.syswin.temail.channel.grpc.servers.ChannelLocations request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SYNC_CHANNEL_LOCATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     *从存储层移除指定的channels信息
     * </pre>
     */
    public com.syswin.temail.channel.grpc.servers.CommonResponse removeChannelLocations(com.syswin.temail.channel.grpc.servers.ChannelLocations request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_CHANNEL_LOCATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     *gateserver注销服务
     * </pre>
     */
    public com.syswin.temail.channel.grpc.servers.CommonResponse serverOffLine(com.syswin.temail.channel.grpc.servers.GatewayServer request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SERVER_OFF_LINE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *服务端功能定义
   * </pre>
   */
  public static final class GatewayRegistrySyncServerFutureStub extends io.grpc.stub.AbstractStub<GatewayRegistrySyncServerFutureStub> {
    private GatewayRegistrySyncServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GatewayRegistrySyncServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayRegistrySyncServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GatewayRegistrySyncServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *gateserver注册服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syswin.temail.channel.grpc.servers.CommonResponse> serverRegistry(
        com.syswin.temail.channel.grpc.servers.GatewayServer request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SERVER_REGISTRY, getCallOptions()), request);
    }

    /**
     * <pre>
     *gateServer心跳处理服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syswin.temail.channel.grpc.servers.CommonResponse> serverHeartBeat(
        com.syswin.temail.channel.grpc.servers.GatewayServer request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SERVER_HEART_BEAT, getCallOptions()), request);
    }

    /**
     * <pre>
     *gatesServer上的channel信息同步到存储层
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syswin.temail.channel.grpc.servers.CommonResponse> syncChannelLocations(
        com.syswin.temail.channel.grpc.servers.ChannelLocations request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SYNC_CHANNEL_LOCATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     *从存储层移除指定的channels信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syswin.temail.channel.grpc.servers.CommonResponse> removeChannelLocations(
        com.syswin.temail.channel.grpc.servers.ChannelLocations request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_CHANNEL_LOCATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     *gateserver注销服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syswin.temail.channel.grpc.servers.CommonResponse> serverOffLine(
        com.syswin.temail.channel.grpc.servers.GatewayServer request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SERVER_OFF_LINE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SERVER_REGISTRY = 0;
  private static final int METHODID_SERVER_HEART_BEAT = 1;
  private static final int METHODID_SYNC_CHANNEL_LOCATIONS = 2;
  private static final int METHODID_REMOVE_CHANNEL_LOCATIONS = 3;
  private static final int METHODID_SERVER_OFF_LINE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GatewayRegistrySyncServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GatewayRegistrySyncServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_REGISTRY:
          serviceImpl.serverRegistry((com.syswin.temail.channel.grpc.servers.GatewayServer) request,
              (io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse>) responseObserver);
          break;
        case METHODID_SERVER_HEART_BEAT:
          serviceImpl.serverHeartBeat((com.syswin.temail.channel.grpc.servers.GatewayServer) request,
              (io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse>) responseObserver);
          break;
        case METHODID_SYNC_CHANNEL_LOCATIONS:
          serviceImpl.syncChannelLocations((com.syswin.temail.channel.grpc.servers.ChannelLocations) request,
              (io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse>) responseObserver);
          break;
        case METHODID_REMOVE_CHANNEL_LOCATIONS:
          serviceImpl.removeChannelLocations((com.syswin.temail.channel.grpc.servers.ChannelLocations) request,
              (io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse>) responseObserver);
          break;
        case METHODID_SERVER_OFF_LINE:
          serviceImpl.serverOffLine((com.syswin.temail.channel.grpc.servers.GatewayServer) request,
              (io.grpc.stub.StreamObserver<com.syswin.temail.channel.grpc.servers.CommonResponse>) responseObserver);
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

  private static final class GatewayRegistrySyncServerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.syswin.temail.channel.grpc.servers.ChannelRegistry.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GatewayRegistrySyncServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GatewayRegistrySyncServerDescriptorSupplier())
              .addMethod(METHOD_SERVER_REGISTRY)
              .addMethod(METHOD_SERVER_HEART_BEAT)
              .addMethod(METHOD_SYNC_CHANNEL_LOCATIONS)
              .addMethod(METHOD_REMOVE_CHANNEL_LOCATIONS)
              .addMethod(METHOD_SERVER_OFF_LINE)
              .build();
        }
      }
    }
    return result;
  }
}
