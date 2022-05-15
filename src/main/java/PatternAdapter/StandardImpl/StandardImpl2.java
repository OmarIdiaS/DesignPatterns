package PatternAdapter.StandardImpl;

import PatternAdapter.Standard.Standard;

public class StandardImpl2 implements Standard {

    @Override
    public void operation(int nb1, int nb2) {
        double result = nb1 / 2 + nb2;
        System.out.println("Second Standard Implementation");
        System.out.println("Result = " + result);
    }
}
