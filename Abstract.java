abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    void setTitle(String s){
        title = s;
    }
}

public class Abstract{
    public static void main(String[] args) {
        String title = "A tale of two cities";
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+ new_novel.getTitle());
    }
}