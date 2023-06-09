import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        int p =  sc.nextInt();
        System.out.println("Enter rate of interest ");
        int r = sc.nextInt();
        System.out.println("Enter time in year");
        int t = sc.nextInt();
        float si = (p*r*t)/100;
        System.out.println("simple interest "+si);
        sc.close();
    }
}