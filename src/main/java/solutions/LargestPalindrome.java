package solutions;public class LargestPalindrome {

    public int largestPalindrome(int n) {
        long result = 0;
        long init1 = new Double(Math.pow(10d, n)).longValue();
        outerloop:
        while (init1 > 1){
            for(long i = --init1 ; i > result/init1 ; i--){
                if(isPalindrome(init1 * i)){
                    if(init1 * i > result){
                        result = init1 * i;
                    }
                    continue outerloop;
                }
            }
        }

        return (result == 0 ? 0 : (int) (result % 1337));
    }

    private boolean isPalindrome(long number) {
        long palindrome = number; // copied number into variable
        long reverse = 0;

        while (palindrome > 0) {
            long remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return reverse==number;
    }
}
