
import java.util.Scanner;

class reversedigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for reverse: ");
        int a = sc.nextInt();
        int b;
        StringBuilder res = new StringBuilder();
        while(a>0){
            b = a%10;
            res.append(b);
            a = a/10;
        }
        System.out.println(res.toString());
    }
}