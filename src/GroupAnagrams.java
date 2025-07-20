import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String Temp = strs[i];
            char[] tempWordChars = Temp.toCharArray();
            Arrays.sort(tempWordChars);
            String keyString = String.valueOf(tempWordChars);
            if (!map.containsKey(keyString)) {
                map.put(keyString, new ArrayList<>());
            }
                map.get(keyString).add(Temp);
        }
        return new ArrayList<>(map.values());
    }
}