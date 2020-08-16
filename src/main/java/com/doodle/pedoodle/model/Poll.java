
package com.doodle.pedoodle.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "adminKey",
    "latestChange",
    "initiated",
    "participantsCount",
    "inviteesCount",
    "type",
    "hidden",
    "preferencesType",
    "state",
    "locale",
    "title",
    "initiator",
    "options",
    "optionsHash",
    "participants",
    "invitees",
    "device",
    "levels",
    "location",
    "description",
    "multiDay",
    "columnConstraint",
    "dateText",
    "timeZone",
    "rowConstraint"
})
@Document("polls")
public class Poll {

    @JsonProperty("_id")
    @Id
    private String _id;
    @JsonProperty("adminKey")
    private String adminKey;
    @JsonProperty("latestChange")
    private Long latestChange;
    @JsonProperty("initiated")
    private Long initiated;
    @JsonProperty("participantsCount")
    private Long participantsCount;
    @JsonProperty("inviteesCount")
    private Long inviteesCount;
    @JsonProperty("type")
    private String type;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("preferencesType")
    private String preferencesType;
    @JsonProperty("state")
    private String state;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("title")
    private String title;
    @JsonProperty("initiator")
    private Initiator initiator;
    @JsonProperty("options")
    private List<Option> options = new ArrayList<Option>();
    @JsonProperty("optionsHash")
    private String optionsHash;
    @JsonProperty("participants")
    private List<Participant> participants = new ArrayList<Participant>();
    @JsonProperty("invitees")
    private List<Object> invitees = new ArrayList<Object>();
    @JsonProperty("device")
    private String device;
    @JsonProperty("levels")
    private String levels;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("description")
    private String description;
    @JsonProperty("multiDay")
    private Boolean multiDay;
    @JsonProperty("columnConstraint")
    private Long columnConstraint;
    @JsonProperty("dateText")
    private Boolean dateText;
    @JsonProperty("timeZone")
    private Boolean timeZone;
    @JsonProperty("rowConstraint")
    private Long rowConstraint;

    @JsonProperty("_id")
    public String get_id() {
        return _id;
    }

    @JsonProperty("_id")
    public void set_id(String _id) {
        this._id = _id;
    }

    @JsonProperty("adminKey")
    public String getAdminKey() {
        return adminKey;
    }

    @JsonProperty("adminKey")
    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    @JsonProperty("latestChange")
    public Long getLatestChange() {
        return latestChange;
    }

    @JsonProperty("latestChange")
    public void setLatestChange(Long latestChange) {
        this.latestChange = latestChange;
    }

    @JsonProperty("initiated")
    public Long getInitiated() {
        return initiated;
    }

    @JsonProperty("initiated")
    public void setInitiated(Long initiated) {
        this.initiated = initiated;
    }

    @JsonProperty("participantsCount")
    public Long getParticipantsCount() {
        return participantsCount;
    }

    @JsonProperty("participantsCount")
    public void setParticipantsCount(Long participantsCount) {
        this.participantsCount = participantsCount;
    }

    @JsonProperty("inviteesCount")
    public Long getInviteesCount() {
        return inviteesCount;
    }

    @JsonProperty("inviteesCount")
    public void setInviteesCount(Long inviteesCount) {
        this.inviteesCount = inviteesCount;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("preferencesType")
    public String getPreferencesType() {
        return preferencesType;
    }

    @JsonProperty("preferencesType")
    public void setPreferencesType(String preferencesType) {
        this.preferencesType = preferencesType;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("initiator")
    public Initiator getInitiator() {
        return initiator;
    }

    @JsonProperty("initiator")
    public void setInitiator(Initiator initiator) {
        this.initiator = initiator;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @JsonProperty("optionsHash")
    public String getOptionsHash() {
        return optionsHash;
    }

    @JsonProperty("optionsHash")
    public void setOptionsHash(String optionsHash) {
        this.optionsHash = optionsHash;
    }

    @JsonProperty("participants")
    public List<Participant> getParticipants() {
        return participants;
    }

    @JsonProperty("participants")
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @JsonProperty("invitees")
    public List<Object> getInvitees() {
        return invitees;
    }

    @JsonProperty("invitees")
    public void setInvitees(List<Object> invitees) {
        this.invitees = invitees;
    }

    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }

    @JsonProperty("levels")
    public String getLevels() {
        return levels;
    }

    @JsonProperty("levels")
    public void setLevels(String levels) {
        this.levels = levels;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("multiDay")
    public Boolean getMultiDay() {
        return multiDay;
    }

    @JsonProperty("multiDay")
    public void setMultiDay(Boolean multiDay) {
        this.multiDay = multiDay;
    }

    @JsonProperty("columnConstraint")
    public Long getColumnConstraint() {
        return columnConstraint;
    }

    @JsonProperty("columnConstraint")
    public void setColumnConstraint(Long columnConstraint) {
        this.columnConstraint = columnConstraint;
    }

    @JsonProperty("dateText")
    public Boolean getDateText() {
        return dateText;
    }

    @JsonProperty("dateText")
    public void setDateText(Boolean dateText) {
        this.dateText = dateText;
    }

    @JsonProperty("timeZone")
    public Boolean getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(Boolean timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("rowConstraint")
    public Long getRowConstraint() {
        return rowConstraint;
    }

    @JsonProperty("rowConstraint")
    public void setRowConstraint(Long rowConstraint) {
        this.rowConstraint = rowConstraint;
    }

}
