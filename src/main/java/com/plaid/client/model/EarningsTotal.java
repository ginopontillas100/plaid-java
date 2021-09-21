/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.34.1
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
import com.plaid.client.model.Pay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing both the current pay period and year to date amount for an earning category.
 */
@ApiModel(description = "An object representing both the current pay period and year to date amount for an earning category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T23:03:50.146Z[GMT]")
public class EarningsTotal {
  /**
   * Commonly used term to describe the line item.
   */
  @JsonAdapter(CanonicalDescriptionEnum.Adapter.class)
  public enum CanonicalDescriptionEnum {
    BONUS("BONUS"),
    
    COMMISSION("COMMISSION"),
    
    OVERTIME("OVERTIME"),
    
    PAID_TIME_OFF("PAID TIME OFF"),
    
    REGULAR_PAY("REGULAR PAY"),
    
    VACATION("VACATION"),
    
    EMPLOYEE_MEDICARE("EMPLOYEE MEDICARE"),
    
    FICA("FICA"),
    
    SOCIAL_SECURITY_EMPLOYEE_TAX("SOCIAL SECURITY EMPLOYEE TAX"),
    
    MEDICAL("MEDICAL"),
    
    VISION("VISION"),
    
    DENTAL("DENTAL"),
    
    NET_PAY("NET PAY"),
    
    TAXES("TAXES"),
    
    NOT_FOUND("NOT_FOUND"),
    
    OTHER("OTHER");

    private String value;

    CanonicalDescriptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CanonicalDescriptionEnum fromValue(String value) {
      for (CanonicalDescriptionEnum b : CanonicalDescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CanonicalDescriptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CanonicalDescriptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CanonicalDescriptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CanonicalDescriptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CANONICAL_DESCRIPTION = "canonical_description";
  @SerializedName(SERIALIZED_NAME_CANONICAL_DESCRIPTION)
  private CanonicalDescriptionEnum canonicalDescription;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENT_PAY = "current_pay";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAY)
  private Pay currentPay;

  public static final String SERIALIZED_NAME_YTD_PAY = "ytd_pay";
  @SerializedName(SERIALIZED_NAME_YTD_PAY)
  private Pay ytdPay;

  public static final String SERIALIZED_NAME_CURRENT_HOURS = "current_hours";
  @SerializedName(SERIALIZED_NAME_CURRENT_HOURS)
  private String currentHours;

  public static final String SERIALIZED_NAME_CURRENT_RATE = "current_rate";
  @SerializedName(SERIALIZED_NAME_CURRENT_RATE)
  private String currentRate;


  public EarningsTotal canonicalDescription(CanonicalDescriptionEnum canonicalDescription) {
    
    this.canonicalDescription = canonicalDescription;
    return this;
  }

   /**
   * Commonly used term to describe the line item.
   * @return canonicalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Commonly used term to describe the line item.")

  public CanonicalDescriptionEnum getCanonicalDescription() {
    return canonicalDescription;
  }


  public void setCanonicalDescription(CanonicalDescriptionEnum canonicalDescription) {
    this.canonicalDescription = canonicalDescription;
  }


  public EarningsTotal description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Text of the line item as printed on the paystub.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text of the line item as printed on the paystub.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EarningsTotal currentPay(Pay currentPay) {
    
    this.currentPay = currentPay;
    return this;
  }

   /**
   * Get currentPay
   * @return currentPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getCurrentPay() {
    return currentPay;
  }


  public void setCurrentPay(Pay currentPay) {
    this.currentPay = currentPay;
  }


  public EarningsTotal ytdPay(Pay ytdPay) {
    
    this.ytdPay = ytdPay;
    return this;
  }

   /**
   * Get ytdPay
   * @return ytdPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getYtdPay() {
    return ytdPay;
  }


  public void setYtdPay(Pay ytdPay) {
    this.ytdPay = ytdPay;
  }


  public EarningsTotal currentHours(String currentHours) {
    
    this.currentHours = currentHours;
    return this;
  }

   /**
   * Get currentHours
   * @return currentHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentHours() {
    return currentHours;
  }


  public void setCurrentHours(String currentHours) {
    this.currentHours = currentHours;
  }


  public EarningsTotal currentRate(String currentRate) {
    
    this.currentRate = currentRate;
    return this;
  }

   /**
   * Get currentRate
   * @return currentRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentRate() {
    return currentRate;
  }


  public void setCurrentRate(String currentRate) {
    this.currentRate = currentRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsTotal earningsTotal = (EarningsTotal) o;
    return Objects.equals(this.canonicalDescription, earningsTotal.canonicalDescription) &&
        Objects.equals(this.description, earningsTotal.description) &&
        Objects.equals(this.currentPay, earningsTotal.currentPay) &&
        Objects.equals(this.ytdPay, earningsTotal.ytdPay) &&
        Objects.equals(this.currentHours, earningsTotal.currentHours) &&
        Objects.equals(this.currentRate, earningsTotal.currentRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalDescription, description, currentPay, ytdPay, currentHours, currentRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsTotal {\n");
    sb.append("    canonicalDescription: ").append(toIndentedString(canonicalDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currentPay: ").append(toIndentedString(currentPay)).append("\n");
    sb.append("    ytdPay: ").append(toIndentedString(ytdPay)).append("\n");
    sb.append("    currentHours: ").append(toIndentedString(currentHours)).append("\n");
    sb.append("    currentRate: ").append(toIndentedString(currentRate)).append("\n");
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

