// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package com.manning.mss.ch08.sample04;

public final class InventoryProto {
  private InventoryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sample03_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sample03_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sample03_LineItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sample03_LineItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sample03_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sample03_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sample03_UpdateReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sample03_UpdateReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017inventory.proto\022\010sample03\";\n\005Order\022\017\n\007" +
      "orderId\030\001 \001(\005\022!\n\005items\030\002 \003(\0132\022.sample03." +
      "LineItem\"@\n\010LineItem\022\"\n\007product\030\001 \001(\0132\021." +
      "sample03.Product\022\020\n\010quantity\030\002 \001(\005\"H\n\007Pr" +
      "oduct\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010categ" +
      "ory\030\003 \001(\t\022\021\n\tunitPrice\030\004 \001(\002\"\036\n\013UpdateRe" +
      "ply\022\017\n\007message\030\001 \001(\t2H\n\tInventory\022;\n\017Upd" +
      "ateInventory\022\017.sample03.Order\032\025.sample03" +
      ".UpdateReply\"\000B1\n\035com.manning.mss.ch08.s" +
      "ample04B\016InventoryProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_sample03_Order_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sample03_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sample03_Order_descriptor,
        new java.lang.String[] { "OrderId", "Items", });
    internal_static_sample03_LineItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sample03_LineItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sample03_LineItem_descriptor,
        new java.lang.String[] { "Product", "Quantity", });
    internal_static_sample03_Product_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sample03_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sample03_Product_descriptor,
        new java.lang.String[] { "Id", "Name", "Category", "UnitPrice", });
    internal_static_sample03_UpdateReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sample03_UpdateReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sample03_UpdateReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}