package RegEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class IndexRegex {

    public static List<String> findIndexesInText(final String input){

        List<String> foundIndexes = new ArrayList<String>();

        String patternString = "([0-8][0-8][0-9][0-9][0-9]|[0-7][0-9][0-9][0-9][0-9]|890[0-1][0-1])";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            foundIndexes.add(matcher.group());
        }
        return foundIndexes;

    }

}