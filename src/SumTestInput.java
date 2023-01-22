import java.util.Scanner;
import java.lang.Integer;

public class SumTestInput {
    public static void main(String[] args) {
        System.out.println("Please enter Two numbers to add:");
        Scanner Obj1 = new Scanner(System.in);
        int a = Obj1.nextInt();
        int b = Obj1.nextInt();
        Obj1.close();

        System.out.println("Your total numbers are: " + Integer.sum(a,b));
    }
}
