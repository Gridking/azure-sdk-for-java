/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.models;

import com.microsoft.rest.BaseResource;

/**
 * Plan for the resource.
 */
public class Plan {
    /**
     * Gets or sets the plan ID.
     */
    private String name;

    /**
     * Gets or sets the publisher ID.
     */
    private String publisher;

    /**
     * Gets or sets the offer ID.
     */
    private String product;

    /**
     * Gets or sets the promotion code.
     */
    private String promotionCode;

    /**
     * Get the name value.
     *
     * @return the name value
     */ 
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */ 
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */ 
    public String getProduct() {
        return this.product;
    }

    /**
     * Set the product value.
     *
     * @param product the product value to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Get the promotionCode value.
     *
     * @return the promotionCode value
     */ 
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotionCode value.
     *
     * @param promotionCode the promotionCode value to set
     */
    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

}