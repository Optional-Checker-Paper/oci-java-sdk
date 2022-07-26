/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Notebook Session runtime configuration details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NotebookSessionRuntimeConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NotebookSessionRuntimeConfigDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "customEnvironmentVariables",
        "notebookSessionGitConfigDetails"
    })
    public NotebookSessionRuntimeConfigDetails(
            java.util.Map<String, String> customEnvironmentVariables,
            NotebookSessionGitConfigDetails notebookSessionGitConfigDetails) {
        super();
        this.customEnvironmentVariables = customEnvironmentVariables;
        this.notebookSessionGitConfigDetails = notebookSessionGitConfigDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Custom environment variables for Notebook Session. These key-value pairs will be available for customers in Notebook Sessions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customEnvironmentVariables")
        private java.util.Map<String, String> customEnvironmentVariables;

        /**
         * Custom environment variables for Notebook Session. These key-value pairs will be available for customers in Notebook Sessions.
         * @param customEnvironmentVariables the value to set
         * @return this builder
         **/
        public Builder customEnvironmentVariables(
                java.util.Map<String, String> customEnvironmentVariables) {
            this.customEnvironmentVariables = customEnvironmentVariables;
            this.__explicitlySet__.add("customEnvironmentVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionGitConfigDetails")
        private NotebookSessionGitConfigDetails notebookSessionGitConfigDetails;

        public Builder notebookSessionGitConfigDetails(
                NotebookSessionGitConfigDetails notebookSessionGitConfigDetails) {
            this.notebookSessionGitConfigDetails = notebookSessionGitConfigDetails;
            this.__explicitlySet__.add("notebookSessionGitConfigDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NotebookSessionRuntimeConfigDetails build() {
            NotebookSessionRuntimeConfigDetails __instance__ =
                    new NotebookSessionRuntimeConfigDetails(
                            customEnvironmentVariables, notebookSessionGitConfigDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotebookSessionRuntimeConfigDetails o) {
            Builder copiedBuilder =
                    customEnvironmentVariables(o.getCustomEnvironmentVariables())
                            .notebookSessionGitConfigDetails(
                                    o.getNotebookSessionGitConfigDetails());

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
     * Custom environment variables for Notebook Session. These key-value pairs will be available for customers in Notebook Sessions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customEnvironmentVariables")
    private final java.util.Map<String, String> customEnvironmentVariables;

    /**
     * Custom environment variables for Notebook Session. These key-value pairs will be available for customers in Notebook Sessions.
     * @return the value
     **/
    public java.util.Map<String, String> getCustomEnvironmentVariables() {
        return customEnvironmentVariables;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionGitConfigDetails")
    private final NotebookSessionGitConfigDetails notebookSessionGitConfigDetails;

    public NotebookSessionGitConfigDetails getNotebookSessionGitConfigDetails() {
        return notebookSessionGitConfigDetails;
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
        sb.append("NotebookSessionRuntimeConfigDetails(");
        sb.append("customEnvironmentVariables=")
                .append(String.valueOf(this.customEnvironmentVariables));
        sb.append(", notebookSessionGitConfigDetails=")
                .append(String.valueOf(this.notebookSessionGitConfigDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotebookSessionRuntimeConfigDetails)) {
            return false;
        }

        NotebookSessionRuntimeConfigDetails other = (NotebookSessionRuntimeConfigDetails) o;
        return java.util.Objects.equals(
                        this.customEnvironmentVariables, other.customEnvironmentVariables)
                && java.util.Objects.equals(
                        this.notebookSessionGitConfigDetails, other.notebookSessionGitConfigDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.customEnvironmentVariables == null
                                ? 43
                                : this.customEnvironmentVariables.hashCode());
        result =
                (result * PRIME)
                        + (this.notebookSessionGitConfigDetails == null
                                ? 43
                                : this.notebookSessionGitConfigDetails.hashCode());
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
