package ObjectsAndClassesExercise.P04Students;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;

    public Students (String fn,String ln,double grade){

        this.firstName=fn;
        this.lastName=ln;
        this.grade=grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }
}
