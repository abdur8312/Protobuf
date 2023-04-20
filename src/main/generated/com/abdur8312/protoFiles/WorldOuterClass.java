// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world.proto

package com.abdur8312.protoFiles;

public final class WorldOuterClass {
  private WorldOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.abdur8312.protoFiles.World)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string fName = 1;</code>
     */
    java.lang.String getFName();
    /**
     * <code>optional string fName = 1;</code>
     */
    com.google.protobuf.ByteString
        getFNameBytes();

    /**
     * <code>optional string lName = 2;</code>
     */
    java.lang.String getLName();
    /**
     * <code>optional string lName = 2;</code>
     */
    com.google.protobuf.ByteString
        getLNameBytes();
  }
  /**
   * Protobuf type {@code com.abdur8312.protoFiles.World}
   */
  public  static final class World extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.abdur8312.protoFiles.World)
      WorldOrBuilder {
    // Use World.newBuilder() to construct.
    private World(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private World() {
      fName_ = "";
      lName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private World(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              fName_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              lName_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.abdur8312.protoFiles.WorldOuterClass.internal_static_com_abdur8312_protoFiles_World_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.abdur8312.protoFiles.WorldOuterClass.internal_static_com_abdur8312_protoFiles_World_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.abdur8312.protoFiles.WorldOuterClass.World.class, com.abdur8312.protoFiles.WorldOuterClass.World.Builder.class);
    }

    public static final int FNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object fName_;
    /**
     * <code>optional string fName = 1;</code>
     */
    public java.lang.String getFName() {
      java.lang.Object ref = fName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fName_ = s;
        return s;
      }
    }
    /**
     * <code>optional string fName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFNameBytes() {
      java.lang.Object ref = fName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object lName_;
    /**
     * <code>optional string lName = 2;</code>
     */
    public java.lang.String getLName() {
      java.lang.Object ref = lName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lName_ = s;
        return s;
      }
    }
    /**
     * <code>optional string lName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLNameBytes() {
      java.lang.Object ref = lName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getFNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fName_);
      }
      if (!getLNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lName_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fName_);
      }
      if (!getLNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lName_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.abdur8312.protoFiles.WorldOuterClass.World)) {
        return super.equals(obj);
      }
      com.abdur8312.protoFiles.WorldOuterClass.World other = (com.abdur8312.protoFiles.WorldOuterClass.World) obj;

      boolean result = true;
      result = result && getFName()
          .equals(other.getFName());
      result = result && getLName()
          .equals(other.getLName());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + FNAME_FIELD_NUMBER;
      hash = (53 * hash) + getFName().hashCode();
      hash = (37 * hash) + LNAME_FIELD_NUMBER;
      hash = (53 * hash) + getLName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.abdur8312.protoFiles.WorldOuterClass.World parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.abdur8312.protoFiles.WorldOuterClass.World parseFrom(
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
    public static Builder newBuilder(com.abdur8312.protoFiles.WorldOuterClass.World prototype) {
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
     * Protobuf type {@code com.abdur8312.protoFiles.World}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.abdur8312.protoFiles.World)
        com.abdur8312.protoFiles.WorldOuterClass.WorldOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.abdur8312.protoFiles.WorldOuterClass.internal_static_com_abdur8312_protoFiles_World_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.abdur8312.protoFiles.WorldOuterClass.internal_static_com_abdur8312_protoFiles_World_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.abdur8312.protoFiles.WorldOuterClass.World.class, com.abdur8312.protoFiles.WorldOuterClass.World.Builder.class);
      }

      // Construct using com.abdur8312.protoFiles.WorldOuterClass.World.newBuilder()
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
        fName_ = "";

        lName_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.abdur8312.protoFiles.WorldOuterClass.internal_static_com_abdur8312_protoFiles_World_descriptor;
      }

      public com.abdur8312.protoFiles.WorldOuterClass.World getDefaultInstanceForType() {
        return com.abdur8312.protoFiles.WorldOuterClass.World.getDefaultInstance();
      }

      public com.abdur8312.protoFiles.WorldOuterClass.World build() {
        com.abdur8312.protoFiles.WorldOuterClass.World result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.abdur8312.protoFiles.WorldOuterClass.World buildPartial() {
        com.abdur8312.protoFiles.WorldOuterClass.World result = new com.abdur8312.protoFiles.WorldOuterClass.World(this);
        result.fName_ = fName_;
        result.lName_ = lName_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.abdur8312.protoFiles.WorldOuterClass.World) {
          return mergeFrom((com.abdur8312.protoFiles.WorldOuterClass.World)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.abdur8312.protoFiles.WorldOuterClass.World other) {
        if (other == com.abdur8312.protoFiles.WorldOuterClass.World.getDefaultInstance()) return this;
        if (!other.getFName().isEmpty()) {
          fName_ = other.fName_;
          onChanged();
        }
        if (!other.getLName().isEmpty()) {
          lName_ = other.lName_;
          onChanged();
        }
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
        com.abdur8312.protoFiles.WorldOuterClass.World parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.abdur8312.protoFiles.WorldOuterClass.World) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object fName_ = "";
      /**
       * <code>optional string fName = 1;</code>
       */
      public java.lang.String getFName() {
        java.lang.Object ref = fName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string fName = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFNameBytes() {
        java.lang.Object ref = fName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string fName = 1;</code>
       */
      public Builder setFName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string fName = 1;</code>
       */
      public Builder clearFName() {
        
        fName_ = getDefaultInstance().getFName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string fName = 1;</code>
       */
      public Builder setFNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object lName_ = "";
      /**
       * <code>optional string lName = 2;</code>
       */
      public java.lang.String getLName() {
        java.lang.Object ref = lName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string lName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLNameBytes() {
        java.lang.Object ref = lName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string lName = 2;</code>
       */
      public Builder setLName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string lName = 2;</code>
       */
      public Builder clearLName() {
        
        lName_ = getDefaultInstance().getLName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string lName = 2;</code>
       */
      public Builder setLNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lName_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.abdur8312.protoFiles.World)
    }

    // @@protoc_insertion_point(class_scope:com.abdur8312.protoFiles.World)
    private static final com.abdur8312.protoFiles.WorldOuterClass.World DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.abdur8312.protoFiles.WorldOuterClass.World();
    }

    public static com.abdur8312.protoFiles.WorldOuterClass.World getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<World>
        PARSER = new com.google.protobuf.AbstractParser<World>() {
      public World parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new World(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<World> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<World> getParserForType() {
      return PARSER;
    }

    public com.abdur8312.protoFiles.WorldOuterClass.World getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_abdur8312_protoFiles_World_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_abdur8312_protoFiles_World_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013world.proto\022\030com.abdur8312.protoFiles\"" +
      "%\n\005World\022\r\n\005fName\030\001 \001(\t\022\r\n\005lName\030\002 \001(\tb\006" +
      "proto3"
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
    internal_static_com_abdur8312_protoFiles_World_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_abdur8312_protoFiles_World_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_abdur8312_protoFiles_World_descriptor,
        new java.lang.String[] { "FName", "LName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
