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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * An enum indicating the type of a linked service.
 */
@JsonAdapter(RiskCheckLinkedService.Adapter.class)
public enum RiskCheckLinkedService {
  
  APPLE("apple"),
  
  EBAY("ebay"),
  
  FACEBOOK("facebook"),
  
  FLICKR("flickr"),
  
  FOURSQUARE("foursquare"),
  
  GITHUB("github"),
  
  GOOGLE("google"),
  
  GRAVATAR("gravatar"),
  
  INSTAGRAM("instagram"),
  
  LASTFM("lastfm"),
  
  LINKEDIN("linkedin"),
  
  MICROSOFT("microsoft"),
  
  MYSPACE("myspace"),
  
  PINTEREST("pinterest"),
  
  SKYPE("skype"),
  
  SPOTIFY("spotify"),
  
  TELEGRAM("telegram"),
  
  TUMBLR("tumblr"),
  
  TWITTER("twitter"),
  
  VIBER("viber"),
  
  VIMEO("vimeo"),
  
  WEIBO("weibo"),
  
  WHATSAPP("whatsapp"),
  
  YAHOO("yahoo"),
  
  AIRBNB("airbnb"),
  
  AMAZON("amazon"),
  
  BOOKING("booking"),
  
  DISCORD("discord"),
  
  KAKAO("kakao"),
  
  OK("ok"),
  
  QZONE("qzone"),
  
  LINE("line"),
  
  SNAPCHAT("snapchat"),
  
  ZALO("zalo"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RiskCheckLinkedService(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskCheckLinkedService fromValue(String value) {
    for (RiskCheckLinkedService b : RiskCheckLinkedService.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return RiskCheckLinkedService.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<RiskCheckLinkedService> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskCheckLinkedService enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskCheckLinkedService read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskCheckLinkedService.fromValue(value);
    }
  }
}

