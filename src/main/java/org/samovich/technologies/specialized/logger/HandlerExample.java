/**
 * @file HandlerExample.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/5/2014
 * 
 * Example of logger class with LOGGER object which is used to log messages.
 */

package org.samovich.technologies.specialized.logger;

import java.io.IOException;
import java.util.logging.*;

public class HandlerExample {

    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
    
    public static void main(String[] args) {
        
        /*
         * A ConsoleHandler records all the log messages to System.err. By 
         * default, a Logger is associated with this handler.
         */
        Handler consoleHandler = null;
        
        /*
         * A FileHandler is used to record all the log messages to a specific 
         * file or to a rotating set of files.
         */
        Handler fileHandler = null;
        
        try {
            //Creating consoleHandler and fileHandler
            consoleHandler = new ConsoleHandler();
            fileHandler  = new FileHandler("./javacodegeeks.log");
            
            //Assigning handlers to LOGGER object
            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);
            
            //Setting levels to handlers and LOGGER
            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);
            
            LOGGER.config("Configuration done.");
            
            //Console handler removed
            LOGGER.removeHandler(consoleHandler);
            LOGGER.log(Level.FINE, "Finer logged");
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
        
        LOGGER.finer("Finest example on LOGGER handler completed.");
    }

}
