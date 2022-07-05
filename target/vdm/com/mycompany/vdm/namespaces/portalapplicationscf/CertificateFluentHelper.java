
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import javax.annotation.Nonnull;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.CertificateSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.mycompany.vdm.namespaces.portalapplicationscf.Certificate Certificate} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CertificateFluentHelper
    extends FluentHelperRead<CertificateFluentHelper, Certificate, CertificateSelectable>
{


    /**
     * Creates a fluent helper using the specified service path and entity collection to send the read requests.
     * 
     * @param entityCollection
     *     The entity collection to direct the requests to.
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public CertificateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
    }

    /**
     * Creates a fluent helper using the specified service path to send the read requests.
     * 
     * @param servicePath
     *     The service path to direct the read requests to.
     * @deprecated
     *     Use the constructor {@link CertificateFluentHelper#CertificateFluentHelper(String, String)} instead.
     */
    @Deprecated
    public CertificateFluentHelper(
        @Nonnull
        final String servicePath) {
        super(servicePath);
    }

    @Override
    @Nonnull
    protected Class<Certificate> getEntityClass() {
        return Certificate.class;
    }

}
