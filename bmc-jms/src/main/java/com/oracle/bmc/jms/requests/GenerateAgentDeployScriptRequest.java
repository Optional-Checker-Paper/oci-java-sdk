/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GenerateAgentDeployScriptExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GenerateAgentDeployScriptRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class GenerateAgentDeployScriptRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.jms.model.GenerateAgentDeployScriptDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Fleet.
     */
    private String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Fleet.
     */
    public String getFleetId() {
        return fleetId;
    }
    /**
     * Attributes to generate agent deploy script for a Fleet.
     */
    private com.oracle.bmc.jms.model.GenerateAgentDeployScriptDetails
            generateAgentDeployScriptDetails;

    /**
     * Attributes to generate agent deploy script for a Fleet.
     */
    public com.oracle.bmc.jms.model.GenerateAgentDeployScriptDetails
            getGenerateAgentDeployScriptDetails() {
        return generateAgentDeployScriptDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.jms.model.GenerateAgentDeployScriptDetails getBody$() {
        return generateAgentDeployScriptDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GenerateAgentDeployScriptRequest,
                    com.oracle.bmc.jms.model.GenerateAgentDeployScriptDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Fleet.
         */
        private String fleetId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Fleet.
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /**
         * Attributes to generate agent deploy script for a Fleet.
         */
        private com.oracle.bmc.jms.model.GenerateAgentDeployScriptDetails
                generateAgentDeployScriptDetails = null;

        /**
         * Attributes to generate agent deploy script for a Fleet.
         * @param generateAgentDeployScriptDetails the value to set
         * @return this builder instance
         */
        public Builder generateAgentDeployScriptDetails(
                com.oracle.bmc.jms.model.GenerateAgentDeployScriptDetails
                        generateAgentDeployScriptDetails) {
            this.generateAgentDeployScriptDetails = generateAgentDeployScriptDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GenerateAgentDeployScriptRequest o) {
            fleetId(o.getFleetId());
            generateAgentDeployScriptDetails(o.getGenerateAgentDeployScriptDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GenerateAgentDeployScriptRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GenerateAgentDeployScriptRequest
         */
        public GenerateAgentDeployScriptRequest build() {
            GenerateAgentDeployScriptRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.jms.model.GenerateAgentDeployScriptDetails body) {
            generateAgentDeployScriptDetails(body);
            return this;
        }

        /**
         * Build the instance of GenerateAgentDeployScriptRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GenerateAgentDeployScriptRequest
         */
        public GenerateAgentDeployScriptRequest buildWithoutInvocationCallback() {
            GenerateAgentDeployScriptRequest request = new GenerateAgentDeployScriptRequest();
            request.fleetId = fleetId;
            request.generateAgentDeployScriptDetails = generateAgentDeployScriptDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new GenerateAgentDeployScriptRequest(fleetId, generateAgentDeployScriptDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fleetId(fleetId)
                .generateAgentDeployScriptDetails(generateAgentDeployScriptDetails)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",generateAgentDeployScriptDetails=")
                .append(String.valueOf(this.generateAgentDeployScriptDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateAgentDeployScriptRequest)) {
            return false;
        }

        GenerateAgentDeployScriptRequest other = (GenerateAgentDeployScriptRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(
                        this.generateAgentDeployScriptDetails,
                        other.generateAgentDeployScriptDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.generateAgentDeployScriptDetails == null
                                ? 43
                                : this.generateAgentDeployScriptDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
