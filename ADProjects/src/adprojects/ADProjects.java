
package adprojects;

public class ADProjects {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] A = new int[1000000];
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum = sum + A[i];
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(elapsedTime);
        Test();
    }

    public static void Test (){
        System.out.println("hello");
        
    }

}
