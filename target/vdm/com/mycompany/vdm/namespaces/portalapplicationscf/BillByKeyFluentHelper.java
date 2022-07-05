
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.BillSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.mycompany.vdm.namespaces.portalapplicationscf.Bill Bill} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BillByKeyFluentHelper
    extends FluentHelperByKey<BillByKeyFluentHelper, Bill, BillSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.mycompany.vdm.namespaces.portalapplicationscf.Bill Bill} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param fromDate
     *     
     * @param entityType
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code Bill}
     * @param toDate
     *     
     * @param entityId
     *     
     * @deprecated
     *     Use the constructor {@link BillByKeyFluentHelper#BillByKeyFluentHelper(String, String, String, String, LocalDateTime, LocalDateTime)}  instead.
     */
    @Deprecated
    public BillByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String entityId, final String entityType, final LocalDateTime fromDate, final LocalDateTime toDate) {
        super(servicePath);
        this.key.put("entityId", entityId);
        this.key.put("entityType", entityType);
        this.key.put("fromDate", fromDate);
        this.key.put("toDate", toDate);
    }

    /**
     * Creates a fluent helper object that will fetch a single {@link com.mycompany.vdm.namespaces.portalapplicationscf.Bill Bill} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param fromDate
     *     
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code Bill}
     * @param entityType
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code Bill}
     * @param toDate
     *     
     * @param entityId
     *     
     */
    public BillByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String entityId, final String entityType, final LocalDateTime fromDate, final LocalDateTime toDate) {
        super(servicePath, entityCollection);
        this.key.put("entityId", entityId);
        this.key.put("entityType", entityType);
        this.key.put("fromDate", fromDate);
        this.key.put("toDate", toDate);
    }

    @Override
    @Nonnull
    protected Class<Bill> getEntityClass() {
        return Bill.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
