import RegEx.IndexRegex;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Tests {

    @Test
    public void testFindingIndexesInText(){

        String textInput = "У вівторок, 25 червня, об 11 годині відбудеться відкриття нової IoT лабораторії у" +
                "Львівській Політехніці, яку Львівський ІТ Кластер стартує спільно з ІТ компаніями. Студенти програми" +
                "“Інтернет Речей” навчатимуться програмувати 80000 29000 89999 22813 85999 89022 99999 37 розумні пристрої та матимуть можливість реалізовувати" +
                "власні ідеї в життя.";

        InputStream inputStreamForInt = new ByteArrayInputStream(textInput.getBytes());
        System.setIn(inputStreamForInt);

        System.out.println(IndexRegex.findIndexesInText(textInput));

    }

}
