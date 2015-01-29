package de.proxy.folder;

import java.util.logging.Logger;

public class ProxyApp {
    private static final Logger LOGGER = Logger.getLogger("ProxyApp");

    private ProxyApp() {

    }

    public static void main(String[] args) {
        // If we give correct userName and password
        User user = new User("arpit", "arpit");
        ProxyFolder folderProxy = new ProxyFolder(user);
        LOGGER.fine("When userName and password are correct:");
        folderProxy.performOperations();
        LOGGER.fine("**************************************");
        // if we give wrong userName and Password
        User userWrong = new User("abc", "abc");
        ProxyFolder folderProxyWrong = new ProxyFolder(userWrong);
        LOGGER.fine("When userName and password are incorrect:");
        folderProxyWrong.performOperations();

    }
}
