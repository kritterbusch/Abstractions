package abstractions;

public class Abstractions {

    public static void main(String[] args) {
        Abstractions a = new Abstractions();
        a.realLife();
        a.imaginary();
    }

    public void realLife()

    {
        System.out.println("---My Car---");
        Honda myCar = new Honda(2009, "Accord", "dark blue");
        System.out.println(myCar);
    }

    public void imaginary()

    {
        System.out.println("\n--A.A. Milne Character---");
        ThePooh bear = new ThePooh("Yellow", "Rotund", "Silly", "Winnie the Pooh");
        System.out.println(bear);

    }

}
