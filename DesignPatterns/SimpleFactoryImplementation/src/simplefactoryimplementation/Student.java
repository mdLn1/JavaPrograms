package simplefactoryimplementation;


public class Student extends Person {
    
    private int yearOfStudy;
    
    // create an instance of Student with some values
    public Student() {
        super("Student", 19);
        this.yearOfStudy = 2;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    
}
