
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
import com.mycompany.vdm.namespaces.portalapplicationscf.field.CacheResourceField;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.CacheResourceSelectable;
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
 * <p>Original entity name from the Odata EDM: <b>CacheResource</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CacheResource
    extends VdmEntity<CacheResource>
{

    /**
     * Selector for all available fields of CacheResource.
     * 
     */
    public final static CacheResourceSelectable ALL_FIELDS = () -> "*";
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>compression_enabled</b></p>
     * 
     * @return
     *     The compression_enabled contained in this entity.
     */
    @SerializedName("compression_enabled")
    @JsonProperty("compression_enabled")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "compression_enabled")
    private Boolean compression_enabled;
    /**
     * Use with available fluent helpers to apply the <b>compression_enabled</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Boolean> COMPRESSION_ENABLED = new CacheResourceField<Boolean>("compression_enabled");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>disk_size</b></p>
     * 
     * @return
     *     The disk_size contained in this entity.
     */
    @SerializedName("disk_size")
    @JsonProperty("disk_size")
    @Nullable
    @ODataField(odataName = "disk_size")
    private Integer disk_size;
    /**
     * Use with available fluent helpers to apply the <b>disk_size</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Integer> DISK_SIZE = new CacheResourceField<Integer>("disk_size");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>expirySettings</b></p>
     * 
     * @return
     *     The expirySettings contained in this entity.
     */
    @SerializedName("expirySettings")
    @JsonProperty("expirySettings")
    @Nullable
    @ODataField(odataName = "expirySettings")
    private ExpirySettings expirySettings;
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>in_memory_size</b></p>
     * 
     * @return
     *     The in_memory_size contained in this entity.
     */
    @SerializedName("in_memory_size")
    @JsonProperty("in_memory_size")
    @Nullable
    @ODataField(odataName = "in_memory_size")
    private Integer in_memory_size;
    /**
     * Use with available fluent helpers to apply the <b>in_memory_size</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Integer> IN_MEMORY_SIZE = new CacheResourceField<Integer>("in_memory_size");
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
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>max_element_disk</b></p>
     * 
     * @return
     *     The max_element_disk contained in this entity.
     */
    @SerializedName("max_element_disk")
    @JsonProperty("max_element_disk")
    @Nullable
    @ODataField(odataName = "max_element_disk")
    private Integer max_element_disk;
    /**
     * Use with available fluent helpers to apply the <b>max_element_disk</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Integer> MAX_ELEMENT_DISK = new CacheResourceField<Integer>("max_element_disk");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>max_element_memory</b></p>
     * 
     * @return
     *     The max_element_memory contained in this entity.
     */
    @SerializedName("max_element_memory")
    @JsonProperty("max_element_memory")
    @Nullable
    @ODataField(odataName = "max_element_memory")
    private Integer max_element_memory;
    /**
     * Use with available fluent helpers to apply the <b>max_element_memory</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Integer> MAX_ELEMENT_MEMORY = new CacheResourceField<Integer>("max_element_memory");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>min_compression_size</b></p>
     * 
     * @return
     *     The min_compression_size contained in this entity.
     */
    @SerializedName("min_compression_size")
    @JsonProperty("min_compression_size")
    @Nullable
    @ODataField(odataName = "min_compression_size")
    private Integer min_compression_size;
    /**
     * Use with available fluent helpers to apply the <b>min_compression_size</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Integer> MIN_COMPRESSION_SIZE = new CacheResourceField<Integer>("min_compression_size");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>name</b></p>
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
    public final static CacheResourceField<String> NAME = new CacheResourceField<String>("name");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>over_flow_to_disk</b></p>
     * 
     * @return
     *     The over_flow_to_disk contained in this entity.
     */
    @SerializedName("over_flow_to_disk")
    @JsonProperty("over_flow_to_disk")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "over_flow_to_disk")
    private Boolean over_flow_to_disk;
    /**
     * Use with available fluent helpers to apply the <b>over_flow_to_disk</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Boolean> OVER_FLOW_TO_DISK = new CacheResourceField<Boolean>("over_flow_to_disk");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>persistent_cache</b></p>
     * 
     * @return
     *     The persistent_cache contained in this entity.
     */
    @SerializedName("persistent_cache")
    @JsonProperty("persistent_cache")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "persistent_cache")
    private Boolean persistent_cache;
    /**
     * Use with available fluent helpers to apply the <b>persistent_cache</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Boolean> PERSISTENT_CACHE = new CacheResourceField<Boolean>("persistent_cache");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>skip_cache_element_size</b></p>
     * 
     * @return
     *     The skip_cache_element_size contained in this entity.
     */
    @SerializedName("skip_cache_element_size")
    @JsonProperty("skip_cache_element_size")
    @Nullable
    @ODataField(odataName = "skip_cache_element_size")
    private Integer skip_cache_element_size;
    /**
     * Use with available fluent helpers to apply the <b>skip_cache_element_size</b> field to query operations.
     * 
     */
    public final static CacheResourceField<Integer> SKIP_CACHE_ELEMENT_SIZE = new CacheResourceField<Integer>("skip_cache_element_size");

    @Nonnull
    @Override
    public Class<CacheResource> getType() {
        return CacheResource.class;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>compression_enabled</b></p>
     * 
     * @param compression_enabled
     *     The compression_enabled to set.
     */
    public void setCompression_enabled(
        @Nullable
        final Boolean compression_enabled) {
        rememberChangedField("compression_enabled", this.compression_enabled);
        this.compression_enabled = compression_enabled;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>disk_size</b></p>
     * 
     * @param disk_size
     *     The disk_size to set.
     */
    public void setDisk_size(
        @Nullable
        final Integer disk_size) {
        rememberChangedField("disk_size", this.disk_size);
        this.disk_size = disk_size;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>expirySettings</b></p>
     * 
     * @param expirySettings
     *     The expirySettings to set.
     */
    public void setExpirySettings(
        @Nullable
        final ExpirySettings expirySettings) {
        rememberChangedField("expirySettings", this.expirySettings);
        this.expirySettings = expirySettings;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>in_memory_size</b></p>
     * 
     * @param in_memory_size
     *     The in_memory_size to set.
     */
    public void setIn_memory_size(
        @Nullable
        final Integer in_memory_size) {
        rememberChangedField("in_memory_size", this.in_memory_size);
        this.in_memory_size = in_memory_size;
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
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>max_element_disk</b></p>
     * 
     * @param max_element_disk
     *     The max_element_disk to set.
     */
    public void setMax_element_disk(
        @Nullable
        final Integer max_element_disk) {
        rememberChangedField("max_element_disk", this.max_element_disk);
        this.max_element_disk = max_element_disk;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>max_element_memory</b></p>
     * 
     * @param max_element_memory
     *     The max_element_memory to set.
     */
    public void setMax_element_memory(
        @Nullable
        final Integer max_element_memory) {
        rememberChangedField("max_element_memory", this.max_element_memory);
        this.max_element_memory = max_element_memory;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>min_compression_size</b></p>
     * 
     * @param min_compression_size
     *     The min_compression_size to set.
     */
    public void setMin_compression_size(
        @Nullable
        final Integer min_compression_size) {
        rememberChangedField("min_compression_size", this.min_compression_size);
        this.min_compression_size = min_compression_size;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>name</b></p>
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
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>over_flow_to_disk</b></p>
     * 
     * @param over_flow_to_disk
     *     The over_flow_to_disk to set.
     */
    public void setOver_flow_to_disk(
        @Nullable
        final Boolean over_flow_to_disk) {
        rememberChangedField("over_flow_to_disk", this.over_flow_to_disk);
        this.over_flow_to_disk = over_flow_to_disk;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>persistent_cache</b></p>
     * 
     * @param persistent_cache
     *     The persistent_cache to set.
     */
    public void setPersistent_cache(
        @Nullable
        final Boolean persistent_cache) {
        rememberChangedField("persistent_cache", this.persistent_cache);
        this.persistent_cache = persistent_cache;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>skip_cache_element_size</b></p>
     * 
     * @param skip_cache_element_size
     *     The skip_cache_element_size to set.
     */
    public void setSkip_cache_element_size(
        @Nullable
        final Integer skip_cache_element_size) {
        rememberChangedField("skip_cache_element_size", this.skip_cache_element_size);
        this.skip_cache_element_size = skip_cache_element_size;
    }

    @Override
    protected String getEntityCollection() {
        return "CacheResources";
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
        values.put("compression_enabled", getCompression_enabled());
        values.put("disk_size", getDisk_size());
        values.put("expirySettings", getExpirySettings());
        values.put("in_memory_size", getIn_memory_size());
        values.put("life_cycle", getLife_cycle());
        values.put("max_element_disk", getMax_element_disk());
        values.put("max_element_memory", getMax_element_memory());
        values.put("min_compression_size", getMin_compression_size());
        values.put("name", getName());
        values.put("over_flow_to_disk", getOver_flow_to_disk());
        values.put("persistent_cache", getPersistent_cache());
        values.put("skip_cache_element_size", getSkip_cache_element_size());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("compression_enabled")) {
                final Object value = values.remove("compression_enabled");
                if ((value == null)||(!value.equals(getCompression_enabled()))) {
                    setCompression_enabled(((Boolean) value));
                }
            }
            if (values.containsKey("disk_size")) {
                final Object value = values.remove("disk_size");
                if ((value == null)||(!value.equals(getDisk_size()))) {
                    setDisk_size(((Integer) value));
                }
            }
            if (values.containsKey("in_memory_size")) {
                final Object value = values.remove("in_memory_size");
                if ((value == null)||(!value.equals(getIn_memory_size()))) {
                    setIn_memory_size(((Integer) value));
                }
            }
            if (values.containsKey("max_element_disk")) {
                final Object value = values.remove("max_element_disk");
                if ((value == null)||(!value.equals(getMax_element_disk()))) {
                    setMax_element_disk(((Integer) value));
                }
            }
            if (values.containsKey("max_element_memory")) {
                final Object value = values.remove("max_element_memory");
                if ((value == null)||(!value.equals(getMax_element_memory()))) {
                    setMax_element_memory(((Integer) value));
                }
            }
            if (values.containsKey("min_compression_size")) {
                final Object value = values.remove("min_compression_size");
                if ((value == null)||(!value.equals(getMin_compression_size()))) {
                    setMin_compression_size(((Integer) value));
                }
            }
            if (values.containsKey("name")) {
                final Object value = values.remove("name");
                if ((value == null)||(!value.equals(getName()))) {
                    setName(((String) value));
                }
            }
            if (values.containsKey("over_flow_to_disk")) {
                final Object value = values.remove("over_flow_to_disk");
                if ((value == null)||(!value.equals(getOver_flow_to_disk()))) {
                    setOver_flow_to_disk(((Boolean) value));
                }
            }
            if (values.containsKey("persistent_cache")) {
                final Object value = values.remove("persistent_cache");
                if ((value == null)||(!value.equals(getPersistent_cache()))) {
                    setPersistent_cache(((Boolean) value));
                }
            }
            if (values.containsKey("skip_cache_element_size")) {
                final Object value = values.remove("skip_cache_element_size");
                if ((value == null)||(!value.equals(getSkip_cache_element_size()))) {
                    setSkip_cache_element_size(((Integer) value));
                }
            }
        }
        // structured properties
        {
            if (values.containsKey("expirySettings")) {
                final Object value = values.remove("expirySettings");
                if (value instanceof Map) {
                    if (getExpirySettings() == null) {
                        setExpirySettings(new ExpirySettings());
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    getExpirySettings().fromMap(inputMap);
                }
                if ((value == null)&&(getExpirySettings()!= null)) {
                    setExpirySettings(null);
                }
            }
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
    public static<T >CacheResourceField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CacheResourceField<T>(fieldName);
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
    public static<T,DomainT >CacheResourceField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CacheResourceField<T>(fieldName, typeConverter);
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
