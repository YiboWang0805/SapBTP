
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmComplex;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original complex type name from the Odata EDM: <b>ExpirySettings</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class ExpirySettings
    extends VdmComplex<ExpirySettings>
{

    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>expiry_date</b></p>
     * 
     * @param expiry_date
     *     
     */
    @SerializedName("expiry_date")
    @JsonProperty("expiry_date")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "expiry_date", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime expiry_date;
    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>expiry_settings_override_disabled</b></p>
     * 
     * @param expiry_settings_override_disabled
     *     
     */
    @SerializedName("expiry_settings_override_disabled")
    @JsonProperty("expiry_settings_override_disabled")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "expiry_settings_override_disabled")
    private Boolean expiry_settings_override_disabled;
    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>time_out</b></p>
     * 
     * @param time_out
     *     
     */
    @SerializedName("time_out")
    @JsonProperty("time_out")
    @Nullable
    @ODataField(odataName = "time_out")
    private Integer time_out;
    /**
     * Constraints: Nullable, Maximum length: 255 <p>Original property from the Odata EDM: <b>time_out_day</b></p>
     * 
     * @param time_out_day
     *     
     */
    @SerializedName("time_out_day")
    @JsonProperty("time_out_day")
    @Nullable
    @ODataField(odataName = "time_out_day")
    private String time_out_day;

    @Nonnull
    @Override
    public Class<ExpirySettings> getType() {
        return ExpirySettings.class;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("expiry_date", getExpiry_date());
        values.put("expiry_settings_override_disabled", getExpiry_settings_override_disabled());
        values.put("time_out", getTime_out());
        values.put("time_out_day", getTime_out_day());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("expiry_date")) {
                final Object value = values.remove("expiry_date");
                if ((value == null)||(!value.equals(getExpiry_date()))) {
                    setExpiry_date(((LocalDateTime) value));
                }
            }
            if (values.containsKey("expiry_settings_override_disabled")) {
                final Object value = values.remove("expiry_settings_override_disabled");
                if ((value == null)||(!value.equals(getExpiry_settings_override_disabled()))) {
                    setExpiry_settings_override_disabled(((Boolean) value));
                }
            }
            if (values.containsKey("time_out")) {
                final Object value = values.remove("time_out");
                if ((value == null)||(!value.equals(getTime_out()))) {
                    setTime_out(((Integer) value));
                }
            }
            if (values.containsKey("time_out_day")) {
                final Object value = values.remove("time_out_day");
                if ((value == null)||(!value.equals(getTime_out_day()))) {
                    setTime_out_day(((String) value));
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

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        return result;
    }

    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>expiry_date</b></p>
     * 
     * @param expiry_date
     *     The expiry_date to set.
     */
    public void setExpiry_date(
        @Nullable
        final LocalDateTime expiry_date) {
        rememberChangedField("expiry_date", this.expiry_date);
        this.expiry_date = expiry_date;
    }

    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>expiry_settings_override_disabled</b></p>
     * 
     * @param expiry_settings_override_disabled
     *     The expiry_settings_override_disabled to set.
     */
    public void setExpiry_settings_override_disabled(
        @Nullable
        final Boolean expiry_settings_override_disabled) {
        rememberChangedField("expiry_settings_override_disabled", this.expiry_settings_override_disabled);
        this.expiry_settings_override_disabled = expiry_settings_override_disabled;
    }

    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>time_out</b></p>
     * 
     * @param time_out
     *     The time_out to set.
     */
    public void setTime_out(
        @Nullable
        final Integer time_out) {
        rememberChangedField("time_out", this.time_out);
        this.time_out = time_out;
    }

    /**
     * Constraints: Nullable, Maximum length: 255 <p>Original property from the Odata EDM: <b>time_out_day</b></p>
     * 
     * @param time_out_day
     *     The time_out_day to set.
     */
    public void setTime_out_day(
        @Nullable
        final String time_out_day) {
        rememberChangedField("time_out_day", this.time_out_day);
        this.time_out_day = time_out_day;
    }

}
