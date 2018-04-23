package com.cmpe275.grpcComm;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: server.proto")
public final class CommunicationServiceGrpc {

  private CommunicationServiceGrpc() {}

  public static final String SERVICE_NAME = "grpcComm.CommunicationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.LeaderRequest,
      com.cmpe275.grpcComm.BoolResponse> METHOD_PING_INTERNAL =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.LeaderRequest, com.cmpe275.grpcComm.BoolResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "pingInternal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.LeaderRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.BoolResponse.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("pingInternal"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.ReplicationRequest,
      com.cmpe275.grpcComm.ClientResponse> METHOD_GET_CLIENT_STATUS =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.ReplicationRequest, com.cmpe275.grpcComm.ClientResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "getClientStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.ReplicationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.ClientResponse.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("getClientStatus"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.ReplicationRequest,
      com.cmpe275.grpcComm.BoolResponse> METHOD_SET_LEADER =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.ReplicationRequest, com.cmpe275.grpcComm.BoolResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "setLeader"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.ReplicationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.BoolResponse.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("setLeader"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.ReplicationRequest,
      com.cmpe275.grpcComm.BoolResponse> METHOD_REQUEST_VOTE =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.ReplicationRequest, com.cmpe275.grpcComm.BoolResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "requestVote"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.ReplicationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.BoolResponse.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("requestVote"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.NodeState,
      com.cmpe275.grpcComm.BoolResponse> METHOD_SET_NODE_STATE =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.NodeState, com.cmpe275.grpcComm.BoolResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "setNodeState"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.NodeState.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.BoolResponse.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("setNodeState"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.ReplicationRequest,
      com.cmpe275.grpcComm.ReplicationRequest> METHOD_GET_LEADER_NODE =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.ReplicationRequest, com.cmpe275.grpcComm.ReplicationRequest>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "getLeaderNode"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.ReplicationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.ReplicationRequest.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("getLeaderNode"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.Request,
      com.cmpe275.grpcComm.Response> METHOD_PUT_HANDLER =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.Request, com.cmpe275.grpcComm.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "putHandler"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Response.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("putHandler"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.Request,
      com.cmpe275.grpcComm.Response> METHOD_GET_HANDLER =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.Request, com.cmpe275.grpcComm.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "getHandler"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Response.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("getHandler"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.Request,
      com.cmpe275.grpcComm.Response> METHOD_GET_FROM_LOCAL_CLUSTER =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.Request, com.cmpe275.grpcComm.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "GetFromLocalCluster"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Response.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("GetFromLocalCluster"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.Request,
      com.cmpe275.grpcComm.Response> METHOD_PUT_TO_LOCAL_CLUSTER =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.Request, com.cmpe275.grpcComm.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "PutToLocalCluster"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Response.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("PutToLocalCluster"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.Request,
      com.cmpe275.grpcComm.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.Request, com.cmpe275.grpcComm.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.Response.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("ping"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.EmptyRequest,
      com.cmpe275.grpcComm.DateResponse> METHOD_GET_UNIQUE_DATE_IDS =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.EmptyRequest, com.cmpe275.grpcComm.DateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "getUniqueDateIds"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.EmptyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.DateResponse.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("getUniqueDateIds"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.cmpe275.grpcComm.EmptyRequest,
      com.cmpe275.grpcComm.BoolResponse> METHOD_UPDATE_BLOOM_FILTER =
      io.grpc.MethodDescriptor.<com.cmpe275.grpcComm.EmptyRequest, com.cmpe275.grpcComm.BoolResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcComm.CommunicationService", "updateBloomFilter"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.EmptyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.cmpe275.grpcComm.BoolResponse.getDefaultInstance()))
          .setSchemaDescriptor(new CommunicationServiceMethodDescriptorSupplier("updateBloomFilter"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommunicationServiceStub newStub(io.grpc.Channel channel) {
    return new CommunicationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommunicationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommunicationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommunicationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommunicationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CommunicationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void pingInternal(com.cmpe275.grpcComm.LeaderRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING_INTERNAL, responseObserver);
    }

    /**
     */
    public void getClientStatus(com.cmpe275.grpcComm.ReplicationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLIENT_STATUS, responseObserver);
    }

    /**
     */
    public void setLeader(com.cmpe275.grpcComm.ReplicationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_LEADER, responseObserver);
    }

    /**
     */
    public void requestVote(com.cmpe275.grpcComm.ReplicationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REQUEST_VOTE, responseObserver);
    }

    /**
     */
    public void setNodeState(com.cmpe275.grpcComm.NodeState request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_NODE_STATE, responseObserver);
    }

    /**
     */
    public void getLeaderNode(com.cmpe275.grpcComm.ReplicationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.ReplicationRequest> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_LEADER_NODE, responseObserver);
    }

    /**
     * <pre>
     *interface, for inter-intra cluster communication
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Request> putHandler(
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_PUT_HANDLER, responseObserver);
    }

    /**
     */
    public void getHandler(com.cmpe275.grpcComm.Request request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_HANDLER, responseObserver);
    }

    /**
     */
    public void getFromLocalCluster(com.cmpe275.grpcComm.Request request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FROM_LOCAL_CLUSTER, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Request> putToLocalCluster(
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_PUT_TO_LOCAL_CLUSTER, responseObserver);
    }

    /**
     */
    public void ping(com.cmpe275.grpcComm.Request request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     */
    public void getUniqueDateIds(com.cmpe275.grpcComm.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.DateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_UNIQUE_DATE_IDS, responseObserver);
    }

    /**
     */
    public void updateBloomFilter(com.cmpe275.grpcComm.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_BLOOM_FILTER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING_INTERNAL,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.LeaderRequest,
                com.cmpe275.grpcComm.BoolResponse>(
                  this, METHODID_PING_INTERNAL)))
          .addMethod(
            METHOD_GET_CLIENT_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.ReplicationRequest,
                com.cmpe275.grpcComm.ClientResponse>(
                  this, METHODID_GET_CLIENT_STATUS)))
          .addMethod(
            METHOD_SET_LEADER,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.ReplicationRequest,
                com.cmpe275.grpcComm.BoolResponse>(
                  this, METHODID_SET_LEADER)))
          .addMethod(
            METHOD_REQUEST_VOTE,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.ReplicationRequest,
                com.cmpe275.grpcComm.BoolResponse>(
                  this, METHODID_REQUEST_VOTE)))
          .addMethod(
            METHOD_SET_NODE_STATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.NodeState,
                com.cmpe275.grpcComm.BoolResponse>(
                  this, METHODID_SET_NODE_STATE)))
          .addMethod(
            METHOD_GET_LEADER_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.ReplicationRequest,
                com.cmpe275.grpcComm.ReplicationRequest>(
                  this, METHODID_GET_LEADER_NODE)))
          .addMethod(
            METHOD_PUT_HANDLER,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.Request,
                com.cmpe275.grpcComm.Response>(
                  this, METHODID_PUT_HANDLER)))
          .addMethod(
            METHOD_GET_HANDLER,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.Request,
                com.cmpe275.grpcComm.Response>(
                  this, METHODID_GET_HANDLER)))
          .addMethod(
            METHOD_GET_FROM_LOCAL_CLUSTER,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.Request,
                com.cmpe275.grpcComm.Response>(
                  this, METHODID_GET_FROM_LOCAL_CLUSTER)))
          .addMethod(
            METHOD_PUT_TO_LOCAL_CLUSTER,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.Request,
                com.cmpe275.grpcComm.Response>(
                  this, METHODID_PUT_TO_LOCAL_CLUSTER)))
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.Request,
                com.cmpe275.grpcComm.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_GET_UNIQUE_DATE_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.EmptyRequest,
                com.cmpe275.grpcComm.DateResponse>(
                  this, METHODID_GET_UNIQUE_DATE_IDS)))
          .addMethod(
            METHOD_UPDATE_BLOOM_FILTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.cmpe275.grpcComm.EmptyRequest,
                com.cmpe275.grpcComm.BoolResponse>(
                  this, METHODID_UPDATE_BLOOM_FILTER)))
          .build();
    }
  }

  /**
   */
  public static final class CommunicationServiceStub extends io.grpc.stub.AbstractStub<CommunicationServiceStub> {
    private CommunicationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommunicationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommunicationServiceStub(channel, callOptions);
    }

    /**
     */
    public void pingInternal(com.cmpe275.grpcComm.LeaderRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING_INTERNAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientStatus(com.cmpe275.grpcComm.ReplicationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.ClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLIENT_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setLeader(com.cmpe275.grpcComm.ReplicationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_LEADER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestVote(com.cmpe275.grpcComm.ReplicationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REQUEST_VOTE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setNodeState(com.cmpe275.grpcComm.NodeState request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_STATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLeaderNode(com.cmpe275.grpcComm.ReplicationRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.ReplicationRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_LEADER_NODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *interface, for inter-intra cluster communication
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Request> putHandler(
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_PUT_HANDLER, getCallOptions()), responseObserver);
    }

    /**
     */
    public void getHandler(com.cmpe275.grpcComm.Request request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_HANDLER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFromLocalCluster(com.cmpe275.grpcComm.Request request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_FROM_LOCAL_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Request> putToLocalCluster(
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_PUT_TO_LOCAL_CLUSTER, getCallOptions()), responseObserver);
    }

    /**
     */
    public void ping(com.cmpe275.grpcComm.Request request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUniqueDateIds(com.cmpe275.grpcComm.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.DateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_UNIQUE_DATE_IDS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBloomFilter(com.cmpe275.grpcComm.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BLOOM_FILTER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommunicationServiceBlockingStub extends io.grpc.stub.AbstractStub<CommunicationServiceBlockingStub> {
    private CommunicationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommunicationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommunicationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cmpe275.grpcComm.BoolResponse pingInternal(com.cmpe275.grpcComm.LeaderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING_INTERNAL, getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.grpcComm.ClientResponse getClientStatus(com.cmpe275.grpcComm.ReplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLIENT_STATUS, getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.grpcComm.BoolResponse setLeader(com.cmpe275.grpcComm.ReplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_LEADER, getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.grpcComm.BoolResponse requestVote(com.cmpe275.grpcComm.ReplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REQUEST_VOTE, getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.grpcComm.BoolResponse setNodeState(com.cmpe275.grpcComm.NodeState request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_NODE_STATE, getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.grpcComm.ReplicationRequest getLeaderNode(com.cmpe275.grpcComm.ReplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_LEADER_NODE, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.cmpe275.grpcComm.Response> getHandler(
        com.cmpe275.grpcComm.Request request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_HANDLER, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.cmpe275.grpcComm.Response> getFromLocalCluster(
        com.cmpe275.grpcComm.Request request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_FROM_LOCAL_CLUSTER, getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.grpcComm.Response ping(com.cmpe275.grpcComm.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.grpcComm.DateResponse getUniqueDateIds(com.cmpe275.grpcComm.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_UNIQUE_DATE_IDS, getCallOptions(), request);
    }

    /**
     */
    public com.cmpe275.grpcComm.BoolResponse updateBloomFilter(com.cmpe275.grpcComm.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_BLOOM_FILTER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommunicationServiceFutureStub extends io.grpc.stub.AbstractStub<CommunicationServiceFutureStub> {
    private CommunicationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommunicationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommunicationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.BoolResponse> pingInternal(
        com.cmpe275.grpcComm.LeaderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING_INTERNAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.ClientResponse> getClientStatus(
        com.cmpe275.grpcComm.ReplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLIENT_STATUS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.BoolResponse> setLeader(
        com.cmpe275.grpcComm.ReplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_LEADER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.BoolResponse> requestVote(
        com.cmpe275.grpcComm.ReplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REQUEST_VOTE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.BoolResponse> setNodeState(
        com.cmpe275.grpcComm.NodeState request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_STATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.ReplicationRequest> getLeaderNode(
        com.cmpe275.grpcComm.ReplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_LEADER_NODE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.Response> ping(
        com.cmpe275.grpcComm.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.DateResponse> getUniqueDateIds(
        com.cmpe275.grpcComm.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_UNIQUE_DATE_IDS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cmpe275.grpcComm.BoolResponse> updateBloomFilter(
        com.cmpe275.grpcComm.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BLOOM_FILTER, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING_INTERNAL = 0;
  private static final int METHODID_GET_CLIENT_STATUS = 1;
  private static final int METHODID_SET_LEADER = 2;
  private static final int METHODID_REQUEST_VOTE = 3;
  private static final int METHODID_SET_NODE_STATE = 4;
  private static final int METHODID_GET_LEADER_NODE = 5;
  private static final int METHODID_GET_HANDLER = 6;
  private static final int METHODID_GET_FROM_LOCAL_CLUSTER = 7;
  private static final int METHODID_PING = 8;
  private static final int METHODID_GET_UNIQUE_DATE_IDS = 9;
  private static final int METHODID_UPDATE_BLOOM_FILTER = 10;
  private static final int METHODID_PUT_HANDLER = 11;
  private static final int METHODID_PUT_TO_LOCAL_CLUSTER = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommunicationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommunicationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING_INTERNAL:
          serviceImpl.pingInternal((com.cmpe275.grpcComm.LeaderRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT_STATUS:
          serviceImpl.getClientStatus((com.cmpe275.grpcComm.ReplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.ClientResponse>) responseObserver);
          break;
        case METHODID_SET_LEADER:
          serviceImpl.setLeader((com.cmpe275.grpcComm.ReplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse>) responseObserver);
          break;
        case METHODID_REQUEST_VOTE:
          serviceImpl.requestVote((com.cmpe275.grpcComm.ReplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse>) responseObserver);
          break;
        case METHODID_SET_NODE_STATE:
          serviceImpl.setNodeState((com.cmpe275.grpcComm.NodeState) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse>) responseObserver);
          break;
        case METHODID_GET_LEADER_NODE:
          serviceImpl.getLeaderNode((com.cmpe275.grpcComm.ReplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.ReplicationRequest>) responseObserver);
          break;
        case METHODID_GET_HANDLER:
          serviceImpl.getHandler((com.cmpe275.grpcComm.Request) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response>) responseObserver);
          break;
        case METHODID_GET_FROM_LOCAL_CLUSTER:
          serviceImpl.getFromLocalCluster((com.cmpe275.grpcComm.Request) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((com.cmpe275.grpcComm.Request) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response>) responseObserver);
          break;
        case METHODID_GET_UNIQUE_DATE_IDS:
          serviceImpl.getUniqueDateIds((com.cmpe275.grpcComm.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.DateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLOOM_FILTER:
          serviceImpl.updateBloomFilter((com.cmpe275.grpcComm.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.BoolResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT_HANDLER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putHandler(
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response>) responseObserver);
        case METHODID_PUT_TO_LOCAL_CLUSTER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putToLocalCluster(
              (io.grpc.stub.StreamObserver<com.cmpe275.grpcComm.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CommunicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommunicationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cmpe275.grpcComm.DataProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommunicationService");
    }
  }

  private static final class CommunicationServiceFileDescriptorSupplier
      extends CommunicationServiceBaseDescriptorSupplier {
    CommunicationServiceFileDescriptorSupplier() {}
  }

  private static final class CommunicationServiceMethodDescriptorSupplier
      extends CommunicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommunicationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CommunicationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommunicationServiceFileDescriptorSupplier())
              .addMethod(METHOD_PING_INTERNAL)
              .addMethod(METHOD_GET_CLIENT_STATUS)
              .addMethod(METHOD_SET_LEADER)
              .addMethod(METHOD_REQUEST_VOTE)
              .addMethod(METHOD_SET_NODE_STATE)
              .addMethod(METHOD_GET_LEADER_NODE)
              .addMethod(METHOD_PUT_HANDLER)
              .addMethod(METHOD_GET_HANDLER)
              .addMethod(METHOD_GET_FROM_LOCAL_CLUSTER)
              .addMethod(METHOD_PUT_TO_LOCAL_CLUSTER)
              .addMethod(METHOD_PING)
              .addMethod(METHOD_GET_UNIQUE_DATE_IDS)
              .addMethod(METHOD_UPDATE_BLOOM_FILTER)
              .build();
        }
      }
    }
    return result;
  }
}
