/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Log Analytics Entity topology that contains a set of log analytics entities and a set of relationships between those.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEntityTopologySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsEntityTopologySummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nodes", "links"})
    public LogAnalyticsEntityTopologySummary(
            LogAnalyticsEntityCollection nodes, LogAnalyticsEntityTopologyLinkCollection links) {
        super();
        this.nodes = nodes;
        this.links = links;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private LogAnalyticsEntityCollection nodes;

        public Builder nodes(LogAnalyticsEntityCollection nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("links")
        private LogAnalyticsEntityTopologyLinkCollection links;

        public Builder links(LogAnalyticsEntityTopologyLinkCollection links) {
            this.links = links;
            this.__explicitlySet__.add("links");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntityTopologySummary build() {
            LogAnalyticsEntityTopologySummary model =
                    new LogAnalyticsEntityTopologySummary(this.nodes, this.links);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntityTopologySummary model) {
            if (model.wasPropertyExplicitlySet("nodes")) {
                this.nodes(model.getNodes());
            }
            if (model.wasPropertyExplicitlySet("links")) {
                this.links(model.getLinks());
            }
            return this;
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

    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final LogAnalyticsEntityCollection nodes;

    public LogAnalyticsEntityCollection getNodes() {
        return nodes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("links")
    private final LogAnalyticsEntityTopologyLinkCollection links;

    public LogAnalyticsEntityTopologyLinkCollection getLinks() {
        return links;
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
        sb.append("LogAnalyticsEntityTopologySummary(");
        sb.append("super=").append(super.toString());
        sb.append("nodes=").append(String.valueOf(this.nodes));
        sb.append(", links=").append(String.valueOf(this.links));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsEntityTopologySummary)) {
            return false;
        }

        LogAnalyticsEntityTopologySummary other = (LogAnalyticsEntityTopologySummary) o;
        return java.util.Objects.equals(this.nodes, other.nodes)
                && java.util.Objects.equals(this.links, other.links)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + (this.links == null ? 43 : this.links.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
