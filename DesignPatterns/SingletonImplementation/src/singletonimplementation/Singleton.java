package singletonimplementation;

import java.util.ArrayList;


public class Singleton {
    
    // has its instance initialised to null
    private static Singleton instance = null;
    
    private final ArrayList<Person> people;
    
    // private constructor means it cannot be instantiated
    // from outside its class
    private Singleton(){
        people = new ArrayList<>();
    }
    
    // makes sure to fill one request at a time
    // if multiple classes call it at the same time
    public static synchronized Singleton getInstance() {
        // checks if the class was instantiated, if not instantiate it
        if (instance == null) {
            instance = new Singleton();
        }
        // returns instance 
        return instance;
    }
    
    // non-static method that can be safely accessed
    public void addPerson(Person person){
        people.add(person);
        System.out.println(person.getName() + " was added to the list.");
    }
    
    public synchronized ArrayList<Person> getPeople(){
        return people;
    }
}
