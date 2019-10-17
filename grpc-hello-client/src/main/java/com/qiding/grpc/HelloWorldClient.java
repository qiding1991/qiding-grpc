package com.qiding.grpc;

import com.google.common.util.concurrent.ListenableFuture;
import com.proto.grpc.HelloServiceGrpc;
import com.proto.grpc.HelloRequest;
import com.proto.grpc.HelloResponse;

import java.util.concurrent.*;

public class HelloWorldClient {

    private String clientName;
    private String password;
    private HelloServiceGrpc.HelloServiceBlockingStub blockingStub;
    private HelloServiceGrpc.HelloServiceFutureStub futureStub;

    public HelloWorldClient(String clientName, String password, HelloServiceGrpc.HelloServiceBlockingStub blockingStub, HelloServiceGrpc.HelloServiceFutureStub futureStub) {
        this.clientName = clientName;
        this.password = password;
        this.blockingStub = blockingStub;
        this.futureStub = futureStub;
    }

    public void callHello() {
        HelloRequest request = HelloRequest.newBuilder()
                .setUsername(clientName)
                .setPassword(password)
                .build();
        HelloResponse response = blockingStub.sayHello(request);
        System.out.println(response.getMessage());
    }

    public void aSyncCall() throws ExecutionException, InterruptedException {
        HelloRequest request = HelloRequest.newBuilder()
                .setUsername(clientName)
                .setPassword(password)
                .build();
        ListenableFuture<HelloResponse> futureResponse= futureStub.sayHello(request);
        futureResponse.addListener(()->System.out.println("执行成功"),new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>()));
        System.out.println("获取执行结果");
        System.out.println(futureResponse.get().getMessage());
    }

}
