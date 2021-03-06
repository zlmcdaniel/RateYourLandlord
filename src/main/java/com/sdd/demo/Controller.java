package com.sdd.demo;

public class Controller {
    
    private static Controller controller_instance = null;
    
    public Controller() {

    }

    // Get an instance of the Controller
    public static Controller instance() { 
        if ( controller_instance == null ) 
            controller_instance = new Controller();

        return controller_instance; 
    } 

    // Implement event parsing later...
    public static void handleEvent( String eventSpecification ) throws IllegalArgumentException{
        java.lang.System.out.println( "Handle event: " + eventSpecification );
    }
}
