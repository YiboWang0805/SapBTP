
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mycompany.vdm.namespaces.portalapplicationscf.field.EndPointPropertyField;
import com.mycompany.vdm.namespaces.portalapplicationscf.link.EndPointPropertyOneToOneLink;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.EndPointPropertySelectable;
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
 * <p>Original entity name from the Odata EDM: <b>EndPointProperty</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class EndPointProperty
    extends VdmEntity<EndPointProperty>
{

    /**
     * Selector for all available fields of EndPointProperty.
     * 
     */
    public final static EndPointPropertySelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 36 <p>Original property name from the Odata EDM: <b>id</b></p>
     * 
     * @return
     *     The id contained in this entity.
     */
    @Key
    @SerializedName("id")
    @JsonProperty("id")
    @Nullable
    @ODataField(odataName = "id")
    private String id;
    /**
     * Use with available fluent helpers to apply the <b>id</b> field to query operations.
     * 
     */
    public final static EndPointPropertyField<String> ID = new EndPointPropertyField<String>("id");
    /**
     * Constraints: Nullable, Maximum length: 512 <p>Original property name from the Odata EDM: <b>name</b></p>
     * 
     * @return
     *     The name contained in this entity.
     */
    @SerializedName("name")
    @JsonProperty("name")
    @Nullable
    @ODataField(odataName = "name")
    private String name;
    /**
     * Use with available fluent helpers to apply the <b>name</b> field to query operations.
     * 
     */
    public final static EndPointPropertyField<String> NAME = new EndPointPropertyField<String>("name");
    /**
     * Constraints: Nullable, Maximum length: 36 <p>Original property name from the Odata EDM: <b>FK_PROXYENDPOINT_ID</b></p>
     * 
     * @return
     *     The fK_PROXYENDPOINT_ID contained in this entity.
     */
    @SerializedName("FK_PROXYENDPOINT_ID")
    @JsonProperty("FK_PROXYENDPOINT_ID")
    @Nullable
    @ODataField(odataName = "FK_PROXYENDPOINT_ID")
    private String fK_PROXYENDPOINT_ID;
    /**
     * Use with available fluent helpers to apply the <b>FK_PROXYENDPOINT_ID</b> field to query operations.
     * 
     */
    public final static EndPointPropertyField<String> FKPROXYENDPOINTID = new EndPointPropertyField<String>("FK_PROXYENDPOINT_ID");
    /**
     * Constraints: Nullable, Maximum length: 36 <p>Original property name from the Odata EDM: <b>FK_TARGETENDPOINT_ID</b></p>
     * 
     * @return
     *     The fK_TARGETENDPOINT_ID contained in this entity.
     */
    @SerializedName("FK_TARGETENDPOINT_ID")
    @JsonProperty("FK_TARGETENDPOINT_ID")
    @Nullable
    @ODataField(odataName = "FK_TARGETENDPOINT_ID")
    private String fK_TARGETENDPOINT_ID;
    /**
     * Use with available fluent helpers to apply the <b>FK_TARGETENDPOINT_ID</b> field to query operations.
     * 
     */
    public final static EndPointPropertyField<String> FKTARGETENDPOINTID = new EndPointPropertyField<String>("FK_TARGETENDPOINT_ID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>value</b></p>
     * 
     * @return
     *     The value contained in this entity.
     */
    @SerializedName("value")
    @JsonProperty("value")
    @Nullable
    @ODataField(odataName = "value")
    private String value;
    /**
     * Use with available fluent helpers to apply the <b>value</b> field to query operations.
     * 
     */
    public final static EndPointPropertyField<String> VALUE = new EndPointPropertyField<String>("value");
    /**
     * Navigation property <b>proxyEndPoint</b> for <b>EndPointProperty</b> to single <b>APIProxyEndPoint</b>.
     * 
     */
    @SerializedName("proxyEndPoint")
    @JsonProperty("proxyEndPoint")
    @ODataField(odataName = "proxyEndPoint")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private APIProxyEndPoint toProxyEndPoint;
    /**
     * Navigation property <b>targetEndPoint</b> for <b>EndPointProperty</b> to single <b>APITargetEndPoint</b>.
     * 
     */
    @SerializedName("targetEndPoint")
    @JsonProperty("targetEndPoint")
    @ODataField(odataName = "targetEndPoint")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private APITargetEndPoint toTargetEndPoint;
    /**
     * Use with available fluent helpers to apply the <b>proxyEndPoint</b> navigation property to query operations.
     * 
     */
    public final static EndPointPropertyOneToOneLink<APIProxyEndPoint> TO_PROXY_END_POINT = new EndPointPropertyOneToOneLink<APIProxyEndPoint>("proxyEndPoint");
    /**
     * Use with available fluent helpers to apply the <b>targetEndPoint</b> navigation property to query operations.
     * 
     */
    public final static EndPointPropertyOneToOneLink<APITargetEndPoint> TO_TARGET_END_POINT = new EndPointPropertyOneToOneLink<APITargetEndPoint>("targetEndPoint");

    @Nonnull
    @Override
    public Class<EndPointProperty> getType() {
        return EndPointProperty.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 36 <p>Original property name from the Odata EDM: <b>id</b></p>
     * 
     * @param id
     *     The id to set.
     */
    public void setId(
        @Nullable
        final String id) {
        rememberChangedField("id", this.id);
        this.id = id;
    }

    /**
     * Constraints: Nullable, Maximum length: 512 <p>Original property name from the Odata EDM: <b>name</b></p>
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
     * Constraints: Nullable, Maximum length: 36 <p>Original property name from the Odata EDM: <b>FK_PROXYENDPOINT_ID</b></p>
     * 
     * @param fK_PROXYENDPOINT_ID
     *     The fK_PROXYENDPOINT_ID to set.
     */
    public void setFK_PROXYENDPOINT_ID(
        @Nullable
        final String fK_PROXYENDPOINT_ID) {
        rememberChangedField("FK_PROXYENDPOINT_ID", this.fK_PROXYENDPOINT_ID);
        this.fK_PROXYENDPOINT_ID = fK_PROXYENDPOINT_ID;
    }

    /**
     * Constraints: Nullable, Maximum length: 36 <p>Original property name from the Odata EDM: <b>FK_TARGETENDPOINT_ID</b></p>
     * 
     * @param fK_TARGETENDPOINT_ID
     *     The fK_TARGETENDPOINT_ID to set.
     */
    public void setFK_TARGETENDPOINT_ID(
        @Nullable
        final String fK_TARGETENDPOINT_ID) {
        rememberChangedField("FK_TARGETENDPOINT_ID", this.fK_TARGETENDPOINT_ID);
        this.fK_TARGETENDPOINT_ID = fK_TARGETENDPOINT_ID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>value</b></p>
     * 
     * @param value
     *     The value to set.
     */
    public void setValue(
        @Nullable
        final String value) {
        rememberChangedField("value", this.value);
        this.value = value;
    }

    @Override
    protected String getEntityCollection() {
        return "EndPointProperties";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("id", getId());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("id", getId());
        values.put("name", getName());
        values.put("FK_PROXYENDPOINT_ID", getFK_PROXYENDPOINT_ID());
        values.put("FK_TARGETENDPOINT_ID", getFK_TARGETENDPOINT_ID());
        values.put("value", getValue());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("id")) {
                final Object value = values.remove("id");
                if ((value == null)||(!value.equals(getId()))) {
                    setId(((String) value));
                }
            }
            if (values.containsKey("name")) {
                final Object value = values.remove("name");
                if ((value == null)||(!value.equals(getName()))) {
                    setName(((String) value));
                }
            }
            if (values.containsKey("FK_PROXYENDPOINT_ID")) {
                final Object value = values.remove("FK_PROXYENDPOINT_ID");
                if ((value == null)||(!value.equals(getFK_PROXYENDPOINT_ID()))) {
                    setFK_PROXYENDPOINT_ID(((String) value));
                }
            }
            if (values.containsKey("FK_TARGETENDPOINT_ID")) {
                final Object value = values.remove("FK_TARGETENDPOINT_ID");
                if ((value == null)||(!value.equals(getFK_TARGETENDPOINT_ID()))) {
                    setFK_TARGETENDPOINT_ID(((String) value));
                }
            }
            if (values.containsKey("value")) {
                final Object value = values.remove("value");
                if ((value == null)||(!value.equals(getValue()))) {
                    setValue(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("proxyEndPoint")) {
                final Object value = (values).remove("proxyEndPoint");
                if (value instanceof Map) {
                    if (toProxyEndPoint == null) {
                        toProxyEndPoint = new APIProxyEndPoint();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toProxyEndPoint.fromMap(inputMap);
                }
            }
            if ((values).containsKey("targetEndPoint")) {
                final Object value = (values).remove("targetEndPoint");
                if (value instanceof Map) {
                    if (toTargetEndPoint == null) {
                        toTargetEndPoint = new APITargetEndPoint();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toTargetEndPoint.fromMap(inputMap);
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
    public static<T >EndPointPropertyField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new EndPointPropertyField<T>(fieldName);
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
    public static<T,DomainT >EndPointPropertyField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new EndPointPropertyField<T>(fieldName, typeConverter);
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
        if (toProxyEndPoint!= null) {
            (values).put("proxyEndPoint", toProxyEndPoint);
        }
        if (toTargetEndPoint!= null) {
            (values).put("targetEndPoint", toTargetEndPoint);
        }
        return values;
    }

    /**
     * Fetches the <b>APIProxyEndPoint</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>proxyEndPoint</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>APIProxyEndPoint</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public APIProxyEndPoint fetchProxyEndPoint()
        throws ODataException
    {
        final HttpDestinationProperties destination = getDestinationForFetch();
        if (destination == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type APIProxyEndPoint.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned HttpDestination. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("id=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(id));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("proxyEndPoint");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final HttpClient httpClient = HttpClientAccessor.getHttpClient(destination);
        final ODataQueryResult result = query.execute(httpClient);
        final APIProxyEndPoint entity = result.as(APIProxyEndPoint.class);
        entity.attachToService(getServicePathForFetch(), destination);
        return entity;
    }

    /**
     * Retrieval of associated <b>APIProxyEndPoint</b> entity (one to one). This corresponds to the OData navigation property <b>proxyEndPoint</b>.
     * <p>
     * If the navigation property <b>proxyEndPoint</b> of a queried <b>EndPointProperty</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>APIProxyEndPoint</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public APIProxyEndPoint getProxyEndPointOrFetch()
        throws ODataException
    {
        if (toProxyEndPoint == null) {
            toProxyEndPoint = fetchProxyEndPoint();
        }
        return toProxyEndPoint;
    }

    /**
     * Retrieval of associated <b>APIProxyEndPoint</b> entity (one to one). This corresponds to the OData navigation property <b>proxyEndPoint</b>.
     * <p>
     * If the navigation property for an entity <b>EndPointProperty</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Option</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>proxyEndPoint</b> is already loaded, the result will contain the <b>APIProxyEndPoint</b> entity. If not, an <code>Option</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Option<APIProxyEndPoint> getProxyEndPointIfPresent() {
        return Option.of(toProxyEndPoint);
    }

    /**
     * Overwrites the associated <b>APIProxyEndPoint</b> entity for the loaded navigation property <b>proxyEndPoint</b>.
     * 
     * @param value
     *     New <b>APIProxyEndPoint</b> entity.
     */
    public void setProxyEndPoint(final APIProxyEndPoint value) {
        toProxyEndPoint = value;
    }

    /**
     * Fetches the <b>APITargetEndPoint</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>targetEndPoint</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>APITargetEndPoint</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public APITargetEndPoint fetchTargetEndPoint()
        throws ODataException
    {
        final HttpDestinationProperties destination = getDestinationForFetch();
        if (destination == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type APITargetEndPoint.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned HttpDestination. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("id=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(id));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("targetEndPoint");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final HttpClient httpClient = HttpClientAccessor.getHttpClient(destination);
        final ODataQueryResult result = query.execute(httpClient);
        final APITargetEndPoint entity = result.as(APITargetEndPoint.class);
        entity.attachToService(getServicePathForFetch(), destination);
        return entity;
    }

    /**
     * Retrieval of associated <b>APITargetEndPoint</b> entity (one to one). This corresponds to the OData navigation property <b>targetEndPoint</b>.
     * <p>
     * If the navigation property <b>targetEndPoint</b> of a queried <b>EndPointProperty</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>APITargetEndPoint</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public APITargetEndPoint getTargetEndPointOrFetch()
        throws ODataException
    {
        if (toTargetEndPoint == null) {
            toTargetEndPoint = fetchTargetEndPoint();
        }
        return toTargetEndPoint;
    }

    /**
     * Retrieval of associated <b>APITargetEndPoint</b> entity (one to one). This corresponds to the OData navigation property <b>targetEndPoint</b>.
     * <p>
     * If the navigation property for an entity <b>EndPointProperty</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Option</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>targetEndPoint</b> is already loaded, the result will contain the <b>APITargetEndPoint</b> entity. If not, an <code>Option</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Option<APITargetEndPoint> getTargetEndPointIfPresent() {
        return Option.of(toTargetEndPoint);
    }

    /**
     * Overwrites the associated <b>APITargetEndPoint</b> entity for the loaded navigation property <b>targetEndPoint</b>.
     * 
     * @param value
     *     New <b>APITargetEndPoint</b> entity.
     */
    public void setTargetEndPoint(final APITargetEndPoint value) {
        toTargetEndPoint = value;
    }


    /**
     * Helper class to allow for fluent creation of EndPointProperty instances.
     * 
     */
    public final static class EndPointPropertyBuilder {

        private APIProxyEndPoint toProxyEndPoint;
        private APITargetEndPoint toTargetEndPoint;

        private EndPointProperty.EndPointPropertyBuilder toProxyEndPoint(final APIProxyEndPoint value) {
            toProxyEndPoint = value;
            return this;
        }

        /**
         * Navigation property <b>proxyEndPoint</b> for <b>EndPointProperty</b> to single <b>APIProxyEndPoint</b>.
         * 
         * @param value
         *     The APIProxyEndPoint to build this EndPointProperty with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public EndPointProperty.EndPointPropertyBuilder proxyEndPoint(final APIProxyEndPoint value) {
            return toProxyEndPoint(value);
        }

        private EndPointProperty.EndPointPropertyBuilder toTargetEndPoint(final APITargetEndPoint value) {
            toTargetEndPoint = value;
            return this;
        }

        /**
         * Navigation property <b>targetEndPoint</b> for <b>EndPointProperty</b> to single <b>APITargetEndPoint</b>.
         * 
         * @param value
         *     The APITargetEndPoint to build this EndPointProperty with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public EndPointProperty.EndPointPropertyBuilder targetEndPoint(final APITargetEndPoint value) {
            return toTargetEndPoint(value);
        }

    }

}
