class funpara{

    void sum(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        funpara obj = new funpara();
        obj.sum(30, 20);

    }
}