package com.EventModel.App.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventModel.App.Entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{


	List<Event> getBytype(String eventtype);

}
