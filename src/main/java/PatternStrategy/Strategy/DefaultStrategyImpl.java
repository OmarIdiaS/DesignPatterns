package PatternStrategy.Strategy;

public class DefaultStrategyImpl implements IStrategy{
    @Override
    public void applyStrategy() {
        System.out.println("Etape intermédiaire de l'algo avec la statégie par défaut");
    }
}
