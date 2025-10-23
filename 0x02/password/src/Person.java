
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private String userName;
    private String password;

    public Person(){}

    public Person(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUser() {
        return userName;
    }

    public void setUser(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser(String userName){

        Pattern specialCharPattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = specialCharPattern.matcher(userName);
        
        if (userName.length() < 8) {
            return false;
        }

        if (matcher.find()) {
            return false;
        }

        // Se passou em ambas as verificações, o usuário é válido
        return true;
    }



    public static boolean checkPassword(String password) {
        if (password == null) {
            return false;
        }

        if (password.length() < 8) {
            return false;
        }

        Pattern upperCasePattern = Pattern.compile("[A-Z]+");
        Matcher upperCaseMatcher = upperCasePattern.matcher(password);
        if (!upperCaseMatcher.find()) {
            return false;
        }

        Pattern digitPattern = Pattern.compile("[0-9]+");
        Matcher digitMatcher = digitPattern.matcher(password);
        if (!digitMatcher.find()) {
            return false;
        }

        Pattern specialCharPattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher specialCharMatcher = specialCharPattern.matcher(password);
        if (!specialCharMatcher.find()) {
            return false;
        }

        // Se passou em todas as verificações, a senha é válida
        return true;
    }


}