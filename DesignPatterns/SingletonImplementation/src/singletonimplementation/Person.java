package singletonimplementation;

public class Person {
    
    private final String name;
    private final int age;
    
    // in the constructor we call the method
    // addPersonToSingleton so that the singleton
    // class gets updated every time a new Person is created
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        addPersonToSingleton();
    }
    
    // method that adds a person to the singleton class
    private void addPersonToSingleton() {
        Singleton singleton =  Singleton.getInstance();
        singleton.addPerson(this);
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
