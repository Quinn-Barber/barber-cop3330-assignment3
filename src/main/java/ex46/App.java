package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner input = new Scanner(inputFile);
        ArrayList<Words> arr = Functions.output(input);
        for(int i = 0; i < arr.size(); i++){

            int maxi = 0;
            int maximum = arr.get(0).occurrence;
            for(int j = 0; j < arr.size(); j++){
                if( arr.get(j).occurrence > maximum ){
                    maximum = arr.get(j).occurrence;
                    maxi = j;
                }
            }
            System.out.format("%-10s", (arr.get(maxi).word + ":"));
            for(int g = 0; g < arr.get(maxi).occurrence; g++){
                System.out.print("*");
            }
            System.out.println();
            arr.get(maxi).occurrence = 0;
        }

    }
}
class Words{
    public String word;
    public int occurrence;

    public Words(String word, int occurrence){
        this.word = word;
        this.occurrence = occurrence;
    }
}

class Functions{
    public static ArrayList<Words> output(Scanner input)
    {
        ArrayList<Words> arr = new ArrayList<>(15);
        String query = input.next();
        if(query == null)
            return arr;
        arr.add(new Words(query, 1));

        while(input.hasNext()){
            query = input.next();

            boolean loop = true;

            for (Words words : arr) {

                if (words.word.equals(query)) {
                    words.occurrence += 1;
                    loop = false;
                    break;
                }
            }

            if(loop){
                arr.add(new Words(query, 1));
            }
        }
        return arr;
    }

}