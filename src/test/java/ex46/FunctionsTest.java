package ex46;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionsTest extends TestCase {

    public void testOutput() throws FileNotFoundException {
        ArrayList<Words> expected = new ArrayList<>();
        expected.add(new Words("badger", 7));
        expected.add(new Words("mushroom", 2));
        expected.add(new Words("snake", 1));
        File inputFile = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner input = new Scanner(inputFile);
        ArrayList<Words> arr = Functions.output(input);
        assertEquals(expected.get(0).word, arr.get(0).word);
        assertEquals(expected.get(1).word, arr.get(1).word);
        assertEquals(expected.get(2).word, arr.get(2).word);
        assertEquals(expected.get(0).occurrence, arr.get(0).occurrence);
        assertEquals(expected.get(1).occurrence, arr.get(1).occurrence);
        assertEquals(expected.get(2).occurrence, arr.get(2).occurrence);
    }
}