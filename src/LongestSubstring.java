import java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Character> sChars = new HashMap<Character, Character>();
        int[] counts = new int[s.length()];
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
        sChars.put(s.charAt(i),s.charAt(i));
        if(sChars.containsKey(s.charAt(i))){
            count = 0;
            counts[i]=count;
        }
            count +=1;
            counts[i]=count;
        }
        Arrays.stream(counts).sorted();
        return counts[s.length()] ;
    }
}
