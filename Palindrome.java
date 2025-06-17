class Palindrome{

    public static void palindrome(String S) {
        String input = S.toLowerCase();
        String pal = "";
        char ch;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            pal = ch + pal;
        }
        if(input.equals(pal)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome("Amma");

    }
}