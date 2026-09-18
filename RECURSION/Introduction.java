package RECURSION;

class Introduction {
    // Write a Function which calculate power of two

    public static int PowerOfTwo(int n){
        // BASE CASE
        if (n==0) {
            return 1;
        }
        // RECURSIVE CALL + PROCESSING WORK
        return 2*PowerOfTwo(n-1);
    }

    // FACTORIAL OF A NUMBER

    public static int Factorial(int n){
        if (n==0) {
            return 1;
        }
        return n*Factorial(n-1);
    }


    // Fibonacci number of a Number
    
    public static int Fibo(int n){
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
        System.out.println(PowerOfTwo(6));
    }
}
