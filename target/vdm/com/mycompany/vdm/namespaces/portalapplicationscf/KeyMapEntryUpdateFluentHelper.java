
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link com.mycompany.vdm.namespaces.portalapplicationscf.KeyMapEntry KeyMapEntry} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class KeyMapEntryUpdateFluentHelper
    extends FluentHelperUpdate<KeyMapEntryUpdateFluentHelper, KeyMapEntry>
{

    /**
     * {@link com.mycompany.vdm.namespaces.portalapplicationscf.KeyMapEntry KeyMapEntry} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final KeyMapEntry entity;

    /**
     * Creates a fluent helper object that will update a {@link com.mycompany.vdm.namespaces.portalapplicationscf.KeyMapEntry KeyMapEntry} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The KeyMapEntry to take the updated values from.
     * @deprecated
     *     Use the constructor {@link KeyMapEntryUpdateFluentHelper#KeyMapEntryUpdateFluentHelper(String, KeyMapEntry,String)} instead.
     */
    @Deprecated
    public KeyMapEntryUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final KeyMapEntry entity) {
        super(servicePath);
        this.entity = entity;
    }

    /**
     * Creates a fluent helper object that will update a {@link com.mycompany.vdm.namespaces.portalapplicationscf.KeyMapEntry KeyMapEntry} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The KeyMapEntry to take the updated values from.
     */
    public KeyMapEntryUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final KeyMapEntry entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected KeyMapEntry getEntity() {
        return entity;
    }

}
