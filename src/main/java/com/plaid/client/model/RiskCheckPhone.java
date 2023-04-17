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
import com.plaid.client.model.RiskCheckLinkedService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Result summary object specifying values for &#x60;phone&#x60; attributes of risk check.
 */
@ApiModel(description = "Result summary object specifying values for `phone` attributes of risk check.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T21:11:54.856293Z[Etc/UTC]")
public class RiskCheckPhone {
  public static final String SERIALIZED_NAME_LINKED_SERVICES = "linked_services";
  @SerializedName(SERIALIZED_NAME_LINKED_SERVICES)
  private Set<RiskCheckLinkedService> linkedServices = new LinkedHashSet<>();


  public RiskCheckPhone linkedServices(Set<RiskCheckLinkedService> linkedServices) {
    
    this.linkedServices = linkedServices;
    return this;
  }

  public RiskCheckPhone addLinkedServicesItem(RiskCheckLinkedService linkedServicesItem) {
    this.linkedServices.add(linkedServicesItem);
    return this;
  }

   /**
   * Get linkedServices
   * @return linkedServices
  **/
  @ApiModelProperty(example = "[\"facebook\"]", required = true, value = "")

  public Set<RiskCheckLinkedService> getLinkedServices() {
    return linkedServices;
  }


  public void setLinkedServices(Set<RiskCheckLinkedService> linkedServices) {
    this.linkedServices = linkedServices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckPhone riskCheckPhone = (RiskCheckPhone) o;
    return Objects.equals(this.linkedServices, riskCheckPhone.linkedServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckPhone {\n");
    sb.append("    linkedServices: ").append(toIndentedString(linkedServices)).append("\n");
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

