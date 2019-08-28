package com.didala.jiang.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @author : jiangwei
 * @date :  2019-08-28
 * @description
 */
public class TestMain {

    public static void main(String[] args) throws IOException {
        /* The port on which the server should run */
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new GreeterImpl())
                .build()
                .start();

        System.in.read();
    }
}