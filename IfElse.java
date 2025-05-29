
import java.util.Scanner;

class IfElse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        if(x < y){
            System.out.println("Y is greater than X");
        }
        else{
            System.out.println("X is greater than Y");
        }
    }
}