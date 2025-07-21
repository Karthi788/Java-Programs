
import java.util.Scanner;

class Tennum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=1;i<=arr.length;i++){
            System.out.println(i);
        }
    }
}