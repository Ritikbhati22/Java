import java.util.Scanner;

public class TakingInput {
    public static void main(String[] argv){
        System.out.println("Enter the no. ");
        Scanner ritik = new Scanner(System.in);
        System.out.println("Enter the Number 1: ");
        int a = ritik.nextInt();
//        boolean s = ritik.hasNextInt();
//        System.out.println(s);
        System.out.println("Enter the Number 2: ");
        int b = ritik.nextInt();
        int ans = a + b;
        System.out.println("The total is : "+ans);
        System.out.println("Enter the string");
        String s = ritik.nextLine();
        System.out.println(s);
    }

}
