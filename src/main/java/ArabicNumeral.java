import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicNumeral {
    LinkedHashMap<String, Integer> SYMBOLS = new LinkedHashMap();

    public ArabicNumeral(){
        SYMBOLS.put("M", 1000);
        SYMBOLS.put("CM", 900);
        SYMBOLS.put("D", 500);
        SYMBOLS.put("CD", 400);
        SYMBOLS.put("C", 100);
        SYMBOLS.put("XC", 90);
        SYMBOLS.put("L", 50);
        SYMBOLS.put("XL", 40);
        SYMBOLS.put("X", 10);
        SYMBOLS.put("IX", 9);
        SYMBOLS.put("IV", 4);
        SYMBOLS.put("I", 1);
    }
    public Integer convert(String romain) {
        Integer arabic = 0;
        while (romain.length() > 0){
            for(Map.Entry<String, Integer> entry: SYMBOLS.entrySet()){
                if (romain.startsWith(entry.getKey())){
                        arabic += entry.getValue();
                        romain = romain.substring(entry.getKey().length());
                    }
                }
            }
        return arabic;
    }
}
