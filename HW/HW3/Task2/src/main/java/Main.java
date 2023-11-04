public class Main {
    public static void main(String[] args) {
        // Создание руководителя и сотрудников
        Employee manager = new Manager("John", 5000);
        Employee employee1 = new Employee("Alice", 2000);
        Employee employee2 = new Employee("Bob", 2500);
        Employee employee3 = new Employee("Eva", 3000);

        // Добавление всех сотрудников в общий массив
        Employee[] employees = {manager, employee1, employee2, employee3};

        // Повышение зарплаты всем сотрудникам, за исключением руководителей
        Manager.increaseSalary(employees, 10);

        // Вывод текущей зарплаты всех сотрудников
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}