package PatternAdapter.Adapter;

import PatternAdapter.OldImplementation.OldImplementation;
import PatternAdapter.Standard.Standard;

public class Adapter implements Standard {
    OldImplementation oldImplementation = new OldImplementation();

    @Override
    public void operation(int nb1, int nb2) {
        double sumFromOldImplementation = oldImplementation.sum(nb1, nb2);
        oldImplementation.print(sumFromOldImplementation);
    }
}
