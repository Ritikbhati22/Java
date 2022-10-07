import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("Result");
        Scanner Sc = new Scanner(System.in);
        int Maths = Sc.nextInt();
        System.out.println("Marks In Maths : "+ Maths);
        int Physics = Sc.nextInt();
        System.out.println("Marks In Physics : "+ Physics);
        int Hindi = Sc.nextInt();
        System.out.println("Marks In Hindi: "+ Hindi);
        float ans = Maths+Physics+Hindi/3.0f;
        if(Maths < 33 && Physics < 33 && Hindi < 33 && ans<40) {
            System.out.println("fail");
        }
        else{
            System.out.println("Pass");
        }

    }
}