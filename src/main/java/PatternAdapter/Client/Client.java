package PatternAdapter.Client;

import PatternAdapter.Standard.Standard;

public class Client {
    private Standard standardInterface;

    public void process(int nb1, int nb2){
        standardInterface.operation(nb1, nb2);
    }

    public void setStandardInterface(Standard standardInterface) {
        this.standardInterface = standardInterface;
    }
}
