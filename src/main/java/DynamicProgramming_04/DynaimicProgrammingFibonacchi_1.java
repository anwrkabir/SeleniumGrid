package DynamicProgramming_04;

public class DynaimicProgrammingFibonacchi {

    public static  int fibonacci( int n){
        if (n<=1){
            return  n; // Base cases
        }

        // Create an array to store Fibonacci numbers
        int [] dp = new int[n+1];


        // Initialize the first two Fibonacci numbers
        dp[0]= 0;
        dp[1]= 1;

        // Fill the array iteratively
        for( int i= 2; i<=n ; i++){
            dp[i]= dp[i-1] + dp[i-2];
        }
        return dp[n];


    }

    public static void main(String[] args) {
        int n = 6; // Example: Find the 5th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));

    }


}
