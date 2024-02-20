package com.grpcclient.grpcclient.service;

import org.springframework.stereotype.Service;

import com.grpc.grpc.Request;
import com.grpc.grpc.Response;
import com.grpc.grpc.ProtoBuffersGrpc.ProtoBuffersBlockingStub;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class MessageService {

    @GrpcClient("grpc-server")
    private ProtoBuffersBlockingStub protoBuffersBlockingStub;

    public void send(String message) {
        Request helloWorldRequest = Request.newBuilder().setMessage(message).build();
        Response helloWorldResponse = this.protoBuffersBlockingStub.communicate(helloWorldRequest);
        System.out.println("GRPC client message sent to server : " + helloWorldResponse.getMessage());
    }
    
}
