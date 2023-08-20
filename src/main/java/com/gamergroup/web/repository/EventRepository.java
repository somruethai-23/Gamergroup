package com.gamergroup.web.repository;

import com.gamergroup.web.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
