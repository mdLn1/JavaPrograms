package simplefactoryimplementation;

public class Factory {
 
    // check the kind of class required
    // there are many ways of doing this
    // hashmaps or arraylists could be used instead of a switch statement
    public static Person createObject(String type){
        switch (type) {
            case "Student":
                return new Student();
            case "Teacher":
                return new Teacher();
            default:
                return null;
        }
    }
    
}
