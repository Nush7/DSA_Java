package DP;

public class Memoization {
    static int calls=0;
    private static int fibo(int n, int[] dp){
        calls++;
        if(n==1 || n==0) return 1;
        if(dp[n]!= -1) return dp[n];
        int result= fibo(n-1, dp) + fibo(n-2, dp);
        dp[n]=result;
        return result;
    }
    public static void main(String[] args) {
        int n=5;
        int[] dp= new int[n+1];
        for(int i=0;i<=n; i++){
            dp[i]= -1;
        }
        System.out.println(fibo(n, dp));
        System.out.println("calls "+ calls );
    }

}
