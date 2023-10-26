package pac2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private final List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(String brand, String model) {
        Computer computer = new Computer(brand, model);
        computers.add(computer);
    }

    public void removeComputer(String brand, String model) {
        computers.removeIf(computer -> computer.has(brand, model));
    }

    public List<Computer> searchComputers(String brand) {
        return computers.stream().filter(c -> c.hasBrand(brand)).collect(Collectors.toList());
    }
}
