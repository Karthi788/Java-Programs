abstract class Person{
    public String Name = "Karthi";
    public int age = 22;
    public abstract void study();
}

class Student extends Person{
    public int graduationyear = 2025;
   
    public void study(){
        System.out.println("Studying all day");
    }
}

public class Modifierexample{
    public static void main(String[] args) {
        Student myObject = new Student();
        System.out.println("Name: " + myObject.Name);
        System.out.println("Age: "+ myObject.age);
        System.out.println("Graduation Year: "+ myObject.graduationyear);
        myObject.study();
    }
}