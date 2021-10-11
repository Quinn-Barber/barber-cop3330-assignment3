package ex42;
import java.io.*;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Quinn Barber
 */

public class App {
    public static void main(String[] args) //Runs all of the functions and prints output
    {
        Scanner input = Functions.openfile();
        ArrayList<Employee> arr = Functions.scan(input);
        System.out.println("Last      First     Salary\n--------------------------");
        for(int i = 0; arr.get(i).n == 0; i++)
            System.out.format("%-10s%-10s%-5d\n", arr.get(i).fname, arr.get(i).lname, arr.get(i).salary);
    }

}
class Employee //Holds the parameters passed for each employee, in order so the scan function can make an arraylist to hold all the data
{
    public String fname;
    public String lname;
    public int salary;
    public int n;

    public Employee(String fname, String lname, int salary, int n)
    {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.n = n;
    }
}

class Functions //Has two functions, openfile which returns the scanner, and scan which takes the data into an ArrayList.
{
    public static Scanner openfile()
    {
        File inputFile = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner scInput = null;
        try {
            scInput = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return scInput;
    }

    public static ArrayList<Employee> scan(Scanner scInput) //Uses scanner to save info to an ArrayList<Employee>, returns said list to main
    {
        Employee temp;
        int n = 1;
        ArrayList<Employee> arr = new ArrayList<>();
        while(scInput.hasNextLine()){
            String input = scInput.nextLine();
            String[] names = input.split(",", 3);
            String fname = names[0];
            String lname = names[1];
            String sal = names[2];
            int salary = Integer.valueOf(sal);
            temp = new Employee(fname, lname, salary, 0);
            arr.add(temp);
            n++;
        }
        temp = new Employee("", "", 0, n);
        arr.add(temp);
        return arr;
    }

}