package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPlay {
    public static void main(String[] args) {

        String str = "I'm a cool string!";
        String str1 = "I'm a cool string!";
        String str2 = "I'M A COOL STRING!";
        String str3 = new String("I'm a cool string!");
        System.out.println("Original string:\n" + str);

        System.out.println("String length: " + str.length());
        System.out.println("Substring from the index: 6->10: " + str.substring(6, 10));
        System.out.println("str.equals(str1): " + str.equals(str1));
        System.out.println("Index #1 output: " + str.charAt(1));
        System.out.println("Comparing strings: " + str.compareTo(str1));
        System.out.println("Comparing strings to ignore case: " + str.compareToIgnoreCase(str2));
        System.out.println("Whether the character 'o' is in the string: " + str.contains("o"));
        System.out.println("Comparison of character sequences: " + str.contentEquals(str3));


        System.out.println("Pattern: ");
        String emailPattern = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}";
        String email = "desant74268@yandex.ru";
        Pattern compilePattern = Pattern.compile(emailPattern);
        Matcher compileMatcher = compilePattern.matcher(email);

        while (compileMatcher.find()){
            System.out.println(email.substring(compileMatcher.start(),compileMatcher.end()));

        }



    }
}
