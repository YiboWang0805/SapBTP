
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link com.mycompany.vdm.namespaces.portalapplicationscf.FileResource FileResource} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class FileResourceCreateFluentHelper
    extends FluentHelperCreate<FileResourceCreateFluentHelper, FileResource>
{

    /**
     * {@link com.mycompany.vdm.namespaces.portalapplicationscf.FileResource FileResource} entity object that will be created in the S/4HANA system.
     * 
     */
    private final FileResource entity;

    /**
     * Creates a fluent helper object that will create a {@link com.mycompany.vdm.namespaces.portalapplicationscf.FileResource FileResource} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The FileResource to create.
     * @deprecated
     *     Use the constructor {@link FileResourceCreateFluentHelper#FileResourceCreateFluentHelper(String, FileResource,String)} instead.
     */
    @Deprecated
    public FileResourceCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final FileResource entity) {
        super(servicePath);
        this.entity = entity;
    }

    /**
     * Creates a fluent helper object that will create a {@link com.mycompany.vdm.namespaces.portalapplicationscf.FileResource FileResource} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection  to direct the create requests to.
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The FileResource to create.
     */
    public FileResourceCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final FileResource entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected FileResource getEntity() {
        return entity;
    }

}
