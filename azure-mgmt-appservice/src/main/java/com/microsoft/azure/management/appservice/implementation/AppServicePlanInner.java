/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.management.appservice.StatusOptions;
import com.microsoft.azure.management.appservice.HostingEnvironmentProfile;
import com.microsoft.azure.management.appservice.ProvisioningState;
import com.microsoft.azure.management.appservice.SkuDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * App Service plan.
 */
@JsonFlatten
public class AppServicePlanInner extends Resource {
    /**
     * Name for the App Service plan.
     */
    @JsonProperty(value = "properties.name")
    private String appServicePlanName;

    /**
     * Target worker tier assigned to the App Service plan.
     */
    @JsonProperty(value = "properties.workerTierName")
    private String workerTierName;

    /**
     * App Service plan status. Possible values include: 'Ready', 'Pending'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private StatusOptions status;

    /**
     * App Service plan subscription.
     */
    @JsonProperty(value = "properties.subscription", access = JsonProperty.Access.WRITE_ONLY)
    private String subscription;

    /**
     * App Service plan administration site.
     */
    @JsonProperty(value = "properties.adminSiteName")
    private String adminSiteName;

    /**
     * Specification for the App Service Environment to use for the App
     * Service plan.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * Maximum number of instances that can be assigned to this App Service
     * plan.
     */
    @JsonProperty(value = "properties.maximumNumberOfWorkers", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximumNumberOfWorkers;

    /**
     * Geographical location for the App Service plan.
     */
    @JsonProperty(value = "properties.geoRegion", access = JsonProperty.Access.WRITE_ONLY)
    private String geoRegion;

    /**
     * If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service
     * plan can be scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service
     * plan will scale to all instances of the plan.
     */
    @JsonProperty(value = "properties.perSiteScaling")
    private Boolean perSiteScaling;

    /**
     * Number of apps assigned to this App Service plan.
     */
    @JsonProperty(value = "properties.numberOfSites", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfSites;

    /**
     * Resource group of the App Service plan.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * Scaling worker count.
     */
    @JsonProperty(value = "properties.targetWorkerCount")
    private Integer targetWorkerCount;

    /**
     * Scaling worker size ID.
     */
    @JsonProperty(value = "properties.targetWorkerSizeId")
    private Integer targetWorkerSizeId;

    /**
     * Provisioning state of the App Service Environment. Possible values
     * include: 'Succeeded', 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The sku property.
     */
    private SkuDescription sku;

    /**
     * Get the appServicePlanName value.
     *
     * @return the appServicePlanName value
     */
    public String appServicePlanName() {
        return this.appServicePlanName;
    }

    /**
     * Set the appServicePlanName value.
     *
     * @param appServicePlanName the appServicePlanName value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withAppServicePlanName(String appServicePlanName) {
        this.appServicePlanName = appServicePlanName;
        return this;
    }

    /**
     * Get the workerTierName value.
     *
     * @return the workerTierName value
     */
    public String workerTierName() {
        return this.workerTierName;
    }

    /**
     * Set the workerTierName value.
     *
     * @param workerTierName the workerTierName value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withWorkerTierName(String workerTierName) {
        this.workerTierName = workerTierName;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public StatusOptions status() {
        return this.status;
    }

    /**
     * Get the subscription value.
     *
     * @return the subscription value
     */
    public String subscription() {
        return this.subscription;
    }

    /**
     * Get the adminSiteName value.
     *
     * @return the adminSiteName value
     */
    public String adminSiteName() {
        return this.adminSiteName;
    }

    /**
     * Set the adminSiteName value.
     *
     * @param adminSiteName the adminSiteName value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withAdminSiteName(String adminSiteName) {
        this.adminSiteName = adminSiteName;
        return this;
    }

    /**
     * Get the hostingEnvironmentProfile value.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile value.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get the maximumNumberOfWorkers value.
     *
     * @return the maximumNumberOfWorkers value
     */
    public Integer maximumNumberOfWorkers() {
        return this.maximumNumberOfWorkers;
    }

    /**
     * Get the geoRegion value.
     *
     * @return the geoRegion value
     */
    public String geoRegion() {
        return this.geoRegion;
    }

    /**
     * Get the perSiteScaling value.
     *
     * @return the perSiteScaling value
     */
    public Boolean perSiteScaling() {
        return this.perSiteScaling;
    }

    /**
     * Set the perSiteScaling value.
     *
     * @param perSiteScaling the perSiteScaling value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withPerSiteScaling(Boolean perSiteScaling) {
        this.perSiteScaling = perSiteScaling;
        return this;
    }

    /**
     * Get the numberOfSites value.
     *
     * @return the numberOfSites value
     */
    public Integer numberOfSites() {
        return this.numberOfSites;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the targetWorkerCount value.
     *
     * @return the targetWorkerCount value
     */
    public Integer targetWorkerCount() {
        return this.targetWorkerCount;
    }

    /**
     * Set the targetWorkerCount value.
     *
     * @param targetWorkerCount the targetWorkerCount value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withTargetWorkerCount(Integer targetWorkerCount) {
        this.targetWorkerCount = targetWorkerCount;
        return this;
    }

    /**
     * Get the targetWorkerSizeId value.
     *
     * @return the targetWorkerSizeId value
     */
    public Integer targetWorkerSizeId() {
        return this.targetWorkerSizeId;
    }

    /**
     * Set the targetWorkerSizeId value.
     *
     * @param targetWorkerSizeId the targetWorkerSizeId value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withTargetWorkerSizeId(Integer targetWorkerSizeId) {
        this.targetWorkerSizeId = targetWorkerSizeId;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

}
