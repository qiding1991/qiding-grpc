package com.qiding.grpc;

public class App {

    public static void main(String[] args) {
        GrpcMailClient grpcMailClient=GrpcMailClient.getInstance("192.168.33.213",9110);
        String channelLocations= grpcMailClient.getChannelLocations("a.receiver@syswin.com");
        System.out.println(channelLocations);
    }
}
