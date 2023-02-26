package ObjectsAndClassesExercise.groomingSalon;

public class Pet {
    private String name;
    private  int age;
    private String owner;

    //конструктор

    public Pet(String name, int age, String owner) {
        //нов празен обект
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override // пренаписваме
    public String toString() {
        return this.name + " "+this.age+" - (" + this.owner+")";

    }
}
