package pac2;

//public class PetDogKennel {
//    private Dog[] dogs;
//    private int numberOfDogs;
//
//    // Конструктор для инициализации массива собак
//    public PetDogKennel(int capacity) {
//        dogs = new Dog[capacity];
//        numberOfDogs = 0;
//    }
//
//    // Метод для добавления собаки в питомник
//    public void addDog(String name, int age) {
//        if (numberOfDogs < dogs.length) {
//            dogs[numberOfDogs] = new Dog(name, age);
//            numberOfDogs++;
//            System.out.println("Собака добавлена в питомник.");
//        } else {
//            System.out.println("Питомник полон, нельзя добавить больше собак.");
//        }
//    }
//
//    // Метод для вывода всех собак в питомнике
//    public void listDogs() {
//        System.out.println("Список собак в питомнике:");
//        for (int i = 0; i < numberOfDogs; i++) {
//            System.out.println(dogs[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        PetDogKennel kennel = new PetDogKennel(5);
//
//        kennel.addDog("Барон", 3);
//        kennel.addDog("Рэкс", 5);
//
//        kennel.listDogs();
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class PetDogKennel {
    private final List<Dog> dogs;

    public PetDogKennel() {
        dogs = new ArrayList<>();
    }

    public static void main(String[] args) {
        PetDogKennel petDog = new PetDogKennel();

        // Добавление нескольких собак в питомник
        petDog.addDog(new Dog("Барон", 2));
        petDog.addDog(new Dog("Рэкс", 3));
        petDog.addDog(new Dog("Макс", 5));

        // Вывод информации о собаках в питомнике
        List<Dog> dogList = petDog.getDogs();
        for (Dog dog : dogList) {
            System.out.println("Имя: " + dog.getName());
            System.out.println("Возраст: " + dog.getAge() + " года");
            System.out.println("Возраст в человеческих годах: " + dog.getHumanAge() + " лет");
            System.out.println();
        }
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
