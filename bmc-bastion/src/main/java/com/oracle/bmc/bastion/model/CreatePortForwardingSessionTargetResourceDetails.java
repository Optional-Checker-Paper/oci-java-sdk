/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * Details about a port forwarding session for a target resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreatePortForwardingSessionTargetResourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sessionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePortForwardingSessionTargetResourceDetails
        extends CreateSessionTargetResourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePort")
        private Integer targetResourcePort;

        public Builder targetResourcePort(Integer targetResourcePort) {
            this.targetResourcePort = targetResourcePort;
            this.__explicitlySet__.add("targetResourcePort");
            return this;
        }
        /**
         * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        /**
         * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
         * @param targetResourceId the value to set
         * @return this builder
         **/
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }
        /**
         * The private IP address of the target resource that the session connects to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePrivateIpAddress")
        private String targetResourcePrivateIpAddress;

        /**
         * The private IP address of the target resource that the session connects to.
         * @param targetResourcePrivateIpAddress the value to set
         * @return this builder
         **/
        public Builder targetResourcePrivateIpAddress(String targetResourcePrivateIpAddress) {
            this.targetResourcePrivateIpAddress = targetResourcePrivateIpAddress;
            this.__explicitlySet__.add("targetResourcePrivateIpAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePortForwardingSessionTargetResourceDetails build() {
            CreatePortForwardingSessionTargetResourceDetails __instance__ =
                    new CreatePortForwardingSessionTargetResourceDetails(
                            targetResourcePort, targetResourceId, targetResourcePrivateIpAddress);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePortForwardingSessionTargetResourceDetails o) {
            Builder copiedBuilder =
                    targetResourcePort(o.getTargetResourcePort())
                            .targetResourceId(o.getTargetResourceId())
                            .targetResourcePrivateIpAddress(o.getTargetResourcePrivateIpAddress());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreatePortForwardingSessionTargetResourceDetails(
            Integer targetResourcePort,
            String targetResourceId,
            String targetResourcePrivateIpAddress) {
        super(targetResourcePort);
        this.targetResourceId = targetResourceId;
        this.targetResourcePrivateIpAddress = targetResourcePrivateIpAddress;
    }

    /**
     * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    private final String targetResourceId;

    /**
     * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
     * @return the value
     **/
    public String getTargetResourceId() {
        return targetResourceId;
    }

    /**
     * The private IP address of the target resource that the session connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePrivateIpAddress")
    private final String targetResourcePrivateIpAddress;

    /**
     * The private IP address of the target resource that the session connects to.
     * @return the value
     **/
    public String getTargetResourcePrivateIpAddress() {
        return targetResourcePrivateIpAddress;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreatePortForwardingSessionTargetResourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(", targetResourcePrivateIpAddress=")
                .append(String.valueOf(this.targetResourcePrivateIpAddress));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePortForwardingSessionTargetResourceDetails)) {
            return false;
        }

        CreatePortForwardingSessionTargetResourceDetails other =
                (CreatePortForwardingSessionTargetResourceDetails) o;
        return java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(
                        this.targetResourcePrivateIpAddress, other.targetResourcePrivateIpAddress)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourcePrivateIpAddress == null
                                ? 43
                                : this.targetResourcePrivateIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
