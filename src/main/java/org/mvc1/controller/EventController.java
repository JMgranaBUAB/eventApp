package org.mvc1.controller;

import org.mvc1.model.Event;
import org.mvc1.repository.EventRepositoryImpl;

public class EventController {

    //EventRepositoryImpl eventRepository = new EventRepositoryImpl();

    private EventRepositoryImpl eventRepository;

    public EventController(EventRepositoryImpl eventRepository){
        this.eventRepository = eventRepository;
    }

    public void createEventController(Event event){
        eventRepository.createEvent(event);
    }

}
