// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.cmpe275.grpcComm;

public interface PutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpcComm.PutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpcComm.MetaData metaData = 1;</code>
   */
  boolean hasMetaData();
  /**
   * <code>.grpcComm.MetaData metaData = 1;</code>
   */
  com.cmpe275.grpcComm.MetaData getMetaData();
  /**
   * <code>.grpcComm.MetaData metaData = 1;</code>
   */
  com.cmpe275.grpcComm.MetaDataOrBuilder getMetaDataOrBuilder();

  /**
   * <code>.grpcComm.DatFragment datFragment = 2;</code>
   */
  boolean hasDatFragment();
  /**
   * <code>.grpcComm.DatFragment datFragment = 2;</code>
   */
  com.cmpe275.grpcComm.DatFragment getDatFragment();
  /**
   * <code>.grpcComm.DatFragment datFragment = 2;</code>
   */
  com.cmpe275.grpcComm.DatFragmentOrBuilder getDatFragmentOrBuilder();
}
