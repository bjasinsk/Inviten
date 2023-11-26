package com.inviten.api.features.meetings;

import org.springframework.web.bind.annotation.*;

@RestController
public class MeetingController {
    private final IMeetingRepository meetingRepository;

    public MeetingController(IMeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    @GetMapping("/meetings/{id}")
    Meeting one(@PathVariable String id) {
        return meetingRepository.one(id);
    }

    @PostMapping("/meetings")
    public void create(@RequestBody Meeting meeting) { meetingRepository.create(meeting); }
}
