class Methodoverloading{
static int addMethod(int x, int y){
    return x+y;
}

static double  addMethod(double  x, double  y){
    return x+y;
}


public static void main(String[] args) {
        int integer = addMethod(10, 20);
        double decimal = addMethod(4.3, 6.26);
        System.out.println("Int: "+ integer);
        System.out.println("Decimal: "+ decimal);

    }
}

