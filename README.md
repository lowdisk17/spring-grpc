# spring-grpc
A simple project to kickstart your spring boot and grpc journey

Note: 2 Approach of verification

Pre-req for 2nd Approach
1. Install grpcurl

Approches

1. Run the server and client in sequence by using any IDE of your choice (example VSCode)
  - After running client, check client and server console for the default message
2. Run the server and by using grpcurl you can send request to the server
  - grpcurl --plaintext -d '{"message":"Sample Message"}' localhost:9090 <service>/<method>
