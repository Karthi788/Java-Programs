public class MultipleClasses{
    int x = 5;
}

class second{
    public static void main(String[] args) {
        MultipleClasses obj = new MultipleClasses();
        System.out.println(obj.x);
    }
}