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
import com.plaid.client.model.MatchSummaryCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Analysis information describing why a screening hit matched the provided user information
 */
@ApiModel(description = "Analysis information describing why a screening hit matched the provided user information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T17:51:05.669516Z[Etc/UTC]")
public class ScreeningHitAnalysis {
  public static final String SERIALIZED_NAME_DATES_OF_BIRTH = "dates_of_birth";
  @SerializedName(SERIALIZED_NAME_DATES_OF_BIRTH)
  private MatchSummaryCode datesOfBirth;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private MatchSummaryCode documents;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private MatchSummaryCode locations;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private MatchSummaryCode names;

  public static final String SERIALIZED_NAME_SEARCH_TERMS_VERSION = "search_terms_version";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERMS_VERSION)
  private Double searchTermsVersion;


  public ScreeningHitAnalysis datesOfBirth(MatchSummaryCode datesOfBirth) {
    
    this.datesOfBirth = datesOfBirth;
    return this;
  }

   /**
   * Get datesOfBirth
   * @return datesOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getDatesOfBirth() {
    return datesOfBirth;
  }


  public void setDatesOfBirth(MatchSummaryCode datesOfBirth) {
    this.datesOfBirth = datesOfBirth;
  }


  public ScreeningHitAnalysis documents(MatchSummaryCode documents) {
    
    this.documents = documents;
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getDocuments() {
    return documents;
  }


  public void setDocuments(MatchSummaryCode documents) {
    this.documents = documents;
  }


  public ScreeningHitAnalysis locations(MatchSummaryCode locations) {
    
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getLocations() {
    return locations;
  }


  public void setLocations(MatchSummaryCode locations) {
    this.locations = locations;
  }


  public ScreeningHitAnalysis names(MatchSummaryCode names) {
    
    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getNames() {
    return names;
  }


  public void setNames(MatchSummaryCode names) {
    this.names = names;
  }


  public ScreeningHitAnalysis searchTermsVersion(Double searchTermsVersion) {
    
    this.searchTermsVersion = searchTermsVersion;
    return this;
  }

   /**
   * The version of the screening&#39;s &#x60;search_terms&#x60; that were compared when the screening hit was added. screening hits are immutable once they have been reviewed. If changes are detected due to updates to the screening&#39;s &#x60;search_terms&#x60;, the associated program, or the list&#39;s source data prior to review, the screening hit will be updated to reflect those changes.
   * @return searchTermsVersion
  **/
  @ApiModelProperty(example = "1", required = true, value = "The version of the screening's `search_terms` that were compared when the screening hit was added. screening hits are immutable once they have been reviewed. If changes are detected due to updates to the screening's `search_terms`, the associated program, or the list's source data prior to review, the screening hit will be updated to reflect those changes.")

  public Double getSearchTermsVersion() {
    return searchTermsVersion;
  }


  public void setSearchTermsVersion(Double searchTermsVersion) {
    this.searchTermsVersion = searchTermsVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningHitAnalysis screeningHitAnalysis = (ScreeningHitAnalysis) o;
    return Objects.equals(this.datesOfBirth, screeningHitAnalysis.datesOfBirth) &&
        Objects.equals(this.documents, screeningHitAnalysis.documents) &&
        Objects.equals(this.locations, screeningHitAnalysis.locations) &&
        Objects.equals(this.names, screeningHitAnalysis.names) &&
        Objects.equals(this.searchTermsVersion, screeningHitAnalysis.searchTermsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datesOfBirth, documents, locations, names, searchTermsVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningHitAnalysis {\n");
    sb.append("    datesOfBirth: ").append(toIndentedString(datesOfBirth)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    searchTermsVersion: ").append(toIndentedString(searchTermsVersion)).append("\n");
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

