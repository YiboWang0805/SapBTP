
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
import com.mycompany.vdm.namespaces.portalapplicationscf.field.ACLProductLinkageField;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.ACLProductLinkageSelectable;
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
 * <p>Original entity name from the Odata EDM: <b>ACLProductLinkage</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class ACLProductLinkage
    extends VdmEntity<ACLProductLinkage>
{

    /**
     * Selector for all available fields of ACLProductLinkage.
     * 
     */
    public final static ACLProductLinkageSelectable ALL_FIELDS = () -> "*";
    /**
     * Constraints: Nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>devportalRuleId</b></p>
     * 
     * @return
     *     The devportalRuleId contained in this entity.
     */
    @SerializedName("devportalRuleId")
    @JsonProperty("devportalRuleId")
    @Nullable
    @ODataField(odataName = "devportalRuleId")
    private String devportalRuleId;
    /**
     * Use with available fluent helpers to apply the <b>devportalRuleId</b> field to query operations.
     * 
     */
    public final static ACLProductLinkageField<String> DEVPORTAL_RULE_ID = new ACLProductLinkageField<String>("devportalRuleId");
    /**
     * Constraints: Nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>entityId</b></p>
     * 
     * @return
     *     The entityId contained in this entity.
     */
    @SerializedName("entityId")
    @JsonProperty("entityId")
    @Nullable
    @ODataField(odataName = "entityId")
    private String entityId;
    /**
     * Use with available fluent helpers to apply the <b>entityId</b> field to query operations.
     * 
     */
    public final static ACLProductLinkageField<String> ENTITY_ID = new ACLProductLinkageField<String>("entityId");
    /**
     * Constraints: Nullable, Maximum length: 64 <p>Original property name from the Odata EDM: <b>entityType</b></p>
     * 
     * @return
     *     The entityType contained in this entity.
     */
    @SerializedName("entityType")
    @JsonProperty("entityType")
    @Nullable
    @ODataField(odataName = "entityType")
    private String entityType;
    /**
     * Use with available fluent helpers to apply the <b>entityType</b> field to query operations.
     * 
     */
    public final static ACLProductLinkageField<String> ENTITY_TYPE = new ACLProductLinkageField<String>("entityType");
    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>isPublished</b></p>
     * 
     * @return
     *     The isPublished contained in this entity.
     */
    @SerializedName("isPublished")
    @JsonProperty("isPublished")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "isPublished")
    private Boolean isPublished;
    /**
     * Use with available fluent helpers to apply the <b>isPublished</b> field to query operations.
     * 
     */
    public final static ACLProductLinkageField<Boolean> IS_PUBLISHED = new ACLProductLinkageField<Boolean>("isPublished");
    /**
     * Constraints: Nullable, Maximum length: 64 <p>Original property name from the Odata EDM: <b>operation</b></p>
     * 
     * @return
     *     The operation contained in this entity.
     */
    @SerializedName("operation")
    @JsonProperty("operation")
    @Nullable
    @ODataField(odataName = "operation")
    private String operation;
    /**
     * Use with available fluent helpers to apply the <b>operation</b> field to query operations.
     * 
     */
    public final static ACLProductLinkageField<String> OPERATION = new ACLProductLinkageField<String>("operation");
    /**
     * Constraints: Nullable, Maximum length: 1024 <p>Original property name from the Odata EDM: <b>permissionSet</b></p>
     * 
     * @return
     *     The permissionSet contained in this entity.
     */
    @SerializedName("permissionSet")
    @JsonProperty("permissionSet")
    @Nullable
    @ODataField(odataName = "permissionSet")
    private String permissionSet;
    /**
     * Use with available fluent helpers to apply the <b>permissionSet</b> field to query operations.
     * 
     */
    public final static ACLProductLinkageField<String> PERMISSION_SET = new ACLProductLinkageField<String>("permissionSet");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ruleId</b></p>
     * 
     * @return
     *     The ruleId contained in this entity.
     */
    @Key
    @SerializedName("ruleId")
    @JsonProperty("ruleId")
    @Nullable
    @ODataField(odataName = "ruleId")
    private String ruleId;
    /**
     * Use with available fluent helpers to apply the <b>ruleId</b> field to query operations.
     * 
     */
    public final static ACLProductLinkageField<String> RULE_ID = new ACLProductLinkageField<String>("ruleId");

    @Nonnull
    @Override
    public Class<ACLProductLinkage> getType() {
        return ACLProductLinkage.class;
    }

    /**
     * Constraints: Nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>devportalRuleId</b></p>
     * 
     * @param devportalRuleId
     *     The devportalRuleId to set.
     */
    public void setDevportalRuleId(
        @Nullable
        final String devportalRuleId) {
        rememberChangedField("devportalRuleId", this.devportalRuleId);
        this.devportalRuleId = devportalRuleId;
    }

    /**
     * Constraints: Nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>entityId</b></p>
     * 
     * @param entityId
     *     The entityId to set.
     */
    public void setEntityId(
        @Nullable
        final String entityId) {
        rememberChangedField("entityId", this.entityId);
        this.entityId = entityId;
    }

    /**
     * Constraints: Nullable, Maximum length: 64 <p>Original property name from the Odata EDM: <b>entityType</b></p>
     * 
     * @param entityType
     *     The entityType to set.
     */
    public void setEntityType(
        @Nullable
        final String entityType) {
        rememberChangedField("entityType", this.entityType);
        this.entityType = entityType;
    }

    /**
     * Constraints: Nullable<p>Original property name from the Odata EDM: <b>isPublished</b></p>
     * 
     * @param isPublished
     *     The isPublished to set.
     */
    public void setIsPublished(
        @Nullable
        final Boolean isPublished) {
        rememberChangedField("isPublished", this.isPublished);
        this.isPublished = isPublished;
    }

    /**
     * Constraints: Nullable, Maximum length: 64 <p>Original property name from the Odata EDM: <b>operation</b></p>
     * 
     * @param operation
     *     The operation to set.
     */
    public void setOperation(
        @Nullable
        final String operation) {
        rememberChangedField("operation", this.operation);
        this.operation = operation;
    }

    /**
     * Constraints: Nullable, Maximum length: 1024 <p>Original property name from the Odata EDM: <b>permissionSet</b></p>
     * 
     * @param permissionSet
     *     The permissionSet to set.
     */
    public void setPermissionSet(
        @Nullable
        final String permissionSet) {
        rememberChangedField("permissionSet", this.permissionSet);
        this.permissionSet = permissionSet;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ruleId</b></p>
     * 
     * @param ruleId
     *     The ruleId to set.
     */
    public void setRuleId(
        @Nullable
        final String ruleId) {
        rememberChangedField("ruleId", this.ruleId);
        this.ruleId = ruleId;
    }

    @Override
    protected String getEntityCollection() {
        return "ACLProductLinkages";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("ruleId", getRuleId());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("devportalRuleId", getDevportalRuleId());
        values.put("entityId", getEntityId());
        values.put("entityType", getEntityType());
        values.put("isPublished", getIsPublished());
        values.put("operation", getOperation());
        values.put("permissionSet", getPermissionSet());
        values.put("ruleId", getRuleId());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("devportalRuleId")) {
                final Object value = values.remove("devportalRuleId");
                if ((value == null)||(!value.equals(getDevportalRuleId()))) {
                    setDevportalRuleId(((String) value));
                }
            }
            if (values.containsKey("entityId")) {
                final Object value = values.remove("entityId");
                if ((value == null)||(!value.equals(getEntityId()))) {
                    setEntityId(((String) value));
                }
            }
            if (values.containsKey("entityType")) {
                final Object value = values.remove("entityType");
                if ((value == null)||(!value.equals(getEntityType()))) {
                    setEntityType(((String) value));
                }
            }
            if (values.containsKey("isPublished")) {
                final Object value = values.remove("isPublished");
                if ((value == null)||(!value.equals(getIsPublished()))) {
                    setIsPublished(((Boolean) value));
                }
            }
            if (values.containsKey("operation")) {
                final Object value = values.remove("operation");
                if ((value == null)||(!value.equals(getOperation()))) {
                    setOperation(((String) value));
                }
            }
            if (values.containsKey("permissionSet")) {
                final Object value = values.remove("permissionSet");
                if ((value == null)||(!value.equals(getPermissionSet()))) {
                    setPermissionSet(((String) value));
                }
            }
            if (values.containsKey("ruleId")) {
                final Object value = values.remove("ruleId");
                if ((value == null)||(!value.equals(getRuleId()))) {
                    setRuleId(((String) value));
                }
            }
        }
        // structured properties
        {
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
    public static<T >ACLProductLinkageField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new ACLProductLinkageField<T>(fieldName);
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
    public static<T,DomainT >ACLProductLinkageField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new ACLProductLinkageField<T>(fieldName, typeConverter);
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
