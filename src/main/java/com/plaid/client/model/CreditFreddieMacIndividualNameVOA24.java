/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.343.0
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
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T21:32:38.660057Z[Etc/UTC]")
public class CreditFreddieMacIndividualNameVOA24 {
  public static final String SERIALIZED_NAME_FIRST_NAME = "FirstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "LastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "MiddleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;


  public CreditFreddieMacIndividualNameVOA24 firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the individual represented by the parent object.
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The first name of the individual represented by the parent object.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CreditFreddieMacIndividualNameVOA24 lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the individual represented by the parent object.
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "The last name of the individual represented by the parent object.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CreditFreddieMacIndividualNameVOA24 middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the individual represented by the parent object.
   * @return middleName
  **/
  @ApiModelProperty(required = true, value = "The middle name of the individual represented by the parent object.")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacIndividualNameVOA24 creditFreddieMacIndividualNameVOA24 = (CreditFreddieMacIndividualNameVOA24) o;
    return Objects.equals(this.firstName, creditFreddieMacIndividualNameVOA24.firstName) &&
        Objects.equals(this.lastName, creditFreddieMacIndividualNameVOA24.lastName) &&
        Objects.equals(this.middleName, creditFreddieMacIndividualNameVOA24.middleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, middleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacIndividualNameVOA24 {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
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

