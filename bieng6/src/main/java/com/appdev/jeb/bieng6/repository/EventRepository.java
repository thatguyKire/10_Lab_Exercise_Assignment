package com.appdev.jeb.bieng6.repository;

import com.appdev.jeb.bieng6.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
