// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.cmpe275.grpcComm;

public interface GetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpcComm.GetRequest)
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
   * <code>.grpcComm.QueryParams queryParams = 2;</code>
   */
  boolean hasQueryParams();
  /**
   * <code>.grpcComm.QueryParams queryParams = 2;</code>
   */
  com.cmpe275.grpcComm.QueryParams getQueryParams();
  /**
   * <code>.grpcComm.QueryParams queryParams = 2;</code>
   */
  com.cmpe275.grpcComm.QueryParamsOrBuilder getQueryParamsOrBuilder();
}
