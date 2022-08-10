/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Resource Capacity samples
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExadataInsightResourceCapacityTrendAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataInsightResourceCapacityTrendAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"endTimestamp", "capacity"})
    public ExadataInsightResourceCapacityTrendAggregation(
            java.util.Date endTimestamp, Double capacity) {
        super();
        this.endTimestamp = endTimestamp;
        this.capacity = capacity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The timestamp in which the current sampling period ends in RFC 3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
        private java.util.Date endTimestamp;

        /**
         * The timestamp in which the current sampling period ends in RFC 3339 format.
         * @param endTimestamp the value to set
         * @return this builder
         **/
        public Builder endTimestamp(java.util.Date endTimestamp) {
            this.endTimestamp = endTimestamp;
            this.__explicitlySet__.add("endTimestamp");
            return this;
        }
        /**
         * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        /**
         * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
         *
         * @param capacity the value to set
         * @return this builder
         **/
        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInsightResourceCapacityTrendAggregation build() {
            ExadataInsightResourceCapacityTrendAggregation model =
                    new ExadataInsightResourceCapacityTrendAggregation(
                            this.endTimestamp, this.capacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInsightResourceCapacityTrendAggregation model) {
            if (model.wasPropertyExplicitlySet("endTimestamp")) {
                this.endTimestamp(model.getEndTimestamp());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
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

    /**
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    private final java.util.Date endTimestamp;

    /**
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     * @return the value
     **/
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Double capacity;

    /**
     * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
     *
     * @return the value
     **/
    public Double getCapacity() {
        return capacity;
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
        sb.append("ExadataInsightResourceCapacityTrendAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("endTimestamp=").append(String.valueOf(this.endTimestamp));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInsightResourceCapacityTrendAggregation)) {
            return false;
        }

        ExadataInsightResourceCapacityTrendAggregation other =
                (ExadataInsightResourceCapacityTrendAggregation) o;
        return java.util.Objects.equals(this.endTimestamp, other.endTimestamp)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endTimestamp == null ? 43 : this.endTimestamp.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
