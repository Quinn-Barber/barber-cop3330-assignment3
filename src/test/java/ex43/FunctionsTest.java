package ex43;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

public class FunctionsTest extends TestCase {

    public void testCreate() throws IOException {
        Input ans = new Input("awesomeco", "Max Power", "y", "y");
        Functions.create(ans);
        File file = new File("./src/main/java/ex43/website/awesomeco/index.html");
        assertTrue(file.exists());
        File file2 = new File("./src/main/java/ex43/website/awesomeco");
        assertTrue(file2.exists());
        File file3 = new File("./src/main/java/ex43/website/awesomeco/js");
        assertTrue(file3.exists());
        File file4 = new File("./src/main/java/ex43/website/awesomeco/css");
        assertTrue(file4.exists());


    }
}