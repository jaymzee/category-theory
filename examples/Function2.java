import java.util.List;
import java.util.Arrays;

// define the interface instead of using java.util.function
interface Func {
    double apply(double x);
}

public class Function2 {
    public static void each(Func f, List<Double> nums) {
        for (double num : nums) {
            System.out.println(f.apply(num));
        }
    }

    public static void main(String[] args) {
        var nums = Arrays.asList(1.0, 2.1, 3.14);
        each(x -> x * x, nums);
        each(x -> x + 1, nums);
    }
}
