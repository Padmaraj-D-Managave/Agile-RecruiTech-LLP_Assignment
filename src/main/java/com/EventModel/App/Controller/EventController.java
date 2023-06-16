package com.EventModel.App.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.EventModel.App.Entity.Event;
import com.EventModel.App.Services.EventServices;

@RestController
@RequestMapping("/api")
public class EventController 
{
	@Autowired
	EventServices es;
	
	@PostMapping
	public String addevent(@RequestBody  Event event) {
		System.out.println(event);
		Event addEvent = es.addEvent(event);
		int eventId = addEvent.getEventId();
		System.out.println("added to db"+addEvent);
		return "Added and userID is"+eventId;
	}
	
	@GetMapping("/{eventId}")
	public Event getEvent(@PathVariable int eventId)
	{
		if(es.fingEvent(eventId))
		{
			System.out.println(eventId);
			Event event = es.getEvent(eventId);
			System.out.println("Event fro getmapping"+event);
			return event;
		}else {
			return null;
		}
		
	}
	
	@DeleteMapping("/{eventId}")
	public String deleteEvent(@PathVariable int eventId)
	{
		if(es.fingEvent(eventId))
		{
			System.out.println("from delete "+eventId);
			es.daleteEvent(eventId);
			return "delete";
			
		}else {
			return eventId+" Not Present";
		}
	}
	
	@PutMapping
	public String updateEvent(@RequestBody Event event)
	{
		Event updateEvent = es.updateEvent(event);
		return "updated";
	}
	
	@GetMapping("/Events")
	public List<Event> getAllEvent(@RequestParam(value = "pageNumber",defaultValue = "0",required = false )Integer pageNo,
			@RequestParam(value = "pageSizes",defaultValue = "5",required = false)Integer pageSize)
	{

		List<Event> listEvents=es.getAllEvents(pageNo,pageSize);
		return listEvents;
		
	}
}
//name, files[image], tagline, schedule, description, moderator, category, sub_category, rigor_rank