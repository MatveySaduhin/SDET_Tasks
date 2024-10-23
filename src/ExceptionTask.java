public class ExceptionTask {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(authCheck("afaAf", "Abcdefghijklmnop123456", "abcdefghijklmnop123456"));
    }

    public static boolean authCheck(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Введный логин не соответствует требованиям");
            }

            if (!password.matches("[a-zA-Z0-9_]+") || password.length() < 20) {
                throw new WrongPasswordException("Введный пароль не соответствует требованиям");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Введёные пароли не совпадают");
            }

            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
    }
}

