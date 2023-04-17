/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.345.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A detailed breakdown of the institution&#39;s performance for a request type. The values for &#x60;success&#x60;, &#x60;error_plaid&#x60;, and &#x60;error_institution&#x60; sum to 1. The time range used for calculating the breakdown may range from the most recent few minutes to the past six hours. In general, smaller institutions will show status that was calculated over a longer period of time. For Investment updates, which are refreshed less frequently, the period assessed may be 24 hours or more. For more details, see [Institution status details](https://plaid.com/docs/account/activity/#institution-status-details).
 */
@ApiModel(description = "A detailed breakdown of the institution's performance for a request type. The values for `success`, `error_plaid`, and `error_institution` sum to 1. The time range used for calculating the breakdown may range from the most recent few minutes to the past six hours. In general, smaller institutions will show status that was calculated over a longer period of time. For Investment updates, which are refreshed less frequently, the period assessed may be 24 hours or more. For more details, see [Institution status details](https://plaid.com/docs/account/activity/#institution-status-details).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T21:11:54.856293Z[Etc/UTC]")
public class ProductStatusBreakdown {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Double success;

  public static final String SERIALIZED_NAME_ERROR_PLAID = "error_plaid";
  @SerializedName(SERIALIZED_NAME_ERROR_PLAID)
  private Double errorPlaid;

  public static final String SERIALIZED_NAME_ERROR_INSTITUTION = "error_institution";
  @SerializedName(SERIALIZED_NAME_ERROR_INSTITUTION)
  private Double errorInstitution;

  /**
   * The &#x60;refresh_interval&#x60; may be &#x60;DELAYED&#x60; or &#x60;STOPPED&#x60; even when the success rate is high. This value is only returned for Transactions status breakdowns.
   */
  @JsonAdapter(RefreshIntervalEnum.Adapter.class)
  public enum RefreshIntervalEnum {
    NORMAL("NORMAL"),
    
    DELAYED("DELAYED"),
    
    STOPPED("STOPPED");

    private String value;

    RefreshIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefreshIntervalEnum fromValue(String value) {
      for (RefreshIntervalEnum b : RefreshIntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RefreshIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefreshIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefreshIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefreshIntervalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFRESH_INTERVAL = "refresh_interval";
  @SerializedName(SERIALIZED_NAME_REFRESH_INTERVAL)
  private RefreshIntervalEnum refreshInterval;


  public ProductStatusBreakdown success(Double success) {
    
    this.success = success;
    return this;
  }

   /**
   * The percentage of login attempts that are successful, expressed as a decimal.
   * @return success
  **/
  @ApiModelProperty(required = true, value = "The percentage of login attempts that are successful, expressed as a decimal.")

  public Double getSuccess() {
    return success;
  }


  public void setSuccess(Double success) {
    this.success = success;
  }


  public ProductStatusBreakdown errorPlaid(Double errorPlaid) {
    
    this.errorPlaid = errorPlaid;
    return this;
  }

   /**
   * The percentage of logins that are failing due to an internal Plaid issue, expressed as a decimal. 
   * @return errorPlaid
  **/
  @ApiModelProperty(required = true, value = "The percentage of logins that are failing due to an internal Plaid issue, expressed as a decimal. ")

  public Double getErrorPlaid() {
    return errorPlaid;
  }


  public void setErrorPlaid(Double errorPlaid) {
    this.errorPlaid = errorPlaid;
  }


  public ProductStatusBreakdown errorInstitution(Double errorInstitution) {
    
    this.errorInstitution = errorInstitution;
    return this;
  }

   /**
   * The percentage of logins that are failing due to an issue in the institution&#39;s system, expressed as a decimal.
   * @return errorInstitution
  **/
  @ApiModelProperty(required = true, value = "The percentage of logins that are failing due to an issue in the institution's system, expressed as a decimal.")

  public Double getErrorInstitution() {
    return errorInstitution;
  }


  public void setErrorInstitution(Double errorInstitution) {
    this.errorInstitution = errorInstitution;
  }


  public ProductStatusBreakdown refreshInterval(RefreshIntervalEnum refreshInterval) {
    
    this.refreshInterval = refreshInterval;
    return this;
  }

   /**
   * The &#x60;refresh_interval&#x60; may be &#x60;DELAYED&#x60; or &#x60;STOPPED&#x60; even when the success rate is high. This value is only returned for Transactions status breakdowns.
   * @return refreshInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `refresh_interval` may be `DELAYED` or `STOPPED` even when the success rate is high. This value is only returned for Transactions status breakdowns.")

  public RefreshIntervalEnum getRefreshInterval() {
    return refreshInterval;
  }


  public void setRefreshInterval(RefreshIntervalEnum refreshInterval) {
    this.refreshInterval = refreshInterval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductStatusBreakdown productStatusBreakdown = (ProductStatusBreakdown) o;
    return Objects.equals(this.success, productStatusBreakdown.success) &&
        Objects.equals(this.errorPlaid, productStatusBreakdown.errorPlaid) &&
        Objects.equals(this.errorInstitution, productStatusBreakdown.errorInstitution) &&
        Objects.equals(this.refreshInterval, productStatusBreakdown.refreshInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errorPlaid, errorInstitution, refreshInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductStatusBreakdown {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errorPlaid: ").append(toIndentedString(errorPlaid)).append("\n");
    sb.append("    errorInstitution: ").append(toIndentedString(errorInstitution)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

