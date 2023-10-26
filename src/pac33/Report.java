package pac33;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.printf("%-20s %15s%n", "Имя сотрудника", "Зарплата");

        for (Employee employee : employees) {
            System.out.printf("%-20s %15.2f%n", employee.getFullname(), employee.getSalary());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван", 50000.0),
                new Employee("Петров Петр", 60000.0),
                new Employee("Сидоров Сидор", 55000.0)
        };

        Report.generateReport(employees);
    }
}
