package RECURSION;

public class SubsetSum {
    public static void subsetSum(int[] a, int n, int idx, int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }

        //curr idx + sum, inclusion
        subsetSum(a,n,idx+1,sum+a[idx]);
        //curr ans, exclusion
        subsetSum(a,n,idx+1,sum);
    }
    public static void main(String[] args) {
        int[] a={2,4,5};
        subsetSum(a, a.length, 0, 0);

    }

}
