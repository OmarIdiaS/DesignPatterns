package PatternStrategy.Strategy;

public class StrategyImpl1 implements IStrategy{
    @Override
    public void applyStrategy() {
        System.out.println("Etape intermédiaire de l'algo avec la statégie 1");
    }
}
