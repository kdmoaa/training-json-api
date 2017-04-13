package com.form;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by fujiwara_shuhei_gn on 2017/04/13.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
    private int event_id;
    private String title;
    //    private String catch;
    private String description;
    private String event_url;
    private String hash_tag;
    private String started_at;
    private String ended_at;
    private int limit;
    private String event_type;
    private String address;
    private String place;
    private String lat;
    private String lon;
    private int owner_id;
    private String owner_nickname;
    private String owner_display_name;
    private int accepted;
    private int waiting;
    private String updated_at;

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvent_url() {
        return event_url;
    }

    public void setEvent_url(String event_url) {
        this.event_url = event_url;
    }

    public String getHash_tag() {
        return hash_tag;
    }

    public void setHash_tag(String hash_tag) {
        this.hash_tag = hash_tag;
    }

    public String getStarted_at() {
        return started_at;
    }

    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    public String getEnded_at() {
        return ended_at;
    }

    public void setEnded_at(String ended_at) {
        this.ended_at = ended_at;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getOwner_nickname() {
        return owner_nickname;
    }

    public void setOwner_nickname(String owner_nickname) {
        this.owner_nickname = owner_nickname;
    }

    public String getOwner_display_name() {
        return owner_display_name;
    }

    public void setOwner_display_name(String owner_display_name) {
        this.owner_display_name = owner_display_name;
    }

    public int getAccepted() {
        return accepted;
    }

    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    public int getWaiting() {
        return waiting;
    }

    public void setWaiting(int waiting) {
        this.waiting = waiting;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Event{" +
            "event_id=" + event_id +
            ", title='" + title + '\'' +
            ", description='" + description + '\'' +
            ", event_url='" + event_url + '\'' +
            ", hash_tag='" + hash_tag + '\'' +
            ", started_at='" + started_at + '\'' +
            ", ended_at='" + ended_at + '\'' +
            ", limit=" + limit +
            ", event_type='" + event_type + '\'' +
            ", address='" + address + '\'' +
            ", place='" + place + '\'' +
            ", lat='" + lat + '\'' +
            ", lon='" + lon + '\'' +
            ", owner_id=" + owner_id +
            ", owner_nickname='" + owner_nickname + '\'' +
            ", owner_display_name='" + owner_display_name + '\'' +
            ", accepted=" + accepted +
            ", waiting=" + waiting +
            ", updated_at='" + updated_at + '\'' +
            '}';
    }
}
