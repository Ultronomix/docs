
package ultranomics.sep2022challengeone;

public class SumOfArray {
    public static int sumOfArray(int[] importIntArray){
        int result = 0;
        
        for(int crawler : importIntArray){
            result = result+crawler;
        }
        
        return result;
    }
}
