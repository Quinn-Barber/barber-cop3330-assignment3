package ex44;

import com.google.gson.stream.JsonReader;
import junit.framework.TestCase;

import java.io.FileReader;
import java.io.IOException;

public class FunctionsTest extends TestCase {

    public void testFoundProduct() throws IOException {
        String name = "Widget";
        JsonReader reader = new JsonReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        assertTrue(Functions.foundProduct(name, reader));
        name = "Doodad";
        reader = new JsonReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        assertTrue(Functions.foundProduct(name, reader));
        name = "Thing";
        reader = new JsonReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        assertTrue(Functions.foundProduct(name, reader));
        name = "IAmNotInTheList";
        reader = new JsonReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        assertFalse(Functions.foundProduct(name, reader));
        name = "widget";
        reader = new JsonReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        assertFalse(Functions.foundProduct(name, reader));
        name = "25.00";
        reader = new JsonReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        assertFalse(Functions.foundProduct(name, reader));
        name = "5";
        reader = new JsonReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        assertFalse(Functions.foundProduct(name, reader));
    }
}