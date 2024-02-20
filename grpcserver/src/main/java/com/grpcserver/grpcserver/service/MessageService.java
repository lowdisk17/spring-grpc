package com.grpcserver.grpcserver.service;

import com.grpc.grpc.ProtoBuffersGrpc;
import com.grpc.grpc.Request;
import com.grpc.grpc.Response;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MessageService extends ProtoBuffersGrpc.ProtoBuffersImplBase {

    @Override
    public void communicate(Request request, StreamObserver<Response> responseObserver) {
        String input = request.getMessage();
        System.out.println("Received Message: " + input);

        Response out = Response.newBuilder()
            .setMessage("Received message : " + input)
            .build();

        responseObserver.onNext(out);
        responseObserver.onCompleted();
    }
    
}
