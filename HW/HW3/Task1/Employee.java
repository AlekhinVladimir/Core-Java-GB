class Employee {
    private int year;
    private int month;
    private int day;

    public Employee(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Метод компаратора для сравнения двух дат
    // Возвращает:
    // -1, если первая дата меньше второй;
    // 0, если даты равны;
    // 1, если первая дата больше второй;
    public int compareDates(Employee other) {
        int diffYears = this.year - other.year;
        int diffMonths = this.month - other.month;
        int diffDays = this.day - other.day;

        // Сравниваем года
        if (diffYears != 0) {
            return Integer.compare(diffYears, 0);
        }

        // Сравниваем месяцы
        if (diffMonths != 0) {
            return Integer.compare(diffMonths, 0);
        }

        // Сравниваем дни
        return Integer.compare(diffDays, 0);
    }
}