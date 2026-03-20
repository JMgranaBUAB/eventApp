package org.mvc1;

import org.mvc1.config.DBManager;
import org.mvc1.controller.EventController;
import org.mvc1.model.Event;
import org.mvc1.repository.EventRepositoryImpl;
import org.mvc1.view.EventView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //probar connexion a BBDD
        //DBManager.initConnection();
        //DBManager.closeConnection();

        //EventRepositoryImpl eventRepository = new EventRepositoryImpl();

        //Event evento1 = new Event("Cumpleaños de Juanlu", "Cumpleaños en el jump city PArk", 25.35);
        //eventRepository.createEvent(evento1);

        //Event evento2 = new Event("Comida de fin de Año", "a las 20h en el retaurante el Capriccio", 14.25);
        //eventRepository.createEvent(evento2);

        //Event evento3 = new Event("Evento 3", "Evento a las 15h30 de hoy", 100.00);

        EventRepositoryImpl eventRepository = new EventRepositoryImpl(); // esto lo gestionara Springboot
        EventController eventController = new EventController(eventRepository); // esto lo gestionara Springboot
        //eventController.createEventController(evento3);
        EventView eventView = new EventView(eventController);
        //eventView.CreateEventView();
        eventView.showEvents();

    }
}
