import java.util.Scanner;

public class KiloToMeter {
    public static void main(String[] args) {
        System.out.println("Kilo TO meter:");
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter The Kilometer : ");
        float kilo = SC.nextFloat();
        float meter = kilo*1000;
        System.out.println("The total meter : "+ meter);

    }
}
