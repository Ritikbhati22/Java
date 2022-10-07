import java.util.Scanner;

public class CalculatePer {
    public static void main(String[] argv){
        System.out.println("Calculate the percentag of student: ");
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter the marks:");
        System.out.println("Maths");
        float a =Sc.nextFloat();
        System.out.println("hindi");
        float b = Sc.nextFloat();
        System.out.println("English");
        float c = Sc.nextFloat();
        System.out.println("SocialScience");
        float d = Sc.nextFloat();
        System.out.println("Sanskrit");
        float e = Sc.nextFloat();
        System.out.println("Science");
        float f = Sc.nextFloat();
        float ans = a+b+c+d+e+f;
//        float total =500;
        float percentage = (ans/600)*100;
        System.out.println("The percentage : "+ percentage);
        System.out.println(5+6);


    }
}
