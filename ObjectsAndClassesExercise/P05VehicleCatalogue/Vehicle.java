package ObjectsAndClassesExercise.P05VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int hp;

    public Vehicle(String type, String model,
                   String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        String formatedType="";
        if (getType().equals("car")){
            formatedType="Car";
        } else if (getType().equals("truck")) {
            formatedType = "Truck";

        }
        return String.format("Type: %s%nModel: %s%n" +
                        "Color: %s%nHorsepower: %d",formatedType,
                this.model,this.color,this.hp);
    }
}
