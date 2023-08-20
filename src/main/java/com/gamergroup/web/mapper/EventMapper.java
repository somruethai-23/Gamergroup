package com.gamergroup.web.mapper;

import com.gamergroup.web.dto.EventDto;
import com.gamergroup.web.models.Event;

public class EventMapper {

        public static Event mapToEvent(EventDto eventDto) {
            return Event.builder()
                    .id(eventDto.getId())
                    .name(eventDto.getName())
                    .startTime(eventDto.getStartTime())
                    .endTime(eventDto.getEndTime())
                    .type(eventDto.getType())
                    .photoUrl(eventDto.getPhotoUrl())
                    .createdOn(eventDto.getCreatedOn())
                    .updatedOn(eventDto.getUpdatedOn())
                    .club(eventDto.getClub())
                    .build();
        }

        public static EventDto mapToEventDto(Event event) {
            return EventDto.builder()
                    .id(event.getId())
                    .name(event.getName())
                    .startTime(event.getStartTime())
                    .endTime(event.getEndTime())
                    .type(event.getType())
                    .photoUrl(event.getPhotoUrl())
                    .createdOn(event.getCreatedOn())
                    .updatedOn(event.getUpdatedOn())
                    .club(event.getClub())
                    .build();
        }
}
