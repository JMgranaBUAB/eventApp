package org.mvc1;

import org.mvc1.config.DBManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //probar connexion a BBDD
        DBManager.initConnection();
        DBManager.closeConnection();

    }
}
