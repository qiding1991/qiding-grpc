package com.qiding.grpc;

import com.google.gson.Gson;
import com.syswin.temail.channel.grpc.servers.ChannelLocations;
import com.syswin.temail.channel.grpc.servers.DispatchLocationQueryServerGrpc;
import com.syswin.temail.channel.grpc.servers.GatewayRegistrySyncServerGrpc;
import com.syswin.temail.channel.grpc.servers.UserAccount;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcMailClient {
    private String host;
    private Integer port;
    private Gson gson=new Gson();
    private DispatchLocationQueryServerGrpc.DispatchLocationQueryServerBlockingStub serviceProxy;
    private static volatile GrpcMailClient grpcMailClient;


    private GrpcMailClient(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    public static synchronized GrpcMailClient getInstance(String host, Integer port) {
        if (grpcMailClient == null) {
            grpcMailClient = new GrpcMailClient(host, port);
            //获取channel
            ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build();
            //代理对象
            grpcMailClient.serviceProxy = DispatchLocationQueryServerGrpc.newBlockingStub(managedChannel);
        }
        return grpcMailClient;
    }

    public String getChannelLocations(String account) {
        UserAccount userAccount = UserAccount.newBuilder().setAccount(account).build();
        //获取返回值
        return gson.toJson(serviceProxy.getChannelLocationsByAccount(userAccount));
    }
}
