import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.function.DoubleUnaryOperator;

public class MapList {
    public static void foo(DoubleUnaryOperator f) {
        System.out.println(f.applyAsDouble(3.14));
    }

    public static void main(String[] args) {
        var nums1 = Arrays.asList(1, 2, 3);
        System.out.println(nums1.getClass());

        var nums2 = nums1.stream()
            .map(x -> x * x)
            .collect(Collectors.toList());
        System.out.println(nums2);

        var nums3 = nums2.stream()
            .map(x -> x + 1)
            .collect(Collectors.toList());
        System.out.println(nums3);

        foo(x -> x * x);
    }
}
