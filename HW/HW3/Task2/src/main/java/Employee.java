public class Employee {
    private String name;
    private double salary;

    // Конструктор
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Метод повышения зарплаты для всех сотрудников
    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }
}
