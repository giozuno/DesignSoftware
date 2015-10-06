package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";
    public String size;

    public static final String MINI = "Mini";
    public static final String REGULAR = "Regular";
    public static final String MEGA = "Mega";

    public String getDescription(){
        return description;
    }

    public String getSize() {
        return size;
    }

    public abstract double cost() throws RuntimeException;
}
