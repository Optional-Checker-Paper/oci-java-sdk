/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Mutual TLS settings used when sending requests to virtual services within the mesh.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressGatewayMutualTransportLayerSecurity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IngressGatewayMutualTransportLayerSecurity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maximumValidity")
        private Integer maximumValidity;

        public Builder maximumValidity(Integer maximumValidity) {
            this.maximumValidity = maximumValidity;
            this.__explicitlySet__.add("maximumValidity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressGatewayMutualTransportLayerSecurity build() {
            IngressGatewayMutualTransportLayerSecurity __instance__ =
                    new IngressGatewayMutualTransportLayerSecurity(certificateId, maximumValidity);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressGatewayMutualTransportLayerSecurity o) {
            Builder copiedBuilder =
                    certificateId(o.getCertificateId()).maximumValidity(o.getMaximumValidity());

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

    /**
     * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    String certificateId;

    /**
     * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
     * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
     * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
     * will be renewed every 30 days.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumValidity")
    Integer maximumValidity;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}