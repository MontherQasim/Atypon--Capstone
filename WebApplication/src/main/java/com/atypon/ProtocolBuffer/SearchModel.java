package com.atypon.ProtocolBuffer;

public final class SearchModel {
    private SearchModel() {}
    static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
                com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
                /* major= */ 4,
                /* minor= */ 26,
                /* patch= */ 1,
                /* suffix= */ "",
                SearchModel.class.getName());
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
            // @@protoc_insertion_point(interface_extends:Model.proto.Request)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string search_query = 1;</code>
         * @return Whether the searchQuery field is set.
         */
        boolean hasSearchQuery();
        /**
         * <code>required string search_query = 1;</code>
         * @return The searchQuery.
         */
        java.lang.String getSearchQuery();
        /**
         * <code>required string search_query = 1;</code>
         * @return The bytes for searchQuery.
         */
        com.google.protobuf.ByteString
        getSearchQueryBytes();
    }
    /**
     * Protobuf type {@code Model.proto.Request}
     */
    public static final class Request extends
            com.google.protobuf.GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:Model.proto.Request)
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
            searchQuery_ = "";
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SearchModel.internal_static_Model_proto_Request_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SearchModel.internal_static_Model_proto_Request_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SearchModel.Request.class, SearchModel.Request.Builder.class);
        }

        private int bitField0_;
        public static final int SEARCH_QUERY_FIELD_NUMBER = 1;
        @SuppressWarnings("serial")
        private volatile java.lang.Object searchQuery_ = "";
        /**
         * <code>required string search_query = 1;</code>
         * @return Whether the searchQuery field is set.
         */
        @java.lang.Override
        public boolean hasSearchQuery() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>required string search_query = 1;</code>
         * @return The searchQuery.
         */
        @java.lang.Override
        public java.lang.String getSearchQuery() {
            java.lang.Object ref = searchQuery_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    searchQuery_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string search_query = 1;</code>
         * @return The bytes for searchQuery.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getSearchQueryBytes() {
            java.lang.Object ref = searchQuery_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                searchQuery_ = b;
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

            if (!hasSearchQuery()) {
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
                com.google.protobuf.GeneratedMessage.writeString(output, 1, searchQuery_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.GeneratedMessage.computeStringSize(1, searchQuery_);
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
            if (!(obj instanceof SearchModel.Request)) {
                return super.equals(obj);
            }
            SearchModel.Request other = (SearchModel.Request) obj;

            if (hasSearchQuery() != other.hasSearchQuery()) return false;
            if (hasSearchQuery()) {
                if (!getSearchQuery()
                        .equals(other.getSearchQuery())) return false;
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
            if (hasSearchQuery()) {
                hash = (37 * hash) + SEARCH_QUERY_FIELD_NUMBER;
                hash = (53 * hash) + getSearchQuery().hashCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static SearchModel.Request parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.Request parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.Request parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.Request parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.Request parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.Request parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.Request parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input);
        }
        public static SearchModel.Request parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static SearchModel.Request parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static SearchModel.Request parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static SearchModel.Request parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input);
        }
        public static SearchModel.Request parseFrom(
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
        public static Builder newBuilder(SearchModel.Request prototype) {
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
         * Protobuf type {@code Model.proto.Request}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Model.proto.Request)
                SearchModel.RequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SearchModel.internal_static_Model_proto_Request_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SearchModel.internal_static_Model_proto_Request_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SearchModel.Request.class, SearchModel.Request.Builder.class);
            }

            // Construct using ProtocolBuffer.SearchModel.Request.newBuilder()
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
                searchQuery_ = "";
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SearchModel.internal_static_Model_proto_Request_descriptor;
            }

            @java.lang.Override
            public SearchModel.Request getDefaultInstanceForType() {
                return SearchModel.Request.getDefaultInstance();
            }

            @java.lang.Override
            public SearchModel.Request build() {
                SearchModel.Request result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public SearchModel.Request buildPartial() {
                SearchModel.Request result = new SearchModel.Request(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(SearchModel.Request result) {
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.searchQuery_ = searchQuery_;
                    to_bitField0_ |= 0x00000001;
                }
                result.bitField0_ |= to_bitField0_;
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SearchModel.Request) {
                    return mergeFrom((SearchModel.Request)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SearchModel.Request other) {
                if (other == SearchModel.Request.getDefaultInstance()) return this;
                if (other.hasSearchQuery()) {
                    searchQuery_ = other.searchQuery_;
                    bitField0_ |= 0x00000001;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                if (!hasSearchQuery()) {
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
                                searchQuery_ = input.readBytes();
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

            private java.lang.Object searchQuery_ = "";
            /**
             * <code>required string search_query = 1;</code>
             * @return Whether the searchQuery field is set.
             */
            public boolean hasSearchQuery() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <code>required string search_query = 1;</code>
             * @return The searchQuery.
             */
            public java.lang.String getSearchQuery() {
                java.lang.Object ref = searchQuery_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        searchQuery_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string search_query = 1;</code>
             * @return The bytes for searchQuery.
             */
            public com.google.protobuf.ByteString
            getSearchQueryBytes() {
                java.lang.Object ref = searchQuery_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    searchQuery_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string search_query = 1;</code>
             * @param value The searchQuery to set.
             * @return This builder for chaining.
             */
            public Builder setSearchQuery(
                    java.lang.String value) {
                if (value == null) { throw new NullPointerException(); }
                searchQuery_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>required string search_query = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearSearchQuery() {
                searchQuery_ = getDefaultInstance().getSearchQuery();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }
            /**
             * <code>required string search_query = 1;</code>
             * @param value The bytes for searchQuery to set.
             * @return This builder for chaining.
             */
            public Builder setSearchQueryBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) { throw new NullPointerException(); }
                searchQuery_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Model.proto.Request)
        }

        // @@protoc_insertion_point(class_scope:Model.proto.Request)
        private static final SearchModel.Request DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new SearchModel.Request();
        }

        public static SearchModel.Request getDefaultInstance() {
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
        public SearchModel.Request getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Model.proto.Response)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        java.util.List<SearchModel.DocumentStats>
        getRelevantDocumentsList();
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        SearchModel.DocumentStats getRelevantDocuments(int index);
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        int getRelevantDocumentsCount();
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        java.util.List<? extends SearchModel.DocumentStatsOrBuilder>
        getRelevantDocumentsOrBuilderList();
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        SearchModel.DocumentStatsOrBuilder getRelevantDocumentsOrBuilder(
                int index);

        /**
         * <code>optional int32 status_code = 2;</code>
         * @return Whether the statusCode field is set.
         */
        boolean hasStatusCode();
        /**
         * <code>optional int32 status_code = 2;</code>
         * @return The statusCode.
         */
        int getStatusCode();
    }
    /**
     * Protobuf type {@code Model.proto.Response}
     */
    public static final class Response extends
            com.google.protobuf.GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:Model.proto.Response)
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
            relevantDocuments_ = java.util.Collections.emptyList();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SearchModel.internal_static_Model_proto_Response_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SearchModel.internal_static_Model_proto_Response_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SearchModel.Response.class, SearchModel.Response.Builder.class);
        }

        private int bitField0_;
        public static final int RELEVANT_DOCUMENTS_FIELD_NUMBER = 1;
        @SuppressWarnings("serial")
        private java.util.List<SearchModel.DocumentStats> relevantDocuments_;
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        @java.lang.Override
        public java.util.List<SearchModel.DocumentStats> getRelevantDocumentsList() {
            return relevantDocuments_;
        }
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        @java.lang.Override
        public java.util.List<? extends SearchModel.DocumentStatsOrBuilder>
        getRelevantDocumentsOrBuilderList() {
            return relevantDocuments_;
        }
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        @java.lang.Override
        public int getRelevantDocumentsCount() {
            return relevantDocuments_.size();
        }
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        @java.lang.Override
        public SearchModel.DocumentStats getRelevantDocuments(int index) {
            return relevantDocuments_.get(index);
        }
        /**
         * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
         */
        @java.lang.Override
        public SearchModel.DocumentStatsOrBuilder getRelevantDocumentsOrBuilder(
                int index) {
            return relevantDocuments_.get(index);
        }

        public static final int STATUS_CODE_FIELD_NUMBER = 2;
        private int statusCode_ = 0;
        /**
         * <code>optional int32 status_code = 2;</code>
         * @return Whether the statusCode field is set.
         */
        @java.lang.Override
        public boolean hasStatusCode() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>optional int32 status_code = 2;</code>
         * @return The statusCode.
         */
        @java.lang.Override
        public int getStatusCode() {
            return statusCode_;
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            for (int i = 0; i < getRelevantDocumentsCount(); i++) {
                if (!getRelevantDocuments(i).isInitialized()) {
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
            for (int i = 0; i < relevantDocuments_.size(); i++) {
                output.writeMessage(1, relevantDocuments_.get(i));
            }
            if (((bitField0_ & 0x00000001) != 0)) {
                output.writeInt32(2, statusCode_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < relevantDocuments_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, relevantDocuments_.get(i));
            }
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, statusCode_);
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
            if (!(obj instanceof SearchModel.Response)) {
                return super.equals(obj);
            }
            SearchModel.Response other = (SearchModel.Response) obj;

            if (!getRelevantDocumentsList()
                    .equals(other.getRelevantDocumentsList())) return false;
            if (hasStatusCode() != other.hasStatusCode()) return false;
            if (hasStatusCode()) {
                if (getStatusCode()
                        != other.getStatusCode()) return false;
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
            if (getRelevantDocumentsCount() > 0) {
                hash = (37 * hash) + RELEVANT_DOCUMENTS_FIELD_NUMBER;
                hash = (53 * hash) + getRelevantDocumentsList().hashCode();
            }
            if (hasStatusCode()) {
                hash = (37 * hash) + STATUS_CODE_FIELD_NUMBER;
                hash = (53 * hash) + getStatusCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static SearchModel.Response parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.Response parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.Response parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.Response parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.Response parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.Response parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.Response parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input);
        }
        public static SearchModel.Response parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static SearchModel.Response parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static SearchModel.Response parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static SearchModel.Response parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input);
        }
        public static SearchModel.Response parseFrom(
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
        public static Builder newBuilder(SearchModel.Response prototype) {
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
         * Protobuf type {@code Model.proto.Response}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Model.proto.Response)
                SearchModel.ResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SearchModel.internal_static_Model_proto_Response_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SearchModel.internal_static_Model_proto_Response_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SearchModel.Response.class, SearchModel.Response.Builder.class);
            }

            // Construct using ProtocolBuffer.SearchModel.Response.newBuilder()
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
                if (relevantDocumentsBuilder_ == null) {
                    relevantDocuments_ = java.util.Collections.emptyList();
                } else {
                    relevantDocuments_ = null;
                    relevantDocumentsBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                statusCode_ = 0;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SearchModel.internal_static_Model_proto_Response_descriptor;
            }

            @java.lang.Override
            public SearchModel.Response getDefaultInstanceForType() {
                return SearchModel.Response.getDefaultInstance();
            }

            @java.lang.Override
            public SearchModel.Response build() {
                SearchModel.Response result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public SearchModel.Response buildPartial() {
                SearchModel.Response result = new SearchModel.Response(this);
                buildPartialRepeatedFields(result);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartialRepeatedFields(SearchModel.Response result) {
                if (relevantDocumentsBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        relevantDocuments_ = java.util.Collections.unmodifiableList(relevantDocuments_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.relevantDocuments_ = relevantDocuments_;
                } else {
                    result.relevantDocuments_ = relevantDocumentsBuilder_.build();
                }
            }

            private void buildPartial0(SearchModel.Response result) {
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.statusCode_ = statusCode_;
                    to_bitField0_ |= 0x00000001;
                }
                result.bitField0_ |= to_bitField0_;
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SearchModel.Response) {
                    return mergeFrom((SearchModel.Response)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SearchModel.Response other) {
                if (other == SearchModel.Response.getDefaultInstance()) return this;
                if (relevantDocumentsBuilder_ == null) {
                    if (!other.relevantDocuments_.isEmpty()) {
                        if (relevantDocuments_.isEmpty()) {
                            relevantDocuments_ = other.relevantDocuments_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureRelevantDocumentsIsMutable();
                            relevantDocuments_.addAll(other.relevantDocuments_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.relevantDocuments_.isEmpty()) {
                        if (relevantDocumentsBuilder_.isEmpty()) {
                            relevantDocumentsBuilder_.dispose();
                            relevantDocumentsBuilder_ = null;
                            relevantDocuments_ = other.relevantDocuments_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            relevantDocumentsBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getRelevantDocumentsFieldBuilder() : null;
                        } else {
                            relevantDocumentsBuilder_.addAllMessages(other.relevantDocuments_);
                        }
                    }
                }
                if (other.hasStatusCode()) {
                    setStatusCode(other.getStatusCode());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                for (int i = 0; i < getRelevantDocumentsCount(); i++) {
                    if (!getRelevantDocuments(i).isInitialized()) {
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
                                SearchModel.DocumentStats m =
                                        input.readMessage(
                                                SearchModel.DocumentStats.parser(),
                                                extensionRegistry);
                                if (relevantDocumentsBuilder_ == null) {
                                    ensureRelevantDocumentsIsMutable();
                                    relevantDocuments_.add(m);
                                } else {
                                    relevantDocumentsBuilder_.addMessage(m);
                                }
                                break;
                            } // case 10
                            case 16: {
                                statusCode_ = input.readInt32();
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 16
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

            private java.util.List<SearchModel.DocumentStats> relevantDocuments_ =
                    java.util.Collections.emptyList();
            private void ensureRelevantDocumentsIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    relevantDocuments_ = new java.util.ArrayList<SearchModel.DocumentStats>(relevantDocuments_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<
                    SearchModel.DocumentStats, SearchModel.DocumentStats.Builder, SearchModel.DocumentStatsOrBuilder> relevantDocumentsBuilder_;

            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public java.util.List<SearchModel.DocumentStats> getRelevantDocumentsList() {
                if (relevantDocumentsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(relevantDocuments_);
                } else {
                    return relevantDocumentsBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public int getRelevantDocumentsCount() {
                if (relevantDocumentsBuilder_ == null) {
                    return relevantDocuments_.size();
                } else {
                    return relevantDocumentsBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public SearchModel.DocumentStats getRelevantDocuments(int index) {
                if (relevantDocumentsBuilder_ == null) {
                    return relevantDocuments_.get(index);
                } else {
                    return relevantDocumentsBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder setRelevantDocuments(
                    int index, SearchModel.DocumentStats value) {
                if (relevantDocumentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.set(index, value);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder setRelevantDocuments(
                    int index, SearchModel.DocumentStats.Builder builderForValue) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addRelevantDocuments(SearchModel.DocumentStats value) {
                if (relevantDocumentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.add(value);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addRelevantDocuments(
                    int index, SearchModel.DocumentStats value) {
                if (relevantDocumentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.add(index, value);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addRelevantDocuments(
                    SearchModel.DocumentStats.Builder builderForValue) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.add(builderForValue.build());
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addRelevantDocuments(
                    int index, SearchModel.DocumentStats.Builder builderForValue) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addAllRelevantDocuments(
                    java.lang.Iterable<? extends SearchModel.DocumentStats> values) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, relevantDocuments_);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder clearRelevantDocuments() {
                if (relevantDocumentsBuilder_ == null) {
                    relevantDocuments_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public Builder removeRelevantDocuments(int index) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.remove(index);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public SearchModel.DocumentStats.Builder getRelevantDocumentsBuilder(
                    int index) {
                return getRelevantDocumentsFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public SearchModel.DocumentStatsOrBuilder getRelevantDocumentsOrBuilder(
                    int index) {
                if (relevantDocumentsBuilder_ == null) {
                    return relevantDocuments_.get(index);  } else {
                    return relevantDocumentsBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public java.util.List<? extends SearchModel.DocumentStatsOrBuilder>
            getRelevantDocumentsOrBuilderList() {
                if (relevantDocumentsBuilder_ != null) {
                    return relevantDocumentsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(relevantDocuments_);
                }
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public SearchModel.DocumentStats.Builder addRelevantDocumentsBuilder() {
                return getRelevantDocumentsFieldBuilder().addBuilder(
                        SearchModel.DocumentStats.getDefaultInstance());
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public SearchModel.DocumentStats.Builder addRelevantDocumentsBuilder(
                    int index) {
                return getRelevantDocumentsFieldBuilder().addBuilder(
                        index, SearchModel.DocumentStats.getDefaultInstance());
            }
            /**
             * <code>repeated .Model.proto.DocumentStats relevant_documents = 1;</code>
             */
            public java.util.List<SearchModel.DocumentStats.Builder>
            getRelevantDocumentsBuilderList() {
                return getRelevantDocumentsFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    SearchModel.DocumentStats, SearchModel.DocumentStats.Builder, SearchModel.DocumentStatsOrBuilder>
            getRelevantDocumentsFieldBuilder() {
                if (relevantDocumentsBuilder_ == null) {
                    relevantDocumentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            SearchModel.DocumentStats, SearchModel.DocumentStats.Builder, SearchModel.DocumentStatsOrBuilder>(
                            relevantDocuments_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    relevantDocuments_ = null;
                }
                return relevantDocumentsBuilder_;
            }

            private int statusCode_ ;
            /**
             * <code>optional int32 status_code = 2;</code>
             * @return Whether the statusCode field is set.
             */
            @java.lang.Override
            public boolean hasStatusCode() {
                return ((bitField0_ & 0x00000002) != 0);
            }
            /**
             * <code>optional int32 status_code = 2;</code>
             * @return The statusCode.
             */
            @java.lang.Override
            public int getStatusCode() {
                return statusCode_;
            }
            /**
             * <code>optional int32 status_code = 2;</code>
             * @param value The statusCode to set.
             * @return This builder for chaining.
             */
            public Builder setStatusCode(int value) {

                statusCode_ = value;
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 status_code = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearStatusCode() {
                bitField0_ = (bitField0_ & ~0x00000002);
                statusCode_ = 0;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Model.proto.Response)
        }

        // @@protoc_insertion_point(class_scope:Model.proto.Response)
        private static final SearchModel.Response DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new SearchModel.Response();
        }

        public static SearchModel.Response getDefaultInstance() {
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
        public SearchModel.Response getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DocumentStatsOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Model.proto.DocumentStats)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string document_name = 1;</code>
         * @return Whether the documentName field is set.
         */
        boolean hasDocumentName();
        /**
         * <code>required string document_name = 1;</code>
         * @return The documentName.
         */
        java.lang.String getDocumentName();
        /**
         * <code>required string document_name = 1;</code>
         * @return The bytes for documentName.
         */
        com.google.protobuf.ByteString
        getDocumentNameBytes();

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
     * Protobuf type {@code Model.proto.DocumentStats}
     */
    public static final class DocumentStats extends
            com.google.protobuf.GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:Model.proto.DocumentStats)
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
            documentName_ = "";
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SearchModel.internal_static_Model_proto_DocumentStats_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SearchModel.internal_static_Model_proto_DocumentStats_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SearchModel.DocumentStats.class, SearchModel.DocumentStats.Builder.class);
        }

        private int bitField0_;
        public static final int DOCUMENT_NAME_FIELD_NUMBER = 1;
        @SuppressWarnings("serial")
        private volatile java.lang.Object documentName_ = "";
        /**
         * <code>required string document_name = 1;</code>
         * @return Whether the documentName field is set.
         */
        @java.lang.Override
        public boolean hasDocumentName() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>required string document_name = 1;</code>
         * @return The documentName.
         */
        @java.lang.Override
        public java.lang.String getDocumentName() {
            java.lang.Object ref = documentName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    documentName_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string document_name = 1;</code>
         * @return The bytes for documentName.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getDocumentNameBytes() {
            java.lang.Object ref = documentName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                documentName_ = b;
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

            if (!hasDocumentName()) {
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
                com.google.protobuf.GeneratedMessage.writeString(output, 1, documentName_);
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
                size += com.google.protobuf.GeneratedMessage.computeStringSize(1, documentName_);
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
            if (!(obj instanceof SearchModel.DocumentStats)) {
                return super.equals(obj);
            }
            SearchModel.DocumentStats other = (SearchModel.DocumentStats) obj;

            if (hasDocumentName() != other.hasDocumentName()) return false;
            if (hasDocumentName()) {
                if (!getDocumentName()
                        .equals(other.getDocumentName())) return false;
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
            if (hasDocumentName()) {
                hash = (37 * hash) + DOCUMENT_NAME_FIELD_NUMBER;
                hash = (53 * hash) + getDocumentName().hashCode();
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

        public static SearchModel.DocumentStats parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.DocumentStats parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.DocumentStats parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.DocumentStats parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.DocumentStats parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SearchModel.DocumentStats parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SearchModel.DocumentStats parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input);
        }
        public static SearchModel.DocumentStats parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static SearchModel.DocumentStats parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static SearchModel.DocumentStats parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static SearchModel.DocumentStats parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessage
                    .parseWithIOException(PARSER, input);
        }
        public static SearchModel.DocumentStats parseFrom(
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
        public static Builder newBuilder(SearchModel.DocumentStats prototype) {
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
         * Protobuf type {@code Model.proto.DocumentStats}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Model.proto.DocumentStats)
                SearchModel.DocumentStatsOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SearchModel.internal_static_Model_proto_DocumentStats_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SearchModel.internal_static_Model_proto_DocumentStats_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SearchModel.DocumentStats.class, SearchModel.DocumentStats.Builder.class);
            }

            // Construct using ProtocolBuffer.SearchModel.DocumentStats.newBuilder()
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
                documentName_ = "";
                score_ = 0D;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SearchModel.internal_static_Model_proto_DocumentStats_descriptor;
            }

            @java.lang.Override
            public SearchModel.DocumentStats getDefaultInstanceForType() {
                return SearchModel.DocumentStats.getDefaultInstance();
            }

            @java.lang.Override
            public SearchModel.DocumentStats build() {
                SearchModel.DocumentStats result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public SearchModel.DocumentStats buildPartial() {
                SearchModel.DocumentStats result = new SearchModel.DocumentStats(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(SearchModel.DocumentStats result) {
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.documentName_ = documentName_;
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
                if (other instanceof SearchModel.DocumentStats) {
                    return mergeFrom((SearchModel.DocumentStats)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SearchModel.DocumentStats other) {
                if (other == SearchModel.DocumentStats.getDefaultInstance()) return this;
                if (other.hasDocumentName()) {
                    documentName_ = other.documentName_;
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
                if (!hasDocumentName()) {
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
                                documentName_ = input.readBytes();
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

            private java.lang.Object documentName_ = "";
            /**
             * <code>required string document_name = 1;</code>
             * @return Whether the documentName field is set.
             */
            public boolean hasDocumentName() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <code>required string document_name = 1;</code>
             * @return The documentName.
             */
            public java.lang.String getDocumentName() {
                java.lang.Object ref = documentName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        documentName_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string document_name = 1;</code>
             * @return The bytes for documentName.
             */
            public com.google.protobuf.ByteString
            getDocumentNameBytes() {
                java.lang.Object ref = documentName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    documentName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string document_name = 1;</code>
             * @param value The documentName to set.
             * @return This builder for chaining.
             */
            public Builder setDocumentName(
                    java.lang.String value) {
                if (value == null) { throw new NullPointerException(); }
                documentName_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>required string document_name = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearDocumentName() {
                documentName_ = getDefaultInstance().getDocumentName();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }
            /**
             * <code>required string document_name = 1;</code>
             * @param value The bytes for documentName to set.
             * @return This builder for chaining.
             */
            public Builder setDocumentNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) { throw new NullPointerException(); }
                documentName_ = value;
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

            // @@protoc_insertion_point(builder_scope:Model.proto.DocumentStats)
        }

        // @@protoc_insertion_point(class_scope:Model.proto.DocumentStats)
        private static final SearchModel.DocumentStats DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new SearchModel.DocumentStats();
        }

        public static SearchModel.DocumentStats getDefaultInstance() {
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
        public SearchModel.DocumentStats getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_proto_Request_descriptor;
    private static final
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_proto_Request_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_proto_Response_descriptor;
    private static final
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_proto_Response_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_proto_DocumentStats_descriptor;
    private static final
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_proto_DocumentStats_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\021SearchModel.proto\022\013Model.proto\"\037\n\007Requ" +
                        "est\022\024\n\014search_query\030\001 \002(\t\"W\n\010Response\0226\n" +
                        "\022relevant_documents\030\001 \003(\0132\032.Model.proto." +
                        "DocumentStats\022\023\n\013status_code\030\002 \001(\005\"5\n\rDo" +
                        "cumentStats\022\025\n\rdocument_name\030\001 \002(\t\022\r\n\005sc" +
                        "ore\030\002 \001(\001"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        });
        internal_static_Model_proto_Request_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_Model_proto_Request_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_Model_proto_Request_descriptor,
                new java.lang.String[] { "SearchQuery", });
        internal_static_Model_proto_Response_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_Model_proto_Response_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_Model_proto_Response_descriptor,
                new java.lang.String[] { "RelevantDocuments", "StatusCode", });
        internal_static_Model_proto_DocumentStats_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_Model_proto_DocumentStats_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_Model_proto_DocumentStats_descriptor,
                new java.lang.String[] { "DocumentName", "Score", });
        descriptor.resolveAllFeaturesImmutable();
    }

    // @@protoc_insertion_point(outer_class_scope)
}