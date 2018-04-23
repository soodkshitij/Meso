// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.cmpe275.grpcComm;

/**
 * Protobuf enum {@code grpcComm.StatusCode}
 */
public enum StatusCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <code>Ok = 1;</code>
   */
  Ok(1),
  /**
   * <code>Failed = 2;</code>
   */
  Failed(2),
  /**
   * <code>EOF = 3;</code>
   */
  EOF(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <code>Ok = 1;</code>
   */
  public static final int Ok_VALUE = 1;
  /**
   * <code>Failed = 2;</code>
   */
  public static final int Failed_VALUE = 2;
  /**
   * <code>EOF = 3;</code>
   */
  public static final int EOF_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static StatusCode valueOf(int value) {
    return forNumber(value);
  }

  public static StatusCode forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return Ok;
      case 2: return Failed;
      case 3: return EOF;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StatusCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
          public StatusCode findValueByNumber(int number) {
            return StatusCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.cmpe275.grpcComm.DataProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final StatusCode[] VALUES = values();

  public static StatusCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private StatusCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpcComm.StatusCode)
}

