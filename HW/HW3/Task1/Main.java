public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(2023, 11, 1);
        Employee employee2 = new Employee(2023, 11, 2);

        int result = employee1.compareDates(employee2);

        if (result < 0) {
            System.out.println("Первая дата меньше второй");
        } else if (result > 0) {
            System.out.println("Первая дата больше второй");
        } else {
            System.out.println("Даты равны");
        }
    }
}