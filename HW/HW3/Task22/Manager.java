// Класс-наследник "Руководитель"
class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Cтатический метод повышения зарплаты для всех сотрудников, если они не являются руководителями
    public static void increaseSalary(Employee[] employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percentage / 100);
            }
        }
    }
}