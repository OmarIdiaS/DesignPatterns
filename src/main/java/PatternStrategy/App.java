package PatternStrategy;

import PatternStrategy.Strategy.DefaultStrategyImpl;
import PatternStrategy.Strategy.IStrategy;
import PatternStrategy.context.Context;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        Context context = new Context();
        boolean fin = false;
        Scanner scanner = new Scanner(System.in);

        while(!fin){
            System.out.print("Donner la stratégie");
            String strategyClassName = scanner.nextLine();
            IStrategy strategy;
            try{
                strategy = (IStrategy) Class.forName("PatternStrategy.Strategy." + strategyClassName).newInstance();
            }catch (ClassNotFoundException e){
                strategy = new DefaultStrategyImpl();
            }

            context.setStrategy(strategy);
            System.out.println("------------");
            context.process();
        }

    }
}
