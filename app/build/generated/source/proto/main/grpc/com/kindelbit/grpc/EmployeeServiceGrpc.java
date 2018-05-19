package com.kindelbit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: messages.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetByBadgeNumberMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.GetByBadgeNumberRequest,
      com.kindelbit.grpc.EmployeeResponse> METHOD_GET_BY_BADGE_NUMBER = getGetByBadgeNumberMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kindelbit.grpc.GetByBadgeNumberRequest,
      com.kindelbit.grpc.EmployeeResponse> getGetByBadgeNumberMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kindelbit.grpc.GetByBadgeNumberRequest,
      com.kindelbit.grpc.EmployeeResponse> getGetByBadgeNumberMethod() {
    return getGetByBadgeNumberMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kindelbit.grpc.GetByBadgeNumberRequest,
      com.kindelbit.grpc.EmployeeResponse> getGetByBadgeNumberMethodHelper() {
    io.grpc.MethodDescriptor<com.kindelbit.grpc.GetByBadgeNumberRequest, com.kindelbit.grpc.EmployeeResponse> getGetByBadgeNumberMethod;
    if ((getGetByBadgeNumberMethod = EmployeeServiceGrpc.getGetByBadgeNumberMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetByBadgeNumberMethod = EmployeeServiceGrpc.getGetByBadgeNumberMethod) == null) {
          EmployeeServiceGrpc.getGetByBadgeNumberMethod = getGetByBadgeNumberMethod = 
              io.grpc.MethodDescriptor.<com.kindelbit.grpc.GetByBadgeNumberRequest, com.kindelbit.grpc.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "GetByBadgeNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.GetByBadgeNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetByBadgeNumber"))
                  .build();
          }
        }
     }
     return getGetByBadgeNumberMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.GetAllRequest,
      com.kindelbit.grpc.EmployeeResponse> METHOD_GET_ALL = getGetAllMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kindelbit.grpc.GetAllRequest,
      com.kindelbit.grpc.EmployeeResponse> getGetAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kindelbit.grpc.GetAllRequest,
      com.kindelbit.grpc.EmployeeResponse> getGetAllMethod() {
    return getGetAllMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kindelbit.grpc.GetAllRequest,
      com.kindelbit.grpc.EmployeeResponse> getGetAllMethodHelper() {
    io.grpc.MethodDescriptor<com.kindelbit.grpc.GetAllRequest, com.kindelbit.grpc.EmployeeResponse> getGetAllMethod;
    if ((getGetAllMethod = EmployeeServiceGrpc.getGetAllMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAllMethod = EmployeeServiceGrpc.getGetAllMethod) == null) {
          EmployeeServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.kindelbit.grpc.GetAllRequest, com.kindelbit.grpc.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> METHOD_SAVE = getSaveMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> getSaveMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> getSaveMethod() {
    return getSaveMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> getSaveMethodHelper() {
    io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest, com.kindelbit.grpc.EmployeeResponse> getSaveMethod;
    if ((getSaveMethod = EmployeeServiceGrpc.getSaveMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getSaveMethod = EmployeeServiceGrpc.getSaveMethod) == null) {
          EmployeeServiceGrpc.getSaveMethod = getSaveMethod = 
              io.grpc.MethodDescriptor.<com.kindelbit.grpc.EmployeeRequest, com.kindelbit.grpc.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "Save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("Save"))
                  .build();
          }
        }
     }
     return getSaveMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> METHOD_SAVE_ALL = getSaveAllMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> getSaveAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> getSaveAllMethod() {
    return getSaveAllMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest,
      com.kindelbit.grpc.EmployeeResponse> getSaveAllMethodHelper() {
    io.grpc.MethodDescriptor<com.kindelbit.grpc.EmployeeRequest, com.kindelbit.grpc.EmployeeResponse> getSaveAllMethod;
    if ((getSaveAllMethod = EmployeeServiceGrpc.getSaveAllMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getSaveAllMethod = EmployeeServiceGrpc.getSaveAllMethod) == null) {
          EmployeeServiceGrpc.getSaveAllMethod = getSaveAllMethod = 
              io.grpc.MethodDescriptor.<com.kindelbit.grpc.EmployeeRequest, com.kindelbit.grpc.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "SaveAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("SaveAll"))
                  .build();
          }
        }
     }
     return getSaveAllMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddPhotoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kindelbit.grpc.AddPhotoRequest,
      com.kindelbit.grpc.AddPhotoResponse> METHOD_ADD_PHOTO = getAddPhotoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kindelbit.grpc.AddPhotoRequest,
      com.kindelbit.grpc.AddPhotoResponse> getAddPhotoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kindelbit.grpc.AddPhotoRequest,
      com.kindelbit.grpc.AddPhotoResponse> getAddPhotoMethod() {
    return getAddPhotoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kindelbit.grpc.AddPhotoRequest,
      com.kindelbit.grpc.AddPhotoResponse> getAddPhotoMethodHelper() {
    io.grpc.MethodDescriptor<com.kindelbit.grpc.AddPhotoRequest, com.kindelbit.grpc.AddPhotoResponse> getAddPhotoMethod;
    if ((getAddPhotoMethod = EmployeeServiceGrpc.getAddPhotoMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getAddPhotoMethod = EmployeeServiceGrpc.getAddPhotoMethod) == null) {
          EmployeeServiceGrpc.getAddPhotoMethod = getAddPhotoMethod = 
              io.grpc.MethodDescriptor.<com.kindelbit.grpc.AddPhotoRequest, com.kindelbit.grpc.AddPhotoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "AddPhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.AddPhotoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kindelbit.grpc.AddPhotoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("AddPhoto"))
                  .build();
          }
        }
     }
     return getAddPhotoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getByBadgeNumber(com.kindelbit.grpc.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByBadgeNumberMethodHelper(), responseObserver);
    }

    /**
     */
    public void getAll(com.kindelbit.grpc.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethodHelper(), responseObserver);
    }

    /**
     */
    public void save(com.kindelbit.grpc.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSaveAllMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoRequest> addPhoto(
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddPhotoMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByBadgeNumberMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kindelbit.grpc.GetByBadgeNumberRequest,
                com.kindelbit.grpc.EmployeeResponse>(
                  this, METHODID_GET_BY_BADGE_NUMBER)))
          .addMethod(
            getGetAllMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.kindelbit.grpc.GetAllRequest,
                com.kindelbit.grpc.EmployeeResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getSaveMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kindelbit.grpc.EmployeeRequest,
                com.kindelbit.grpc.EmployeeResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getSaveAllMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.kindelbit.grpc.EmployeeRequest,
                com.kindelbit.grpc.EmployeeResponse>(
                  this, METHODID_SAVE_ALL)))
          .addMethod(
            getAddPhotoMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.kindelbit.grpc.AddPhotoRequest,
                com.kindelbit.grpc.AddPhotoResponse>(
                  this, METHODID_ADD_PHOTO)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getByBadgeNumber(com.kindelbit.grpc.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByBadgeNumberMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.kindelbit.grpc.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void save(com.kindelbit.grpc.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSaveAllMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoRequest> addPhoto(
        io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAddPhotoMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kindelbit.grpc.EmployeeResponse getByBadgeNumber(com.kindelbit.grpc.GetByBadgeNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByBadgeNumberMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.kindelbit.grpc.EmployeeResponse> getAll(
        com.kindelbit.grpc.GetAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kindelbit.grpc.EmployeeResponse save(com.kindelbit.grpc.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kindelbit.grpc.EmployeeResponse> getByBadgeNumber(
        com.kindelbit.grpc.GetByBadgeNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByBadgeNumberMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kindelbit.grpc.EmployeeResponse> save(
        com.kindelbit.grpc.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_BADGE_NUMBER = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_SAVE = 2;
  private static final int METHODID_SAVE_ALL = 3;
  private static final int METHODID_ADD_PHOTO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_BADGE_NUMBER:
          serviceImpl.getByBadgeNumber((com.kindelbit.grpc.GetByBadgeNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.kindelbit.grpc.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse>) responseObserver);
          break;
        case METHODID_SAVE:
          serviceImpl.save((com.kindelbit.grpc.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse>) responseObserver);
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
        case METHODID_SAVE_ALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.saveAll(
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.EmployeeResponse>) responseObserver);
        case METHODID_ADD_PHOTO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addPhoto(
              (io.grpc.stub.StreamObserver<com.kindelbit.grpc.AddPhotoResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kindelbit.grpc.Messages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetByBadgeNumberMethodHelper())
              .addMethod(getGetAllMethodHelper())
              .addMethod(getSaveMethodHelper())
              .addMethod(getSaveAllMethodHelper())
              .addMethod(getAddPhotoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
