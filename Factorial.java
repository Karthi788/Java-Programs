class Factorial{
    public static int Factorials(int n){
        if(n==0){
            return 1;
        }
        else{
            return n* Factorials(n-1);
        }
    }
    public static void main(String[] args) {
        int answer = Factorials(5);
        System.out.println(answer);
    }
}