package com.qiding.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        int port=8080;
        String serviceName="qiding-server";
        Server server= ServerBuilder.forPort(port).addService(new HelloWorldService(serviceName)).build().start();
        System.out.println( "Hello client World!" );
        server.awaitTermination();
        System.out.println("服务器已经关机");
    }





}
