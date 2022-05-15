package PatternAdapter.StandardImpl;

import PatternAdapter.Standard.Standard;

public class StandardImpl1 implements Standard {
    @Override
    public void operation(int nb1, int nb2) {
        double result = nb1 %5 * nb2 % 2;
        System.out.println("First Standard Implementation");
        System.out.printf("Result = %.3f", result);
        System.out.println("");
    }
}
