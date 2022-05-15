package PatternMethodTemplate.MethodTemplate;

public abstract class MethodTemplate {
    public double operationTemplate() {
        int i = firstOperation();
        int j = 0;
        double somme = 0;
        while (j < i){
            somme += secondOperation(i);
            j++;
        }
        return somme;
    }

    protected abstract int firstOperation();

    protected abstract double secondOperation(int i);
}
