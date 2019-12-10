
import java.nio.*;
import java.nio.file.*;
/**
 * Test
 */
public class Test {

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: "+path.getFileName());
        System.out.println("Root is: "+path.getRoot());
    
        Path currentParent = path;
        while((currentParent = currentParent.getParent()) != null) {
            System.out.println("Current parent is: "+currentParent);
        }
    }
    public static void main(String[] args) {
        printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
        System.out.println();
        printPathInformation(Paths.get("armadillo/shells.txt"));
        System.out.println("otro");
        Path path1 = Paths.get("file1.txt");
        Path path2 = Paths.get("file2.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));

    }
}