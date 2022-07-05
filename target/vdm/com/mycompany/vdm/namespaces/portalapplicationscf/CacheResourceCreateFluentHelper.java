
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link com.mycompany.vdm.namespaces.portalapplicationscf.CacheResource CacheResource} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CacheResourceCreateFluentHelper
    extends FluentHelperCreate<CacheResourceCreateFluentHelper, CacheResource>
{

    /**
     * {@link com.mycompany.vdm.namespaces.portalapplicationscf.CacheResource CacheResource} entity object that will be created in the S/4HANA system.
     * 
     */
    private final CacheResource entity;

    /**
     * Creates a fluent helper object that will create a {@link com.mycompany.vdm.namespaces.portalapplicationscf.CacheResource CacheResource} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The CacheResource to create.
     * @deprecated
     *     Use the constructor {@link CacheResourceCreateFluentHelper#CacheResourceCreateFluentHelper(String, CacheResource,String)} instead.
     */
    @Deprecated
    public CacheResourceCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final CacheResource entity) {
        super(servicePath);
        this.entity = entity;
    }

    /**
     * Creates a fluent helper object that will create a {@link com.mycompany.vdm.namespaces.portalapplicationscf.CacheResource CacheResource} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection  to direct the create requests to.
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The CacheResource to create.
     */
    public CacheResourceCreateFluentHelper(
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
