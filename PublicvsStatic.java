public class PublicvsStatic{

    public void myfirst(){
        System.out.println("Only accessed by object");
    }

    static void mysecond(){
        System.out.println("without access by object");
    }

    public static void main(String[] args) {
       PublicvsStatic obj = new PublicvsStatic();
       obj.myfirst();
       mysecond();

    }
}