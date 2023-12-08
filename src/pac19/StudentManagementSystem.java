package pac19;

import java.util.Arrays;
import java.util.Scanner;
public class StudentManagementSystem {
    private static final int MAX_STUDENTS = 100;
    private final Student[] students;
    private int numStudents;

    public StudentManagementSystem() {
        this.students = new Student[MAX_STUDENTS];
        this.numStudents = 0;
    }

    public void addStudent(Student student) {
        if (numStudents < MAX_STUDENTS) {
            students[numStudents++] = student;
        } else {
            System.out.println("Максимальное количество студентов достигнуто.");
        }
    }

    public void searchStudent(String fullName) throws StudentNotFoundException {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getFullName().equalsIgnoreCase(fullName)) {
                System.out.println("Студент найден: " + students[i]);
                return;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО \"" + fullName + "\" не найден.");
    }

    public void sortByAverageScore() {
        Arrays.sort(students, 0, numStudents, (s1, s2) -> Double.compare(s2.getAverageScore(), s1.getAverageScore()));
    }

    public void printStudents() {
        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i]);
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Считываем символ перевода строки
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Введите данные для студента " + (i + 1) + ":");
            System.out.print("ФИО: ");
            String fullName = scanner.nextLine();
            System.out.print("Средний балл: ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine(); // Считываем символ перевода строки
            sms.addStudent(new Student(fullName, averageScore));
        }
        System.out.println("--- Список студентов ---");
        sms.printStudents();
        System.out.println("--- Сортировка по среднему баллу ---");
        sms.sortByAverageScore();
        sms.printStudents();
        System.out.println("--- Поиск студента ---");
        System.out.print("Введите ФИО студента: ");
        String searchName = scanner.nextLine();
        try {
            sms.searchStudent(searchName);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}