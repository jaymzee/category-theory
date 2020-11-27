import java.util.List;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

public class Function {
    public static void each(DoubleUnaryOperator f, List<Double> nums) {
        for (double num : nums) {
            System.out.println(f.applyAsDouble(num));
        }
    }

    public static void main(String[] args) {
        var nums = Arrays.asList(1.0, 2.1, 3.14);
        each(x -> x * x, nums);
        each(x -> x + 1, nums);
    }
}
