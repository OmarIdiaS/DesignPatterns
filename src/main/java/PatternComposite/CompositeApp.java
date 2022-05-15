package PatternComposite;

public class CompositeApp {
    public static void main(String[] args) {
        Folder root = new Folder("Categories of Design Patterns");

        Folder f1 = new Folder("Création");
        Folder f2 = new Folder("Structure");
        Folder f3 = new Folder("Comportement");



        root.addComponent(f1);
        root.addComponent(f2);
        root.addComponent(f3);

        f1.addComponent(new File("Singleton Documentation"));
        f1.addComponent(new File("Builder Documentation"));

        f2.addComponent(new File("Composite Documentation"));
        f2.addComponent(new File("Decorator Documentation"));


        f3.addComponent(new File("Observer Documentation"));
        f3.addComponent(new File("Strategy Documentation"));


        root.view();

    }
}
