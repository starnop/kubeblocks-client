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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecTopologiesInnerComponentsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecTopologiesInnerOrders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ClusterTopology represents the definition for a specific cluster topology.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T15:59:08.817252Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecTopologiesInner {
  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<V1alpha1ClusterDefinitionSpecTopologiesInnerComponentsInner> components = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private V1alpha1ClusterDefinitionSpecTopologiesInnerOrders orders;

  public V1alpha1ClusterDefinitionSpecTopologiesInner() {
  }

  public V1alpha1ClusterDefinitionSpecTopologiesInner components(List<V1alpha1ClusterDefinitionSpecTopologiesInnerComponentsInner> components) {
    
    this.components = components;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecTopologiesInner addComponentsItem(V1alpha1ClusterDefinitionSpecTopologiesInnerComponentsInner componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Components specifies the components in the topology.
   * @return components
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1ClusterDefinitionSpecTopologiesInnerComponentsInner> getComponents() {
    return components;
  }


  public void setComponents(List<V1alpha1ClusterDefinitionSpecTopologiesInnerComponentsInner> components) {
    this.components = components;
  }


  public V1alpha1ClusterDefinitionSpecTopologiesInner _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Default indicates whether this topology serves as the default configuration. When set to true, this topology is automatically used unless another is explicitly specified.
   * @return _default
  **/
  @jakarta.annotation.Nullable
  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public V1alpha1ClusterDefinitionSpecTopologiesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the unique identifier for the cluster topology. Cannot be updated.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterDefinitionSpecTopologiesInner orders(V1alpha1ClusterDefinitionSpecTopologiesInnerOrders orders) {
    
    this.orders = orders;
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ClusterDefinitionSpecTopologiesInnerOrders getOrders() {
    return orders;
  }


  public void setOrders(V1alpha1ClusterDefinitionSpecTopologiesInnerOrders orders) {
    this.orders = orders;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecTopologiesInner v1alpha1ClusterDefinitionSpecTopologiesInner = (V1alpha1ClusterDefinitionSpecTopologiesInner) o;
    return Objects.equals(this.components, v1alpha1ClusterDefinitionSpecTopologiesInner.components) &&
        Objects.equals(this._default, v1alpha1ClusterDefinitionSpecTopologiesInner._default) &&
        Objects.equals(this.name, v1alpha1ClusterDefinitionSpecTopologiesInner.name) &&
        Objects.equals(this.orders, v1alpha1ClusterDefinitionSpecTopologiesInner.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components, _default, name, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecTopologiesInner {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
    openapiFields.add("components");
    openapiFields.add("default");
    openapiFields.add("name");
    openapiFields.add("orders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("components");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecTopologiesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecTopologiesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecTopologiesInner is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecTopologiesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecTopologiesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecTopologiesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterDefinitionSpecTopologiesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("components").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
      }

      JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
      // validate the required field `components` (array)
      for (int i = 0; i < jsonArraycomponents.size(); i++) {
        V1alpha1ClusterDefinitionSpecTopologiesInnerComponentsInner.validateJsonObject(jsonArraycomponents.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `orders`
      if (jsonObj.get("orders") != null && !jsonObj.get("orders").isJsonNull()) {
        V1alpha1ClusterDefinitionSpecTopologiesInnerOrders.validateJsonObject(jsonObj.getAsJsonObject("orders"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecTopologiesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecTopologiesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecTopologiesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecTopologiesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecTopologiesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecTopologiesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecTopologiesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecTopologiesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecTopologiesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecTopologiesInner
  */
  public static V1alpha1ClusterDefinitionSpecTopologiesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecTopologiesInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecTopologiesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
