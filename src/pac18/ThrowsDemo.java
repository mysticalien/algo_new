package pac18;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено");
        }
    }
    public static void main(String[] args) {
        ThrowsDemo task = new ThrowsDemo();
        task.getDetails(null);
    }
}
