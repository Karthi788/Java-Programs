
import java.util.Scanner;

class Middle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Middle value of array: "+ arr[n/2]);
    }
}