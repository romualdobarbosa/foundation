import java.util.*;

public class EncodeAndDecode {
    public String encodeAndDecode(String[] strs) {
        String ans = "";
        for (String s:strs) {
            ans += s;
            ans += ":+:";
        }
        return ans;
    }

    public List<String> decode(String s) {
        List<String> ans = new ArrayList<String>();
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            int arrayIndex = 0;
            ans.add(arrayIndex, String.valueOf(temp[i]));
            if(i>4) {
                if (String.valueOf(temp[i] + temp[i - 1] + temp[i - 2]).equals(":=:")) {
                    ans.remove(i);
                    ans.remove(i - 1);
                    ans.remove(i - 2);
                    arrayIndex++;
                }
            }
        }
        return ans;
    }
}
