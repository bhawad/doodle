
package com.doodle.pedoodle.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "preferences"
})
public class Participant {

    @JsonProperty("_id")
    private Long _id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("preferences")
    private List<Long> preferences = new ArrayList<Long>();

    @JsonProperty("_id")
    public Long get_id() {
        return _id;
    }

    @JsonProperty("_id")
    public void set_id(Long _id) {
        this._id = _id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("preferences")
    public List<Long> getPreferences() {
        return preferences;
    }

    @JsonProperty("preferences")
    public void setPreferences(List<Long> preferences) {
        this.preferences = preferences;
    }

}
