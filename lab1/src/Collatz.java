public class Collatz {
    public static int nextNumber(int n)
    {
        /**
         * This method returns the next number of n in Collatz sequence.
         * If n is even, the next number is n/2.
         * If n is odd, the next number is 3n + 1.
         * If n is 1, the sequence is over.
         */

        if(n == 1)
        {
            return 0;
        } // the sequence is over.
        else if(n % 2 == 0)
        {
            return n/2;
        }
        else
        {
            return 3*n+1;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(nextNumber(5));
    }
}