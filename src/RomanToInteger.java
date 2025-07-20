import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

        String s = "MCMXCIV";
        HashMap<Character, Integer> conversor = new HashMap<>();
        conversor.put('I', 1);
        conversor.put('V', 5);
        conversor.put('X', 10);
        conversor.put('L', 50);
        conversor.put('C', 100);
        conversor.put('D', 500);
        conversor.put('M', 1000);
        int soma = conversor.get(s.charAt(s.length() - 1));
        for (int i = s.length()-2; i >=0; i--) {
            if (conversor.get(s.charAt(i)) < conversor.get(s.charAt(i+1))){
                    soma -= conversor.get(s.charAt(i));
            } else {
                soma += conversor.get(s.charAt(i));
            }

        }
        System.out.println(soma);
    }
}

