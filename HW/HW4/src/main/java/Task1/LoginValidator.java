package Task1;

public class LoginValidator {
    public static boolean validateLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Неверный логин: длина логина должна быть меньше 20 символов");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Неверный пароль: длина пароля должна быть меньше 20 символов");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль: пароль и подтверждение пароля не совпадают");
        }

        return true;
    }
}
