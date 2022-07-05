
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link com.mycompany.vdm.namespaces.portalapplicationscf.CacheResource CacheResource} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CacheResourceDeleteFluentHelper
    extends FluentHelperDelete<CacheResourceDeleteFluentHelper, CacheResource>
{

    /**
     * {@link com.mycompany.vdm.namespaces.portalapplicationscf.CacheResource CacheResource} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final CacheResource entity;

    /**
     * Creates a fluent helper object that will delete a {@link com.mycompany.vdm.namespaces.portalapplicationscf.CacheResource CacheResource} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The CacheResource to delete from the endpoint.
     * @deprecated
     *     Use the constructor {@link CacheResourceDeleteFluentHelper#CacheResourceDeleteFluentHelper(String, CacheResource,String)} instead.
     */
    @Deprecated
    public CacheResourceDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final CacheResource entity) {
        super(servicePath);
        this.entity = entity;
    }

    /**
     * Creates a fluent helper object that will delete a {@link com.mycompany.vdm.namespaces.portalapplicationscf.CacheResource CacheResource} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param entityCollection
     *     The entity collection to direct the update requests to.
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The CacheResource to delete from the endpoint.
     */
    public CacheResourceDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final CacheResource entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected CacheResource getEntity() {
        return entity;
    }

}