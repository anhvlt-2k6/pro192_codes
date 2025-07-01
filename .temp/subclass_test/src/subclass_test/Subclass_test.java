package subclass_test;

public class Subclass_test {

    public void demo(int x)
    {
        System.out.print(x % 10);
        if (x % 10 != 0) {
            demo(x / 10);
        }
        System.out.print(x % 10);
    }
    
    public static void main(String[] args) {
       demo(1234);
    }
}
