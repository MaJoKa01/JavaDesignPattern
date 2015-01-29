package de.adapter.volt;

import java.util.logging.Logger;

public class VoltApp {

    private static final Logger LOGGER = Logger.getLogger("VoltApp");

    private VoltApp(){
        
    }
    
    public static void main(String[] args) {
       SocketClassAdapter classAdapter = new SocketClassAdapter();
       SocketObjectAdapter objectAdapter = new SocketObjectAdapter();
       LOGGER.fine("Starting VoltApp!");
       classAdapter.get120Volt();
       objectAdapter.get120Volt();
      
       classAdapter.get12Volt();
       objectAdapter.get12Volt();
      
       classAdapter.get3Volt();
       objectAdapter.get3Volt();
      
    }

}
