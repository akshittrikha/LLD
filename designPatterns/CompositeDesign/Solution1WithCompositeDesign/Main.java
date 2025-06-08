package designPatterns.CompositeDesign.Solution1WithCompositeDesign;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("File 1");
        File f2 = new File("File 2");
        File f3 = new File("File 3");
        File f4 = new File("File 4");

        Directory d1 = new Directory("Directory 1");
        Directory d2 = new Directory("Directory 2");

        d2.addChild(f1);
        d2.addChild(f2);
        d1.addChild(d2);
        d1.addChild(f3);

        d1.ls();
        d2.ls();
        f4.ls();
    }
}