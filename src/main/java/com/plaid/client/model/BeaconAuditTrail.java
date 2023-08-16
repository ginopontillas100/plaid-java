/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.410.1
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
import com.plaid.client.model.BeaconAuditTrailSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the last change made to the parent object specifying what caused the change as well as when it occurred.
 */
@ApiModel(description = "Information about the last change made to the parent object specifying what caused the change as well as when it occurred.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T23:18:44.559547Z[Etc/UTC]")
public class BeaconAuditTrail {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private BeaconAuditTrailSource source;

  public static final String SERIALIZED_NAME_DASHBOARD_USER_ID = "dashboard_user_id";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_USER_ID)
  private String dashboardUserId;


  public BeaconAuditTrail source(BeaconAuditTrailSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconAuditTrailSource getSource() {
    return source;
  }


  public void setSource(BeaconAuditTrailSource source) {
    this.source = source;
  }


  public BeaconAuditTrail dashboardUserId(String dashboardUserId) {
    
    this.dashboardUserId = dashboardUserId;
    return this;
  }

   /**
   * ID of the associated user.
   * @return dashboardUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "54350110fedcbaf01234ffee", required = true, value = "ID of the associated user.")

  public String getDashboardUserId() {
    return dashboardUserId;
  }


  public void setDashboardUserId(String dashboardUserId) {
    this.dashboardUserId = dashboardUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconAuditTrail beaconAuditTrail = (BeaconAuditTrail) o;
    return Objects.equals(this.source, beaconAuditTrail.source) &&
        Objects.equals(this.dashboardUserId, beaconAuditTrail.dashboardUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, dashboardUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconAuditTrail {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dashboardUserId: ").append(toIndentedString(dashboardUserId)).append("\n");
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

