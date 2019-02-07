/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * The details of a Web Application Acceleration and Security (WAAS) policy. A policy describes how the WAAS service should operate for the configured web application.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WaasPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WaasPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
        private java.util.List<String> additionalDomains;

        public Builder additionalDomains(java.util.List<String> additionalDomains) {
            this.additionalDomains = additionalDomains;
            this.__explicitlySet__.add("additionalDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cname")
        private String cname;

        public Builder cname(String cname) {
            this.cname = cname;
            this.__explicitlySet__.add("cname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("origins")
        private java.util.Map<String, Origin> origins;

        public Builder origins(java.util.Map<String, Origin> origins) {
            this.origins = origins;
            this.__explicitlySet__.add("origins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
        private PolicyConfig policyConfig;

        public Builder policyConfig(PolicyConfig policyConfig) {
            this.policyConfig = policyConfig;
            this.__explicitlySet__.add("policyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
        private WafConfig wafConfig;

        public Builder wafConfig(WafConfig wafConfig) {
            this.wafConfig = wafConfig;
            this.__explicitlySet__.add("wafConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WaasPolicy build() {
            WaasPolicy __instance__ =
                    new WaasPolicy(
                            id,
                            compartmentId,
                            displayName,
                            domain,
                            additionalDomains,
                            cname,
                            lifecycleState,
                            timeCreated,
                            origins,
                            policyConfig,
                            wafConfig,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WaasPolicy o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .domain(o.getDomain())
                            .additionalDomains(o.getAdditionalDomains())
                            .cname(o.getCname())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .origins(o.getOrigins())
                            .policyConfig(o.getPolicyConfig())
                            .wafConfig(o.getWafConfig())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the WAAS policy's compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The user-friendly name of the WAAS policy. The name can be changed and does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The web application domain that the WAAS policy protects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * An array of additional domains for this web application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
    java.util.List<String> additionalDomains;

    /**
     * The CNAME record to add to your DNS configuration to route traffic for the domain, and all additional domains, through the WAF.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cname")
    String cname;

    /**
     * The current lifecycle state of the WAAS policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

    /**
     * The date and time the policy was created, expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * A map of host to origin for the web application. The key should be a customer friendly name for the host, ex. primary, secondary, etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("origins")
    java.util.Map<String, Origin> origins;

    @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
    PolicyConfig policyConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
    WafConfig wafConfig;

    /**
     * A simple key-value pair without any defined schema.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * A key-value pair with a defined schema that restricts the values of tags. These predefined keys are scoped to namespaces.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
