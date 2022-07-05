
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link com.mycompany.vdm.namespaces.portalapplicationscf.RouteRule RouteRule} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class RouteRuleDeleteFluentHelper
    extends FluentHelperDelete<RouteRuleDeleteFluentHelper, RouteRule>
{

    /**
     * {@link com.mycompany.vdm.namespaces.portalapplicationscf.RouteRule RouteRule} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final RouteRule entity;

    /**
     * Creates a fluent helper object that will delete a {@link com.mycompany.vdm.namespaces.portalapplicationscf.RouteRule RouteRule} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The RouteRule to delete from the endpoint.
     * @deprecated
     *     Use the constructor {@link RouteRuleDeleteFluentHelper#RouteRuleDeleteFluentHelper(String, RouteRule,String)} instead.
     */
    @Deprecated
    public RouteRuleDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final RouteRule entity) {
        super(servicePath);
        this.entity = entity;
    }

    /**
     * Creates a fluent helper object that will delete a {@link com.mycompany.vdm.namespaces.portalapplicationscf.RouteRule RouteRule} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param entityCollection
     *     The entity collection to direct the update requests to.
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The RouteRule to delete from the endpoint.
     */
    public RouteRuleDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final RouteRule entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected RouteRule getEntity() {
        return entity;
    }

}
