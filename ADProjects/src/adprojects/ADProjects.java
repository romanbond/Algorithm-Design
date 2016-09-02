/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adprojects;

/**
 *
 * @author kepler
 */
public class ADProjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        
        int[] A = new int[1000000];
        int sum = 0;
        
        for (int i = 0; i < A.length; i++){
            sum = sum + A[i];
        }
        long stopTime = System.currentTimeMillis();
        
        long elapsedTime = stopTime - startTime;
        
        System.out.println(elapsedTime);
        
    }
    
}
