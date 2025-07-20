import java.util.Arrays;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean ans = false;
        if (x < 0) ans = false;
        char[] xNumbers = String.valueOf(x).toCharArray();
        char[] xNumbersBackwards = new char[xNumbers.length];
        int j = xNumbers.length-1;
        int i = 0;
        while (j >= 0) {
            xNumbersBackwards[i] = xNumbers[j];
            i++;
            j--;
        }
        if (Arrays.equals(xNumbers,xNumbersBackwards)) ans = true;

        return ans;
    }
}
