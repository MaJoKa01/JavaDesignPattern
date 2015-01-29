package de.composite.filesystem;

import java.util.logging.Logger;

public class File implements AbstractFile {
    private static final Logger LOGGER = Logger.getLogger("File");
    private String mname;

    public File(String name) {
        mname = name;
    }

    public void ls() {
        LOGGER.fine("FileName: " + mname);
    }
}