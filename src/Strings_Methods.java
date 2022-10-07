import java.util.Scanner;

public class Strings_Methods {
    public static void main(String[] args) {
        String name = new String("bhati");
        String name1 = "     Bhati   ";
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0,3));
        System.out.println(name1.replace('B','c'));
        Scanner Sc = new Scanner(System.in);
        String ST = Sc.nextLine();
        System.out.println(ST);
    }
}
