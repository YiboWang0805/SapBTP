
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
import com.mycompany.vdm.namespaces.portalapplicationscf.field.CertificateField;
import com.mycompany.vdm.namespaces.portalapplicationscf.link.CertificateOneToOneLink;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.CertificateSelectable;
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
 * <p>Original entity name from the Odata EDM: <b>Certificate</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Certificate
    extends VdmEntity<Certificate>
{

    /**
     * Selector for all available fields of Certificate.
     * 
     */
    public final static CertificateSelectable ALL_FIELDS = () -> "*";
    /**
     * Constraints: Nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>certName</b></p>
     * 
     * @return
     *     The certName contained in this entity.
     */
    @SerializedName("certName")
    @JsonProperty("certName")
    @Nullable
    @ODataField(odataName = "certName")
    private String certName;
    /**
     * Use with available fluent helpers to apply the <b>certName</b> field to query operations.
     * 
     */
    public final static CertificateField<String> CERT_NAME = new CertificateField<String>("certName");
    /**
     * Constraints: Nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>description</b></p>
     * 
     * @return
     *     The description contained in this entity.
     */
    @SerializedName("description")
    @JsonProperty("description")
    @Nullable
    @ODataField(odataName = "description")
    private String description;
    /**
     * Use with available fluent helpers to apply the <b>description</b> field to query operations.
     * 
     */
    public final static CertificateField<String> DESCRIPTION = new CertificateField<String>("description");
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
    public final static CertificateField<String> NAME = new CertificateField<String>("name");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>storeName</b></p>
     * 
     * @return
     *     The storeName contained in this entity.
     */
    @Key
    @SerializedName("storeName")
    @JsonProperty("storeName")
    @Nullable
    @ODataField(odataName = "storeName")
    private String storeName;
    /**
     * Use with available fluent helpers to apply the <b>storeName</b> field to query operations.
     * 
     */
    public final static CertificateField<String> STORE_NAME = new CertificateField<String>("storeName");
    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>password</b></p>
     * 
     * @return
     *     The password contained in this entity.
     */
    @SerializedName("password")
    @JsonProperty("password")
    @Nullable
    @ODataField(odataName = "password")
    private String password;
    /**
     * Use with available fluent helpers to apply the <b>password</b> field to query operations.
     * 
     */
    public final static CertificateField<String> PASSWORD = new CertificateField<String>("password");
    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>storeType</b></p>
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
    public final static CertificateField<String> STORE_TYPE = new CertificateField<String>("storeType");
    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>expiryDate</b></p>
     * 
     * @return
     *     The expiryDate contained in this entity.
     */
    @SerializedName("expiryDate")
    @JsonProperty("expiryDate")
    @Nullable
    @ODataField(odataName = "expiryDate")
    private String expiryDate;
    /**
     * Use with available fluent helpers to apply the <b>expiryDate</b> field to query operations.
     * 
     */
    public final static CertificateField<String> EXPIRY_DATE = new CertificateField<String>("expiryDate");
    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>issuerEmail</b></p>
     * 
     * @return
     *     The issuerEmail contained in this entity.
     */
    @SerializedName("issuerEmail")
    @JsonProperty("issuerEmail")
    @Nullable
    @ODataField(odataName = "issuerEmail")
    private String issuerEmail;
    /**
     * Use with available fluent helpers to apply the <b>issuerEmail</b> field to query operations.
     * 
     */
    public final static CertificateField<String> ISSUER_EMAIL = new CertificateField<String>("issuerEmail");
    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>subjectEmail</b></p>
     * 
     * @return
     *     The subjectEmail contained in this entity.
     */
    @SerializedName("subjectEmail")
    @JsonProperty("subjectEmail")
    @Nullable
    @ODataField(odataName = "subjectEmail")
    private String subjectEmail;
    /**
     * Use with available fluent helpers to apply the <b>subjectEmail</b> field to query operations.
     * 
     */
    public final static CertificateField<String> SUBJECT_EMAIL = new CertificateField<String>("subjectEmail");
    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>signAlgName</b></p>
     * 
     * @return
     *     The signAlgName contained in this entity.
     */
    @SerializedName("signAlgName")
    @JsonProperty("signAlgName")
    @Nullable
    @ODataField(odataName = "signAlgName")
    private String signAlgName;
    /**
     * Use with available fluent helpers to apply the <b>signAlgName</b> field to query operations.
     * 
     */
    public final static CertificateField<String> SIGN_ALG_NAME = new CertificateField<String>("signAlgName");
    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>isValid</b></p>
     * 
     * @return
     *     The isValid contained in this entity.
     */
    @SerializedName("isValid")
    @JsonProperty("isValid")
    @Nullable
    @ODataField(odataName = "isValid")
    private String isValid;
    /**
     * Use with available fluent helpers to apply the <b>isValid</b> field to query operations.
     * 
     */
    public final static CertificateField<String> IS_VALID = new CertificateField<String>("isValid");
    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>validFrom</b></p>
     * 
     * @return
     *     The validFrom contained in this entity.
     */
    @SerializedName("validFrom")
    @JsonProperty("validFrom")
    @Nullable
    @ODataField(odataName = "validFrom")
    private String validFrom;
    /**
     * Use with available fluent helpers to apply the <b>validFrom</b> field to query operations.
     * 
     */
    public final static CertificateField<String> VALID_FROM = new CertificateField<String>("validFrom");
    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>version</b></p>
     * 
     * @return
     *     The version contained in this entity.
     */
    @SerializedName("version")
    @JsonProperty("version")
    @Nullable
    @ODataField(odataName = "version")
    private String version;
    /**
     * Use with available fluent helpers to apply the <b>version</b> field to query operations.
     * 
     */
    public final static CertificateField<String> VERSION = new CertificateField<String>("version");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>content</b></p>
     * 
     * @return
     *     The content contained in this entity.
     */
    @SerializedName("content")
    @JsonProperty("content")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBinaryAdapter.class)
    @ODataField(odataName = "content")
    private byte[] content;
    /**
     * Use with available fluent helpers to apply the <b>content</b> field to query operations.
     * 
     */
    public final static CertificateField<byte[]> CONTENT = new CertificateField<byte[]>("content");
    /**
     * Navigation property <b>certificateStore</b> for <b>Certificate</b> to single <b>CertificateStore</b>.
     * 
     */
    @SerializedName("certificateStore")
    @JsonProperty("certificateStore")
    @ODataField(odataName = "certificateStore")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private CertificateStore toCertificateStore;
    /**
     * Use with available fluent helpers to apply the <b>certificateStore</b> navigation property to query operations.
     * 
     */
    public final static CertificateOneToOneLink<CertificateStore> TO_CERTIFICATE_STORE = new CertificateOneToOneLink<CertificateStore>("certificateStore");

    @Nonnull
    @Override
    public Class<Certificate> getType() {
        return Certificate.class;
    }

    /**
     * Constraints: Nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>certName</b></p>
     * 
     * @param certName
     *     The certName to set.
     */
    public void setCertName(
        @Nullable
        final String certName) {
        rememberChangedField("certName", this.certName);
        this.certName = certName;
    }

    /**
     * Constraints: Nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>description</b></p>
     * 
     * @param description
     *     The description to set.
     */
    public void setDescription(
        @Nullable
        final String description) {
        rememberChangedField("description", this.description);
        this.description = description;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>storeName</b></p>
     * 
     * @param storeName
     *     The storeName to set.
     */
    public void setStoreName(
        @Nullable
        final String storeName) {
        rememberChangedField("storeName", this.storeName);
        this.storeName = storeName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>password</b></p>
     * 
     * @param password
     *     The password to set.
     */
    public void setPassword(
        @Nullable
        final String password) {
        rememberChangedField("password", this.password);
        this.password = password;
    }

    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>storeType</b></p>
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

    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>expiryDate</b></p>
     * 
     * @param expiryDate
     *     The expiryDate to set.
     */
    public void setExpiryDate(
        @Nullable
        final String expiryDate) {
        rememberChangedField("expiryDate", this.expiryDate);
        this.expiryDate = expiryDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>issuerEmail</b></p>
     * 
     * @param issuerEmail
     *     The issuerEmail to set.
     */
    public void setIssuerEmail(
        @Nullable
        final String issuerEmail) {
        rememberChangedField("issuerEmail", this.issuerEmail);
        this.issuerEmail = issuerEmail;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>subjectEmail</b></p>
     * 
     * @param subjectEmail
     *     The subjectEmail to set.
     */
    public void setSubjectEmail(
        @Nullable
        final String subjectEmail) {
        rememberChangedField("subjectEmail", this.subjectEmail);
        this.subjectEmail = subjectEmail;
    }

    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>signAlgName</b></p>
     * 
     * @param signAlgName
     *     The signAlgName to set.
     */
    public void setSignAlgName(
        @Nullable
        final String signAlgName) {
        rememberChangedField("signAlgName", this.signAlgName);
        this.signAlgName = signAlgName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>isValid</b></p>
     * 
     * @param isValid
     *     The isValid to set.
     */
    public void setIsValid(
        @Nullable
        final String isValid) {
        rememberChangedField("isValid", this.isValid);
        this.isValid = isValid;
    }

    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>validFrom</b></p>
     * 
     * @param validFrom
     *     The validFrom to set.
     */
    public void setValidFrom(
        @Nullable
        final String validFrom) {
        rememberChangedField("validFrom", this.validFrom);
        this.validFrom = validFrom;
    }

    /**
     * Constraints: Not nullable, Maximum length: 256 <p>Original property name from the Odata EDM: <b>version</b></p>
     * 
     * @param version
     *     The version to set.
     */
    public void setVersion(
        @Nullable
        final String version) {
        rememberChangedField("version", this.version);
        this.version = version;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>content</b></p>
     * 
     * @param content
     *     The content to set.
     */
    public void setContent(
        @Nullable
        final byte[] content) {
        rememberChangedField("content", this.content);
        this.content = content;
    }

    @Override
    protected String getEntityCollection() {
        return "Certificates";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("name", getName());
        result.put("storeName", getStoreName());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("certName", getCertName());
        values.put("description", getDescription());
        values.put("life_cycle", getLife_cycle());
        values.put("name", getName());
        values.put("storeName", getStoreName());
        values.put("password", getPassword());
        values.put("storeType", getStoreType());
        values.put("expiryDate", getExpiryDate());
        values.put("issuerEmail", getIssuerEmail());
        values.put("subjectEmail", getSubjectEmail());
        values.put("signAlgName", getSignAlgName());
        values.put("isValid", getIsValid());
        values.put("validFrom", getValidFrom());
        values.put("version", getVersion());
        values.put("content", getContent());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("certName")) {
                final Object value = values.remove("certName");
                if ((value == null)||(!value.equals(getCertName()))) {
                    setCertName(((String) value));
                }
            }
            if (values.containsKey("description")) {
                final Object value = values.remove("description");
                if ((value == null)||(!value.equals(getDescription()))) {
                    setDescription(((String) value));
                }
            }
            if (values.containsKey("name")) {
                final Object value = values.remove("name");
                if ((value == null)||(!value.equals(getName()))) {
                    setName(((String) value));
                }
            }
            if (values.containsKey("storeName")) {
                final Object value = values.remove("storeName");
                if ((value == null)||(!value.equals(getStoreName()))) {
                    setStoreName(((String) value));
                }
            }
            if (values.containsKey("password")) {
                final Object value = values.remove("password");
                if ((value == null)||(!value.equals(getPassword()))) {
                    setPassword(((String) value));
                }
            }
            if (values.containsKey("storeType")) {
                final Object value = values.remove("storeType");
                if ((value == null)||(!value.equals(getStoreType()))) {
                    setStoreType(((String) value));
                }
            }
            if (values.containsKey("expiryDate")) {
                final Object value = values.remove("expiryDate");
                if ((value == null)||(!value.equals(getExpiryDate()))) {
                    setExpiryDate(((String) value));
                }
            }
            if (values.containsKey("issuerEmail")) {
                final Object value = values.remove("issuerEmail");
                if ((value == null)||(!value.equals(getIssuerEmail()))) {
                    setIssuerEmail(((String) value));
                }
            }
            if (values.containsKey("subjectEmail")) {
                final Object value = values.remove("subjectEmail");
                if ((value == null)||(!value.equals(getSubjectEmail()))) {
                    setSubjectEmail(((String) value));
                }
            }
            if (values.containsKey("signAlgName")) {
                final Object value = values.remove("signAlgName");
                if ((value == null)||(!value.equals(getSignAlgName()))) {
                    setSignAlgName(((String) value));
                }
            }
            if (values.containsKey("isValid")) {
                final Object value = values.remove("isValid");
                if ((value == null)||(!value.equals(getIsValid()))) {
                    setIsValid(((String) value));
                }
            }
            if (values.containsKey("validFrom")) {
                final Object value = values.remove("validFrom");
                if ((value == null)||(!value.equals(getValidFrom()))) {
                    setValidFrom(((String) value));
                }
            }
            if (values.containsKey("version")) {
                final Object value = values.remove("version");
                if ((value == null)||(!value.equals(getVersion()))) {
                    setVersion(((String) value));
                }
            }
            if (values.containsKey("content")) {
                final Object value = values.remove("content");
                if ((value == null)||(!value.equals(getContent()))) {
                    setContent(((byte[]) value));
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
            if ((values).containsKey("certificateStore")) {
                final Object value = (values).remove("certificateStore");
                if (value instanceof Map) {
                    if (toCertificateStore == null) {
                        toCertificateStore = new CertificateStore();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toCertificateStore.fromMap(inputMap);
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
    public static<T >CertificateField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CertificateField<T>(fieldName);
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
    public static<T,DomainT >CertificateField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CertificateField<T>(fieldName, typeConverter);
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
        if (toCertificateStore!= null) {
            (values).put("certificateStore", toCertificateStore);
        }
        return values;
    }

    /**
     * Fetches the <b>CertificateStore</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>certificateStore</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>CertificateStore</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public CertificateStore fetchCertificateStore()
        throws ODataException
    {
        final HttpDestinationProperties destination = getDestinationForFetch();
        if (destination == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CertificateStore.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned HttpDestination. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("name=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(name));
        odataResourceUrl.append(",storeName=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(storeName));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("certificateStore");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final HttpClient httpClient = HttpClientAccessor.getHttpClient(destination);
        final ODataQueryResult result = query.execute(httpClient);
        final CertificateStore entity = result.as(CertificateStore.class);
        entity.attachToService(getServicePathForFetch(), destination);
        return entity;
    }

    /**
     * Retrieval of associated <b>CertificateStore</b> entity (one to one). This corresponds to the OData navigation property <b>certificateStore</b>.
     * <p>
     * If the navigation property <b>certificateStore</b> of a queried <b>Certificate</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CertificateStore</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public CertificateStore getCertificateStoreOrFetch()
        throws ODataException
    {
        if (toCertificateStore == null) {
            toCertificateStore = fetchCertificateStore();
        }
        return toCertificateStore;
    }

    /**
     * Retrieval of associated <b>CertificateStore</b> entity (one to one). This corresponds to the OData navigation property <b>certificateStore</b>.
     * <p>
     * If the navigation property for an entity <b>Certificate</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Option</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>certificateStore</b> is already loaded, the result will contain the <b>CertificateStore</b> entity. If not, an <code>Option</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Option<CertificateStore> getCertificateStoreIfPresent() {
        return Option.of(toCertificateStore);
    }

    /**
     * Overwrites the associated <b>CertificateStore</b> entity for the loaded navigation property <b>certificateStore</b>.
     * 
     * @param value
     *     New <b>CertificateStore</b> entity.
     */
    public void setCertificateStore(final CertificateStore value) {
        toCertificateStore = value;
    }


    /**
     * Helper class to allow for fluent creation of Certificate instances.
     * 
     */
    public final static class CertificateBuilder {

        private CertificateStore toCertificateStore;

        private Certificate.CertificateBuilder toCertificateStore(final CertificateStore value) {
            toCertificateStore = value;
            return this;
        }

        /**
         * Navigation property <b>certificateStore</b> for <b>Certificate</b> to single <b>CertificateStore</b>.
         * 
         * @param value
         *     The CertificateStore to build this Certificate with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public Certificate.CertificateBuilder certificateStore(final CertificateStore value) {
            return toCertificateStore(value);
        }

    }

}