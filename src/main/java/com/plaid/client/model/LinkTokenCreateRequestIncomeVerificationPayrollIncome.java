/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.197.3
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
import com.plaid.client.model.IncomeVerificationPayrollFlowType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies options for initializing Link for use with Payroll Income. This field is required if &#x60;income_verification&#x60; is included in the &#x60;products&#x60; array and &#x60;payroll&#x60; is specified in &#x60;income_source_types&#x60;.
 */
@ApiModel(description = "Specifies options for initializing Link for use with Payroll Income. This field is required if `income_verification` is included in the `products` array and `payroll` is specified in `income_source_types`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T17:51:05.669516Z[Etc/UTC]")
public class LinkTokenCreateRequestIncomeVerificationPayrollIncome {
  public static final String SERIALIZED_NAME_FLOW_TYPES = "flow_types";
  @SerializedName(SERIALIZED_NAME_FLOW_TYPES)
  private List<IncomeVerificationPayrollFlowType> flowTypes = null;

  public static final String SERIALIZED_NAME_IS_UPDATE_MODE = "is_update_mode";
  @SerializedName(SERIALIZED_NAME_IS_UPDATE_MODE)
  private Boolean isUpdateMode;


  public LinkTokenCreateRequestIncomeVerificationPayrollIncome flowTypes(List<IncomeVerificationPayrollFlowType> flowTypes) {
    
    this.flowTypes = flowTypes;
    return this;
  }

  public LinkTokenCreateRequestIncomeVerificationPayrollIncome addFlowTypesItem(IncomeVerificationPayrollFlowType flowTypesItem) {
    if (this.flowTypes == null) {
      this.flowTypes = new ArrayList<>();
    }
    this.flowTypes.add(flowTypesItem);
    return this;
  }

   /**
   * The types of payroll income verification to enable for the link session. If none are specified, then users will see both document and digital payroll income.
   * @return flowTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The types of payroll income verification to enable for the link session. If none are specified, then users will see both document and digital payroll income.")

  public List<IncomeVerificationPayrollFlowType> getFlowTypes() {
    return flowTypes;
  }


  public void setFlowTypes(List<IncomeVerificationPayrollFlowType> flowTypes) {
    this.flowTypes = flowTypes;
  }


  public LinkTokenCreateRequestIncomeVerificationPayrollIncome isUpdateMode(Boolean isUpdateMode) {
    
    this.isUpdateMode = isUpdateMode;
    return this;
  }

   /**
   * An identifier to indicate whether the income verification link token will be used for an update or not
   * @return isUpdateMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier to indicate whether the income verification link token will be used for an update or not")

  public Boolean getIsUpdateMode() {
    return isUpdateMode;
  }


  public void setIsUpdateMode(Boolean isUpdateMode) {
    this.isUpdateMode = isUpdateMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestIncomeVerificationPayrollIncome linkTokenCreateRequestIncomeVerificationPayrollIncome = (LinkTokenCreateRequestIncomeVerificationPayrollIncome) o;
    return Objects.equals(this.flowTypes, linkTokenCreateRequestIncomeVerificationPayrollIncome.flowTypes) &&
        Objects.equals(this.isUpdateMode, linkTokenCreateRequestIncomeVerificationPayrollIncome.isUpdateMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowTypes, isUpdateMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestIncomeVerificationPayrollIncome {\n");
    sb.append("    flowTypes: ").append(toIndentedString(flowTypes)).append("\n");
    sb.append("    isUpdateMode: ").append(toIndentedString(isUpdateMode)).append("\n");
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

