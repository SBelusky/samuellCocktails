
package com.samuellcocktails.app.generate_sql_scripts.pojo_models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.samuellcocktails.app.generate_sql_scripts.pojo_models.Drink;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "drinks"
})
public class Users {

    @JsonProperty("drinks")
    private List<Drink> drinks = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("drinks")
    public List<Drink> getDrinks() {
        return drinks;
    }

    @JsonProperty("drinks")
    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Users{" +
                "drinks=" + drinks +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
