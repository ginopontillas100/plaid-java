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
import com.plaid.client.model.Asset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * No documentation available
 */
@ApiModel(description = "No documentation available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T17:51:05.669516Z[Etc/UTC]")
public class Assets {
  public static final String SERIALIZED_NAME_A_S_S_E_T = "ASSET";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T)
  private List<Asset> ASSET = new ArrayList<>();


  public Assets ASSET(List<Asset> ASSET) {
    
    this.ASSET = ASSET;
    return this;
  }

  public Assets addASSETItem(Asset ASSETItem) {
    this.ASSET.add(ASSETItem);
    return this;
  }

   /**
   * No documentation available
   * @return ASSET
  **/
  @ApiModelProperty(required = true, value = "No documentation available")

  public List<Asset> getASSET() {
    return ASSET;
  }


  public void setASSET(List<Asset> ASSET) {
    this.ASSET = ASSET;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assets assets = (Assets) o;
    return Objects.equals(this.ASSET, assets.ASSET);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSET);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assets {\n");
    sb.append("    ASSET: ").append(toIndentedString(ASSET)).append("\n");
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

