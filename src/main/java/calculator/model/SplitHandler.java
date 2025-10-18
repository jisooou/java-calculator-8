package calculator.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitHandler {
    private static final String DEFAULT_REGEX = "[, :]";
    private static final String DEFAULT_CUSTOM_REGEX = "//(.)\\\\n(.*)";

    public static String[] split(String input){
        Pattern pattern = Pattern.compile(DEFAULT_CUSTOM_REGEX);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            String customRegex = matcher.group(1); //예) ;
            String numbers = matcher.group(2);
            return numbers.split(customRegex);
        }
        return input.split(DEFAULT_REGEX);
    }
}
