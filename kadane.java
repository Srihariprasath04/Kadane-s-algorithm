// Kadane algorithm is used to find the maximum sum of an subarray
// Leetcode qn no : 53 uses kadane's algorithm
import java.util.*;
class Kadane{
    public static int maxSum(int[] ar){
        int max = Integer.MIN_VALUE;
        int current = 0;
        for(int i=0; i<ar.length; i++){
            current += ar[i];
            if(max < current){
                max = current;
            }
            if(current < 0){
                current = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();   
        }
        System.out.println(maxSum(ar));
    }
}

//-2 1 -3 4 -1 2 1 -5 4