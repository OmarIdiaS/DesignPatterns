package PatternComposite;

public abstract class Component {
    protected String name;
    protected int level;

    protected Folder parent;

    public Component(String name){
        this.name = name;
    }

    public abstract void view();

    public void getParent(){
        System.out.println("Parent name : " + parent.name);
    }

    public String tabulationLevel(){
        String str= "";
        for(int i = 0; i < level; i++){
            str += "\t";
        }

        return str;
    }

}
