package de.composite.filesystem;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Directory implements AbstractFile {

    private String mname;
    private List<AbstractFile> mfiles = new ArrayList<AbstractFile>();
    private static final Logger LOGGER = Logger.getLogger("Directory");

    public Directory(String name) {
        mname = name;
    }

    public void add(AbstractFile obj) {
        mfiles.add(obj);
    }

    public void ls() {
        LOGGER.fine("Directory: " + mname);
        for (int i = 0; i < mfiles.size(); ++i) {
            // Leverage the "lowest common denominator"
            AbstractFile obj = (AbstractFile) mfiles.get(i);
            obj.ls();
        }
    }
}