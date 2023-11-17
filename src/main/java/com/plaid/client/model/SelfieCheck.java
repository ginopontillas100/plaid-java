/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.470.1
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
import com.plaid.client.model.SelfieCheckSelfie;
import com.plaid.client.model.SelfieCheckStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional information for the &#x60;selfie_check&#x60; step. This field will be &#x60;null&#x60; unless &#x60;steps.selfie_check&#x60; has reached a terminal state of either &#x60;success&#x60; or &#x60;failed&#x60;.
 */
@ApiModel(description = "Additional information for the `selfie_check` step. This field will be `null` unless `steps.selfie_check` has reached a terminal state of either `success` or `failed`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T20:03:54.421530Z[Etc/UTC]")
public class SelfieCheck {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SelfieCheckStatus status;

  public static final String SERIALIZED_NAME_SELFIES = "selfies";
  @SerializedName(SERIALIZED_NAME_SELFIES)
  private List<SelfieCheckSelfie> selfies = new ArrayList<>();


  public SelfieCheck status(SelfieCheckStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieCheckStatus getStatus() {
    return status;
  }


  public void setStatus(SelfieCheckStatus status) {
    this.status = status;
  }


  public SelfieCheck selfies(List<SelfieCheckSelfie> selfies) {
    
    this.selfies = selfies;
    return this;
  }

  public SelfieCheck addSelfiesItem(SelfieCheckSelfie selfiesItem) {
    this.selfies.add(selfiesItem);
    return this;
  }

   /**
   * An array of selfies submitted to the &#x60;selfie_check&#x60; step. Each entry represents one user submission.
   * @return selfies
  **/
  @ApiModelProperty(required = true, value = "An array of selfies submitted to the `selfie_check` step. Each entry represents one user submission.")

  public List<SelfieCheckSelfie> getSelfies() {
    return selfies;
  }


  public void setSelfies(List<SelfieCheckSelfie> selfies) {
    this.selfies = selfies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfieCheck selfieCheck = (SelfieCheck) o;
    return Objects.equals(this.status, selfieCheck.status) &&
        Objects.equals(this.selfies, selfieCheck.selfies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, selfies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfieCheck {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    selfies: ").append(toIndentedString(selfies)).append("\n");
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

