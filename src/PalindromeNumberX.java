public class PalindromeNumberX {
    public boolean isPalindrome(int x) {

        if (x<0 || x!=0 && x%10==0) return false;

        int halfX = 0;

        while (halfX<x){
            halfX = halfX*10 + x%10;
            x = x/10;
        }
        return (halfX==x || halfX/10==x);

    }
}
