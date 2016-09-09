
package adprojects;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class ADProjects {

    public static void main(String[] args) throws IOException {
        /*
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
        String text = Test();//this grabs input from the test method below
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
        
        //This is where we read the text file
        Scanner in = new Scanner(new FileReader("example.txt"));
        //convert the scanned material to a string variable
        String out = in.next();
        System.out.println(out);
        
        //text values converted to a double and subtracted
        double outNum = parseInt(out);
        System.out.println(outNum-2);
        
        //Here we compare the output from the textfile
        if(out.equals("12")){
            System.out.println("Truth");
        }else{
            System.out.println("False");
        }
        
        
        //Test();
    }

    public static String Test (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        String text = in.nextLine();
        
        System.out.println(text);
        //String text = "11";
        
        return text;
        
    }

}
