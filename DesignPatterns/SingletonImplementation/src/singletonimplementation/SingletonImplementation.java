package singletonimplementation;

// if you are looking into how to implement Singleton pattern
// in your project I assume you already know what it means
// thus this program only proves how this can be achieved
public class SingletonImplementation {

    // once a person is instantiated
    // printPeople() method is called
    public static void main(String[] args) {
        System.out.println("Program Started\n");
        // add first person
        Person person1 = new Person("Chris", 20);
        printPeople();
        // add second person
        Person person2 = new Person("Gabriel", 26);
        printPeople();
        //add third person
        Person person3 = new Person("George", 18);
        printPeople();
        
        System.out.println("\nProgram Finished");
    }
    
    // everytime this method is called a new instance of singleton is received
    public static void printPeople(){
        Singleton singleton = Singleton.getInstance();
        System.out.println("\nChecking people:");
        for(Person p: singleton.getPeople()){
            System.out.println(p.getName() + " is " + p.getAge() + " years old.");
        }
    }
    
}
