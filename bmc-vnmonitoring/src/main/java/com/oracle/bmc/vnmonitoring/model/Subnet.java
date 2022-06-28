/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * A logical subdivision of a VCN. Each subnet
 * consists of a contiguous range of IP addresses that do not overlap with
 * other subnets in the VCN. Example: 172.16.1.0/24. For more information, see
 * [Overview of the Networking Service](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/overview.htm) and
 * [VCNs and Subnets](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVCNs.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subnet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Subnet {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "cidrBlock",
        "compartmentId",
        "definedTags",
        "dhcpOptionsId",
        "displayName",
        "dnsLabel",
        "freeformTags",
        "id",
        "ipv6CidrBlock",
        "ipv6PublicCidrBlock",
        "ipv6VirtualRouterIp",
        "lifecycleState",
        "prohibitPublicIpOnVnic",
        "routeTableId",
        "securityListIds",
        "subnetDomainName",
        "timeCreated",
        "vcnId",
        "virtualRouterIp",
        "virtualRouterMac"
    })
    public Subnet(
            String availabilityDomain,
            String cidrBlock,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String dhcpOptionsId,
            String displayName,
            String dnsLabel,
            java.util.Map<String, String> freeformTags,
            String id,
            String ipv6CidrBlock,
            String ipv6PublicCidrBlock,
            String ipv6VirtualRouterIp,
            LifecycleState lifecycleState,
            Boolean prohibitPublicIpOnVnic,
            String routeTableId,
            java.util.List<String> securityListIds,
            String subnetDomainName,
            java.util.Date timeCreated,
            String vcnId,
            String virtualRouterIp,
            String virtualRouterMac) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.cidrBlock = cidrBlock;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.dhcpOptionsId = dhcpOptionsId;
        this.displayName = displayName;
        this.dnsLabel = dnsLabel;
        this.freeformTags = freeformTags;
        this.id = id;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6PublicCidrBlock = ipv6PublicCidrBlock;
        this.ipv6VirtualRouterIp = ipv6VirtualRouterIp;
        this.lifecycleState = lifecycleState;
        this.prohibitPublicIpOnVnic = prohibitPublicIpOnVnic;
        this.routeTableId = routeTableId;
        this.securityListIds = securityListIds;
        this.subnetDomainName = subnetDomainName;
        this.timeCreated = timeCreated;
        this.vcnId = vcnId;
        this.virtualRouterIp = virtualRouterIp;
        this.virtualRouterMac = virtualRouterMac;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The subnet's availability domain.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The subnet's availability domain.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The subnet's CIDR block.
         * <p>
         * Example: {@code 10.0.1.0/24}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * The subnet's CIDR block.
         * <p>
         * Example: {@code 10.0.1.0/24}
         *
         * @param cidrBlock the value to set
         * @return this builder
         **/
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the subnet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the subnet.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options that the subnet uses.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
        private String dhcpOptionsId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options that the subnet uses.
         *
         * @param dhcpOptionsId the value to set
         * @return this builder
         **/
        public Builder dhcpOptionsId(String dhcpOptionsId) {
            this.dhcpOptionsId = dhcpOptionsId;
            this.__explicitlySet__.add("dhcpOptionsId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
         * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
         * within this subnet (for example, {@code bminstance-1.subnet123.vcn1.oraclevcn.com}).
         * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
         * The value cannot be changed.
         * <p>
         * The absence of this parameter means the Internet and VCN Resolver
         * will not resolve hostnames of instances in this subnet.
         * <p>
         * For more information, see
         * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         * <p>
         * Example: {@code subnet123}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        /**
         * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
         * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
         * within this subnet (for example, {@code bminstance-1.subnet123.vcn1.oraclevcn.com}).
         * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
         * The value cannot be changed.
         * <p>
         * The absence of this parameter means the Internet and VCN Resolver
         * will not resolve hostnames of instances in this subnet.
         * <p>
         * For more information, see
         * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         * <p>
         * Example: {@code subnet123}
         *
         * @param dnsLabel the value to set
         * @return this builder
         **/
        public Builder dnsLabel(String dnsLabel) {
            this.dnsLabel = dnsLabel;
            this.__explicitlySet__.add("dnsLabel");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The subnet's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The subnet's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's private IP address
         * space. The subnet size is always /64. IPv6 addressing is supported for all commercial and government regions.
         * See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * Example: {@code 2001:0db8:0123:1111::/64}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's private IP address
         * space. The subnet size is always /64. IPv6 addressing is supported for all commercial and government regions.
         * See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * Example: {@code 2001:0db8:0123:1111::/64}
         *
         * @param ipv6CidrBlock the value to set
         * @return this builder
         **/
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }
        /**
         * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's public IP address
         * space. The subnet size is always /64. The left 48 bits are inherited from the
         * {@code ipv6PublicCidrBlock} of the {@link Vcn},
         * and the remaining 16 bits are from the subnet's {@code ipv6CidrBlock}.
         * <p>
         * Example: {@code 2001:0db8:0123:1111::/64}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6PublicCidrBlock")
        private String ipv6PublicCidrBlock;

        /**
         * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's public IP address
         * space. The subnet size is always /64. The left 48 bits are inherited from the
         * {@code ipv6PublicCidrBlock} of the {@link Vcn},
         * and the remaining 16 bits are from the subnet's {@code ipv6CidrBlock}.
         * <p>
         * Example: {@code 2001:0db8:0123:1111::/64}
         *
         * @param ipv6PublicCidrBlock the value to set
         * @return this builder
         **/
        public Builder ipv6PublicCidrBlock(String ipv6PublicCidrBlock) {
            this.ipv6PublicCidrBlock = ipv6PublicCidrBlock;
            this.__explicitlySet__.add("ipv6PublicCidrBlock");
            return this;
        }
        /**
         * For an IPv6-enabled subnet, this is the IPv6 address of the virtual router.
         * <p>
         * Example: {@code 2001:0db8:0123:1111:89ab:cdef:1234:5678}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6VirtualRouterIp")
        private String ipv6VirtualRouterIp;

        /**
         * For an IPv6-enabled subnet, this is the IPv6 address of the virtual router.
         * <p>
         * Example: {@code 2001:0db8:0123:1111:89ab:cdef:1234:5678}
         *
         * @param ipv6VirtualRouterIp the value to set
         * @return this builder
         **/
        public Builder ipv6VirtualRouterIp(String ipv6VirtualRouterIp) {
            this.ipv6VirtualRouterIp = ipv6VirtualRouterIp;
            this.__explicitlySet__.add("ipv6VirtualRouterIp");
            return this;
        }
        /**
         * The subnet's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The subnet's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Whether VNICs within this subnet can have public IP addresses.
         * Defaults to false, which means VNICs created in this subnet will
         * automatically be assigned public IP addresses unless specified
         * otherwise during instance launch or VNIC creation (with the
         * {@code assignPublicIp} flag in
         * {@link CreateVnicDetails}).
         * If {@code prohibitPublicIpOnVnic} is set to true, VNICs created in this
         * subnet cannot have public IP addresses (that is, it's a private
         * subnet).
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prohibitPublicIpOnVnic")
        private Boolean prohibitPublicIpOnVnic;

        /**
         * Whether VNICs within this subnet can have public IP addresses.
         * Defaults to false, which means VNICs created in this subnet will
         * automatically be assigned public IP addresses unless specified
         * otherwise during instance launch or VNIC creation (with the
         * {@code assignPublicIp} flag in
         * {@link CreateVnicDetails}).
         * If {@code prohibitPublicIpOnVnic} is set to true, VNICs created in this
         * subnet cannot have public IP addresses (that is, it's a private
         * subnet).
         * <p>
         * Example: {@code true}
         *
         * @param prohibitPublicIpOnVnic the value to set
         * @return this builder
         **/
        public Builder prohibitPublicIpOnVnic(Boolean prohibitPublicIpOnVnic) {
            this.prohibitPublicIpOnVnic = prohibitPublicIpOnVnic;
            this.__explicitlySet__.add("prohibitPublicIpOnVnic");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table that the subnet uses.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table that the subnet uses.
         * @param routeTableId the value to set
         * @return this builder
         **/
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * The OCIDs of the security list or lists that the subnet uses. Remember
         * that security lists are associated *with the subnet*, but the
         * rules are applied to the individual VNICs in the subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
        private java.util.List<String> securityListIds;

        /**
         * The OCIDs of the security list or lists that the subnet uses. Remember
         * that security lists are associated *with the subnet*, but the
         * rules are applied to the individual VNICs in the subnet.
         *
         * @param securityListIds the value to set
         * @return this builder
         **/
        public Builder securityListIds(java.util.List<String> securityListIds) {
            this.securityListIds = securityListIds;
            this.__explicitlySet__.add("securityListIds");
            return this;
        }
        /**
         * The subnet's domain name, which consists of the subnet's DNS label,
         * the VCN's DNS label, and the {@code oraclevcn.com} domain.
         * <p>
         * For more information, see
         * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         * <p>
         * Example: {@code subnet123.vcn1.oraclevcn.com}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetDomainName")
        private String subnetDomainName;

        /**
         * The subnet's domain name, which consists of the subnet's DNS label,
         * the VCN's DNS label, and the {@code oraclevcn.com} domain.
         * <p>
         * For more information, see
         * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         * <p>
         * Example: {@code subnet123.vcn1.oraclevcn.com}
         *
         * @param subnetDomainName the value to set
         * @return this builder
         **/
        public Builder subnetDomainName(String subnetDomainName) {
            this.subnetDomainName = subnetDomainName;
            this.__explicitlySet__.add("subnetDomainName");
            return this;
        }
        /**
         * The date and time the subnet was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the subnet was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the subnet is in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the subnet is in.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The IP address of the virtual router.
         * <p>
         * Example: {@code 10.0.14.1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterIp")
        private String virtualRouterIp;

        /**
         * The IP address of the virtual router.
         * <p>
         * Example: {@code 10.0.14.1}
         *
         * @param virtualRouterIp the value to set
         * @return this builder
         **/
        public Builder virtualRouterIp(String virtualRouterIp) {
            this.virtualRouterIp = virtualRouterIp;
            this.__explicitlySet__.add("virtualRouterIp");
            return this;
        }
        /**
         * The MAC address of the virtual router.
         * <p>
         * Example: {@code 00:00:00:00:00:01}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterMac")
        private String virtualRouterMac;

        /**
         * The MAC address of the virtual router.
         * <p>
         * Example: {@code 00:00:00:00:00:01}
         *
         * @param virtualRouterMac the value to set
         * @return this builder
         **/
        public Builder virtualRouterMac(String virtualRouterMac) {
            this.virtualRouterMac = virtualRouterMac;
            this.__explicitlySet__.add("virtualRouterMac");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Subnet build() {
            Subnet __instance__ =
                    new Subnet(
                            availabilityDomain,
                            cidrBlock,
                            compartmentId,
                            definedTags,
                            dhcpOptionsId,
                            displayName,
                            dnsLabel,
                            freeformTags,
                            id,
                            ipv6CidrBlock,
                            ipv6PublicCidrBlock,
                            ipv6VirtualRouterIp,
                            lifecycleState,
                            prohibitPublicIpOnVnic,
                            routeTableId,
                            securityListIds,
                            subnetDomainName,
                            timeCreated,
                            vcnId,
                            virtualRouterIp,
                            virtualRouterMac);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Subnet o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .cidrBlock(o.getCidrBlock())
                            .compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .dhcpOptionsId(o.getDhcpOptionsId())
                            .displayName(o.getDisplayName())
                            .dnsLabel(o.getDnsLabel())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .ipv6CidrBlock(o.getIpv6CidrBlock())
                            .ipv6PublicCidrBlock(o.getIpv6PublicCidrBlock())
                            .ipv6VirtualRouterIp(o.getIpv6VirtualRouterIp())
                            .lifecycleState(o.getLifecycleState())
                            .prohibitPublicIpOnVnic(o.getProhibitPublicIpOnVnic())
                            .routeTableId(o.getRouteTableId())
                            .securityListIds(o.getSecurityListIds())
                            .subnetDomainName(o.getSubnetDomainName())
                            .timeCreated(o.getTimeCreated())
                            .vcnId(o.getVcnId())
                            .virtualRouterIp(o.getVirtualRouterIp())
                            .virtualRouterMac(o.getVirtualRouterMac());

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

    /**
     * The subnet's availability domain.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The subnet's availability domain.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The subnet's CIDR block.
     * <p>
     * Example: {@code 10.0.1.0/24}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * The subnet's CIDR block.
     * <p>
     * Example: {@code 10.0.1.0/24}
     *
     * @return the value
     **/
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the subnet.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options that the subnet uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
    private final String dhcpOptionsId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options that the subnet uses.
     *
     * @return the value
     **/
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
     * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (for example, {@code bminstance-1.subnet123.vcn1.oraclevcn.com}).
     * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
     * The value cannot be changed.
     * <p>
     * The absence of this parameter means the Internet and VCN Resolver
     * will not resolve hostnames of instances in this subnet.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: {@code subnet123}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    private final String dnsLabel;

    /**
     * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
     * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (for example, {@code bminstance-1.subnet123.vcn1.oraclevcn.com}).
     * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
     * The value cannot be changed.
     * <p>
     * The absence of this parameter means the Internet and VCN Resolver
     * will not resolve hostnames of instances in this subnet.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: {@code subnet123}
     *
     * @return the value
     **/
    public String getDnsLabel() {
        return dnsLabel;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The subnet's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The subnet's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's private IP address
     * space. The subnet size is always /64. IPv6 addressing is supported for all commercial and government regions.
     * See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:0db8:0123:1111::/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's private IP address
     * space. The subnet size is always /64. IPv6 addressing is supported for all commercial and government regions.
     * See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:0db8:0123:1111::/64}
     *
     * @return the value
     **/
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's public IP address
     * space. The subnet size is always /64. The left 48 bits are inherited from the
     * {@code ipv6PublicCidrBlock} of the {@link Vcn},
     * and the remaining 16 bits are from the subnet's {@code ipv6CidrBlock}.
     * <p>
     * Example: {@code 2001:0db8:0123:1111::/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6PublicCidrBlock")
    private final String ipv6PublicCidrBlock;

    /**
     * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's public IP address
     * space. The subnet size is always /64. The left 48 bits are inherited from the
     * {@code ipv6PublicCidrBlock} of the {@link Vcn},
     * and the remaining 16 bits are from the subnet's {@code ipv6CidrBlock}.
     * <p>
     * Example: {@code 2001:0db8:0123:1111::/64}
     *
     * @return the value
     **/
    public String getIpv6PublicCidrBlock() {
        return ipv6PublicCidrBlock;
    }

    /**
     * For an IPv6-enabled subnet, this is the IPv6 address of the virtual router.
     * <p>
     * Example: {@code 2001:0db8:0123:1111:89ab:cdef:1234:5678}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6VirtualRouterIp")
    private final String ipv6VirtualRouterIp;

    /**
     * For an IPv6-enabled subnet, this is the IPv6 address of the virtual router.
     * <p>
     * Example: {@code 2001:0db8:0123:1111:89ab:cdef:1234:5678}
     *
     * @return the value
     **/
    public String getIpv6VirtualRouterIp() {
        return ipv6VirtualRouterIp;
    }

    /**
     * The subnet's current state.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * The subnet's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The subnet's current state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Whether VNICs within this subnet can have public IP addresses.
     * Defaults to false, which means VNICs created in this subnet will
     * automatically be assigned public IP addresses unless specified
     * otherwise during instance launch or VNIC creation (with the
     * {@code assignPublicIp} flag in
     * {@link CreateVnicDetails}).
     * If {@code prohibitPublicIpOnVnic} is set to true, VNICs created in this
     * subnet cannot have public IP addresses (that is, it's a private
     * subnet).
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prohibitPublicIpOnVnic")
    private final Boolean prohibitPublicIpOnVnic;

    /**
     * Whether VNICs within this subnet can have public IP addresses.
     * Defaults to false, which means VNICs created in this subnet will
     * automatically be assigned public IP addresses unless specified
     * otherwise during instance launch or VNIC creation (with the
     * {@code assignPublicIp} flag in
     * {@link CreateVnicDetails}).
     * If {@code prohibitPublicIpOnVnic} is set to true, VNICs created in this
     * subnet cannot have public IP addresses (that is, it's a private
     * subnet).
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getProhibitPublicIpOnVnic() {
        return prohibitPublicIpOnVnic;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table that the subnet uses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table that the subnet uses.
     * @return the value
     **/
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * The OCIDs of the security list or lists that the subnet uses. Remember
     * that security lists are associated *with the subnet*, but the
     * rules are applied to the individual VNICs in the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
    private final java.util.List<String> securityListIds;

    /**
     * The OCIDs of the security list or lists that the subnet uses. Remember
     * that security lists are associated *with the subnet*, but the
     * rules are applied to the individual VNICs in the subnet.
     *
     * @return the value
     **/
    public java.util.List<String> getSecurityListIds() {
        return securityListIds;
    }

    /**
     * The subnet's domain name, which consists of the subnet's DNS label,
     * the VCN's DNS label, and the {@code oraclevcn.com} domain.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: {@code subnet123.vcn1.oraclevcn.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetDomainName")
    private final String subnetDomainName;

    /**
     * The subnet's domain name, which consists of the subnet's DNS label,
     * the VCN's DNS label, and the {@code oraclevcn.com} domain.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: {@code subnet123.vcn1.oraclevcn.com}
     *
     * @return the value
     **/
    public String getSubnetDomainName() {
        return subnetDomainName;
    }

    /**
     * The date and time the subnet was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the subnet was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the subnet is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the subnet is in.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The IP address of the virtual router.
     * <p>
     * Example: {@code 10.0.14.1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterIp")
    private final String virtualRouterIp;

    /**
     * The IP address of the virtual router.
     * <p>
     * Example: {@code 10.0.14.1}
     *
     * @return the value
     **/
    public String getVirtualRouterIp() {
        return virtualRouterIp;
    }

    /**
     * The MAC address of the virtual router.
     * <p>
     * Example: {@code 00:00:00:00:00:01}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterMac")
    private final String virtualRouterMac;

    /**
     * The MAC address of the virtual router.
     * <p>
     * Example: {@code 00:00:00:00:00:01}
     *
     * @return the value
     **/
    public String getVirtualRouterMac() {
        return virtualRouterMac;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Subnet(");
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dhcpOptionsId=").append(String.valueOf(this.dhcpOptionsId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dnsLabel=").append(String.valueOf(this.dnsLabel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", ipv6CidrBlock=").append(String.valueOf(this.ipv6CidrBlock));
        sb.append(", ipv6PublicCidrBlock=").append(String.valueOf(this.ipv6PublicCidrBlock));
        sb.append(", ipv6VirtualRouterIp=").append(String.valueOf(this.ipv6VirtualRouterIp));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", prohibitPublicIpOnVnic=").append(String.valueOf(this.prohibitPublicIpOnVnic));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", securityListIds=").append(String.valueOf(this.securityListIds));
        sb.append(", subnetDomainName=").append(String.valueOf(this.subnetDomainName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", virtualRouterIp=").append(String.valueOf(this.virtualRouterIp));
        sb.append(", virtualRouterMac=").append(String.valueOf(this.virtualRouterMac));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Subnet)) {
            return false;
        }

        Subnet other = (Subnet) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dhcpOptionsId, other.dhcpOptionsId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dnsLabel, other.dnsLabel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ipv6CidrBlock, other.ipv6CidrBlock)
                && java.util.Objects.equals(this.ipv6PublicCidrBlock, other.ipv6PublicCidrBlock)
                && java.util.Objects.equals(this.ipv6VirtualRouterIp, other.ipv6VirtualRouterIp)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.prohibitPublicIpOnVnic, other.prohibitPublicIpOnVnic)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.securityListIds, other.securityListIds)
                && java.util.Objects.equals(this.subnetDomainName, other.subnetDomainName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.virtualRouterIp, other.virtualRouterIp)
                && java.util.Objects.equals(this.virtualRouterMac, other.virtualRouterMac)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dhcpOptionsId == null ? 43 : this.dhcpOptionsId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dnsLabel == null ? 43 : this.dnsLabel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlock == null ? 43 : this.ipv6CidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6PublicCidrBlock == null
                                ? 43
                                : this.ipv6PublicCidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6VirtualRouterIp == null
                                ? 43
                                : this.ipv6VirtualRouterIp.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.prohibitPublicIpOnVnic == null
                                ? 43
                                : this.prohibitPublicIpOnVnic.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityListIds == null ? 43 : this.securityListIds.hashCode());
        result =
                (result * PRIME)
                        + (this.subnetDomainName == null ? 43 : this.subnetDomainName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualRouterIp == null ? 43 : this.virtualRouterIp.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualRouterMac == null ? 43 : this.virtualRouterMac.hashCode());
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