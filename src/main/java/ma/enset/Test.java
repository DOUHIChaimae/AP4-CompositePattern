package ma.enset;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("DesignPattern");
        Folder dossier1 = (Folder) root.addComponent(new Folder("Comportement"));
        Folder dossier2 = (Folder) root.addComponent(new Folder("Structure"));
        Folder dossier3 = (Folder) root.addComponent(new Folder("Création"));

        dossier1.addComponent(new File("Strategy"));
        dossier1.addComponent(new File("Observer"));
        dossier2.addComponent(new File("Decorator"));
        dossier2.addComponent(new File("Composite"));
        dossier2.addComponent(new File("Adapter"));
        dossier3.addComponent(new File("Singleton"));
        dossier3.addComponent(new File("Builder"));

        Folder dossier21 = (Folder) dossier2.addComponent(new Folder("Str21"));
        dossier21.addComponent(new File("C211"));

        root.show();
    }
}
