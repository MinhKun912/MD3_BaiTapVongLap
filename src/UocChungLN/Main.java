package UocChungLN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a:");
        a=scanner.nextInt();
        System.out.println("ENter b:");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0  || b==0 ){
            System.out.println("No great common facter");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
                System.out.println("a = " +a );
            }else {
                b=b-a;
                System.out.println("result3 = " +b);
            }

        }
        System.out.println("Greate common facter :" +a);
    }

}
