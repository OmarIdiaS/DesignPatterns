package PatternComposite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Component addComponent(Component component){
        component.level = level + 1;
        component.parent = this;
        components.add(component);
        return component;
    }

    public void remove(Component component){
        components.remove(component);
    }

    public List<Component> getChilds(){
        return components;
    }

    public void view(){
        String tab = tabulationLevel();
        System.out.println(tab + " > Folder : " + name);
        components
                .stream()
                .forEach(e -> e.view());
    }

}
