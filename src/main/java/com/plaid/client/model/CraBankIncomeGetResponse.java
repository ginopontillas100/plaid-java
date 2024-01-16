/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.485.0
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
import com.plaid.client.model.CraBankIncome;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CraBankIncomeGetResponse defines the response schema for &#x60;/cra/bank_income/get&#x60;.
 */
@ApiModel(description = "CraBankIncomeGetResponse defines the response schema for `/cra/bank_income/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class CraBankIncomeGetResponse {
  public static final String SERIALIZED_NAME_BANK_INCOME = "bank_income";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME)
  private List<CraBankIncome> bankIncome = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public CraBankIncomeGetResponse bankIncome(List<CraBankIncome> bankIncome) {
    
    this.bankIncome = bankIncome;
    return this;
  }

  public CraBankIncomeGetResponse addBankIncomeItem(CraBankIncome bankIncomeItem) {
    if (this.bankIncome == null) {
      this.bankIncome = new ArrayList<>();
    }
    this.bankIncome.add(bankIncomeItem);
    return this;
  }

   /**
   * Get bankIncome
   * @return bankIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CraBankIncome> getBankIncome() {
    return bankIncome;
  }


  public void setBankIncome(List<CraBankIncome> bankIncome) {
    this.bankIncome = bankIncome;
  }


  public CraBankIncomeGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraBankIncomeGetResponse craBankIncomeGetResponse = (CraBankIncomeGetResponse) o;
    return Objects.equals(this.bankIncome, craBankIncomeGetResponse.bankIncome) &&
        Objects.equals(this.requestId, craBankIncomeGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankIncome, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraBankIncomeGetResponse {\n");
    sb.append("    bankIncome: ").append(toIndentedString(bankIncome)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

