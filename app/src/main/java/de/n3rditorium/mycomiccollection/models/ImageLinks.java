package de.n3rditorium.mycomiccollection.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({"smallThumbnail", "thumbnail"})
public class ImageLinks implements Serializable {

@JsonProperty ("smallThumbnail")
   private String smallThumbnail;
   @JsonProperty ("thumbnail")
   private String thumbnail;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   /**
    * @return The smallThumbnail
    */
   @JsonProperty ("smallThumbnail")
   public String getSmallThumbnail() {
      return smallThumbnail;
   }

   /**
    * @param smallThumbnail The smallThumbnail
    */
   @JsonProperty ("smallThumbnail")
   public void setSmallThumbnail(String smallThumbnail) {
      this.smallThumbnail = smallThumbnail;
   }

   /**
    * @return The thumbnail
    */
   @JsonProperty ("thumbnail")
   public String getThumbnail() {
      return thumbnail;
   }

   /**
    * @param thumbnail The thumbnail
    */
   @JsonProperty ("thumbnail")
   public void setThumbnail(String thumbnail) {
      this.thumbnail = thumbnail;
   }

   @JsonAnyGetter
   public Map<String, Object> getAdditionalProperties() {
      return this.additionalProperties;
   }

   @JsonAnySetter
   public void setAdditionalProperty(String name, Object value) {
      this.additionalProperties.put(name, value);
   }
}