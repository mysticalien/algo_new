package pac2;

public class Dog {
    private String name;
    private int age;

    // Конструктор для инициализации данных собаки
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Методы для доступа к имени и возрасту
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод для перевода возраста собаки в "человеческий" возраст
    public int getHumanAge() {
        return age * 7;
    }

    // Метод для представления собаки в виде строки
    @Override
    public String toString() {
        return "имя: " + name + ", возраст: " + age;
    }
}
