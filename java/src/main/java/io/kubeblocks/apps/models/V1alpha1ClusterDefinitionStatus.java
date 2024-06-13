/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.27.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubeblocks.apps.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ClusterDefinitionStatus defines the observed state of ClusterDefinition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T15:59:08.817252Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionStatus {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  /**
   * Specifies the current phase of the ClusterDefinition. Valid values are &#x60;empty&#x60;, &#x60;Available&#x60;, &#x60;Unavailable&#x60;. When &#x60;Available&#x60;, the ClusterDefinition is ready and can be referenced by related objects.
   */
  @JsonAdapter(PhaseEnum.Adapter.class)
  public enum PhaseEnum {
    AVAILABLE("Available"),
    
    UNAVAILABLE("Unavailable");

    private String value;

    PhaseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhaseEnum fromValue(String value) {
      for (PhaseEnum b : PhaseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhaseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhaseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhaseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private PhaseEnum phase;

  public static final String SERIALIZED_NAME_SERVICE_REFS = "serviceRefs";
  @SerializedName(SERIALIZED_NAME_SERVICE_REFS)
  private String serviceRefs;

  public static final String SERIALIZED_NAME_TOPOLOGIES = "topologies";
  @SerializedName(SERIALIZED_NAME_TOPOLOGIES)
  private String topologies;

  public V1alpha1ClusterDefinitionStatus() {
  }

  public V1alpha1ClusterDefinitionStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Provides additional information about the current phase.
   * @return message
  **/
  @jakarta.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1ClusterDefinitionStatus observedGeneration(Long observedGeneration) {
    
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * Represents the most recent generation observed for this ClusterDefinition.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1alpha1ClusterDefinitionStatus phase(PhaseEnum phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Specifies the current phase of the ClusterDefinition. Valid values are &#x60;empty&#x60;, &#x60;Available&#x60;, &#x60;Unavailable&#x60;. When &#x60;Available&#x60;, the ClusterDefinition is ready and can be referenced by related objects.
   * @return phase
  **/
  @jakarta.annotation.Nullable
  public PhaseEnum getPhase() {
    return phase;
  }


  public void setPhase(PhaseEnum phase) {
    this.phase = phase;
  }


  public V1alpha1ClusterDefinitionStatus serviceRefs(String serviceRefs) {
    
    this.serviceRefs = serviceRefs;
    return this;
  }

   /**
   * The service references declared by this ClusterDefinition.
   * @return serviceRefs
  **/
  @jakarta.annotation.Nullable
  public String getServiceRefs() {
    return serviceRefs;
  }


  public void setServiceRefs(String serviceRefs) {
    this.serviceRefs = serviceRefs;
  }


  public V1alpha1ClusterDefinitionStatus topologies(String topologies) {
    
    this.topologies = topologies;
    return this;
  }

   /**
   * Topologies this ClusterDefinition supported.
   * @return topologies
  **/
  @jakarta.annotation.Nullable
  public String getTopologies() {
    return topologies;
  }


  public void setTopologies(String topologies) {
    this.topologies = topologies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionStatus v1alpha1ClusterDefinitionStatus = (V1alpha1ClusterDefinitionStatus) o;
    return Objects.equals(this.message, v1alpha1ClusterDefinitionStatus.message) &&
        Objects.equals(this.observedGeneration, v1alpha1ClusterDefinitionStatus.observedGeneration) &&
        Objects.equals(this.phase, v1alpha1ClusterDefinitionStatus.phase) &&
        Objects.equals(this.serviceRefs, v1alpha1ClusterDefinitionStatus.serviceRefs) &&
        Objects.equals(this.topologies, v1alpha1ClusterDefinitionStatus.topologies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, observedGeneration, phase, serviceRefs, topologies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionStatus {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    serviceRefs: ").append(toIndentedString(serviceRefs)).append("\n");
    sb.append("    topologies: ").append(toIndentedString(topologies)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("message");
    openapiFields.add("observedGeneration");
    openapiFields.add("phase");
    openapiFields.add("serviceRefs");
    openapiFields.add("topologies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionStatus is not found in the empty JSON string", V1alpha1ClusterDefinitionStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
      if ((jsonObj.get("serviceRefs") != null && !jsonObj.get("serviceRefs").isJsonNull()) && !jsonObj.get("serviceRefs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceRefs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceRefs").toString()));
      }
      if ((jsonObj.get("topologies") != null && !jsonObj.get("topologies").isJsonNull()) && !jsonObj.get("topologies").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topologies` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topologies").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionStatus
  */
  public static V1alpha1ClusterDefinitionStatus fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionStatus.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

