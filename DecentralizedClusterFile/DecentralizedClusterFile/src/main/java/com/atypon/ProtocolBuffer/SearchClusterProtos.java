package com.atypon.ProtocolBuffer;

public final class SearchClusterProtos {
  private SearchClusterProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      SearchClusterProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:distributed.search.Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string query = 1;</code>
     * @return Whether the query field is set.
     */
    boolean hasQuery();
    /**
     * <code>required string query = 1;</code>
     * @return The query.
     */
    java.lang.String getQuery();
    /**
     * <code>required string query = 1;</code>
     * @return The bytes for query.
     */
    com.google.protobuf.ByteString
        getQueryBytes();
  }
  /**
   * Protobuf type {@code distributed.search.Request}
   */
  public static final class Request extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:distributed.search.Request)
      RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 26,
        /* patch= */ 1,
        /* suffix= */ "",
        Request.class.getName());
    }
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Request() {
      query_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SearchClusterProtos.internal_static_distributed_search_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SearchClusterProtos.internal_static_distributed_search_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SearchClusterProtos.Request.class, SearchClusterProtos.Request.Builder.class);
    }

    private int bitField0_;
    public static final int QUERY_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object query_ = "";
    /**
     * <code>required string query = 1;</code>
     * @return Whether the query field is set.
     */
    @java.lang.Override
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string query = 1;</code>
     * @return The query.
     */
    @java.lang.Override
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          query_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string query = 1;</code>
     * @return The bytes for query.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasQuery()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, query_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, query_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SearchClusterProtos.Request)) {
        return super.equals(obj);
      }
      SearchClusterProtos.Request other = (SearchClusterProtos.Request) obj;

      if (hasQuery() != other.hasQuery()) return false;
      if (hasQuery()) {
        if (!getQuery()
            .equals(other.getQuery())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasQuery()) {
        hash = (37 * hash) + QUERY_FIELD_NUMBER;
        hash = (53 * hash) + getQuery().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SearchClusterProtos.Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SearchClusterProtos.Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SearchClusterProtos.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SearchClusterProtos.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SearchClusterProtos.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SearchClusterProtos.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SearchClusterProtos.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SearchClusterProtos.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SearchClusterProtos.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SearchClusterProtos.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SearchClusterProtos.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SearchClusterProtos.Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SearchClusterProtos.Request prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code distributed.search.Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:distributed.search.Request)
        SearchClusterProtos.RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SearchClusterProtos.internal_static_distributed_search_Request_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SearchClusterProtos.internal_static_distributed_search_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SearchClusterProtos.Request.class, SearchClusterProtos.Request.Builder.class);
      }

      // Construct using distributed.search.SearchClusterProtos.Request.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        query_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SearchClusterProtos.internal_static_distributed_search_Request_descriptor;
      }

      @java.lang.Override
      public SearchClusterProtos.Request getDefaultInstanceForType() {
        return SearchClusterProtos.Request.getDefaultInstance();
      }

      @java.lang.Override
      public SearchClusterProtos.Request build() {
        SearchClusterProtos.Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SearchClusterProtos.Request buildPartial() {
        SearchClusterProtos.Request result = new SearchClusterProtos.Request(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(SearchClusterProtos.Request result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.query_ = query_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SearchClusterProtos.Request) {
          return mergeFrom((SearchClusterProtos.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SearchClusterProtos.Request other) {
        if (other == SearchClusterProtos.Request.getDefaultInstance()) return this;
        if (other.hasQuery()) {
          query_ = other.query_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasQuery()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                query_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object query_ = "";
      /**
       * <code>required string query = 1;</code>
       * @return Whether the query field is set.
       */
      public boolean hasQuery() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string query = 1;</code>
       * @return The query.
       */
      public java.lang.String getQuery() {
        java.lang.Object ref = query_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            query_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string query = 1;</code>
       * @return The bytes for query.
       */
      public com.google.protobuf.ByteString
          getQueryBytes() {
        java.lang.Object ref = query_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          query_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string query = 1;</code>
       * @param value The query to set.
       * @return This builder for chaining.
       */
      public Builder setQuery(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        query_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required string query = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuery() {
        query_ = getDefaultInstance().getQuery();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>required string query = 1;</code>
       * @param value The bytes for query to set.
       * @return This builder for chaining.
       */
      public Builder setQueryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        query_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:distributed.search.Request)
    }

    // @@protoc_insertion_point(class_scope:distributed.search.Request)
    private static final SearchClusterProtos.Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SearchClusterProtos.Request();
    }

    public static SearchClusterProtos.Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Request>
        PARSER = new com.google.protobuf.AbstractParser<Request>() {
      @java.lang.Override
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SearchClusterProtos.Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:distributed.search.Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    java.util.List<SearchClusterProtos.Response.DocumentStats>
        getDocumentsList();
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    SearchClusterProtos.Response.DocumentStats getDocuments(int index);
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    int getDocumentsCount();
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    java.util.List<? extends SearchClusterProtos.Response.DocumentStatsOrBuilder>
        getDocumentsOrBuilderList();
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    SearchClusterProtos.Response.DocumentStatsOrBuilder getDocumentsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code distributed.search.Response}
   */
  public static final class Response extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:distributed.search.Response)
      ResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 26,
        /* patch= */ 1,
        /* suffix= */ "",
        Response.class.getName());
    }
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Response() {
      documents_ = java.util.Collections.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SearchClusterProtos.internal_static_distributed_search_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SearchClusterProtos.internal_static_distributed_search_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SearchClusterProtos.Response.class, SearchClusterProtos.Response.Builder.class);
    }

    public interface DocumentStatsOrBuilder extends
        // @@protoc_insertion_point(interface_extends:distributed.search.Response.DocumentStats)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>required string name = 1;</code>
       * @return Whether the name field is set.
       */
      boolean hasName();
      /**
       * <code>required string name = 1;</code>
       * @return The name.
       */
      java.lang.String getName();
      /**
       * <code>required string name = 1;</code>
       * @return The bytes for name.
       */
      com.google.protobuf.ByteString
          getNameBytes();

      /**
       * <code>optional double score = 2;</code>
       * @return Whether the score field is set.
       */
      boolean hasScore();
      /**
       * <code>optional double score = 2;</code>
       * @return The score.
       */
      double getScore();
    }
    /**
     * Protobuf type {@code distributed.search.Response.DocumentStats}
     */
    public static final class DocumentStats extends
        com.google.protobuf.GeneratedMessage implements
        // @@protoc_insertion_point(message_implements:distributed.search.Response.DocumentStats)
        DocumentStatsOrBuilder {
    private static final long serialVersionUID = 0L;
      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 26,
          /* patch= */ 1,
          /* suffix= */ "",
          DocumentStats.class.getName());
      }
      // Use DocumentStats.newBuilder() to construct.
      private DocumentStats(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
      }
      private DocumentStats() {
        name_ = "";
      }

      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SearchClusterProtos.internal_static_distributed_search_Response_DocumentStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SearchClusterProtos.internal_static_distributed_search_Response_DocumentStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SearchClusterProtos.Response.DocumentStats.class, SearchClusterProtos.Response.DocumentStats.Builder.class);
      }

      private int bitField0_;
      public static final int NAME_FIELD_NUMBER = 1;
      @SuppressWarnings("serial")
      private volatile java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       * @return Whether the name field is set.
       */
      @java.lang.Override
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string name = 1;</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        }
      }
      /**
       * <code>required string name = 1;</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int SCORE_FIELD_NUMBER = 2;
      private double score_ = 0D;
      /**
       * <code>optional double score = 2;</code>
       * @return Whether the score field is set.
       */
      @java.lang.Override
      public boolean hasScore() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional double score = 2;</code>
       * @return The score.
       */
      @java.lang.Override
      public double getScore() {
        return score_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasName()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeDouble(2, score_);
        }
        getUnknownFields().writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeDoubleSize(2, score_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof SearchClusterProtos.Response.DocumentStats)) {
          return super.equals(obj);
        }
        SearchClusterProtos.Response.DocumentStats other = (SearchClusterProtos.Response.DocumentStats) obj;

        if (hasName() != other.hasName()) return false;
        if (hasName()) {
          if (!getName()
              .equals(other.getName())) return false;
        }
        if (hasScore() != other.hasScore()) return false;
        if (hasScore()) {
          if (java.lang.Double.doubleToLongBits(getScore())
              != java.lang.Double.doubleToLongBits(
                  other.getScore())) return false;
        }
        if (!getUnknownFields().equals(other.getUnknownFields())) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasName()) {
          hash = (37 * hash) + NAME_FIELD_NUMBER;
          hash = (53 * hash) + getName().hashCode();
        }
        if (hasScore()) {
          hash = (37 * hash) + SCORE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              java.lang.Double.doubleToLongBits(getScore()));
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static SearchClusterProtos.Response.DocumentStats parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
            .parseWithIOException(PARSER, input);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SearchClusterProtos.Response.DocumentStats parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
            .parseDelimitedWithIOException(PARSER, input);
      }

      public static SearchClusterProtos.Response.DocumentStats parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
            .parseWithIOException(PARSER, input);
      }
      public static SearchClusterProtos.Response.DocumentStats parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(SearchClusterProtos.Response.DocumentStats prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code distributed.search.Response.DocumentStats}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:distributed.search.Response.DocumentStats)
          SearchClusterProtos.Response.DocumentStatsOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return SearchClusterProtos.internal_static_distributed_search_Response_DocumentStats_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return SearchClusterProtos.internal_static_distributed_search_Response_DocumentStats_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  SearchClusterProtos.Response.DocumentStats.class, SearchClusterProtos.Response.DocumentStats.Builder.class);
        }

        // Construct using distributed.search.SearchClusterProtos.Response.DocumentStats.newBuilder()
        private Builder() {

        }

        private Builder(
            com.google.protobuf.GeneratedMessage.BuilderParent parent) {
          super(parent);

        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          bitField0_ = 0;
          name_ = "";
          score_ = 0D;
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return SearchClusterProtos.internal_static_distributed_search_Response_DocumentStats_descriptor;
        }

        @java.lang.Override
        public SearchClusterProtos.Response.DocumentStats getDefaultInstanceForType() {
          return SearchClusterProtos.Response.DocumentStats.getDefaultInstance();
        }

        @java.lang.Override
        public SearchClusterProtos.Response.DocumentStats build() {
          SearchClusterProtos.Response.DocumentStats result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public SearchClusterProtos.Response.DocumentStats buildPartial() {
          SearchClusterProtos.Response.DocumentStats result = new SearchClusterProtos.Response.DocumentStats(this);
          if (bitField0_ != 0) { buildPartial0(result); }
          onBuilt();
          return result;
        }

        private void buildPartial0(SearchClusterProtos.Response.DocumentStats result) {
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            result.name_ = name_;
            to_bitField0_ |= 0x00000001;
          }
          if (((from_bitField0_ & 0x00000002) != 0)) {
            result.score_ = score_;
            to_bitField0_ |= 0x00000002;
          }
          result.bitField0_ |= to_bitField0_;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof SearchClusterProtos.Response.DocumentStats) {
            return mergeFrom((SearchClusterProtos.Response.DocumentStats)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(SearchClusterProtos.Response.DocumentStats other) {
          if (other == SearchClusterProtos.Response.DocumentStats.getDefaultInstance()) return this;
          if (other.hasName()) {
            name_ = other.name_;
            bitField0_ |= 0x00000001;
            onChanged();
          }
          if (other.hasScore()) {
            setScore(other.getScore());
          }
          this.mergeUnknownFields(other.getUnknownFields());
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasName()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  name_ = input.readBytes();
                  bitField0_ |= 0x00000001;
                  break;
                } // case 10
                case 17: {
                  score_ = input.readDouble();
                  bitField0_ |= 0x00000002;
                  break;
                } // case 17
                default: {
                  if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                    done = true; // was an endgroup tag
                  }
                  break;
                } // default:
              } // switch (tag)
            } // while (!done)
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
          } finally {
            onChanged();
          } // finally
          return this;
        }
        private int bitField0_;

        private java.lang.Object name_ = "";
        /**
         * <code>required string name = 1;</code>
         * @return Whether the name field is set.
         */
        public boolean hasName() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>required string name = 1;</code>
         * @return The name.
         */
        public java.lang.String getName() {
          java.lang.Object ref = name_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              name_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>required string name = 1;</code>
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
            getNameBytes() {
          java.lang.Object ref = name_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            name_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>required string name = 1;</code>
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(
            java.lang.String value) {
          if (value == null) { throw new NullPointerException(); }
          name_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }
        /**
         * <code>required string name = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearName() {
          name_ = getDefaultInstance().getName();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
          return this;
        }
        /**
         * <code>required string name = 1;</code>
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) { throw new NullPointerException(); }
          name_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }

        private double score_ ;
        /**
         * <code>optional double score = 2;</code>
         * @return Whether the score field is set.
         */
        @java.lang.Override
        public boolean hasScore() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>optional double score = 2;</code>
         * @return The score.
         */
        @java.lang.Override
        public double getScore() {
          return score_;
        }
        /**
         * <code>optional double score = 2;</code>
         * @param value The score to set.
         * @return This builder for chaining.
         */
        public Builder setScore(double value) {

          score_ = value;
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }
        /**
         * <code>optional double score = 2;</code>
         * @return This builder for chaining.
         */
        public Builder clearScore() {
          bitField0_ = (bitField0_ & ~0x00000002);
          score_ = 0D;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:distributed.search.Response.DocumentStats)
      }

      // @@protoc_insertion_point(class_scope:distributed.search.Response.DocumentStats)
      private static final SearchClusterProtos.Response.DocumentStats DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new SearchClusterProtos.Response.DocumentStats();
      }

      public static SearchClusterProtos.Response.DocumentStats getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<DocumentStats>
          PARSER = new com.google.protobuf.AbstractParser<DocumentStats>() {
        @java.lang.Override
        public DocumentStats parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

      public static com.google.protobuf.Parser<DocumentStats> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<DocumentStats> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public SearchClusterProtos.Response.DocumentStats getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public static final int DOCUMENTS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<SearchClusterProtos.Response.DocumentStats> documents_;
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    @java.lang.Override
    public java.util.List<SearchClusterProtos.Response.DocumentStats> getDocumentsList() {
      return documents_;
    }
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends SearchClusterProtos.Response.DocumentStatsOrBuilder>
        getDocumentsOrBuilderList() {
      return documents_;
    }
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    @java.lang.Override
    public int getDocumentsCount() {
      return documents_.size();
    }
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    @java.lang.Override
    public SearchClusterProtos.Response.DocumentStats getDocuments(int index) {
      return documents_.get(index);
    }
    /**
     * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
     */
    @java.lang.Override
    public SearchClusterProtos.Response.DocumentStatsOrBuilder getDocumentsOrBuilder(
        int index) {
      return documents_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getDocumentsCount(); i++) {
        if (!getDocuments(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < documents_.size(); i++) {
        output.writeMessage(1, documents_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < documents_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, documents_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SearchClusterProtos.Response)) {
        return super.equals(obj);
      }
      SearchClusterProtos.Response other = (SearchClusterProtos.Response) obj;

      if (!getDocumentsList()
          .equals(other.getDocumentsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getDocumentsCount() > 0) {
        hash = (37 * hash) + DOCUMENTS_FIELD_NUMBER;
        hash = (53 * hash) + getDocumentsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SearchClusterProtos.Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SearchClusterProtos.Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SearchClusterProtos.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SearchClusterProtos.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SearchClusterProtos.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SearchClusterProtos.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SearchClusterProtos.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SearchClusterProtos.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SearchClusterProtos.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SearchClusterProtos.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SearchClusterProtos.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SearchClusterProtos.Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SearchClusterProtos.Response prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code distributed.search.Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:distributed.search.Response)
        SearchClusterProtos.ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SearchClusterProtos.internal_static_distributed_search_Response_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SearchClusterProtos.internal_static_distributed_search_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SearchClusterProtos.Response.class, SearchClusterProtos.Response.Builder.class);
      }

      // Construct using distributed.search.SearchClusterProtos.Response.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        if (documentsBuilder_ == null) {
          documents_ = java.util.Collections.emptyList();
        } else {
          documents_ = null;
          documentsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SearchClusterProtos.internal_static_distributed_search_Response_descriptor;
      }

      @java.lang.Override
      public SearchClusterProtos.Response getDefaultInstanceForType() {
        return SearchClusterProtos.Response.getDefaultInstance();
      }

      @java.lang.Override
      public SearchClusterProtos.Response build() {
        SearchClusterProtos.Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SearchClusterProtos.Response buildPartial() {
        SearchClusterProtos.Response result = new SearchClusterProtos.Response(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(SearchClusterProtos.Response result) {
        if (documentsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            documents_ = java.util.Collections.unmodifiableList(documents_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.documents_ = documents_;
        } else {
          result.documents_ = documentsBuilder_.build();
        }
      }

      private void buildPartial0(SearchClusterProtos.Response result) {
        int from_bitField0_ = bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SearchClusterProtos.Response) {
          return mergeFrom((SearchClusterProtos.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SearchClusterProtos.Response other) {
        if (other == SearchClusterProtos.Response.getDefaultInstance()) return this;
        if (documentsBuilder_ == null) {
          if (!other.documents_.isEmpty()) {
            if (documents_.isEmpty()) {
              documents_ = other.documents_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDocumentsIsMutable();
              documents_.addAll(other.documents_);
            }
            onChanged();
          }
        } else {
          if (!other.documents_.isEmpty()) {
            if (documentsBuilder_.isEmpty()) {
              documentsBuilder_.dispose();
              documentsBuilder_ = null;
              documents_ = other.documents_;
              bitField0_ = (bitField0_ & ~0x00000001);
              documentsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getDocumentsFieldBuilder() : null;
            } else {
              documentsBuilder_.addAllMessages(other.documents_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getDocumentsCount(); i++) {
          if (!getDocuments(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                SearchClusterProtos.Response.DocumentStats m =
                    input.readMessage(
                        SearchClusterProtos.Response.DocumentStats.parser(),
                        extensionRegistry);
                if (documentsBuilder_ == null) {
                  ensureDocumentsIsMutable();
                  documents_.add(m);
                } else {
                  documentsBuilder_.addMessage(m);
                }
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.util.List<SearchClusterProtos.Response.DocumentStats> documents_ =
        java.util.Collections.emptyList();
      private void ensureDocumentsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          documents_ = new java.util.ArrayList<SearchClusterProtos.Response.DocumentStats>(documents_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          SearchClusterProtos.Response.DocumentStats, SearchClusterProtos.Response.DocumentStats.Builder, SearchClusterProtos.Response.DocumentStatsOrBuilder> documentsBuilder_;

      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public java.util.List<SearchClusterProtos.Response.DocumentStats> getDocumentsList() {
        if (documentsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(documents_);
        } else {
          return documentsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public int getDocumentsCount() {
        if (documentsBuilder_ == null) {
          return documents_.size();
        } else {
          return documentsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public SearchClusterProtos.Response.DocumentStats getDocuments(int index) {
        if (documentsBuilder_ == null) {
          return documents_.get(index);
        } else {
          return documentsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder setDocuments(
          int index, SearchClusterProtos.Response.DocumentStats value) {
        if (documentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentsIsMutable();
          documents_.set(index, value);
          onChanged();
        } else {
          documentsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder setDocuments(
          int index, SearchClusterProtos.Response.DocumentStats.Builder builderForValue) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          documents_.set(index, builderForValue.build());
          onChanged();
        } else {
          documentsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder addDocuments(SearchClusterProtos.Response.DocumentStats value) {
        if (documentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentsIsMutable();
          documents_.add(value);
          onChanged();
        } else {
          documentsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder addDocuments(
          int index, SearchClusterProtos.Response.DocumentStats value) {
        if (documentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentsIsMutable();
          documents_.add(index, value);
          onChanged();
        } else {
          documentsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder addDocuments(
          SearchClusterProtos.Response.DocumentStats.Builder builderForValue) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          documents_.add(builderForValue.build());
          onChanged();
        } else {
          documentsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder addDocuments(
          int index, SearchClusterProtos.Response.DocumentStats.Builder builderForValue) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          documents_.add(index, builderForValue.build());
          onChanged();
        } else {
          documentsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder addAllDocuments(
          java.lang.Iterable<? extends SearchClusterProtos.Response.DocumentStats> values) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, documents_);
          onChanged();
        } else {
          documentsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder clearDocuments() {
        if (documentsBuilder_ == null) {
          documents_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          documentsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public Builder removeDocuments(int index) {
        if (documentsBuilder_ == null) {
          ensureDocumentsIsMutable();
          documents_.remove(index);
          onChanged();
        } else {
          documentsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public SearchClusterProtos.Response.DocumentStats.Builder getDocumentsBuilder(
          int index) {
        return getDocumentsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public SearchClusterProtos.Response.DocumentStatsOrBuilder getDocumentsOrBuilder(
          int index) {
        if (documentsBuilder_ == null) {
          return documents_.get(index);  } else {
          return documentsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public java.util.List<? extends SearchClusterProtos.Response.DocumentStatsOrBuilder>
           getDocumentsOrBuilderList() {
        if (documentsBuilder_ != null) {
          return documentsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(documents_);
        }
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public SearchClusterProtos.Response.DocumentStats.Builder addDocumentsBuilder() {
        return getDocumentsFieldBuilder().addBuilder(
            SearchClusterProtos.Response.DocumentStats.getDefaultInstance());
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public SearchClusterProtos.Response.DocumentStats.Builder addDocumentsBuilder(
          int index) {
        return getDocumentsFieldBuilder().addBuilder(
            index, SearchClusterProtos.Response.DocumentStats.getDefaultInstance());
      }
      /**
       * <code>repeated .distributed.search.Response.DocumentStats documents = 1;</code>
       */
      public java.util.List<SearchClusterProtos.Response.DocumentStats.Builder>
           getDocumentsBuilderList() {
        return getDocumentsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          SearchClusterProtos.Response.DocumentStats, SearchClusterProtos.Response.DocumentStats.Builder, SearchClusterProtos.Response.DocumentStatsOrBuilder>
          getDocumentsFieldBuilder() {
        if (documentsBuilder_ == null) {
          documentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              SearchClusterProtos.Response.DocumentStats, SearchClusterProtos.Response.DocumentStats.Builder, SearchClusterProtos.Response.DocumentStatsOrBuilder>(
                  documents_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          documents_ = null;
        }
        return documentsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:distributed.search.Response)
    }

    // @@protoc_insertion_point(class_scope:distributed.search.Response)
    private static final SearchClusterProtos.Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SearchClusterProtos.Response();
    }

    public static SearchClusterProtos.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Response>
        PARSER = new com.google.protobuf.AbstractParser<Response>() {
      @java.lang.Override
      public Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SearchClusterProtos.Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributed_search_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_distributed_search_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributed_search_Response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_distributed_search_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributed_search_Response_DocumentStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_distributed_search_Response_DocumentStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033search_cluster_protos.proto\022\022distribut" +
      "ed.search\"\030\n\007Request\022\r\n\005query\030\001 \002(\t\"w\n\010R" +
      "esponse\022=\n\tdocuments\030\001 \003(\0132*.distributed" +
      ".search.Response.DocumentStats\032,\n\rDocume" +
      "ntStats\022\014\n\004name\030\001 \002(\t\022\r\n\005score\030\002 \001(\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_distributed_search_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_distributed_search_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_distributed_search_Request_descriptor,
        new java.lang.String[] { "Query", });
    internal_static_distributed_search_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_distributed_search_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_distributed_search_Response_descriptor,
        new java.lang.String[] { "Documents", });
    internal_static_distributed_search_Response_DocumentStats_descriptor =
      internal_static_distributed_search_Response_descriptor.getNestedTypes().get(0);
    internal_static_distributed_search_Response_DocumentStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_distributed_search_Response_DocumentStats_descriptor,
        new java.lang.String[] { "Name", "Score", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
