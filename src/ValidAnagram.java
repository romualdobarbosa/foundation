import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] wordS = s.toCharArray();
        char[] wordT = t.toCharArray();
        Arrays.sort(wordT);
        Arrays.sort(wordS);
        return Arrays.equals(wordT, wordS);
    }
}
