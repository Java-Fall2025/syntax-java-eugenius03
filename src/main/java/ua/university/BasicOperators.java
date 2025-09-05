package ua.university;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        return new double [] {a+b+c, (a+b+c)/3};
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        return Integer.max(Integer.max(a,b),c);
    }

    /**
     /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if (score>=90 && score<=100) return 'A';
        else if (score>=80 && score<=89) return 'B';
        else if (score>=70 && score<=79) return 'C';
        else if (score>=60 && score<=69) return 'D';
        else if (score>=50 && score<=59) return 'E';
        else if (score>=0 && score<=49) return 'F';

        throw new IllegalArgumentException();

        

    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        switch(day){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
        }
        throw new IllegalArgumentException();
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if (n<=0) throw new IllegalArgumentException();
        int[] a = new int[n];
        for (int i = 0; i< n; i++) {
            a[i] = n-i;
        }
        return a;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if ( n < 0 ) throw new IllegalArgumentException();
        long a = 1;
        for(int i = 1; i <= n; i++){
            a*=i;
        }
        return a;
        
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        if ( arr == null ) throw new IllegalArgumentException();
        int left = 0;
        int right = arr.length - 1;

        while (left <right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        if ( matrix == null ) throw new IllegalArgumentException();
        int Sum = 0;
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                Sum += matrix1[j];
            }
        }

        return Sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if ( s == null ) throw new IllegalArgumentException();
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if ( arr.length<1 ) throw new IllegalArgumentException();
        int min = arr[0], max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[] {min, max};
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if( n <= 0 ) throw new IllegalArgumentException();

        int[][] a = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n;j++){
                a[i][j]= (i + 1) * (j + 1);
            }
        }
        return a;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        int[] a = new int[n/2];
        for(int i = 0; i<n/2; i++){
            a[i] = (i+1) * 2;
        }
        return a;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int limit = (int) Math.sqrt(n);

        for (int i = 3; i <= limit; i+=2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        int count = 0;
        String vowels ="aeiou";
        s = s.toLowerCase();
        for (int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1){
            fib[1] = 1;
        }

        for(int i = 2; i < n; i++){
            fib[i] = fib[i - 1] + fib[i -2];
        }
        return fib;


    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {

        int[][] transposed = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        int[] copy = arr.clone();
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j< arr.length - i - 1; j++){
                if (copy[j] > copy[j + 1]){
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        return copy;
    }

}