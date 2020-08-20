import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {

    LinkedHashMap<Integer, String > DIGITS;

    RomanNumeral(){
        DIGITS = new LinkedHashMap<Integer, String>();
        DIGITS.put(1000, "M");
        DIGITS.put(900, "CM");
        DIGITS.put(500, "D");
        DIGITS.put(400, "CD");
        DIGITS.put(100, "C");
        DIGITS.put(50, "L");
        DIGITS.put(40, "XL");
        DIGITS.put(10, "X");
        DIGITS.put(9, "IX");
        DIGITS.put(5, "V");
        DIGITS.put(4, "IV");
        DIGITS.put(1, "I");

    }


    public String convert(Integer number) {
        String roman = "";

        for(Map.Entry<Integer, String> entry: DIGITS.entrySet()){
            while (number >= entry.getKey()){
                roman += entry.getValue();
                number -= entry.getKey();
            }
        }
        return roman;
    }
}
