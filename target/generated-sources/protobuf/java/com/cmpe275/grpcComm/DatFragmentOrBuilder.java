// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.cmpe275.grpcComm;

public interface DatFragmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpcComm.DatFragment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string timestamp_utc = 1;</code>
   */
  java.lang.String getTimestampUtc();
  /**
   * <code>string timestamp_utc = 1;</code>
   */
  com.google.protobuf.ByteString
      getTimestampUtcBytes();

  /**
   * <code>bytes data = 2;</code>
   */
  com.google.protobuf.ByteString getData();
}