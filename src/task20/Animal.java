package task20;

public interface Animal {
    // Метод для издания звука
    void makeSound();

    // Метод для получения названия вида животного
    String getSpecies();

    // Метод для определения, является ли животное хищником
    boolean isPredator();
}