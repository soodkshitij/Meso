// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.cmpe275.grpcComm;

/**
 * Protobuf type {@code grpcComm.DateResponse}
 */
public  final class DateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpcComm.DateResponse)
    DateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateResponse.newBuilder() to construct.
  private DateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateResponse() {
    dates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DateResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              dates_ = new java.util.ArrayList<com.cmpe275.grpcComm.Dates>();
              mutable_bitField0_ |= 0x00000001;
            }
            dates_.add(
                input.readMessage(com.cmpe275.grpcComm.Dates.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        dates_ = java.util.Collections.unmodifiableList(dates_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_DateResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_DateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cmpe275.grpcComm.DateResponse.class, com.cmpe275.grpcComm.DateResponse.Builder.class);
  }

  public static final int DATES_FIELD_NUMBER = 1;
  private java.util.List<com.cmpe275.grpcComm.Dates> dates_;
  /**
   * <code>repeated .grpcComm.Dates dates = 1;</code>
   */
  public java.util.List<com.cmpe275.grpcComm.Dates> getDatesList() {
    return dates_;
  }
  /**
   * <code>repeated .grpcComm.Dates dates = 1;</code>
   */
  public java.util.List<? extends com.cmpe275.grpcComm.DatesOrBuilder> 
      getDatesOrBuilderList() {
    return dates_;
  }
  /**
   * <code>repeated .grpcComm.Dates dates = 1;</code>
   */
  public int getDatesCount() {
    return dates_.size();
  }
  /**
   * <code>repeated .grpcComm.Dates dates = 1;</code>
   */
  public com.cmpe275.grpcComm.Dates getDates(int index) {
    return dates_.get(index);
  }
  /**
   * <code>repeated .grpcComm.Dates dates = 1;</code>
   */
  public com.cmpe275.grpcComm.DatesOrBuilder getDatesOrBuilder(
      int index) {
    return dates_.get(index);
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
    for (int i = 0; i < dates_.size(); i++) {
      output.writeMessage(1, dates_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dates_.get(i));
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
    if (!(obj instanceof com.cmpe275.grpcComm.DateResponse)) {
      return super.equals(obj);
    }
    com.cmpe275.grpcComm.DateResponse other = (com.cmpe275.grpcComm.DateResponse) obj;

    boolean result = true;
    result = result && getDatesList()
        .equals(other.getDatesList());
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
    if (getDatesCount() > 0) {
      hash = (37 * hash) + DATES_FIELD_NUMBER;
      hash = (53 * hash) + getDatesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cmpe275.grpcComm.DateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.DateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cmpe275.grpcComm.DateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cmpe275.grpcComm.DateResponse parseFrom(
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
  public static Builder newBuilder(com.cmpe275.grpcComm.DateResponse prototype) {
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
   * Protobuf type {@code grpcComm.DateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpcComm.DateResponse)
      com.cmpe275.grpcComm.DateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_DateResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_DateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cmpe275.grpcComm.DateResponse.class, com.cmpe275.grpcComm.DateResponse.Builder.class);
    }

    // Construct using com.cmpe275.grpcComm.DateResponse.newBuilder()
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
        getDatesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (datesBuilder_ == null) {
        dates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        datesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_DateResponse_descriptor;
    }

    public com.cmpe275.grpcComm.DateResponse getDefaultInstanceForType() {
      return com.cmpe275.grpcComm.DateResponse.getDefaultInstance();
    }

    public com.cmpe275.grpcComm.DateResponse build() {
      com.cmpe275.grpcComm.DateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cmpe275.grpcComm.DateResponse buildPartial() {
      com.cmpe275.grpcComm.DateResponse result = new com.cmpe275.grpcComm.DateResponse(this);
      int from_bitField0_ = bitField0_;
      if (datesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          dates_ = java.util.Collections.unmodifiableList(dates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dates_ = dates_;
      } else {
        result.dates_ = datesBuilder_.build();
      }
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
      if (other instanceof com.cmpe275.grpcComm.DateResponse) {
        return mergeFrom((com.cmpe275.grpcComm.DateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cmpe275.grpcComm.DateResponse other) {
      if (other == com.cmpe275.grpcComm.DateResponse.getDefaultInstance()) return this;
      if (datesBuilder_ == null) {
        if (!other.dates_.isEmpty()) {
          if (dates_.isEmpty()) {
            dates_ = other.dates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatesIsMutable();
            dates_.addAll(other.dates_);
          }
          onChanged();
        }
      } else {
        if (!other.dates_.isEmpty()) {
          if (datesBuilder_.isEmpty()) {
            datesBuilder_.dispose();
            datesBuilder_ = null;
            dates_ = other.dates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            datesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDatesFieldBuilder() : null;
          } else {
            datesBuilder_.addAllMessages(other.dates_);
          }
        }
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
      com.cmpe275.grpcComm.DateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cmpe275.grpcComm.DateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.cmpe275.grpcComm.Dates> dates_ =
      java.util.Collections.emptyList();
    private void ensureDatesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        dates_ = new java.util.ArrayList<com.cmpe275.grpcComm.Dates>(dates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cmpe275.grpcComm.Dates, com.cmpe275.grpcComm.Dates.Builder, com.cmpe275.grpcComm.DatesOrBuilder> datesBuilder_;

    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public java.util.List<com.cmpe275.grpcComm.Dates> getDatesList() {
      if (datesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dates_);
      } else {
        return datesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public int getDatesCount() {
      if (datesBuilder_ == null) {
        return dates_.size();
      } else {
        return datesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public com.cmpe275.grpcComm.Dates getDates(int index) {
      if (datesBuilder_ == null) {
        return dates_.get(index);
      } else {
        return datesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder setDates(
        int index, com.cmpe275.grpcComm.Dates value) {
      if (datesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatesIsMutable();
        dates_.set(index, value);
        onChanged();
      } else {
        datesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder setDates(
        int index, com.cmpe275.grpcComm.Dates.Builder builderForValue) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        dates_.set(index, builderForValue.build());
        onChanged();
      } else {
        datesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder addDates(com.cmpe275.grpcComm.Dates value) {
      if (datesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatesIsMutable();
        dates_.add(value);
        onChanged();
      } else {
        datesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder addDates(
        int index, com.cmpe275.grpcComm.Dates value) {
      if (datesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatesIsMutable();
        dates_.add(index, value);
        onChanged();
      } else {
        datesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder addDates(
        com.cmpe275.grpcComm.Dates.Builder builderForValue) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        dates_.add(builderForValue.build());
        onChanged();
      } else {
        datesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder addDates(
        int index, com.cmpe275.grpcComm.Dates.Builder builderForValue) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        dates_.add(index, builderForValue.build());
        onChanged();
      } else {
        datesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder addAllDates(
        java.lang.Iterable<? extends com.cmpe275.grpcComm.Dates> values) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dates_);
        onChanged();
      } else {
        datesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder clearDates() {
      if (datesBuilder_ == null) {
        dates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        datesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public Builder removeDates(int index) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        dates_.remove(index);
        onChanged();
      } else {
        datesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public com.cmpe275.grpcComm.Dates.Builder getDatesBuilder(
        int index) {
      return getDatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public com.cmpe275.grpcComm.DatesOrBuilder getDatesOrBuilder(
        int index) {
      if (datesBuilder_ == null) {
        return dates_.get(index);  } else {
        return datesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public java.util.List<? extends com.cmpe275.grpcComm.DatesOrBuilder> 
         getDatesOrBuilderList() {
      if (datesBuilder_ != null) {
        return datesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dates_);
      }
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public com.cmpe275.grpcComm.Dates.Builder addDatesBuilder() {
      return getDatesFieldBuilder().addBuilder(
          com.cmpe275.grpcComm.Dates.getDefaultInstance());
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public com.cmpe275.grpcComm.Dates.Builder addDatesBuilder(
        int index) {
      return getDatesFieldBuilder().addBuilder(
          index, com.cmpe275.grpcComm.Dates.getDefaultInstance());
    }
    /**
     * <code>repeated .grpcComm.Dates dates = 1;</code>
     */
    public java.util.List<com.cmpe275.grpcComm.Dates.Builder> 
         getDatesBuilderList() {
      return getDatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cmpe275.grpcComm.Dates, com.cmpe275.grpcComm.Dates.Builder, com.cmpe275.grpcComm.DatesOrBuilder> 
        getDatesFieldBuilder() {
      if (datesBuilder_ == null) {
        datesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cmpe275.grpcComm.Dates, com.cmpe275.grpcComm.Dates.Builder, com.cmpe275.grpcComm.DatesOrBuilder>(
                dates_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        dates_ = null;
      }
      return datesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpcComm.DateResponse)
  }

  // @@protoc_insertion_point(class_scope:grpcComm.DateResponse)
  private static final com.cmpe275.grpcComm.DateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cmpe275.grpcComm.DateResponse();
  }

  public static com.cmpe275.grpcComm.DateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateResponse>
      PARSER = new com.google.protobuf.AbstractParser<DateResponse>() {
    public DateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateResponse> getParserForType() {
    return PARSER;
  }

  public com.cmpe275.grpcComm.DateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

