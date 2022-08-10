/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The detach DataAsset response.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetachDataAssetInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetachDataAssetInfo extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"referenceInfo"})
    public DetachDataAssetInfo(java.util.Map<String, ValidationResult> referenceInfo) {
        super();
        this.referenceInfo = referenceInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Map of DataAsset name as key and results as value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referenceInfo")
        private java.util.Map<String, ValidationResult> referenceInfo;

        /**
         * Map of DataAsset name as key and results as value
         * @param referenceInfo the value to set
         * @return this builder
         **/
        public Builder referenceInfo(java.util.Map<String, ValidationResult> referenceInfo) {
            this.referenceInfo = referenceInfo;
            this.__explicitlySet__.add("referenceInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachDataAssetInfo build() {
            DetachDataAssetInfo model = new DetachDataAssetInfo(this.referenceInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachDataAssetInfo model) {
            if (model.wasPropertyExplicitlySet("referenceInfo")) {
                this.referenceInfo(model.getReferenceInfo());
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
     * Map of DataAsset name as key and results as value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceInfo")
    private final java.util.Map<String, ValidationResult> referenceInfo;

    /**
     * Map of DataAsset name as key and results as value
     * @return the value
     **/
    public java.util.Map<String, ValidationResult> getReferenceInfo() {
        return referenceInfo;
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
        sb.append("DetachDataAssetInfo(");
        sb.append("super=").append(super.toString());
        sb.append("referenceInfo=").append(String.valueOf(this.referenceInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachDataAssetInfo)) {
            return false;
        }

        DetachDataAssetInfo other = (DetachDataAssetInfo) o;
        return java.util.Objects.equals(this.referenceInfo, other.referenceInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.referenceInfo == null ? 43 : this.referenceInfo.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
