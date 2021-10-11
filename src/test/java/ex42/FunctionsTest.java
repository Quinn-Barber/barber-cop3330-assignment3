package ex42;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionsTest extends TestCase {

    public void testScan() {
        ArrayList<Employee> arr = new ArrayList<>();
        Employee temp;
        temp = new Employee("Ling", "Mai", 55900, 0);
        arr.add(temp);
        temp = new Employee("Johnson", "Jim", 56500, 0);
        arr.add(temp);
        temp = new Employee("Jones", "Aaron", 46000, 0);
        arr.add(temp);
        temp = new Employee("Jones", "Chris", 34500, 0);
        arr.add(temp);
        temp = new Employee("Swift", "Geoffrey", 14200, 0);
        arr.add(temp);
        temp = new Employee("Xiong", "Fong", 65000, 0);
        arr.add(temp);
        temp = new Employee("Zarnecki", "Sabrina", 51500, 0);
        arr.add(temp);
        temp = new Employee("", "", 0, 7);
        arr.add(temp);
        Scanner input = Functions.openfile();
        ArrayList<Employee> arr2 = Functions.scan(input);
        for(int i = 0; i < 7; i++){
            assertEquals(arr.get(1).fname, arr2.get(1).fname);
            assertEquals(arr.get(1).lname, arr2.get(1).lname);
            assertEquals(arr.get(1).salary, arr2.get(1).salary);
            assertEquals(arr.get(1).n, arr2.get(1).n);
            }
        }
    }