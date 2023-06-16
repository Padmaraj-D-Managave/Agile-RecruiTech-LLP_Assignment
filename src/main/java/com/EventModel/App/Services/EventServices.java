package com.EventModel.App.Services;

import java.util.List;

import com.EventModel.App.Entity.Event;

public interface EventServices {

	Event addEvent(Event event);

	Event getEvent(int eventId);

	boolean daleteEvent(int eventId);

	boolean fingEvent(int eventId);

	Event updateEvent(Event event);

	List<Event> getAllEvents(Integer pageNo,Integer pageSize);


}
