package com.qiding.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.proto.grpc.HelloServiceGrpc;
import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        System.out.println( "Hello  server World!" );
        int port=8080;
        String host="127.0.0.1";
        //获取channel
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress(host,port).usePlaintext(true).build();
        //获取阻塞的对象
        HelloServiceGrpc.HelloServiceBlockingStub blockingStub= HelloServiceGrpc.newBlockingStub(managedChannel);
        //获取非阻塞对象
        HelloServiceGrpc.HelloServiceFutureStub  futureStub=HelloServiceGrpc.newFutureStub(managedChannel);
        //传入对象
        HelloWorldClient helloWorldClient=new HelloWorldClient("qiding2","qiding",blockingStub,futureStub);
        //阻塞远程调用
        helloWorldClient.callHello();
        //非阻塞调用
        helloWorldClient.aSyncCall();
    }
}
