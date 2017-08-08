// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dict.proto

package org.jigsaw.payment;

/**
 * <pre>
 **
 * 科目类别，必须按照公司的会计准则来设计。科目类别编号将作为科目标号的起始。
 * </pre>
 *
 * Protobuf enum {@code org.jigsaw.payment.AccountClassification}
 */
public enum AccountClassification
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *资产
   * </pre>
   *
   * <code>ASSETS = 1;</code>
   */
  ASSETS(1),
  /**
   * <pre>
   *负债
   * </pre>
   *
   * <code>LIABILITIES = 2;</code>
   */
  LIABILITIES(2),
  /**
   * <pre>
   *共同类    
   * </pre>
   *
   * <code>COMMON = 3;</code>
   */
  COMMON(3),
  /**
   * <pre>
   *所有者权益
   * </pre>
   *
   * <code>EQUITY = 4;</code>
   */
  EQUITY(4),
  /**
   * <pre>
   *成本类
   * </pre>
   *
   * <code>COST = 5;</code>
   */
  COST(5),
  /**
   * <pre>
   *损益类
   * </pre>
   *
   * <code>PROFIT_LOSS = 6;</code>
   */
  PROFIT_LOSS(6),
  ;

  /**
   * <pre>
   *资产
   * </pre>
   *
   * <code>ASSETS = 1;</code>
   */
  public static final int ASSETS_VALUE = 1;
  /**
   * <pre>
   *负债
   * </pre>
   *
   * <code>LIABILITIES = 2;</code>
   */
  public static final int LIABILITIES_VALUE = 2;
  /**
   * <pre>
   *共同类    
   * </pre>
   *
   * <code>COMMON = 3;</code>
   */
  public static final int COMMON_VALUE = 3;
  /**
   * <pre>
   *所有者权益
   * </pre>
   *
   * <code>EQUITY = 4;</code>
   */
  public static final int EQUITY_VALUE = 4;
  /**
   * <pre>
   *成本类
   * </pre>
   *
   * <code>COST = 5;</code>
   */
  public static final int COST_VALUE = 5;
  /**
   * <pre>
   *损益类
   * </pre>
   *
   * <code>PROFIT_LOSS = 6;</code>
   */
  public static final int PROFIT_LOSS_VALUE = 6;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AccountClassification valueOf(int value) {
    return forNumber(value);
  }

  public static AccountClassification forNumber(int value) {
    switch (value) {
      case 1: return ASSETS;
      case 2: return LIABILITIES;
      case 3: return COMMON;
      case 4: return EQUITY;
      case 5: return COST;
      case 6: return PROFIT_LOSS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AccountClassification>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AccountClassification> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AccountClassification>() {
          public AccountClassification findValueByNumber(int number) {
            return AccountClassification.forNumber(number);
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
    return org.jigsaw.payment.Dict.getDescriptor().getEnumTypes().get(1);
  }

  private static final AccountClassification[] VALUES = values();

  public static AccountClassification valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AccountClassification(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:org.jigsaw.payment.AccountClassification)
}
