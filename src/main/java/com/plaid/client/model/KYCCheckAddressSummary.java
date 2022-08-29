/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.161.5
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
import com.plaid.client.model.AddressPurposeLabel;
import com.plaid.client.model.MatchSummaryCode;
import com.plaid.client.model.POBoxStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result summary object specifying how the &#x60;address&#x60; field matched.
 */
@ApiModel(description = "Result summary object specifying how the `address` field matched.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T20:00:26.713837Z[Etc/UTC]")
public class KYCCheckAddressSummary {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private MatchSummaryCode summary;

  public static final String SERIALIZED_NAME_PO_BOX = "po_box";
  @SerializedName(SERIALIZED_NAME_PO_BOX)
  private POBoxStatus poBox;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AddressPurposeLabel type;


  public KYCCheckAddressSummary summary(MatchSummaryCode summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "")

  public MatchSummaryCode getSummary() {
    return summary;
  }


  public void setSummary(MatchSummaryCode summary) {
    this.summary = summary;
  }


  public KYCCheckAddressSummary poBox(POBoxStatus poBox) {
    
    this.poBox = poBox;
    return this;
  }

   /**
   * Get poBox
   * @return poBox
  **/
  @ApiModelProperty(required = true, value = "")

  public POBoxStatus getPoBox() {
    return poBox;
  }


  public void setPoBox(POBoxStatus poBox) {
    this.poBox = poBox;
  }


  public KYCCheckAddressSummary type(AddressPurposeLabel type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressPurposeLabel getType() {
    return type;
  }


  public void setType(AddressPurposeLabel type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KYCCheckAddressSummary kyCCheckAddressSummary = (KYCCheckAddressSummary) o;
    return Objects.equals(this.summary, kyCCheckAddressSummary.summary) &&
        Objects.equals(this.poBox, kyCCheckAddressSummary.poBox) &&
        Objects.equals(this.type, kyCCheckAddressSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, poBox, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCCheckAddressSummary {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

