import java.util.Scanner;
import java.util.ArrayList;

public class lesson {
    public static void main(String[] args) {
        First_number();
        Second_number();
        Third_number();
        Fourth_number();
    }
    public static void First_number() {
        Scanner ar = new Scanner(System.in);
        int a = ar.nextInt();
        int i;
        for(i = 1; i <= a; i++)
        {
            System.out.print((int) (i * Math.pow(-1,i+ 1 )) + " ");
        }
    }
    public static void Second_number(){
        Scanner del = new Scanner(System.in);
        int d = del.nextInt();
        int j;
        for(j = 1; j <= d; j++)
        {
            if(d % j == 0){
                System.out.print(d / j + " ");
            }
        }
    }
    public static void Third_number(){
        Scanner m = new Scanner(System.in);
        int month = m.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter the correct month number");
        }
    }
    public static void Fourth_number(){
        int k, k1;
        for(k = 1; k <= 9; k++)
        {
            for(k1 = 1; k1 <= 9; k1++) {
                System.out.printf("%4d", k1 * k);
            }
            System.out.println();
        }
    }
}
