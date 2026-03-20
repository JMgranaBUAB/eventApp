package org.mvc1.repository;


import org.mvc1.config.DBManager;
import org.mvc1.model.Event;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventRepositoryImpl {

    private Connection connection;

    public void createEvent(Event event){

        //String querySQLCreate = "INSERT INTO events(name, description, price) VALUES ('"+ event.getName() + "','"+ event.getDescription() +"',"+ event.getPrice()+ ")";
        String querySQLCreate = "INSERT INTO events(name, description, price) VALUES (?, ?, ?)";


        try{
            connection = DBManager.initConnection(); // conectar a la bbdd

            //Statement statement = connection.createStatement(); // preparar la sentencia - Query
            //statement.executeUpdate(querySQLCreate); // ejecutar la sentencia

            PreparedStatement statement = connection.prepareStatement(querySQLCreate);
            statement.setString(1, event.getName());
            statement.setString(2, event.getDescription());
            statement.setDouble(3, event.getPrice());

            statement.execute();


            System.out.println("Evento Creado");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        } finally {
            DBManager.closeConnection();
        }

    }

    public List<Event> findAll(){
        //inicializar la variable
        List<Event> events = new ArrayList<>();

        String querySQLSelectAll = "SELECT * FROM events";

        try{
            connection = DBManager.initConnection(); // conectar a la bbdd
            PreparedStatement statement = connection.prepareStatement(querySQLSelectAll);
            ResultSet response = statement.executeQuery();

            while (response.next()){
                String name = response.getString("name");
                String description = response.getString("description");
                double price = response.getDouble("price");

                //Instanciar-crear objeto
                Event event = new Event(name,description,price);
                events.add(event);


            }


        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        } finally {
            DBManager.closeConnection();
        }

        return events;
    }

}
