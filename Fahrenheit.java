import java.util.Scanner;


public class Main {

    public static void main(String args[]) {
        double a;
        double b;

        System.out.println("podaj ile jest stopni celciusza");
        Scanner celciusze = new Scanner(System.in);
        a = celciusze.nextDouble();
        b = 1.8 * a + 32.0;
        System.out.println("to bedzie: " + b + "Fahrenheita");


    }
}
    
 