
import java.util.Scanner;

class dowhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("Enter input greater than 10");
            n = sc.nextInt();
        }
        while(n<10);
    }
}