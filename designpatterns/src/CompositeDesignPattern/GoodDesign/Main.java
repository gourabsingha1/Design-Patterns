package CompositeDesignPattern.GoodDesign;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Directory directory1 = new Directory("Folder1");
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.showDetails();
    }
}
