package com.EventModel.App.Services;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.EventModel.App.Entity.Event;
import com.EventModel.App.Repository.EventRepository;
@Service 
public class EventServicesImplementation implements EventServices
{
	@Autowired 
	EventRepository eventRepo; 

	@Override
	public Event addEvent(Event event) {
		// TODO Auto-generated method stub
		Event save = eventRepo.save(event);
		return save;
	}

	@Override
	public Event getEvent(int eventId) {
		// TODO Auto-generated method stub
		Event event = eventRepo.findById(eventId).get();
		return event;
	}

	@Override
	public boolean daleteEvent(int eventId) {
		// TODO Auto-generated method stub
		eventRepo.deleteById(eventId);
		return true;
	}

	@Override
	public boolean fingEvent(int eventId) {
		// TODO Auto-generated method stub
		try {
			Event event = eventRepo.findById(eventId).get();
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		eventRepo.save(event);
		return null;
	}

	@Override
	public List<Event> getAllEvents(Integer pageNo,Integer pageSize) {
		// TODO Auto-generated method stub
		
		Pageable page = PageRequest.of(pageNo , pageSize);
		
		Page<Event> pageAll = eventRepo.findAll(page);
		List<Event> content = pageAll.getContent();
		return content;
	}



}
