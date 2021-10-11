package ex41;
import java.io.*;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Quinn Barber
 */

public class App {
    //As little code as possible in main, primarily working in Functions class.
    public static void main(String[] args)
    {
        Scanner scInput = Functions.openfile();
        Functions.sort(scInput);
    }

}
class Functions{
    //Used for all operations within the code, called to from main.
    //openfile searches for the text file and returns a scanner for it. Also has a catch sequence in case the file is not found.
    public static Scanner openfile()
    {
        File inputFile = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner scInput = null;
        try {
            scInput = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return scInput;
    }
    //sort function sorts the array of names and prints them given the scanner for the text file. It returns the array of names to be tested.
    public static ArrayList<String> sort(Scanner scInput)
    {
        //first create array of strings given the scanner
        int n = 0;
        ArrayList<String> arr = new ArrayList<>();
        while(scInput.hasNextLine()){
            String temp = scInput.nextLine();
            arr.add(temp);
            n++;
        }
        //then sort them using selection sort
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if( arr.get(i).compareTo(arr.get(j)) > 0){
                    String temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }

        //print out output then return array of sorted names
        System.out.println("Total of " + n + " names");
        System.out.println("-----------------");
        for(int i = 0; i < n; i++){
            System.out.println(arr.get(i));
        }
        return arr;
    }
}
