/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents whether or not a web app is cloneable.
 */
public class SiteCloneability {
    /**
     * Name of web app. Possible values include: 'Cloneable',
     * 'PartiallyCloneable', 'NotCloneable'.
     */
    @JsonProperty(required = true)
    private CloneAbilityResult result;

    /**
     * List of features enabled on web app that prevent cloning.
     */
    private List<SiteCloneabilityCriterion> blockingFeatures;

    /**
     * List of features enabled on web app that are non-blocking but cannot be
     * cloned. The web app can still be cloned
     * but the features in this list will not be set up on cloned
     * web app.
     */
    private List<SiteCloneabilityCriterion> unsupportedFeatures;

    /**
     * List of blocking application characteristics.
     */
    private List<SiteCloneabilityCriterion> blockingCharacteristics;

    /**
     * Get the result value.
     *
     * @return the result value
     */
    public CloneAbilityResult getResult() {
        return this.result;
    }

    /**
     * Set the result value.
     *
     * @param result the result value to set
     */
    public void setResult(CloneAbilityResult result) {
        this.result = result;
    }

    /**
     * Get the blockingFeatures value.
     *
     * @return the blockingFeatures value
     */
    public List<SiteCloneabilityCriterion> getBlockingFeatures() {
        return this.blockingFeatures;
    }

    /**
     * Set the blockingFeatures value.
     *
     * @param blockingFeatures the blockingFeatures value to set
     */
    public void setBlockingFeatures(List<SiteCloneabilityCriterion> blockingFeatures) {
        this.blockingFeatures = blockingFeatures;
    }

    /**
     * Get the unsupportedFeatures value.
     *
     * @return the unsupportedFeatures value
     */
    public List<SiteCloneabilityCriterion> getUnsupportedFeatures() {
        return this.unsupportedFeatures;
    }

    /**
     * Set the unsupportedFeatures value.
     *
     * @param unsupportedFeatures the unsupportedFeatures value to set
     */
    public void setUnsupportedFeatures(List<SiteCloneabilityCriterion> unsupportedFeatures) {
        this.unsupportedFeatures = unsupportedFeatures;
    }

    /**
     * Get the blockingCharacteristics value.
     *
     * @return the blockingCharacteristics value
     */
    public List<SiteCloneabilityCriterion> getBlockingCharacteristics() {
        return this.blockingCharacteristics;
    }

    /**
     * Set the blockingCharacteristics value.
     *
     * @param blockingCharacteristics the blockingCharacteristics value to set
     */
    public void setBlockingCharacteristics(List<SiteCloneabilityCriterion> blockingCharacteristics) {
        this.blockingCharacteristics = blockingCharacteristics;
    }

}