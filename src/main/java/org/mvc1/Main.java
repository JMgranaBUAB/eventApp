package org.mvc1;

import org.mvc1.config.DBManager;
import org.mvc1.model.Event;
import org.mvc1.repository.EventRepositoryImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //probar connexion a BBDD
        //DBManager.initConnection();
        //DBManager.closeConnection();

        EventRepositoryImpl eventRepository = new EventRepositoryImpl();

        Event evento1 = new Event("Cumpleaños de Juanlu", "Cumpleaños en el jump city PArk", 25.35);
        //eventRepository.createEvent(evento1);

        Event evento2 = new Event("Comida de fin de Año", "a las 20h en el retaurante el Capriccio", 14.25);
        //eventRepository.createEvent(evento2);


    }
}
