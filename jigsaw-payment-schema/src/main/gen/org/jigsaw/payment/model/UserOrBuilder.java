// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.jigsaw.payment.model;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *内部主键
   * </pre>
   *
   * <code>optional int64 key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   *内部主键
   * </pre>
   *
   * <code>optional int64 key = 1;</code>
   */
  long getKey();

  /**
   * <pre>
   *业务主键   
   * </pre>
   *
   * <code>optional int64 id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   *业务主键   
   * </pre>
   *
   * <code>optional int64 id = 2;</code>
   */
  long getId();

  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>optional int64 create_time = 3 [(.column_option) = { ... }</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>optional int64 create_time = 3 [(.column_option) = { ... }</code>
   */
  long getCreateTime();

  /**
   * <pre>
   *创建用户姓名
   * </pre>
   *
   * <code>optional string create_user = 4;</code>
   */
  boolean hasCreateUser();
  /**
   * <pre>
   *创建用户姓名
   * </pre>
   *
   * <code>optional string create_user = 4;</code>
   */
  java.lang.String getCreateUser();
  /**
   * <pre>
   *创建用户姓名
   * </pre>
   *
   * <code>optional string create_user = 4;</code>
   */
  com.google.protobuf.ByteString
      getCreateUserBytes();

  /**
   * <pre>
   *更新时间
   * </pre>
   *
   * <code>optional int64 update_time = 5 [(.column_option) = { ... }</code>
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   *更新时间
   * </pre>
   *
   * <code>optional int64 update_time = 5 [(.column_option) = { ... }</code>
   */
  long getUpdateTime();

  /**
   * <pre>
   *更新用户姓名
   * </pre>
   *
   * <code>optional string update_user = 6;</code>
   */
  boolean hasUpdateUser();
  /**
   * <pre>
   *更新用户姓名
   * </pre>
   *
   * <code>optional string update_user = 6;</code>
   */
  java.lang.String getUpdateUser();
  /**
   * <pre>
   *更新用户姓名
   * </pre>
   *
   * <code>optional string update_user = 6;</code>
   */
  com.google.protobuf.ByteString
      getUpdateUserBytes();

  /**
   * <pre>
   *状态：1有效 0无效
   * </pre>
   *
   * <code>optional int32 status = 7 [default = 1];</code>
   */
  boolean hasStatus();
  /**
   * <pre>
   *状态：1有效 0无效
   * </pre>
   *
   * <code>optional int32 status = 7 [default = 1];</code>
   */
  int getStatus();

  /**
   * <pre>
   *版本号
   * </pre>
   *
   * <code>optional int32 version = 8 [default = 0];</code>
   */
  boolean hasVersion();
  /**
   * <pre>
   *版本号
   * </pre>
   *
   * <code>optional int32 version = 8 [default = 0];</code>
   */
  int getVersion();

  /**
   * <pre>
   *用户名
   * </pre>
   *
   * <code>required string username = 11;</code>
   */
  boolean hasUsername();
  /**
   * <pre>
   *用户名
   * </pre>
   *
   * <code>required string username = 11;</code>
   */
  java.lang.String getUsername();
  /**
   * <pre>
   *用户名
   * </pre>
   *
   * <code>required string username = 11;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   *密码
   * </pre>
   *
   * <code>required string password = 12;</code>
   */
  boolean hasPassword();
  /**
   * <pre>
   *密码
   * </pre>
   *
   * <code>required string password = 12;</code>
   */
  java.lang.String getPassword();
  /**
   * <pre>
   *密码
   * </pre>
   *
   * <code>required string password = 12;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
