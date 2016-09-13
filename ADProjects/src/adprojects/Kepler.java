// @romanbond

package adprojects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Kepler {
    public static void main(String[] args) throws IOException {
        begin();
    }
    public static void begin() throws IOException {
        System.out.println("So what are we storing today?");
        textPush();
    }
    public static void textPush () throws IOException {
        for(int i = 0; i<1; i++){
            memoryInput(":");
        }
        Scanner in = new Scanner(System.in);
        String output = in.nextLine() + stacking();
        memoryInput(output);
        System.out.println(displayMemory());
    }
    public static String stacking() throws IOException{
        Scanner in = new Scanner(new FileReader("memory.txt"));
        String existingVars = in.next();
        return existingVars;
    }
    public static void memoryInput(String Response) throws IOException {
        String text = Response;
        BufferedWriter output = null;
        try {
            File file = new File("memory.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
        } catch ( IOException e ) {
        } finally {
            if ( output != null ) {
                output.close();
            }
        }
    }
    public static String displayMemory () throws IOException {
        Scanner in = new Scanner(new FileReader("memory.txt"));
        String existingVars = in.next();
        return existingVars;
    }
}