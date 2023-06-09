import java.util.Scanner;

public class NetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basic salary");
        int basic = sc.nextInt();
        float HRA = (basic*50)/100;
         float  TA = (basic*30)/100;
         float  MA = (basic*25)/100;
         float  PF = (basic*10)/100;
         float GS = basic +HRA + TA + MA;
         float tax = (GS*10)/100;
         float netSalary = GS - tax - PF;
         System.out.println("--------  Salary Slip Of Employee --------");
         System.out.println("Basic Salary is :-  "+basic);
         System.out.println("Gross Salary is "+GS);
         System.out.println("Net salary is "+netSalary);
        sc.close(); 
    }
   
}