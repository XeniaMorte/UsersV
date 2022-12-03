import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Form {
    private String login;
    private String password;
    String confirmPassword;

    public Form(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Form{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }

    public String correctFormLogin(String login) throws WrongLoginException {
        Pattern patlatletter = Pattern.compile("[a-zA-Z]{1,20}");

        Matcher matlatletter = patlatletter.matcher(login);
        if (matlatletter.matches()) {
            return "корректый логин";
        }
        throw new WrongLoginException("Неверный логин ");


    }

    public String correctFormPassword(String password) throws WrongPasswordForm {
        Pattern patlatletter = Pattern.compile("[a-zA-Z0-9_]{1,20}");

        Matcher matlatletter = patlatletter.matcher(password);
        if (matlatletter.matches()) {
            return "корректый логин";
        }
        throw new WrongPasswordForm("Неверный пароль ");


    }

    public String correctFormPass2(String confirmPassword) throws WrongPasswordForm {
        Pattern patlatletter = Pattern.compile("[a-zA-Z0-9_]{1,20}");

        Matcher matlatletter = patlatletter.matcher(confirmPassword);
        if (matlatletter.matches() && password.equals(confirmPassword)) {
            return "корректное подтверждение пароля";
        }
        throw new WrongPasswordForm("Неверное подтверждение пароля ");


    }

}

