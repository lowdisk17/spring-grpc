package com.grpcclient.grpcclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.grpcclient.grpcclient.service.MessageService;

@SpringBootApplication
public class GrpcclientApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GrpcclientApplication.class, args);
		MessageService client = context.getBean(MessageService.class);
		client.send("Sending grpc data to server");
	}

}
