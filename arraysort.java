
import java.util.Scanner;

class arraysort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(SortedArr(arr, n));
    }

    public static String SortedArr(int[] arr, int n){
        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                return  "Array isn't sorted";
            }
        }
        return "Array is sorted";
    }
}