/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.421.0
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
import com.plaid.client.model.NumbersInternationalIBAN;
import com.plaid.client.model.RecipientBACS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing the e-wallet account numbers
 */
@ApiModel(description = "An object representing the e-wallet account numbers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class WalletNumbers {
  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private RecipientBACS bacs;

  public static final String SERIALIZED_NAME_INTERNATIONAL = "international";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL)
  private NumbersInternationalIBAN international;


  public WalletNumbers bacs(RecipientBACS bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecipientBACS getBacs() {
    return bacs;
  }


  public void setBacs(RecipientBACS bacs) {
    this.bacs = bacs;
  }


  public WalletNumbers international(NumbersInternationalIBAN international) {
    
    this.international = international;
    return this;
  }

   /**
   * Get international
   * @return international
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersInternationalIBAN getInternational() {
    return international;
  }


  public void setInternational(NumbersInternationalIBAN international) {
    this.international = international;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletNumbers walletNumbers = (WalletNumbers) o;
    return Objects.equals(this.bacs, walletNumbers.bacs) &&
        Objects.equals(this.international, walletNumbers.international);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bacs, international);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletNumbers {\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    international: ").append(toIndentedString(international)).append("\n");
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

