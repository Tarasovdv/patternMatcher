package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneValidator {
    private static final String TELEPHONE_PATTERN = "^\\+\\d{1,3}\\s?\\(\\d{3}\\)\\s?\\d{3}(-\\d{2}){2}$";

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(TELEPHONE_PATTERN);
        Matcher matcher = pattern.matcher("+7(965)021-78-08");
        boolean matches = matcher.matches();
        System.out.println(matches);


    }
}
