package com.inviten.api.features.meetings;


public interface IMeetingRepository {
    public Meeting one(String id);

    public void create(Meeting meeting);

    public Meeting createAndSave(Meeting meeting);

    public void addMember(String meetingId, Member member);

    public void deleteMember(String meetingId, String phoneNumber);

    public void put(Meeting meeting);
}
