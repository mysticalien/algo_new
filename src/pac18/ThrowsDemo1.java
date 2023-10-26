package pac18;

public class ThrowsDemo1 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key; }

    public static void main(String[] args) {
        ThrowsDemo1 task6 = new ThrowsDemo1();
        task6.printMessage("???key???");

        try {
            task6.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено");
        }
    }

}
