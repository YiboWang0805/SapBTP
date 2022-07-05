
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import javax.annotation.Nonnull;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.APIProxyEndPointSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.mycompany.vdm.namespaces.portalapplicationscf.APIProxyEndPoint APIProxyEndPoint} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class APIProxyEndPointFluentHelper
    extends FluentHelperRead<APIProxyEndPointFluentHelper, APIProxyEndPoint, APIProxyEndPointSelectable>
{


    /**
     * Creates a fluent helper using the specified service path and entity collection to send the read requests.
     * 
     * @param entityCollection
     *     The entity collection to direct the requests to.
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public APIProxyEndPointFluentHelper(
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
     *     Use the constructor {@link APIProxyEndPointFluentHelper#APIProxyEndPointFluentHelper(String, String)} instead.
     */
    @Deprecated
    public APIProxyEndPointFluentHelper(
        @Nonnull
        final String servicePath) {
        super(servicePath);
    }

    @Override
    @Nonnull
    protected Class<APIProxyEndPoint> getEntityClass() {
        return APIProxyEndPoint.class;
    }

}