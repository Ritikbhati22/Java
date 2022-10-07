import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        System.out.println(a);
        switch (a){
            case 1:
                System.out.println("Ritik");
                break;
            case 5:
                System.out.println("Chikku");
                break;
            case 6:
                System.out.println("Vaishnav");
                break;
            case 7:
                System.out.println("Ravindra");
                break;
            case 4:
                System.out.println("Ravi");
                break;
            case 3:
                System.out.println("Bhati");
                break;
            default:
                System.out.println("error");
        }


    }
}
