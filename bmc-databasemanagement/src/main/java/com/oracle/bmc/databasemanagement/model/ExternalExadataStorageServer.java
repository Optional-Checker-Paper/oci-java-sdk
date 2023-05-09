/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The Exadata storage server details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalExadataStorageServer.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExternalExadataStorageServer extends DbmResource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalId")
        private String internalId;

        public Builder internalId(String internalId) {
            this.internalId = internalId;
            this.__explicitlySet__.add("internalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * Exadata infrastructure system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * Exadata infrastructure system.
         *
         * @param exadataInfrastructureId the value to set
         * @return this builder
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * Exadata storage grid.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageGridId")
        private String storageGridId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * Exadata storage grid.
         *
         * @param storageGridId the value to set
         * @return this builder
         */
        public Builder storageGridId(String storageGridId) {
            this.storageGridId = storageGridId;
            this.__explicitlySet__.add("storageGridId");
            return this;
        }
        /** The make model of the storage server. */
        @com.fasterxml.jackson.annotation.JsonProperty("makeModel")
        private String makeModel;

        /**
         * The make model of the storage server.
         *
         * @param makeModel the value to set
         * @return this builder
         */
        public Builder makeModel(String makeModel) {
            this.makeModel = makeModel;
            this.__explicitlySet__.add("makeModel");
            return this;
        }
        /** The IP address of the storage server. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address of the storage server.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** CPU count of the storage server */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private java.math.BigDecimal cpuCount;

        /**
         * CPU count of the storage server
         *
         * @param cpuCount the value to set
         * @return this builder
         */
        public Builder cpuCount(java.math.BigDecimal cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }
        /** Storage server memory size in GB */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryGB")
        private Double memoryGB;

        /**
         * Storage server memory size in GB
         *
         * @param memoryGB the value to set
         * @return this builder
         */
        public Builder memoryGB(Double memoryGB) {
            this.memoryGB = memoryGB;
            this.__explicitlySet__.add("memoryGB");
            return this;
        }
        /** Maximum hard disk IO operations per second of the storage server */
        @com.fasterxml.jackson.annotation.JsonProperty("maxHardDiskIOPS")
        private Integer maxHardDiskIOPS;

        /**
         * Maximum hard disk IO operations per second of the storage server
         *
         * @param maxHardDiskIOPS the value to set
         * @return this builder
         */
        public Builder maxHardDiskIOPS(Integer maxHardDiskIOPS) {
            this.maxHardDiskIOPS = maxHardDiskIOPS;
            this.__explicitlySet__.add("maxHardDiskIOPS");
            return this;
        }
        /** Maximum hard disk IO throughput in MB/s of the storage server */
        @com.fasterxml.jackson.annotation.JsonProperty("maxHardDiskThroughput")
        private Integer maxHardDiskThroughput;

        /**
         * Maximum hard disk IO throughput in MB/s of the storage server
         *
         * @param maxHardDiskThroughput the value to set
         * @return this builder
         */
        public Builder maxHardDiskThroughput(Integer maxHardDiskThroughput) {
            this.maxHardDiskThroughput = maxHardDiskThroughput;
            this.__explicitlySet__.add("maxHardDiskThroughput");
            return this;
        }
        /** Maximum flash disk IO operations per second of the storage server */
        @com.fasterxml.jackson.annotation.JsonProperty("maxFlashDiskIOPS")
        private Integer maxFlashDiskIOPS;

        /**
         * Maximum flash disk IO operations per second of the storage server
         *
         * @param maxFlashDiskIOPS the value to set
         * @return this builder
         */
        public Builder maxFlashDiskIOPS(Integer maxFlashDiskIOPS) {
            this.maxFlashDiskIOPS = maxFlashDiskIOPS;
            this.__explicitlySet__.add("maxFlashDiskIOPS");
            return this;
        }
        /** Maximum flash disk IO throughput in MB/s of the storage server */
        @com.fasterxml.jackson.annotation.JsonProperty("maxFlashDiskThroughput")
        private Integer maxFlashDiskThroughput;

        /**
         * Maximum flash disk IO throughput in MB/s of the storage server
         *
         * @param maxFlashDiskThroughput the value to set
         * @return this builder
         */
        public Builder maxFlashDiskThroughput(Integer maxFlashDiskThroughput) {
            this.maxFlashDiskThroughput = maxFlashDiskThroughput;
            this.__explicitlySet__.add("maxFlashDiskThroughput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connector")
        private ExternalExadataStorageConnectorSummary connector;

        public Builder connector(ExternalExadataStorageConnectorSummary connector) {
            this.connector = connector;
            this.__explicitlySet__.add("connector");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalExadataStorageServer build() {
            ExternalExadataStorageServer model =
                    new ExternalExadataStorageServer(
                            this.id,
                            this.displayName,
                            this.version,
                            this.internalId,
                            this.status,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleDetails,
                            this.additionalDetails,
                            this.exadataInfrastructureId,
                            this.storageGridId,
                            this.makeModel,
                            this.ipAddress,
                            this.cpuCount,
                            this.memoryGB,
                            this.maxHardDiskIOPS,
                            this.maxHardDiskThroughput,
                            this.maxFlashDiskIOPS,
                            this.maxFlashDiskThroughput,
                            this.connector);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalExadataStorageServer model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("internalId")) {
                this.internalId(model.getInternalId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("exadataInfrastructureId")) {
                this.exadataInfrastructureId(model.getExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("storageGridId")) {
                this.storageGridId(model.getStorageGridId());
            }
            if (model.wasPropertyExplicitlySet("makeModel")) {
                this.makeModel(model.getMakeModel());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("cpuCount")) {
                this.cpuCount(model.getCpuCount());
            }
            if (model.wasPropertyExplicitlySet("memoryGB")) {
                this.memoryGB(model.getMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("maxHardDiskIOPS")) {
                this.maxHardDiskIOPS(model.getMaxHardDiskIOPS());
            }
            if (model.wasPropertyExplicitlySet("maxHardDiskThroughput")) {
                this.maxHardDiskThroughput(model.getMaxHardDiskThroughput());
            }
            if (model.wasPropertyExplicitlySet("maxFlashDiskIOPS")) {
                this.maxFlashDiskIOPS(model.getMaxFlashDiskIOPS());
            }
            if (model.wasPropertyExplicitlySet("maxFlashDiskThroughput")) {
                this.maxFlashDiskThroughput(model.getMaxFlashDiskThroughput());
            }
            if (model.wasPropertyExplicitlySet("connector")) {
                this.connector(model.getConnector());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public ExternalExadataStorageServer(
            String id,
            String displayName,
            String version,
            String internalId,
            String status,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String lifecycleDetails,
            java.util.Map<String, String> additionalDetails,
            String exadataInfrastructureId,
            String storageGridId,
            String makeModel,
            String ipAddress,
            java.math.BigDecimal cpuCount,
            Double memoryGB,
            Integer maxHardDiskIOPS,
            Integer maxHardDiskThroughput,
            Integer maxFlashDiskIOPS,
            Integer maxFlashDiskThroughput,
            ExternalExadataStorageConnectorSummary connector) {
        super(
                id,
                displayName,
                version,
                internalId,
                status,
                lifecycleState,
                timeCreated,
                timeUpdated,
                lifecycleDetails,
                additionalDetails);
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.storageGridId = storageGridId;
        this.makeModel = makeModel;
        this.ipAddress = ipAddress;
        this.cpuCount = cpuCount;
        this.memoryGB = memoryGB;
        this.maxHardDiskIOPS = maxHardDiskIOPS;
        this.maxHardDiskThroughput = maxHardDiskThroughput;
        this.maxFlashDiskIOPS = maxFlashDiskIOPS;
        this.maxFlashDiskThroughput = maxFlashDiskThroughput;
        this.connector = connector;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Exadata
     * infrastructure system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    private final String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Exadata
     * infrastructure system.
     *
     * @return the value
     */
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Exadata
     * storage grid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageGridId")
    private final String storageGridId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Exadata
     * storage grid.
     *
     * @return the value
     */
    public String getStorageGridId() {
        return storageGridId;
    }

    /** The make model of the storage server. */
    @com.fasterxml.jackson.annotation.JsonProperty("makeModel")
    private final String makeModel;

    /**
     * The make model of the storage server.
     *
     * @return the value
     */
    public String getMakeModel() {
        return makeModel;
    }

    /** The IP address of the storage server. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address of the storage server.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** CPU count of the storage server */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    private final java.math.BigDecimal cpuCount;

    /**
     * CPU count of the storage server
     *
     * @return the value
     */
    public java.math.BigDecimal getCpuCount() {
        return cpuCount;
    }

    /** Storage server memory size in GB */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryGB")
    private final Double memoryGB;

    /**
     * Storage server memory size in GB
     *
     * @return the value
     */
    public Double getMemoryGB() {
        return memoryGB;
    }

    /** Maximum hard disk IO operations per second of the storage server */
    @com.fasterxml.jackson.annotation.JsonProperty("maxHardDiskIOPS")
    private final Integer maxHardDiskIOPS;

    /**
     * Maximum hard disk IO operations per second of the storage server
     *
     * @return the value
     */
    public Integer getMaxHardDiskIOPS() {
        return maxHardDiskIOPS;
    }

    /** Maximum hard disk IO throughput in MB/s of the storage server */
    @com.fasterxml.jackson.annotation.JsonProperty("maxHardDiskThroughput")
    private final Integer maxHardDiskThroughput;

    /**
     * Maximum hard disk IO throughput in MB/s of the storage server
     *
     * @return the value
     */
    public Integer getMaxHardDiskThroughput() {
        return maxHardDiskThroughput;
    }

    /** Maximum flash disk IO operations per second of the storage server */
    @com.fasterxml.jackson.annotation.JsonProperty("maxFlashDiskIOPS")
    private final Integer maxFlashDiskIOPS;

    /**
     * Maximum flash disk IO operations per second of the storage server
     *
     * @return the value
     */
    public Integer getMaxFlashDiskIOPS() {
        return maxFlashDiskIOPS;
    }

    /** Maximum flash disk IO throughput in MB/s of the storage server */
    @com.fasterxml.jackson.annotation.JsonProperty("maxFlashDiskThroughput")
    private final Integer maxFlashDiskThroughput;

    /**
     * Maximum flash disk IO throughput in MB/s of the storage server
     *
     * @return the value
     */
    public Integer getMaxFlashDiskThroughput() {
        return maxFlashDiskThroughput;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connector")
    private final ExternalExadataStorageConnectorSummary connector;

    public ExternalExadataStorageConnectorSummary getConnector() {
        return connector;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExternalExadataStorageServer(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", exadataInfrastructureId=")
                .append(String.valueOf(this.exadataInfrastructureId));
        sb.append(", storageGridId=").append(String.valueOf(this.storageGridId));
        sb.append(", makeModel=").append(String.valueOf(this.makeModel));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", cpuCount=").append(String.valueOf(this.cpuCount));
        sb.append(", memoryGB=").append(String.valueOf(this.memoryGB));
        sb.append(", maxHardDiskIOPS=").append(String.valueOf(this.maxHardDiskIOPS));
        sb.append(", maxHardDiskThroughput=").append(String.valueOf(this.maxHardDiskThroughput));
        sb.append(", maxFlashDiskIOPS=").append(String.valueOf(this.maxFlashDiskIOPS));
        sb.append(", maxFlashDiskThroughput=").append(String.valueOf(this.maxFlashDiskThroughput));
        sb.append(", connector=").append(String.valueOf(this.connector));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalExadataStorageServer)) {
            return false;
        }

        ExternalExadataStorageServer other = (ExternalExadataStorageServer) o;
        return java.util.Objects.equals(this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(this.storageGridId, other.storageGridId)
                && java.util.Objects.equals(this.makeModel, other.makeModel)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.cpuCount, other.cpuCount)
                && java.util.Objects.equals(this.memoryGB, other.memoryGB)
                && java.util.Objects.equals(this.maxHardDiskIOPS, other.maxHardDiskIOPS)
                && java.util.Objects.equals(this.maxHardDiskThroughput, other.maxHardDiskThroughput)
                && java.util.Objects.equals(this.maxFlashDiskIOPS, other.maxFlashDiskIOPS)
                && java.util.Objects.equals(
                        this.maxFlashDiskThroughput, other.maxFlashDiskThroughput)
                && java.util.Objects.equals(this.connector, other.connector)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.storageGridId == null ? 43 : this.storageGridId.hashCode());
        result = (result * PRIME) + (this.makeModel == null ? 43 : this.makeModel.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.cpuCount == null ? 43 : this.cpuCount.hashCode());
        result = (result * PRIME) + (this.memoryGB == null ? 43 : this.memoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.maxHardDiskIOPS == null ? 43 : this.maxHardDiskIOPS.hashCode());
        result =
                (result * PRIME)
                        + (this.maxHardDiskThroughput == null
                                ? 43
                                : this.maxHardDiskThroughput.hashCode());
        result =
                (result * PRIME)
                        + (this.maxFlashDiskIOPS == null ? 43 : this.maxFlashDiskIOPS.hashCode());
        result =
                (result * PRIME)
                        + (this.maxFlashDiskThroughput == null
                                ? 43
                                : this.maxFlashDiskThroughput.hashCode());
        result = (result * PRIME) + (this.connector == null ? 43 : this.connector.hashCode());
        return result;
    }
}