package ex41;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionsTest extends TestCase {

    public void testSort() throws FileNotFoundException {
        ArrayList<String> eq = new ArrayList<String>();

        eq.add("Johnson, Jim");
        eq.add("Jones, Aaron");
        eq.add("Jones, Chris");
        eq.add("Ling, Mai");
        eq.add("Swift, Geoffrey");
        eq.add("Xiong, Fong");
        eq.add("Zarnecki, Sabrina");

        File inputFile = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner scInput = new Scanner(inputFile);

        ArrayList<String> arr = Functions.sort(scInput);
        assertEquals(eq, arr);
    }
}