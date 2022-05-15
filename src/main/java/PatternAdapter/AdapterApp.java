package PatternAdapter;

import PatternAdapter.Adapter.Adapter;
import PatternAdapter.Client.Client;
import PatternAdapter.StandardImpl.StandardImpl1;
import PatternAdapter.StandardImpl.StandardImpl2;

public class AdapterApp {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStandardInterface(new StandardImpl1());
        client.process(4, 5);

        client.setStandardInterface(new StandardImpl2());
        client.process(4, 5);

        client.setStandardInterface(new Adapter());
        client.process(4, 5);
    }
}
