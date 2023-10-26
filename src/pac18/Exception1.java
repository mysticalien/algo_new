package pac18;

public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        Exception1 var = new Exception1();
        var.exceptionDemo();
    }
}
