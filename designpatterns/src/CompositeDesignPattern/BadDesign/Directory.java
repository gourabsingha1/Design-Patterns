package CompositeDesignPattern.BadDesign;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Directory {
    private String name;
    private List<File> files = new ArrayList<>();
    private List<Directory> directories = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addDirectory(Directory directory) {
        directories.add(directory);
    }

    public void showDetails() {
        System.out.println("Directory: " + name);
        for (File file : files) {
            file.showDetails();
        }
        for (Directory directory : directories) {
            directory.showDetails();
        }
    }
}
