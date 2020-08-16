
package com.doodle.pedoodle.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "available",
    "start",
    "end",
    "allday",
    "startDate",
    "endDate",
    "startDateTime",
    "endDateTime",
    "date",
    "dateTime"
})
public class Option {

    @JsonProperty("text")
    private String text;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("start")
    private Long start;
    @JsonProperty("end")
    private Long end;
    @JsonProperty("allday")
    private Boolean allday;
    @JsonProperty("startDate")
    private Long startDate;
    @JsonProperty("endDate")
    private Long endDate;
    @JsonProperty("startDateTime")
    private Long startDateTime;
    @JsonProperty("endDateTime")
    private Long endDateTime;
    @JsonProperty("date")
    private Long date;
    @JsonProperty("dateTime")
    private Long dateTime;

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("start")
    public Long getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Long start) {
        this.start = start;
    }

    @JsonProperty("end")
    public Long getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(Long end) {
        this.end = end;
    }

    @JsonProperty("allday")
    public Boolean getAllday() {
        return allday;
    }

    @JsonProperty("allday")
    public void setAllday(Boolean allday) {
        this.allday = allday;
    }

    @JsonProperty("startDate")
    public Long getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public Long getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("startDateTime")
    public Long getStartDateTime() {
        return startDateTime;
    }

    @JsonProperty("startDateTime")
    public void setStartDateTime(Long startDateTime) {
        this.startDateTime = startDateTime;
    }

    @JsonProperty("endDateTime")
    public Long getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("endDateTime")
    public void setEndDateTime(Long endDateTime) {
        this.endDateTime = endDateTime;
    }

    @JsonProperty("date")
    public Long getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Long date) {
        this.date = date;
    }

    @JsonProperty("dateTime")
    public Long getDateTime() {
        return dateTime;
    }

    @JsonProperty("dateTime")
    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }

}
