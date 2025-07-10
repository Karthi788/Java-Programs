
import java.util.Scanner;

class sumnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The sum of Even number to the given number: "+eve(n));
    }

    public static int eve(int n){
        int res = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                res+=i;
            }
        }
        return res;
    }
}