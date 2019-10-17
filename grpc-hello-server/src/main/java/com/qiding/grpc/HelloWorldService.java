package com.qiding.grpc;

import com.proto.grpc.HelloServiceGrpc;
import com.proto.grpc.HelloRequest;
import com.proto.grpc.HelloResponse;
import io.grpc.stub.StreamObserver;

public class HelloWorldService extends HelloServiceGrpc.HelloServiceImplBase {

    private final String username = "qiding";
    private final String password = "qiding";


    private String serviceName;

    public HelloWorldService(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("用户名:" + request.getUsername());
        System.out.println("密 码:" + request.getPassword());
        HelloResponse response;
        if (username.equalsIgnoreCase(request.getUsername()) && password.equalsIgnoreCase(request.getPassword())) {
            response = HelloResponse.newBuilder().setMessage("login success").setCode("200").build();
        } else {
            response = HelloResponse.newBuilder().setMessage("login error").setCode("400").build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
