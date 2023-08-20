package com.gamergroup.web.service;

import com.gamergroup.web.dto.EventDto;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);

    void updateEvent(EventDto eventDto);

    void deleteEvent(Long eventId);
}
