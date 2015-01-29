package de.composite.filesystem;

import java.util.logging.Logger;

public class CompositeFileSystemDemo {

    private static final Logger LOGGER = Logger.getLogger("CompositeFileSystem");
    private CompositeFileSystemDemo() {
    }

    public static void main(String[] args) {
        LOGGER.fine("Composite FileSystem Demo!");
        Directory one = new Directory("dir111");
        Directory two = new Directory("dir222");
        Directory thr = new Directory("dir333");

        File a = new File("a");
        File b = new File("b");
        File c = new File("c");
        File d = new File("d");
        File e = new File("e");
        one.add(a);
        one.add(two);
        one.add(b);
        two.add(c);
        two.add(d);
        two.add(thr);
        thr.add(e);
        one.ls();
    }
}
