import java.util.Scanner;

public class Associatiivity {
    public static void main(String[] args) {
        System.out.println("the precedence and associativity");
        int a = 6*5-45/3;
        int  b = 6/5-45*3;
        System.out.println(b);
        char ch = 'b';
        ch = (char)(ch  + 8);
        System.out.println(ch);
        ch = (char)(ch-8);
        System.out.println(ch);
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(r>8);
    }
}
