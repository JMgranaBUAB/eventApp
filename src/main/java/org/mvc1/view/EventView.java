package org.mvc1.view;

import org.mvc1.controller.EventController;
import org.mvc1.model.Event;

import java.util.Scanner;

public class EventView {

    private EventController eventController;

    public EventView (EventController eventController){
        this.eventController = eventController;
    }

//    public void CreateEventView(){
//        Event event = new Event("New Event from View", "nueva vista", 1.99);
//        eventController.createEventController(event);
//    }

    public void CreateEventView(){
        Event event = generateEvent();
        eventController.createEventController(event);
    }

    public Event generateEvent(){
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US); //.useLocale(java.util.Locale.US)

        System.out.println("Escriba el nombre del evento : ");
        String name = scanner.nextLine();

        System.out.println("Escriba la descripcion evento : ");
        String description = scanner.nextLine();

        System.out.println("Escriba el precio del evento : ");
        double price = scanner.nextDouble();

        Event event = new Event(name, description, price);

        scanner.close();

        return event;

    }


}
