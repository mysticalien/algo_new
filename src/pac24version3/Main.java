package pac24version3;
class Complex {
    private final int real;
    private final int image;
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }
    public int getReal() {
        return real;
    }
    public int getImage() {
        return image;
    }
}

interface ComplexAbstractFactory {
    Complex createComplex();
    Complex CreateComplex(int real, int image);
}

class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }
    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        System.out.println("Complex 1: Real = " + complex1.getReal() + ", Image = " + complex1.getImage());
        Complex complex2 = factory.CreateComplex(5, 3);
        System.out.println("Complex 2: Real = " + complex2.getReal() + ", Image = " + complex2.getImage());
    }
}
