/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.77.1
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
import com.plaid.client.model.DepositSwitchCreateRequestOptions;
import com.plaid.client.model.DepositSwitchTargetAccount;
import com.plaid.client.model.DepositSwitchTargetUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DepositSwitchAltCreateRequest defines the request schema for &#x60;/deposit_switch/alt/create&#x60;
 */
@ApiModel(description = "DepositSwitchAltCreateRequest defines the request schema for `/deposit_switch/alt/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T21:01:48.207Z[GMT]")
public class DepositSwitchAltCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TARGET_ACCOUNT = "target_account";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCOUNT)
  private DepositSwitchTargetAccount targetAccount;

  public static final String SERIALIZED_NAME_TARGET_USER = "target_user";
  @SerializedName(SERIALIZED_NAME_TARGET_USER)
  private DepositSwitchTargetUser targetUser;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private DepositSwitchCreateRequestOptions options;

  /**
   * ISO-3166-1 alpha-2 country code standard.
   */
  @JsonAdapter(CountryCodeEnum.Adapter.class)
  public enum CountryCodeEnum {
    US("US"),
    
    CA("CA");

    private String value;

    CountryCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountryCodeEnum fromValue(String value) {
      for (CountryCodeEnum b : CountryCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CountryCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountryCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountryCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountryCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private CountryCodeEnum countryCode;


  public DepositSwitchAltCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public DepositSwitchAltCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public DepositSwitchAltCreateRequest targetAccount(DepositSwitchTargetAccount targetAccount) {
    
    this.targetAccount = targetAccount;
    return this;
  }

   /**
   * Get targetAccount
   * @return targetAccount
  **/
  @ApiModelProperty(required = true, value = "")

  public DepositSwitchTargetAccount getTargetAccount() {
    return targetAccount;
  }


  public void setTargetAccount(DepositSwitchTargetAccount targetAccount) {
    this.targetAccount = targetAccount;
  }


  public DepositSwitchAltCreateRequest targetUser(DepositSwitchTargetUser targetUser) {
    
    this.targetUser = targetUser;
    return this;
  }

   /**
   * Get targetUser
   * @return targetUser
  **/
  @ApiModelProperty(required = true, value = "")

  public DepositSwitchTargetUser getTargetUser() {
    return targetUser;
  }


  public void setTargetUser(DepositSwitchTargetUser targetUser) {
    this.targetUser = targetUser;
  }


  public DepositSwitchAltCreateRequest options(DepositSwitchCreateRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DepositSwitchCreateRequestOptions getOptions() {
    return options;
  }


  public void setOptions(DepositSwitchCreateRequestOptions options) {
    this.options = options;
  }


  public DepositSwitchAltCreateRequest countryCode(CountryCodeEnum countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO-3166-1 alpha-2 country code standard.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO-3166-1 alpha-2 country code standard.")

  public CountryCodeEnum getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(CountryCodeEnum countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSwitchAltCreateRequest depositSwitchAltCreateRequest = (DepositSwitchAltCreateRequest) o;
    return Objects.equals(this.clientId, depositSwitchAltCreateRequest.clientId) &&
        Objects.equals(this.secret, depositSwitchAltCreateRequest.secret) &&
        Objects.equals(this.targetAccount, depositSwitchAltCreateRequest.targetAccount) &&
        Objects.equals(this.targetUser, depositSwitchAltCreateRequest.targetUser) &&
        Objects.equals(this.options, depositSwitchAltCreateRequest.options) &&
        Objects.equals(this.countryCode, depositSwitchAltCreateRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, targetAccount, targetUser, options, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchAltCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    targetUser: ").append(toIndentedString(targetUser)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

