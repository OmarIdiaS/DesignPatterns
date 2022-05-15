package PatternAdapter.OldImplementation;

public class OldImplementation {

    public double sum(int nb1, double nb2){
        return nb1 * 2 / nb2;
    }

    public void print(double result){
        System.out.printf("Result from the old standard implementation = %.3f ", result);
        System.out.println("");
    }
}
