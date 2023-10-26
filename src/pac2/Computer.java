package pac2;

public class Computer {
    private final String brand;
    private final String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public boolean has(String brand, String model) {
        return hasBrand(brand) && this.model.equalsIgnoreCase(model);
    }

    public boolean hasBrand(String brand) {
        return this.brand.equalsIgnoreCase(brand);
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
