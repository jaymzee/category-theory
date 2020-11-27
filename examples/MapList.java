import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MapList {
    public static void main(String[] args) {
        var nums1 = Arrays.asList(1,2,3);
        System.out.println(nums1.getClass());

        var nums2 = nums1.stream()
            .map(x -> x * x)
            .collect(Collectors.toList());
        System.out.println(nums2);

        var nums3 = nums2.stream()
            .map(x -> x + 1)
            .collect(Collectors.toList());
        System.out.println(nums3);
    }
}
