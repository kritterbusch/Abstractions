
package abstractions;


public class Honda extends Car {
    
    private int yearModel;
    private String model, color;

    public Honda(int ym, String mod, String c) {
        super("Honda");
        yearModel = ym;
        model = mod;
        color = c;
    }


    public int getYearmodel() {
        return yearModel;
    }

    public String getModel() {
        return model;
    }
    
    @Override
    public String toString()
    {
    String str3 = super.toString() + ". \nIt is a " + yearModel + ", " +  color + ", " + model + ".";
    return str3;
    }    
}
