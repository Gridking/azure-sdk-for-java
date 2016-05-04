package com.microsoft.azure.management.resources.implementation;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.resources.Tenants;
import com.microsoft.azure.management.resources.fluentcore.utils.PagedListConverter;
import com.microsoft.azure.management.resources.implementation.api.SubscriptionClientImpl;
import com.microsoft.azure.management.resources.implementation.api.TenantsInner;
import com.microsoft.azure.management.resources.Tenant;
import com.microsoft.azure.management.resources.implementation.api.TenantIdDescriptionInner;

import java.io.IOException;
import java.util.List;

public final class TenantsImpl
        implements Tenants {
    private TenantsInner tenants;
    private SubscriptionClientImpl client;

    public TenantsImpl(SubscriptionClientImpl client) {
        this.client = client;
        this.tenants = client.tenants();
    }

    @Override
    public PagedList<Tenant> list() throws CloudException, IOException {
        PagedListConverter<TenantIdDescriptionInner, Tenant> converter = new PagedListConverter<TenantIdDescriptionInner, Tenant>() {
            @Override
            public Tenant typeConvert(TenantIdDescriptionInner tenantInner) {
                return new TenantImpl(tenantInner);
            }
        };
        return converter.convert(tenants.list().getBody());
    }
}