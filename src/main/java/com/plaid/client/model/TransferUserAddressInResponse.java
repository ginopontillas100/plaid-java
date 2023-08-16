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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The address associated with the account holder.
 */
@ApiModel(description = "The address associated with the account holder.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T23:18:44.559547Z[Etc/UTC]")
public class TransferUserAddressInResponse {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public TransferUserAddressInResponse street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The street number and name (i.e., \&quot;100 Market St.\&quot;).
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The street number and name (i.e., \"100 Market St.\").")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public TransferUserAddressInResponse city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Ex. \&quot;San Francisco\&quot;
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Ex. \"San Francisco\"")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public TransferUserAddressInResponse region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The state or province (e.g., \&quot;CA\&quot;).
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The state or province (e.g., \"CA\").")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public TransferUserAddressInResponse postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code (e.g., \&quot;94103\&quot;).
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The postal code (e.g., \"94103\").")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public TransferUserAddressInResponse country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * A two-letter country code (e.g., \&quot;US\&quot;).
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A two-letter country code (e.g., \"US\").")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferUserAddressInResponse transferUserAddressInResponse = (TransferUserAddressInResponse) o;
    return Objects.equals(this.street, transferUserAddressInResponse.street) &&
        Objects.equals(this.city, transferUserAddressInResponse.city) &&
        Objects.equals(this.region, transferUserAddressInResponse.region) &&
        Objects.equals(this.postalCode, transferUserAddressInResponse.postalCode) &&
        Objects.equals(this.country, transferUserAddressInResponse.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, region, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferUserAddressInResponse {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

