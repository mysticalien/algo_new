package pac2;

import java.util.ArrayList;
import java.util.Iterator;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(String brand, String model) {
        Computer computer = new Computer(brand, model);
        computers.add(computer);
    }

    public void removeComputer(String brand, String model) {
        Iterator<Computer> iterator = computers.iterator();
        while (iterator.hasNext()) {
            Computer computer = iterator.next();
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                iterator.remove();
            }
        }
    }

    public ArrayList<Computer> searchComputers(String brand) {
        ArrayList<Computer> results = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                results.add(computer);
            }
        }
        return results;
    }
}
