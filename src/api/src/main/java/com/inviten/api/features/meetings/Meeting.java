package com.inviten.api.features.meetings;


import com.inviten.api.authorization.converter.TimeConverter;
import com.inviten.api.features.meetings.dateProposal.DateProposal;
import com.inviten.api.features.meetings.placeProposal.Place;
import com.inviten.api.features.notes.Note;
import com.inviten.api.features.users.User;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.time.LocalTime;
import java.util.UUID;


@DynamoDbBean
public class Meeting {
    private String id = UUID.randomUUID().toString();

    private String name;
    private String date;
    private List<Member> participants;
    private List<DateProposal> dateProposals;
    private List<Place> placeProposals;

    private boolean isPlaceChosen = false;
    private boolean isDateChosen = false;

    private Place place;

    List<Note> notes;

    private String createdAt;

    private String icon;

    @DynamoDbPartitionKey
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){ return name; }

    public void setName(String name) { this.name = name; }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {this.date = date;}


    public List<Member> getParticipants() { return participants; }
    public void setParticipants(List<Member> participants) {
        this.participants = participants;
    }

    public List<DateProposal> getDateProposals() {
        return dateProposals;
    }

    public void setDateProposals(List<DateProposal> dateProposals) {
        this.dateProposals = dateProposals;
    }

    public void setIsDateChosen(boolean isDateChosen) {
        this.isDateChosen = isDateChosen;
    }

    public boolean getIsDateChosen(){
        return isDateChosen;
    }

    public List<Place> getPlaceProposals() {return placeProposals;}
    public void setPlaceProposals(List<Place> placeProposals) {
        this.placeProposals = placeProposals;
    }

    public void setIsPlaceChosen(boolean isPlaceChosen) {
        this.isPlaceChosen = isPlaceChosen;
    }


    public boolean getIsPlaceChosen(){
        return isPlaceChosen;
    }

    public Place getPlace() {return place; }

    public void setPlace(Place place) {this.place = place;}

    public List<Note> getNotes() {return notes;}
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

