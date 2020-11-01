import java.util.List;
import java.util.ArrayList;
import io.github.jaymzee.categorytheory.*;

public class SumsAndProducts {
    public static void main(String[] args) {
        Product<Double, String> prod = new Product<>(5.0, "hello");
        System.out.printf("Product:\n");
        System.out.printf(" fst: %s\n", prod.getFst());
        System.out.printf(" snd: %s\n", prod.getSnd());

        List<Sum<Double,Boolean>> sums = new ArrayList<Sum<Double,Boolean>>();
        sums.add(new Inl<>(3.14));
        sums.add(new Inr<>(false));
        System.out.printf("\nSum:\n");
        sums.forEach(v -> {
            System.out.printf(" caseExpr: %s\n", v.caseExpr(
                (Double y) -> "inl: " + y.toString(),
                (Boolean b) -> "inr: " + b.toString()
            ));
        });
        System.out.printf("new version!!\n");
    }
}
