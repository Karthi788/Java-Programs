

class Return{

    String getname(){
        return "karthi";
    }

    int getphone(){
        return 959;
    }

    public static void main(String[] args) {
        Return obj1 = new Return();
        String name = obj1.getname();
        int number = obj1.getphone();
        System.out.println(name);
        System.out.println(number);
    }
}