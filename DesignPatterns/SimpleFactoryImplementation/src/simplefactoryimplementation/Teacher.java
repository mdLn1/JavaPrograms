package simplefactoryimplementation;

public class Teacher extends Person {

    private int yearsOfTeaching;

    // create an instance of Teacher with some values
    public Teacher() {
        super("Teacher",34);
        this.yearsOfTeaching = 5;
    }

    public int getYearsOfTeaching() {
        return yearsOfTeaching;
    }

    public void setYearsOfTeaching(int yearsOfTeaching) {
        this.yearsOfTeaching = yearsOfTeaching;
    }

}
