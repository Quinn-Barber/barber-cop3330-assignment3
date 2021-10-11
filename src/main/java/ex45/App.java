package ex45;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name for the output file: ");
        String name = input.nextLine();
        File inputFile = new File("src/main/java/ex45/exercise45_input.txt");
        input = new Scanner(inputFile);
        String result = Functions.output(input);
        PrintStream out = new PrintStream("src/main/java/ex45/" + name + ".txt");
        PrintStream systout = System.out;

        System.setOut(out);
        System.out.println(result);

        System.setOut(systout);
        System.out.println("Output file \"" + name + ".txt\" has been added.");
    }
}

class Functions{
    public static String output(Scanner input)
    {
        StringBuilder ret = new StringBuilder();
        while(input.hasNextLine()){
            ret.append(input.nextLine());
            ret.append("\n");
            ret = new StringBuilder(ret.toString().replaceAll("utilize", "use"));
        }

        return ret.toString();
    }




}
