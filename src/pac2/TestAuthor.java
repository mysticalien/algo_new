package pac2;

import pac2.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Иванов Иван", "ivanov@example.com", 'M');
        System.out.println(author); // Выводит информацию об авторе

        System.out.println("Имя автора: " + author.getName());
        System.out.println("Email автора: " + author.getEmail());

        author.setEmail("newemail@example.com");
        System.out.println("Новый email автора: " + author.getEmail());

        System.out.println("Пол автора: " + author.getGender());
    }
}
