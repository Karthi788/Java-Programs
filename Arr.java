
import java.util.Scanner;

class Arr{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt(); 
       }
       System.out.println(calculatearr(n, arr));
    }

    public static int calculatearr(int n, int[] arr){
        int res =0;
        for(int i=0;i<arr.length;i++){
            res += arr[i];
        }
        return res;
    }
}