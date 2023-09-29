package org.example.softeng.interviews;

import java.util.Arrays;
import java.util.List;

/**
 * Some arbitrary data transformation.
 */
public class DataTransformer {

    public static void main(final String[] args) {
        // Some test data - String lengths are:                  9          5        6        4      2
        List<String> someData = Arrays.asList(new String[] {"something", "short", "longer", "snip", "it"});
        System.out.println(DataTransformer.transform(someData));
    }

    public static int transform(final List<String> input) {
        int c = 0;
        for (String item : input) {
            if (item.length() > 4) {
                c = c + item.length();
            }
        }
        return c;
    }
}