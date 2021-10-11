package ex44;

import com.google.gson.stream.JsonReader;
import java.util.*;
import java.io.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        String query;
        boolean find;
        do{
            System.out.print("What is the product name? ");
            query = input.nextLine();
            JsonReader reader = new JsonReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
            find = Functions.foundProduct(query, reader);
            reader.close();
            if(!find){
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }while(!find);


    }
}
class Functions{
    public static boolean foundProduct(String in, JsonReader reader) throws IOException
    {
        reader.beginObject();
        reader.nextName();
        reader.beginArray();
        while(reader.hasNext()){
            reader.beginObject();
            while(reader.hasNext()) {
                String name = reader.nextName();
                String search = reader.nextString();
                if (name.equals("name")) {
                    if (in.equals(search)) {
                        System.out.println("Name: " + search);
                        reader.nextName();
                        search = reader.nextString();
                        System.out.println("Price: " + search);
                        reader.nextName();
                        search = reader.nextString();
                        System.out.println("Quantity: " + search);
                        return true;
                    }
                }
            }
            reader.endObject();
        }
        return false;
    }
}
