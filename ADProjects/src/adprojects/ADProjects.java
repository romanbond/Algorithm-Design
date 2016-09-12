
package adprojects;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class ADProjects {
    
    
    public static void main(String[] args) throws IOException {
        //First we create the file with nothing in it
        //createFile();
        //Next we add literally "something" to the file
        //purgeFile();
        //addToFile("s");
        for(int i=0; i<0;i++){
            String s = display() + Integer.toString(i);
            addToFile(s);
        }
        System.out.println(display());
        purgeFile();
    }
    public static void getNumber() throws IOException{
        String output = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number or type clear");
        String userInput = in.nextLine();
        if(in.nextLine().equals("clear")){
            purgeFile();
        }else{
        output = in.nextLine() + stacking();
        addToFile(output);
        }
    }
    public static void createFile() throws IOException{
        addToFile("");
    }
    public static void addToFile(String addedVar) throws IOException{
        String text = addedVar;
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
        } catch ( IOException e ) {
        } finally {
            if ( output != null ) {
                output.close();
            }
        }
    }
    public static void purgeFile() throws IOException{
        addToFile("");
        /*
        String text = "Purged";
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
        } catch ( IOException e ) {
        } finally {
            if ( output != null ) {
                output.close();
            }
        }*/
    }
    public static void calculation(){
        
    }
    public static String stacking() throws IOException{
        Scanner in = new Scanner(new FileReader("example.txt"));
        //convert the scanned material to a string variable
        String existingVars = in.next();
        //addToFile("");
        return existingVars;
    }
    public static String display() throws IOException{
        Scanner in = new Scanner(new FileReader("example.txt"));
        //convert the scanned material to a string variable
        String existingVars = in.next();
        //addToFile("");
        //System.out.println(existingVars);
        return existingVars;
    }
    
    
    
    

    public static void OldMain () throws IOException {
        /*
        //Runtime example from class

        long startTime = System.currentTimeMillis();
        int[] A = new int[1000000];
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum = sum + A[i];
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(elapsedTime);
        */


        // This text is in the text file and is overwritten everytime it runs
        String text = inputSection();//this grabs input from the test method below
        //String text2 = "1";
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            //output.write(text2);
        } catch ( IOException e ) {
        } finally {
          if ( output != null ) {
            output.close();
          }
        }
        //scanning();
    }

    public static String inputSection() throws IOException{
        String text = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number or type clear");
        if(in.nextLine().equals("clear")){
            purgeText();
        }else{
        text = in.nextLine() + scanning();
        }
        System.out.println("This is the text test  "+ text);
        return text;
    }

    public static String scanning() throws IOException {
        //This is where we read the text file
        Scanner in = new Scanner(new FileReader("example.txt"));
        //convert the scanned material to a string variable
        String out = in.next();
        System.out.println(out);
        
        return out;
    }

    public static void purgeText () throws IOException{
        // This text is in the text file and is overwritten everytime it runs
        String text = "";//this grabs input from the test method below
        //String text2 = "1";
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            //output.write(text2);
        } catch ( IOException e ) {
        } finally {
          if ( output != null ) {
            output.close();
          }
        }
    }

}
