package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();

        scanner.close();

        try {
            boolean isValid = LoginValidator.validateLoginAndPassword(login, password, confirmPassword);
            System.out.println("Логин и пароль верны: " + isValid);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка! Неверный логин: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка! Неверный пароль: " + e.getMessage());
        }
    }
}
