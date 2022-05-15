package PatternMethodTemplate;

import PatternMethodTemplate.MethodTemplate.FirstImplTemplate;
import PatternMethodTemplate.MethodTemplate.SecondImplTemplate;
import PatternMethodTemplate.MethodTemplate.MethodTemplate;

public class ClientApp {
    public static void main(String[] args) {
        MethodTemplate firstTemplateMethod = new FirstImplTemplate();
        System.out.println(firstTemplateMethod.operationTemplate());

        MethodTemplate secondTemplateMethod = new SecondImplTemplate();
        System.out.println(secondTemplateMethod.operationTemplate());
    }
}
