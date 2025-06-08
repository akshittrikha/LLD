package designPatterns.CompositeDesign.Solution1WithCompositeDesign;

import java.util.List;
import java.util.ArrayList;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> children;

    Directory(String name) {
        this.directoryName = name;
        children = new ArrayList<FileSystem>();
    }

    public void addChild(FileSystem child) {
        this.children.add(child);
    }

    public void ls() {
        System.out.println("Directory Name: " + this.directoryName);

        for (FileSystem child: this.children) {
            child.ls();
        }
    }
}