
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.ResourceSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.mycompany.vdm.namespaces.portalapplicationscf.Resource Resource} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class ResourceByKeyFluentHelper
    extends FluentHelperByKey<ResourceByKeyFluentHelper, Resource, ResourceSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.mycompany.vdm.namespaces.portalapplicationscf.Resource Resource} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param type_2
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code Resource}
     * @param locale
     *     
     * @param object_id
     *     
     * @deprecated
     *     Use the constructor {@link ResourceByKeyFluentHelper#ResourceByKeyFluentHelper(String, String, String, String, String)}  instead.
     */
    @Deprecated
    public ResourceByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String locale, final String object_id, final String type_2) {
        super(servicePath);
        this.key.put("locale", locale);
        this.key.put("object_id", object_id);
        this.key.put("type", type_2);
    }

    /**
     * Creates a fluent helper object that will fetch a single {@link com.mycompany.vdm.namespaces.portalapplicationscf.Resource Resource} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code Resource}
     * @param type_2
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code Resource}
     * @param locale
     *     
     * @param object_id
     *     
     */
    public ResourceByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String locale, final String object_id, final String type_2) {
        super(servicePath, entityCollection);
        this.key.put("locale", locale);
        this.key.put("object_id", object_id);
        this.key.put("type", type_2);
    }

    @Override
    @Nonnull
    protected Class<Resource> getEntityClass() {
        return Resource.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
