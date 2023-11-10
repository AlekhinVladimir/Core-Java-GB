import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = Arrays.asList(
                new Student("Иванов", Arrays.asList(4.5, 5.0, 4.0), "Информатика"),
                new Student("Петров", Arrays.asList(4.0, 4.5, 4.8), "Физика"),
                new Student("Сидоров", Arrays.asList(5.0, 5.0, 5.0), "Информатика"),
                new Student("Козлов", Arrays.asList(4.2, 4.1, 4.3), "Информатика"),
                new Student("Смирнова", Arrays.asList(3.8, 4.7, 4.9), "Информатика"),
                new Student("Михайлов", Arrays.asList(4.8, 4.8, 4.8), "Физика")
        );

        // Используем StreamAPI для выполнения задачи
        List<Student> topStudents = students.stream()
                .filter(student -> student.getSpecialty().equals("Информатика"))
                .filter(student -> student.getAverageGrade() > 4.5)
                .sorted((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade())) // Сортируем по убыванию среднего балла
                .limit(5) // Берем первые 5 студентов
                .collect(Collectors.toList());

        // Выводим результат
        topStudents.forEach(student -> System.out.println(student.getName() + " - " + student.getAverageGrade()));
    }
}