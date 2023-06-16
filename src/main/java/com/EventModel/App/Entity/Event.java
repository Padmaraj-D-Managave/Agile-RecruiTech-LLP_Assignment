package com.EventModel.App.Entity;

import java.util.Date;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 int eventId;
	 String type;
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 int uid;
	 String name;
     String tagline;
     Date schedule;
     String description;
     String image; 
     String moderator;
     String category;
     String subCategory;
     Integer rigorRank;
     List<Integer> attendees;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Event(String name, String tagline, Date schedule, String description, String image, String moderator,
			String category, String subCategory, Integer rigorRank) {
		super();
		this.name = name;
		this.tagline = tagline;
		this.schedule = schedule;
		this.description = description;
		this.image = image;
		this.moderator = moderator;
		this.category = category;
		this.subCategory = subCategory;
		this.rigorRank = rigorRank;
	}


	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", type=" + type + ", uid=" + uid + ", name=" + name + ", tagline="
				+ tagline + ", schedule=" + schedule + ", description=" + description + ", image=" + image
				+ ", moderator=" + moderator + ", category=" + category + ", subCategory=" + subCategory
				+ ", rigorRank=" + rigorRank + ", attendees=" + attendees + "]";
	}


	public int getEventId() {
		return eventId;
	}


	public void setEventId(int eventId) {
		this.eventId = eventId;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTagline() {
		return tagline;
	}


	public void setTagline(String tagline) {
		this.tagline = tagline;
	}


	public Date getSchedule() {
		return schedule;
	}


	public void setSchedule(Date schedule) {
		this.schedule = schedule;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getModerator() {
		return moderator;
	}


	public void setModerator(String moderator) {
		this.moderator = moderator;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getSubCategory() {
		return subCategory;
	}


	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}


	public Integer getRigorRank() {
		return rigorRank;
	}


	public void setRigorRank(Integer rigorRank) {
		this.rigorRank = rigorRank;
	}


	public List<Integer> getAttendees() {
		return attendees;
	}


	public void setAttendees(List<Integer> attendees) {
		this.attendees = attendees;
	}


	public Event(int eventId, String type, int uid, String name, String tagline, Date schedule, String description,
			String image, String moderator, String category, String subCategory, Integer rigorRank,
			List<Integer> attendees) {
		super();
		this.eventId = eventId;
		this.type = type;
		this.uid = uid;
		this.name = name;
		this.tagline = tagline;
		this.schedule = schedule;
		this.description = description;
		this.image = image;
		this.moderator = moderator;
		this.category = category;
		this.subCategory = subCategory;
		this.rigorRank = rigorRank;
		this.attendees = attendees;
	}

	
	
     
}
