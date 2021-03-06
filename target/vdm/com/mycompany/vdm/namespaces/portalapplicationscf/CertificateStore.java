
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mycompany.vdm.namespaces.portalapplicationscf.field.CertificateStoreField;
import com.mycompany.vdm.namespaces.portalapplicationscf.link.CertificateStoreLink;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.CertificateStoreSelectable;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpClientAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestinationProperties;
import com.sap.cloud.sdk.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import io.vavr.control.Option;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.http.client.HttpClient;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * <p>Original entity name from the Odata EDM: <b>CertificateStore</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CertificateStore
    extends VdmEntity<CertificateStore>
{

    /**
     * Selector for all available fields of CertificateStore.
     * 
     */
    public final static CertificateStoreSelectable ALL_FIELDS = () -> "*";
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>life_cycle</b></p>
     * 
     * @return
     *     The life_cycle contained in this entity.
     */
    @SerializedName("life_cycle")
    @JsonProperty("life_cycle")
    @Nullable
    @ODataField(odataName = "life_cycle")
    private History life_cycle;
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>name</b></p>
     * 
     * @return
     *     The name contained in this entity.
     */
    @Key
    @SerializedName("name")
    @JsonProperty("name")
    @Nullable
    @ODataField(odataName = "name")
    private String name;
    /**
     * Use with available fluent helpers to apply the <b>name</b> field to query operations.
     * 
     */
    public final static CertificateStoreField<String> NAME = new CertificateStoreField<String>("name");
    /**
     * Constraints: Nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>storeType</b></p>
     * 
     * @return
     *     The storeType contained in this entity.
     */
    @SerializedName("storeType")
    @JsonProperty("storeType")
    @Nullable
    @ODataField(odataName = "storeType")
    private String storeType;
    /**
     * Use with available fluent helpers to apply the <b>storeType</b> field to query operations.
     * 
     */
    public final static CertificateStoreField<String> STORE_TYPE = new CertificateStoreField<String>("storeType");
    /**
     * Navigation property <b>certificates</b> for <b>CertificateStore</b> to multiple <b>Certificate</b>.
     * 
     */
    @SerializedName("certificates")
    @JsonProperty("certificates")
    @ODataField(odataName = "certificates")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<Certificate> toCertificates;
    /**
     * Use with available fluent helpers to apply the <b>certificates</b> navigation property to query operations.
     * 
     */
    public final static CertificateStoreLink<Certificate> TO_CERTIFICATES = new CertificateStoreLink<Certificate>("certificates");

    @Nonnull
    @Override
    public Class<CertificateStore> getType() {
        return CertificateStore.class;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>life_cycle</b></p>
     * 
     * @param life_cycle
     *     The life_cycle to set.
     */
    public void setLife_cycle(
        @Nullable
        final History life_cycle) {
        rememberChangedField("life_cycle", this.life_cycle);
        this.life_cycle = life_cycle;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>name</b></p>
     * 
     * @param name
     *     The name to set.
     */
    public void setName(
        @Nullable
        final String name) {
        rememberChangedField("name", this.name);
        this.name = name;
    }

    /**
     * Constraints: Nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>storeType</b></p>
     * 
     * @param storeType
     *     The storeType to set.
     */
    public void setStoreType(
        @Nullable
        final String storeType) {
        rememberChangedField("storeType", this.storeType);
        this.storeType = storeType;
    }

    @Override
    protected String getEntityCollection() {
        return "CertificateStores";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("name", getName());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("life_cycle", getLife_cycle());
        values.put("name", getName());
        values.put("storeType", getStoreType());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("name")) {
                final Object value = values.remove("name");
                if ((value == null)||(!value.equals(getName()))) {
                    setName(((String) value));
                }
            }
            if (values.containsKey("storeType")) {
                final Object value = values.remove("storeType");
                if ((value == null)||(!value.equals(getStoreType()))) {
                    setStoreType(((String) value));
                }
            }
        }
        // structured properties
        {
            if (values.containsKey("life_cycle")) {
                final Object value = values.remove("life_cycle");
                if (value instanceof Map) {
                    if (getLife_cycle() == null) {
                        setLife_cycle(new History());
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    getLife_cycle().fromMap(inputMap);
                }
                if ((value == null)&&(getLife_cycle()!= null)) {
                    setLife_cycle(null);
                }
            }
        }
        // navigation properties
        {
            if ((values).containsKey("certificates")) {
                final Object value = (values).remove("certificates");
                if (value instanceof Iterable) {
                    if (toCertificates == null) {
                        toCertificates = Lists.newArrayList();
                    } else {
                        toCertificates = Lists.newArrayList(toCertificates);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        Certificate entity;
                        if (toCertificates.size()>i) {
                            entity = toCertificates.get(i);
                        } else {
                            entity = new Certificate();
                            toCertificates.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >CertificateStoreField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CertificateStoreField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >CertificateStoreField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CertificateStoreField<T>(fieldName, typeConverter);
    }

    @Override
    @Nullable
    public HttpDestinationProperties getDestinationForFetch() {
        return super.getDestinationForFetch();
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Override
    public void attachToService(
        @Nullable
        final String servicePath,
        @Nonnull
        final HttpDestinationProperties destination) {
        super.attachToService(servicePath, destination);
    }

    @Override
    protected String getDefaultServicePath() {
        return (com.mycompany.vdm.services.APIPortalApplicationsCFService.DEFAULT_SERVICE_PATH);
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toCertificates!= null) {
            (values).put("certificates", toCertificates);
        }
        return values;
    }

    /**
     * Fetches the <b>Certificate</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>certificates</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>Certificate</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<Certificate> fetchCertificates()
        throws ODataException
    {
        final HttpDestinationProperties destination = getDestinationForFetch();
        if (destination == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type Certificate.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned HttpDestination. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("name=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(name));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("certificates");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final HttpClient httpClient = HttpClientAccessor.getHttpClient(destination);
        final ODataQueryResult result = query.execute(httpClient);
        final List<Certificate> entityList = result.asList(Certificate.class);
        for (Certificate entity: entityList) {
            entity.attachToService(getServicePathForFetch(), destination);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>Certificate</b> entities (one to many). This corresponds to the OData navigation property <b>certificates</b>.
     * <p>
     * If the navigation property <b>certificates</b> of a queried <b>CertificateStore</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>Certificate</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<Certificate> getCertificatesOrFetch()
        throws ODataException
    {
        if (toCertificates == null) {
            toCertificates = fetchCertificates();
        }
        return toCertificates;
    }

    /**
     * Retrieval of associated <b>Certificate</b> entities (one to many). This corresponds to the OData navigation property <b>certificates</b>.
     * <p>
     * If the navigation property for an entity <b>CertificateStore</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Option</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>certificates</b> is already loaded, the result will contain the <b>Certificate</b> entities. If not, an <code>Option</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Option<List<Certificate>> getCertificatesIfPresent() {
        return Option.of(toCertificates);
    }

    /**
     * Overwrites the list of associated <b>Certificate</b> entities for the loaded navigation property <b>certificates</b>.
     * <p>
     * If the navigation property <b>certificates</b> of a queried <b>CertificateStore</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>Certificate</b> entities.
     */
    public void setCertificates(
        @Nonnull
        final List<Certificate> value) {
        if (toCertificates == null) {
            toCertificates = Lists.newArrayList();
        }
        toCertificates.clear();
        toCertificates.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>Certificate</b> entities. This corresponds to the OData navigation property <b>certificates</b>.
     * <p>
     * If the navigation property <b>certificates</b> of a queried <b>CertificateStore</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>Certificate</b> entities.
     */
    public void addCertificates(Certificate... entity) {
        if (toCertificates == null) {
            toCertificates = Lists.newArrayList();
        }
        toCertificates.addAll(Lists.newArrayList(entity));
    }


    /**
     * Helper class to allow for fluent creation of CertificateStore instances.
     * 
     */
    public final static class CertificateStoreBuilder {

        private List<Certificate> toCertificates = Lists.newArrayList();

        private CertificateStore.CertificateStoreBuilder toCertificates(final List<Certificate> value) {
            toCertificates.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>certificates</b> for <b>CertificateStore</b> to multiple <b>Certificate</b>.
         * 
         * @param value
         *     The Certificates to build this CertificateStore with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public CertificateStore.CertificateStoreBuilder certificates(Certificate... value) {
            return toCertificates(Lists.newArrayList(value));
        }

    }

}
