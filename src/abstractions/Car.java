package abstractions;

public class Car extends Vehicle {

    private String make;

    public Car(String m) {
        super("car");
        this.make = m;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        String str2 = super.toString() + make;
        return str2;
    }
}
