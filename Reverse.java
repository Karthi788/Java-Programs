class Reverse{

    public static String rev(String S) {
        String result = "";
        char ch;
        for (int i = 0; i < S.length(); i++){
             ch = S.charAt(i);
             result = ch+result;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = rev("Karthi");
        System.out.println(str);
    }
}