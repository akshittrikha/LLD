package designPatterns.CompositeDesign.WithoutCompositeDesign;

import java.util.List;
import java.util.ArrayList;

public class Directory {
    String directoryName;
    List<Object> children;

    Directory(String name) {
        this.directoryName = name;
        children = new ArrayList<Object>();
    }

    public void addChild(Object obj) {
        children.add(obj);
    }

    public void ls() {
        System.out.println("Directory name: " + this.directoryName);

        for(Object child: children) {
            if (child instanceof File) {
                ((File) child).ls();
            }

            if (child instanceof Directory) {
                ((Directory) child).ls();
            }
        }
    }
}