package autorizationhomework11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidatorValueOfFieldsInAuthorizationForm {
    static Pattern pattern;
    static Matcher matcher;

    static boolean validator(String login, String password, String confirmPassword) {
        pattern = Pattern.compile("\\W");
        matcher = pattern.matcher(login);
        try {
            if (matcher.find()) {
                throw new WrongLoginException("Login contains not available char");
            } else {
                if (login.length() >= 20) {
                    throw new WrongLoginException("Login should be smaller than 20 characters");
                } else {
                    pattern = Pattern.compile("\\D");
                    matcher = pattern.matcher(password);
                    if (matcher.find()) {
                        throw new WrongPasswordException("Password contains not available char");
                    } else {
                        if (password.length() >= 20) {
                            throw new WrongPasswordException("Password should be smaller than 20 characters");
                        } else {
                            if (!password.equals(confirmPassword)) {
                                throw new WrongPasswordException("password and confirm password aren't similar");
                            }
                        }
                    }
                }
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}

