package pac321;

public class Shell {
    public static void main(String[] args) {
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("5.67");

        String str = "7.89";
        double convertedValue = Double.parseDouble(str);

        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj1.floatValue();
        long primitiveLong = doubleObj1.longValue();
        int primitiveInt = doubleObj1.intValue();
        short primitiveShort = doubleObj1.shortValue();
        int primitiveByte = doubleObj1.byteValue();

        System.out.println("Значение doubleObj1: " + doubleObj1);
        System.out.println("Значение doubleObj2: " + doubleObj2);

        String d = Double.toString(3.14);
        System.out.println("Литерал double как строка: " + d);
    }
}
