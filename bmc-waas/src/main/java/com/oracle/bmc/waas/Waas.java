/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public interface Waas extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Accepts a list of recommended Web Application Firewall protection rules. Web Application Firewall protection rule recommendations are sets of rules generated by observed traffic patterns through the Web Application Firewall and are meant to optimize the Web Application Firewall's security profile. Only the rules specified in the request body will be updated; all other rules will remain unchanged.
     * <p>
     * Use the `GET /waasPolicies/{waasPolicyId}/wafConfig/recommendations` method to view a list of recommended Web Application Firewall protection rules. For more information, see [WAF Protection Rules](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/WAF/Tasks/wafprotectionrules.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AcceptRecommendationsResponse acceptRecommendations(AcceptRecommendationsRequest request);

    /**
     * Cancels a specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Allows an SSL certificate to be added to a WAAS policy. The Web Application Firewall terminates SSL connections to inspect requests in runtime, and then re-encrypts requests before sending them to the origin for fulfillment.
     * <p>
     * For more information, see [WAF Settings](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/WAF/Tasks/wafsettings.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCertificateResponse createCertificate(CreateCertificateRequest request);

    /**
     * Creates a new Web Application Acceleration and Security (WAAS) policy in the specified compartment. A WAAS policy must be established before creating Web Application Firewall (WAF) rules. To use WAF rules, your web application's origin servers must defined in the `WaasPolicy` schema.
     * <p>
     * A domain name must be specified when creating a WAAS policy. The domain name should be different from the origins specified in your `WaasPolicy`. Once domain name is entered and stored, it is unchangeable.
     * <p>
     * Use the record data returned in the `cname` field of the `WaasPolicy` object to create a CNAME record in your DNS configuration that will direct your domain's traffic through the WAF.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the service to reside. For information about access control and compartments, see [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Identity/Concepts/overview.htm).
     * <p>
     * You must specify a display name and domain for the WAAS policy. The display name does not have to be unique and can be changed. The domain name should be different from every origin specified in `WaasPolicy`.
     * <p>
     * All Oracle Cloud Infrastructure resources, including WAAS policies, receive a unique, Oracle-assigned ID called an Oracle Cloud Identifier (OCID). When a resource is created, you can find its OCID in the response. You can also retrieve a resource's OCID by using a list API operation for that resource type, or by viewing the resource in the Console. Fore more information, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/identifiers.htm).
     * <p>
     **Note:** After sending the POST request, the new object's state will temporarily be `CREATING`. Ensure that the resource's state has changed to `ACTIVE` before use.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateWaasPolicyResponse createWaasPolicy(CreateWaasPolicyRequest request);

    /**
     * Deletes an SSL certificate from the WAAS service.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request);

    /**
     * Deletes a policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteWaasPolicyResponse deleteWaasPolicy(DeleteWaasPolicyRequest request);

    /**
     * Gets the details of an SSL certificate.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCertificateResponse getCertificate(GetCertificateRequest request);

    /**
     * Gets the device fingerprint challenge settings in the Web Application Firewall configuration for a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDeviceFingerprintChallengeResponse getDeviceFingerprintChallenge(
            GetDeviceFingerprintChallengeRequest request);

    /**
     * Gets the human interaction challenge settings in the Web Application Firewall configuration for a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetHumanInteractionChallengeResponse getHumanInteractionChallenge(
            GetHumanInteractionChallengeRequest request);

    /**
     * Gets the JavaScript challenge settings in the Web Application Firewall configuration for a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJsChallengeResponse getJsChallenge(GetJsChallengeRequest request);

    /**
     * Gets the configuration of a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPolicyConfigResponse getPolicyConfig(GetPolicyConfigRequest request);

    /**
     * Gets the details of a protection rule in the Web Application Firewall configuration for a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetProtectionRuleResponse getProtectionRule(GetProtectionRuleRequest request);

    /**
     * Gets the protection settings in the Web Application Firewall configuration for a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetProtectionSettingsResponse getProtectionSettings(GetProtectionSettingsRequest request);

    /**
     * Gets the details of a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWaasPolicyResponse getWaasPolicy(GetWaasPolicyRequest request);

    /**
     * Gets the address rate limiting settings of the Web Application Firewall configuration for a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWafAddressRateLimitingResponse getWafAddressRateLimiting(
            GetWafAddressRateLimitingRequest request);

    /**
     * Gets the Web Application Firewall configuration details for a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWafConfigResponse getWafConfig(GetWafConfigRequest request);

    /**
     * Gets the details of a specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Gets the currently configured access rules for the Web Application Firewall configration of a specified WAAS policy.
     * The order of the access rules is important. The rules will be checked in the order they are specified and the first matching rule will be used.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAccessRulesResponse listAccessRules(ListAccessRulesRequest request);

    /**
     * Gets the list of currently configured CAPTCHA challenges in the Web
     * Application Firewall configuration of a WAAS policy.
     * <p>
     * The order of the CAPTCHA challenges is important. The URL for each
     * CAPTCHA will be checked in the order they are created.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCaptchasResponse listCaptchas(ListCaptchasRequest request);

    /**
     * Gets a list of SSL certificates that can be used in a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCertificatesResponse listCertificates(ListCertificatesRequest request);

    /**
     * Return the list of the tenant's edge node subnets. Use these CIDR blocks to restrict incoming traffic to your origin. These subnets are owned by OCI and forward traffic to customer origins. They are not associated with specific regions or compartments.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListEdgeSubnetsResponse listEdgeSubnets(ListEdgeSubnetsRequest request);

    /**
     * Gets the list of good bots defined in the Web Application Firewall configuration for a WAAS policy.
     * <p>
     * The list is sorted ascending by `key`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListGoodBotsResponse listGoodBots(ListGoodBotsRequest request);

    /**
     * Gets the list of protection rules in the Web Application Firewall configuration for a WAAS policy, including currently defined rules and recommended rules.
     * The list is sorted ascending by `key`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListProtectionRulesResponse listProtectionRules(ListProtectionRulesRequest request);

    /**
     * Gets the list of recommended Web Application Firewall protection rules.
     * <p>
     * Use the `POST /waasPolicies/{waasPolicyId}/actions/acceptWafConfigRecommendations` method to accept recommended Web Application Firewall protection rules. For more information, see [WAF Protection Rules](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/WAF/Tasks/wafprotectionrules.htm).
     * The list is sorted ascending by `key`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request);

    /**
     * Gets the list of available web application threat intelligence feeds
     * and the actions set for each feed. The list is sorted ascending by
     * `key`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListThreatFeedsResponse listThreatFeeds(ListThreatFeedsRequest request);

    /**
     * Gets a list of WAAS policies.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWaasPoliciesResponse listWaasPolicies(ListWaasPoliciesRequest request);

    /**
     * Gets the number of blocked requests by a Web Application Firewall feature in five minute blocks, in ascending order by `timeObserved`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWafBlockedRequestsResponse listWafBlockedRequests(ListWafBlockedRequestsRequest request);

    /**
     * Gets structured Web Application Firewall event logs for a WAAS
     * policy. The list is sorted by the `timeObserved` starting from the
     * oldest recorded event (ascending).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWafLogsResponse listWafLogs(ListWafLogsRequest request);

    /**
     * Gets the number of requests managed by a Web Application Firewall
     * over a specified period of time, including blocked requests. Sorted
     * by `timeObserved` with oldest requests first (ascending).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWafRequestsResponse listWafRequests(ListWafRequestsRequest request);

    /**
     * Gets the Web Application Firewall traffic data for a WAAS policy.
     * Sorted by `timeObserved` with oldest data points first (ascending).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWafTrafficResponse listWafTraffic(ListWafTrafficRequest request);

    /**
     * Gets the list of whitelists defined in the Web Application Firewall configuration for a WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWhitelistsResponse listWhitelists(ListWhitelistsRequest request);

    /**
     * Gets a list of subnets (CIDR notation) from which the WAAS EDGE may make requests. The subnets are owned by OCI and forward traffic to your origins. Allow traffic from these subnets to your origins. They are not associated with specific regions or compartments.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the list of access rules in the Web Application Firewall configuration for a specified WAAS policy. Access rules allow explicit actions to be defined and executed for requests that meet various conditions. A rule action can be set to allow, detect, or block requests. The detect setting allows the request to pass through the Web Application Firewall and is tagged with a `DETECT` flag in the Web Application Firewall's log.
     * This operation can create, delete, update, and/or reorder access rules depending on the structure of the request body.
     * Updating an existing access rule can be accomplished by changing the properties of the access rule object with a non-empty `key` property in the list.
     * Reordering of access rules can be accomplished by changing the order of the access rules in the list when updating.
     * Creating an access rule can be accomplished by adding a new access rule object to the list without a `key` property. A `key` will be generated for the new access rule upon update.
     * Deleting an access rule can be accomplished by removing the existing access rule object from the list. Any existing access rule with a `key` that is not present in the list of access rules sent in the request will be deleted.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAccessRulesResponse updateAccessRules(UpdateAccessRulesRequest request);

    /**
     * Updates the list of CAPTCHA challenges in the Web Application Firewall configuration for a WAAS policy.
     * This operation can create, update, or delete CAPTCHAs depending on the structure of the request body.
     * Updating an existing CAPTCHA can be accomplished by changing the properties of the CAPTCHA object with a non-empty `key` property in the list.
     * Creating a CAPTCHA can be accomplished by adding a new CAPTCHA object to the list without a `key` property. A `key` will be generated for the new CAPTCHA upon update.
     * Deleting a CAPTCHA can be accomplished by removing the existing CAPTCHA object from the list. Any existing CAPTCHA with a `key` that is not present in the list of CAPTCHAs sent in the request will be deleted.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCaptchasResponse updateCaptchas(UpdateCaptchasRequest request);

    /**
     * It is not possible to update a certificate, only create and delete. Therefore, this operation can only update the display name, freeform tags, and defined tags of a certificate.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request);

    /**
     * Updates the Device Fingerprint Challenge (DFC) settings in the Web Application Firewall configuration for a policy. The DFC generates a hashed signature of both virtual and real browsers based on 50+ attributes. These proprietary signatures are then leveraged for real-time correlation to identify and block malicious bots.
     * <p>
     * The signature is based on a library of attributes detected via JavaScript listeners; the attributes include OS, screen resolution, fonts, UserAgent, IP address, etc. We are constantly making improvements and considering new libraries to include in our DFC build. We can also exclude attributes from the signature as needed.
     * <p>
     * DFC collects attributes to generate a hashed signature about a client \u2013 if a fingerprint is not possible, then it will result in a block or alert action. Actions can be enforced across multiple devices if they share they have the same fingerprint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDeviceFingerprintChallengeResponse updateDeviceFingerprintChallenge(
            UpdateDeviceFingerprintChallengeRequest request);

    /**
     * Updates the list of good bots in the Web Application Firewall configuration for a policy. Only the fields specified in the request body will be updated, all other configuration properties will remain unchanged.
     * <p>
     * Good bots allows you to manage access for bots from known providers, such as Google or Baidu. For more information about good bots, please see [Bot Management](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/WAF/Tasks/botmanagement.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateGoodBotsResponse updateGoodBots(UpdateGoodBotsRequest request);

    /**
     * Updates the Human Interaction Challenge (HIC) settings in the Web Application Firewall configuration for a WAAS policy. HIC is a countermeasure that allows the proxy to check the user's browser for various behaviors that distinguish a human presence from a bot.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateHumanInteractionChallengeResponse updateHumanInteractionChallenge(
            UpdateHumanInteractionChallengeRequest request);

    /**
     * Updates the JavaScript challenge settings in the Web Application Firewall configuration for a WAAS policy. JavaScript Challenge validates that the client can accept JavaScript with a binary decision. For more information, see [Bot Management](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/WAF/Tasks/botmanagement.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateJsChallengeResponse updateJsChallenge(UpdateJsChallengeRequest request);

    /**
     * Updates the configuration for a WAAS policy. Only the fields specified in the request body will be updated; all other properties will remain unchanged.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdatePolicyConfigResponse updatePolicyConfig(UpdatePolicyConfigRequest request);

    /**
     * Updates the action for each specified protection rule. Requests can either be allowed, blocked, or trigger an alert if they meet the parameters of an applied rule. For more information on protection rules, see [WAF Protection Rules](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/WAF/Tasks/wafprotectionrules.htm).
     * This operation can update or disable protection rules depending on the structure of the request body.
     * Updating an existing protection rule can be accomplished by changing the properties of the protection rule object with a non-empty `key` property in the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateProtectionRulesResponse updateProtectionRules(UpdateProtectionRulesRequest request);

    /**
     * Updates the protection settings in the Web Application Firewall configuration for a WAAS policy. Protection settings allow you define what action is taken when a request is blocked by the Web Application Firewall, such as returning a response code or block page. Only the fields specified in the request body will be updated; all other fields will remain unchanged.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateProtectionSettingsResponse updateProtectionSettings(
            UpdateProtectionSettingsRequest request);

    /**
     * Updates the action to take when a request's IP address matches an address in the specified threat intelligence feed. Threat intelligence feeds are compiled lists of IP addresses with malicious reputations based on internet intelligence. Only the threat feeds specified in the request body will be updated; all other threat feeds will remain unchanged.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateThreatFeedsResponse updateThreatFeeds(UpdateThreatFeedsRequest request);

    /**
     * Updates the details of a WAAS policy, including origins and tags. Only the fields specified in the request body will be updated; all other properties will remain unchanged.
     * To update platform provided resources such as `GoodBots`, `ProtectionRules`, and `ThreatFeeds` first retrieve the list of available resources with the related list operation such as `GetThreatFeeds` or `GetProtectionRules`.
     * The returned list will contain objects with `key` properties that can be used to update the resource during the `UpdateWaasPolicy` request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateWaasPolicyResponse updateWaasPolicy(UpdateWaasPolicyRequest request);

    /**
     * Updates the address rate limiting settings in the Web Application Firewall configuration for a policy. Rate limiting allows you to configure a threshold for the number of requests from a unique IP address for the given period. You can also define the response code for the requests from the same address that exceed the threshold.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateWafAddressRateLimitingResponse updateWafAddressRateLimiting(
            UpdateWafAddressRateLimitingRequest request);

    /**
     * Updates the Web Application Firewall configuration for a specified WAAS policy.
     * <p>
     * To update platform provided resources such as `GoodBots`, `ProtectionRules`, and `ThreatFeeds`
     * first retrieve the list of available resources with the related list operation such as
     * `GetThreatFeeds` or `GetProtectionRules`.
     * <p>
     * The returned list will contain objects with `key` properties that can be used to update the
     * resource during the `UpdateWafConfig` request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateWafConfigResponse updateWafConfig(UpdateWafConfigRequest request);

    /**
     * Updates the list of IP addresses that bypass the Web Application Firewall for a WAAS policy. Supports both single IP addresses or subnet masks (CIDR notation).
     * This operation can create, delete, update, and/or reorder whitelists depending on the structure of the request body.
     * Updating an existing whitelist can be accomplished by changing the properties of the whitelist object with a non-empty `key` property in the list.
     * Reordering of whitelists can be accomplished by changing the order of the whitelists in the list when updating.
     * Creating a whitelist can be accomplished by adding a new whitelist object to the list without a `key` property. A `key` will be generated for the new whitelist upon update.
     * Deleting a whitelist can be accomplished by removing the existing whitelist object from the list. Any existing whitelist with a `key` that is not present in the list of whitelists sent in the request will be deleted.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateWhitelistsResponse updateWhitelists(UpdateWhitelistsRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    WaasWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    WaasPaginators getPaginators();
}
