package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException
    {
	    Scanner sc = new Scanner(new File ("MyData.txt"));

        int maxIndex=-1;
        String text[]= new String[1000];

        while(sc.hasNext())
        {
            maxIndex++;
            text[maxIndex]=sc.nextLine();
        }
        sc.close();

        for(int j=0; j<=maxIndex; j++)
            System.out.println(text[j]);

        FileWriter fw= new FileWriter("output.txt", true);
        PrintWriter pw= new PrintWriter(fw);

        pw.println("Hi");
        pw.print(5);



        Scanner kb= new Scanner(System.in);
        System.out.print("Enter your password");
        String password= kb.nextLine();
        pw.println(password);
        pw.close();
        fw.close();

    }
}
