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
 * The constraint for memory size.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T15:59:08.817252Z[Etc/UTC]")
public class V1alpha1ComponentResourceConstraintSpecRulesInnerMemory {
  public static final String SERIALIZED_NAME_MAX_PER_C_P_U = "maxPerCPU";
  @SerializedName(SERIALIZED_NAME_MAX_PER_C_P_U)
  private Object maxPerCPU;

  public static final String SERIALIZED_NAME_MIN_PER_C_P_U = "minPerCPU";
  @SerializedName(SERIALIZED_NAME_MIN_PER_C_P_U)
  private Object minPerCPU;

  public static final String SERIALIZED_NAME_SIZE_PER_C_P_U = "sizePerCPU";
  @SerializedName(SERIALIZED_NAME_SIZE_PER_C_P_U)
  private Object sizePerCPU;

  public V1alpha1ComponentResourceConstraintSpecRulesInnerMemory() {
  }

  public V1alpha1ComponentResourceConstraintSpecRulesInnerMemory maxPerCPU(Object maxPerCPU) {
    
    this.maxPerCPU = maxPerCPU;
    return this;
  }

   /**
   * The maximum size of memory per vcpu core, [MinPerCPU, MaxPerCPU] defines a range for valid memory size per vcpu core. It is useful on GCP as the ratio between the CPU and memory may be a range. If SizePerCPU is specified, MinPerCPU and MaxPerCPU are ignored. Reference: https://cloud.google.com/compute/docs/general-purpose-machines#custom_machine_types
   * @return maxPerCPU
  **/
  @jakarta.annotation.Nullable
  public Object getMaxPerCPU() {
    return maxPerCPU;
  }


  public void setMaxPerCPU(Object maxPerCPU) {
    this.maxPerCPU = maxPerCPU;
  }


  public V1alpha1ComponentResourceConstraintSpecRulesInnerMemory minPerCPU(Object minPerCPU) {
    
    this.minPerCPU = minPerCPU;
    return this;
  }

   /**
   * The minimum size of memory per vcpu core, [MinPerCPU, MaxPerCPU] defines a range for valid memory size per vcpu core. It is useful on GCP as the ratio between the CPU and memory may be a range. If SizePerCPU is specified, MinPerCPU and MaxPerCPU are ignored. Reference: https://cloud.google.com/compute/docs/general-purpose-machines#custom_machine_types
   * @return minPerCPU
  **/
  @jakarta.annotation.Nullable
  public Object getMinPerCPU() {
    return minPerCPU;
  }


  public void setMinPerCPU(Object minPerCPU) {
    this.minPerCPU = minPerCPU;
  }


  public V1alpha1ComponentResourceConstraintSpecRulesInnerMemory sizePerCPU(Object sizePerCPU) {
    
    this.sizePerCPU = sizePerCPU;
    return this;
  }

   /**
   * The size of memory per vcpu core. For example: 1Gi, 200Mi. If SizePerCPU is specified, MinPerCPU and MaxPerCPU are ignore.
   * @return sizePerCPU
  **/
  @jakarta.annotation.Nullable
  public Object getSizePerCPU() {
    return sizePerCPU;
  }


  public void setSizePerCPU(Object sizePerCPU) {
    this.sizePerCPU = sizePerCPU;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentResourceConstraintSpecRulesInnerMemory v1alpha1ComponentResourceConstraintSpecRulesInnerMemory = (V1alpha1ComponentResourceConstraintSpecRulesInnerMemory) o;
    return Objects.equals(this.maxPerCPU, v1alpha1ComponentResourceConstraintSpecRulesInnerMemory.maxPerCPU) &&
        Objects.equals(this.minPerCPU, v1alpha1ComponentResourceConstraintSpecRulesInnerMemory.minPerCPU) &&
        Objects.equals(this.sizePerCPU, v1alpha1ComponentResourceConstraintSpecRulesInnerMemory.sizePerCPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPerCPU, minPerCPU, sizePerCPU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentResourceConstraintSpecRulesInnerMemory {\n");
    sb.append("    maxPerCPU: ").append(toIndentedString(maxPerCPU)).append("\n");
    sb.append("    minPerCPU: ").append(toIndentedString(minPerCPU)).append("\n");
    sb.append("    sizePerCPU: ").append(toIndentedString(sizePerCPU)).append("\n");
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
    openapiFields.add("maxPerCPU");
    openapiFields.add("minPerCPU");
    openapiFields.add("sizePerCPU");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentResourceConstraintSpecRulesInnerMemory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentResourceConstraintSpecRulesInnerMemory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentResourceConstraintSpecRulesInnerMemory is not found in the empty JSON string", V1alpha1ComponentResourceConstraintSpecRulesInnerMemory.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentResourceConstraintSpecRulesInnerMemory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentResourceConstraintSpecRulesInnerMemory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentResourceConstraintSpecRulesInnerMemory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentResourceConstraintSpecRulesInnerMemory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentResourceConstraintSpecRulesInnerMemory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentResourceConstraintSpecRulesInnerMemory.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentResourceConstraintSpecRulesInnerMemory>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentResourceConstraintSpecRulesInnerMemory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentResourceConstraintSpecRulesInnerMemory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentResourceConstraintSpecRulesInnerMemory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentResourceConstraintSpecRulesInnerMemory
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentResourceConstraintSpecRulesInnerMemory
  */
  public static V1alpha1ComponentResourceConstraintSpecRulesInnerMemory fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentResourceConstraintSpecRulesInnerMemory.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentResourceConstraintSpecRulesInnerMemory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

