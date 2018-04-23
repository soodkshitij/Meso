// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.cmpe275.grpcComm;

/**
 * Protobuf type {@code grpcComm.MetaData}
 */
public  final class MetaData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpcComm.MetaData)
    MetaDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaData.newBuilder() to construct.
  private MetaData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaData() {
    uuid_ = "";
    numOfFragment_ = 0;
    mediaType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetaData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            uuid_ = s;
            break;
          }
          case 16: {

            numOfFragment_ = input.readInt32();
            break;
          }
          case 24: {

            mediaType_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_MetaData_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_MetaData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cmpe275.grpcComm.MetaData.class, com.cmpe275.grpcComm.MetaData.Builder.class);
  }

  public static final int UUID_FIELD_NUMBER = 1;
  private volatile java.lang.Object uuid_;
  /**
   * <code>string uuid = 1;</code>
   */
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <code>string uuid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMOFFRAGMENT_FIELD_NUMBER = 2;
  private int numOfFragment_;
  /**
   * <code>int32 numOfFragment = 2;</code>
   */
  public int getNumOfFragment() {
    return numOfFragment_;
  }

  public static final int MEDIATYPE_FIELD_NUMBER = 3;
  private int mediaType_;
  /**
   * <code>int32 mediaType = 3;</code>
   */
  public int getMediaType() {
    return mediaType_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uuid_);
    }
    if (numOfFragment_ != 0) {
      output.writeInt32(2, numOfFragment_);
    }
    if (mediaType_ != 0) {
      output.writeInt32(3, mediaType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uuid_);
    }
    if (numOfFragment_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numOfFragment_);
    }
    if (mediaType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, mediaType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.cmpe275.grpcComm.MetaData)) {
      return super.equals(obj);
    }
    com.cmpe275.grpcComm.MetaData other = (com.cmpe275.grpcComm.MetaData) obj;

    boolean result = true;
    result = result && getUuid()
        .equals(other.getUuid());
    result = result && (getNumOfFragment()
        == other.getNumOfFragment());
    result = result && (getMediaType()
        == other.getMediaType());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (37 * hash) + NUMOFFRAGMENT_FIELD_NUMBER;
    hash = (53 * hash) + getNumOfFragment();
    hash = (37 * hash) + MEDIATYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMediaType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cmpe275.grpcComm.MetaData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.MetaData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cmpe275.grpcComm.MetaData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cmpe275.grpcComm.MetaData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.cmpe275.grpcComm.MetaData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpcComm.MetaData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpcComm.MetaData)
      com.cmpe275.grpcComm.MetaDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_MetaData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_MetaData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cmpe275.grpcComm.MetaData.class, com.cmpe275.grpcComm.MetaData.Builder.class);
    }

    // Construct using com.cmpe275.grpcComm.MetaData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      uuid_ = "";

      numOfFragment_ = 0;

      mediaType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_MetaData_descriptor;
    }

    public com.cmpe275.grpcComm.MetaData getDefaultInstanceForType() {
      return com.cmpe275.grpcComm.MetaData.getDefaultInstance();
    }

    public com.cmpe275.grpcComm.MetaData build() {
      com.cmpe275.grpcComm.MetaData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cmpe275.grpcComm.MetaData buildPartial() {
      com.cmpe275.grpcComm.MetaData result = new com.cmpe275.grpcComm.MetaData(this);
      result.uuid_ = uuid_;
      result.numOfFragment_ = numOfFragment_;
      result.mediaType_ = mediaType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cmpe275.grpcComm.MetaData) {
        return mergeFrom((com.cmpe275.grpcComm.MetaData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cmpe275.grpcComm.MetaData other) {
      if (other == com.cmpe275.grpcComm.MetaData.getDefaultInstance()) return this;
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
        onChanged();
      }
      if (other.getNumOfFragment() != 0) {
        setNumOfFragment(other.getNumOfFragment());
      }
      if (other.getMediaType() != 0) {
        setMediaType(other.getMediaType());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.cmpe275.grpcComm.MetaData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cmpe275.grpcComm.MetaData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object uuid_ = "";
    /**
     * <code>string uuid = 1;</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uuid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uuid = 1;</code>
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 1;</code>
     */
    public Builder clearUuid() {
      
      uuid_ = getDefaultInstance().getUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 1;</code>
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uuid_ = value;
      onChanged();
      return this;
    }

    private int numOfFragment_ ;
    /**
     * <code>int32 numOfFragment = 2;</code>
     */
    public int getNumOfFragment() {
      return numOfFragment_;
    }
    /**
     * <code>int32 numOfFragment = 2;</code>
     */
    public Builder setNumOfFragment(int value) {
      
      numOfFragment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numOfFragment = 2;</code>
     */
    public Builder clearNumOfFragment() {
      
      numOfFragment_ = 0;
      onChanged();
      return this;
    }

    private int mediaType_ ;
    /**
     * <code>int32 mediaType = 3;</code>
     */
    public int getMediaType() {
      return mediaType_;
    }
    /**
     * <code>int32 mediaType = 3;</code>
     */
    public Builder setMediaType(int value) {
      
      mediaType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mediaType = 3;</code>
     */
    public Builder clearMediaType() {
      
      mediaType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpcComm.MetaData)
  }

  // @@protoc_insertion_point(class_scope:grpcComm.MetaData)
  private static final com.cmpe275.grpcComm.MetaData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cmpe275.grpcComm.MetaData();
  }

  public static com.cmpe275.grpcComm.MetaData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetaData>
      PARSER = new com.google.protobuf.AbstractParser<MetaData>() {
    public MetaData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MetaData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetaData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaData> getParserForType() {
    return PARSER;
  }

  public com.cmpe275.grpcComm.MetaData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
