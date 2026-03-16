package org.mvc1.repository;


import org.mvc1.config.DBManager;
import org.mvc1.model.Event;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EventRepositoryImpl {

    private Connection connection;

    public void createEvent(Event event){

        String querySQLCreate = "INSERT INTO events(name, description, price) VALUES ('"+ event.getName() + "','"+ event.getDescription() +"',"+ event.getPrice()+ ")";

        try{
            connection = DBManager.initConnection(); // conectar a la bbdd
            Statement statement = connection.createStatement(); // preparar la sentencia - Query
            statement.executeUpdate(querySQLCreate); // ejecutar la sentencia
            System.out.println("Evento Creado");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        } finally {
            DBManager.closeConnection();
        }


    }

}
