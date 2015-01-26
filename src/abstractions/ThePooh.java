package abstractions;

public class ThePooh extends Bear {

    private String name;

    public ThePooh(String c, String s, String t, String n) {
        super(c, s, t);
        name = n;
    }

    public void setName(String n) {

        name = n;

    }

    @Override
    public String toString() {
        String str3 = "Name: " + name + "\n" + super.toString();
        return str3;
    }

}
