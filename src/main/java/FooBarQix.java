import java.util.LinkedHashMap;
import java.util.Map;

public class FooBarQix {

    private LinkedHashMap<Integer, String> mapNumToFig = new LinkedHashMap<Integer, String>();

    public FooBarQix(){
        mapNumToFig.put(3, "Foo");
        mapNumToFig.put(5, "Bar");
        mapNumToFig.put(7, "Qix");
    }

    public String generate(int number) {
        String res = "";
        for (Map.Entry<Integer, String> entry : mapNumToFig.entrySet()){
            if(number % entry.getKey() == 0){
                res += entry.getValue();
            }
        }

        String numberAsString = String.valueOf(number);

        for (Map.Entry<Integer, String> entry : mapNumToFig.entrySet()){
            if(numberAsString.contains(String.valueOf(entry.getKey()))){
                res += entry.getValue();
            }
        }

        return res == "" ? numberAsString: res;
    }
}
