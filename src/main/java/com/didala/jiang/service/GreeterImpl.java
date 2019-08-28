package com.didala.jiang.service;

import com.didala.jiang.proto.GreeterGrpc;
import com.didala.jiang.proto.HelloWorld;
import io.grpc.stub.StreamObserver;

/**
 * @author : jiangwei
 * @date :  2019-08-28
 * @description
 */
 public class GreeterImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloWorld.HelloRequest req, StreamObserver<HelloWorld.HelloReply> responseObserver) {
        HelloWorld.HelloReply reply = HelloWorld.HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
        System.out.println("Hello " + req.getName());
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}

