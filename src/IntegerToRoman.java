import java.util.HashMap;
import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String roman = "";
        int num =sc.nextInt();
        int numUnits = num%10;
        int numDozens = num/10%10;
        int numHundreds= num/100%10;
        int numThousands= num/1000%100;
        System.out.println(numUnits);
        System.out.println(numDozens);
        System.out.println(numHundreds);
        System.out.println(numThousands);
        HashMap <Integer,String> converterUnits = new HashMap<>();
        converterUnits.put(0,"");
        converterUnits.put(1,"I");
        converterUnits.put(2,"II");
        converterUnits.put(3,"III");
        converterUnits.put(4,"IV");
        converterUnits.put(5,"V");
        converterUnits.put(6,"VI");
        converterUnits.put(7,"VII");
        converterUnits.put(8,"VIII");
        converterUnits.put(9,"IX");


        HashMap <Integer,String> converterDozens = new HashMap<>();
        converterDozens.put(0,"");
        converterDozens.put(1,"X");
        converterDozens.put(2,"XX");
        converterDozens.put(3,"XXX");
        converterDozens.put(4,"XL");
        converterDozens.put(5,"L");
        converterDozens.put(6,"LX");
        converterDozens.put(7,"LXX");
        converterDozens.put(8,"LXXX");
        converterDozens.put(9,"XC");

        HashMap <Integer,String> converterHundreds = new HashMap<>();
        converterHundreds.put(0,"");
        converterHundreds.put(1,"C");
        converterHundreds.put(2,"CC");
        converterHundreds.put(3,"CCC");
        converterHundreds.put(4,"CD");
        converterHundreds.put(5,"D");
        converterHundreds.put(6,"DC");
        converterHundreds.put(7,"DCC");
        converterHundreds.put(8,"DCCC");
        converterHundreds.put(9,"CM");

        HashMap <Integer,String> converterThousand = new HashMap<>();
        converterThousand.put(0,"");
        converterThousand.put(1,"M");
        converterThousand.put(2,"MM");
        converterThousand.put(3,"MMM");

        String units = converterUnits.get(numUnits);
        String dozens = converterDozens.get(numDozens);
        String hundreds = converterHundreds.get(numHundreds);
        String thousands = converterThousand.get(numThousands);


        System.out.println(roman);
        sc.close();
    }
}
