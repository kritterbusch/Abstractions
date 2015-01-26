package abstractions;

public class Bear extends HundredAcreWoodResident {

    private String color, shape, temperament;

    public Bear(String c, String s, String t) {
        super("Hundred Acre Woods");
        
        color = c;
        shape = s;
        temperament = t;
    }

    public void set(String c, String s, String t) {
        color = c;
        shape = s;
        temperament = t;
    }

    @Override
    public String toString()
    {
    String str2 = super.toString() + "\nColor: " + color + "\nShape: " + shape + "\nTemperament: " + temperament;
    return str2;
    }
}
