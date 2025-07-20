import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans = "";
        String first = strs[0];
        String last = strs[strs.length-1];
        int parameter = Math.min(first.length(),last.length());
        for (int i = 0; i < parameter ; i++) {
            if(first.charAt(i)==last.charAt(i)) {
                ans += first.charAt(i);
            } else break;
        }

        return ans;

    }
}
