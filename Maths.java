
import java.util.Scanner;


class Maths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        
        System.out.println("Maximum between x and y: "+java.lang.Math.max(x, y));
        System.out.println("Minimum between x and y: "+java.lang.Math.min(x, y));
        System.out.println("Square root of x: "+java.lang.Math.sqrt(x));
        System.out.println("Absolute value of y: "+java.lang.Math.abs(y));
    }
}