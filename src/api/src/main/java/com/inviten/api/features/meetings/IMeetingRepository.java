package com.inviten.api.features.meetings;


import com.inviten.api.features.users.User;
import org.springframework.web.bind.annotation.PathVariable;

public interface IMeetingRepository {
    public Meeting one(String id);

    public void create(Meeting meeting);

    public Meeting createAndSave(Meeting meeting);

    public void invite(String meetingId, String phoneNumber);

    public void deleteMember(String meetingId, String phoneNumber);

    public void put(Meeting meeting);

    public void leaveMeeting(String meetingId);

    public void promoteMember(String meetingId, String userId);

    public void degradateMember (String meetingId, String userId);

}
