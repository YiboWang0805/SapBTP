
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
import com.mycompany.vdm.namespaces.portalapplicationscf.field.VirtualHostField;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.VirtualHostSelectable;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestinationProperties;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>VirtualHost</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class VirtualHost
    extends VdmEntity<VirtualHost>
{

    /**
     * Selector for all available fields of VirtualHost.
     * 
     */
    public final static VirtualHostSelectable ALL_FIELDS = () -> "*";
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
    public final static VirtualHostField<String> ID = new VirtualHostField<String>("id");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>isDefault</b></p>
     * 
     * @return
     *     The isDefault contained in this entity.
     */
    @SerializedName("isDefault")
    @JsonProperty("isDefault")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "isDefault")
    private Boolean isDefault;
    /**
     * Use with available fluent helpers to apply the <b>isDefault</b> field to query operations.
     * 
     */
    public final static VirtualHostField<Boolean> IS_DEFAULT = new VirtualHostField<Boolean>("isDefault");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>isSSL</b></p>
     * 
     * @return
     *     The isSSL contained in this entity.
     */
    @SerializedName("isSSL")
    @JsonProperty("isSSL")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "isSSL")
    private Boolean isSSL;
    /**
     * Use with available fluent helpers to apply the <b>isSSL</b> field to query operations.
     * 
     */
    public final static VirtualHostField<Boolean> IS_SSL = new VirtualHostField<Boolean>("isSSL");
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
     * Constraints: Nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>name</b></p>
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
    public final static VirtualHostField<String> NAME = new VirtualHostField<String>("name");
    /**
     * Constraints: Nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>projectPath</b></p>
     * 
     * @return
     *     The projectPath contained in this entity.
     */
    @SerializedName("projectPath")
    @JsonProperty("projectPath")
    @Nullable
    @ODataField(odataName = "projectPath")
    private String projectPath;
    /**
     * Use with available fluent helpers to apply the <b>projectPath</b> field to query operations.
     * 
     */
    public final static VirtualHostField<String> PROJECT_PATH = new VirtualHostField<String>("projectPath");
    /**
     * Constraints: Nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>virtual_host</b></p>
     * 
     * @return
     *     The virtual_host contained in this entity.
     */
    @SerializedName("virtual_host")
    @JsonProperty("virtual_host")
    @Nullable
    @ODataField(odataName = "virtual_host")
    private String virtual_host;
    /**
     * Use with available fluent helpers to apply the <b>virtual_host</b> field to query operations.
     * 
     */
    public final static VirtualHostField<String> VIRTUAL_HOST = new VirtualHostField<String>("virtual_host");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>virtual_port</b></p>
     * 
     * @return
     *     The virtual_port contained in this entity.
     */
    @SerializedName("virtual_port")
    @JsonProperty("virtual_port")
    @Nullable
    @ODataField(odataName = "virtual_port")
    private Integer virtual_port;
    /**
     * Use with available fluent helpers to apply the <b>virtual_port</b> field to query operations.
     * 
     */
    public final static VirtualHostField<Integer> VIRTUAL_PORT = new VirtualHostField<Integer>("virtual_port");

    @Nonnull
    @Override
    public Class<VirtualHost> getType() {
        return VirtualHost.class;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>isDefault</b></p>
     * 
     * @param isDefault
     *     The isDefault to set.
     */
    public void setIsDefault(
        @Nullable
        final Boolean isDefault) {
        rememberChangedField("isDefault", this.isDefault);
        this.isDefault = isDefault;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>isSSL</b></p>
     * 
     * @param isSSL
     *     The isSSL to set.
     */
    public void setIsSSL(
        @Nullable
        final Boolean isSSL) {
        rememberChangedField("isSSL", this.isSSL);
        this.isSSL = isSSL;
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
     * Constraints: Nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>name</b></p>
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
     * Constraints: Nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>projectPath</b></p>
     * 
     * @param projectPath
     *     The projectPath to set.
     */
    public void setProjectPath(
        @Nullable
        final String projectPath) {
        rememberChangedField("projectPath", this.projectPath);
        this.projectPath = projectPath;
    }

    /**
     * Constraints: Nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>virtual_host</b></p>
     * 
     * @param virtual_host
     *     The virtual_host to set.
     */
    public void setVirtual_host(
        @Nullable
        final String virtual_host) {
        rememberChangedField("virtual_host", this.virtual_host);
        this.virtual_host = virtual_host;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>virtual_port</b></p>
     * 
     * @param virtual_port
     *     The virtual_port to set.
     */
    public void setVirtual_port(
        @Nullable
        final Integer virtual_port) {
        rememberChangedField("virtual_port", this.virtual_port);
        this.virtual_port = virtual_port;
    }

    @Override
    protected String getEntityCollection() {
        return "VirtualHosts";
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
        values.put("isDefault", getIsDefault());
        values.put("isSSL", getIsSSL());
        values.put("life_cycle", getLife_cycle());
        values.put("name", getName());
        values.put("projectPath", getProjectPath());
        values.put("virtual_host", getVirtual_host());
        values.put("virtual_port", getVirtual_port());
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
            if (values.containsKey("isDefault")) {
                final Object value = values.remove("isDefault");
                if ((value == null)||(!value.equals(getIsDefault()))) {
                    setIsDefault(((Boolean) value));
                }
            }
            if (values.containsKey("isSSL")) {
                final Object value = values.remove("isSSL");
                if ((value == null)||(!value.equals(getIsSSL()))) {
                    setIsSSL(((Boolean) value));
                }
            }
            if (values.containsKey("name")) {
                final Object value = values.remove("name");
                if ((value == null)||(!value.equals(getName()))) {
                    setName(((String) value));
                }
            }
            if (values.containsKey("projectPath")) {
                final Object value = values.remove("projectPath");
                if ((value == null)||(!value.equals(getProjectPath()))) {
                    setProjectPath(((String) value));
                }
            }
            if (values.containsKey("virtual_host")) {
                final Object value = values.remove("virtual_host");
                if ((value == null)||(!value.equals(getVirtual_host()))) {
                    setVirtual_host(((String) value));
                }
            }
            if (values.containsKey("virtual_port")) {
                final Object value = values.remove("virtual_port");
                if ((value == null)||(!value.equals(getVirtual_port()))) {
                    setVirtual_port(((Integer) value));
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
    public static<T >VirtualHostField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new VirtualHostField<T>(fieldName);
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
    public static<T,DomainT >VirtualHostField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new VirtualHostField<T>(fieldName, typeConverter);
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

}