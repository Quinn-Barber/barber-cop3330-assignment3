package ex43;

import java.io.*;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args) throws IOException {
        Input in = Functions.input();
        Functions.create(in);
    }
}

class Input{ //Holds all the information the user passes to the program
    public String name;
    public String author;
    public String js;
    public String css;

    public Input(String name, String author, String js, String css)
    {
        this.name = name;
        this.author = author;
        this.js = js;
        this.css = css;
    }
}

class Functions{ //Class holds all the main functions of the code, run through main

    public static Input input(){
        //Scans the input of the user and stores it in an
        //'Input' class which is returned to main to be passed to the create function.
        Scanner input = new Scanner(System.in);
        Input ans;
        String name;
        String author;
        String js;
        String css;
        System.out.print("Site name: ");
        name = input.nextLine();
        System.out.print("Author: ");
        author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        js = input.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        css = input.nextLine();
        ans = new Input(name, author, js, css);
        return ans;
    }

    public static void create(Input in) throws IOException {
        //Creates all the folders the user asked for.
        //Displays message when the folders are created.
        String name = "./src/main/java/ex43/website/";
        name += in.name;
        boolean made = new File(name).mkdirs();
        if(made)
            System.out.println("Created ./website/" + in.name);

        File html = new File(name + "/index.html");

        BufferedWriter bw = new BufferedWriter(new FileWriter(html));
        bw.write("<html>\n<head>\n<title>" + in.name + "</title>\n<meta author = \"" + in.author + "\">\n</head>\n</html>");
        bw.close();

        if(!html.createNewFile())
            System.out.println("Created ./website/" + in.name + "/index.html");

        if(in.js.equals("y")){
            made = new File("./src/main/java/ex43/website/" + in.name + "/js").mkdirs();
            if(made)
                System.out.println("Created ./website/" + in.name + "/js/");
        }
        if(in.css.equals("y")){
            made = new File("./src/main/java/ex43/website/" + in.name + "/css").mkdirs();
            if(made)
                System.out.println("Created ./website/" + in.name + "/css/");
        }
    }

}
