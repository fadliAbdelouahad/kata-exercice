import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> generate(int number) {
        List<Integer> res = new ArrayList<Integer>();
        int divisor = 2;
        while (number > 1){
            while (number % divisor == 0){
                res.add(divisor);
                number /= divisor;
            }
            divisor ++;
        }
        return res;
    }
}
