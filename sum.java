
import java.util.Scanner;

class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for sum: ");
        int a = sc.nextInt();
        int b;
        int res=0;
        while(a>0){
            b= a%10;
            res+=b;
            a=a/10;
        }
        System.out.println(res);
    }
}