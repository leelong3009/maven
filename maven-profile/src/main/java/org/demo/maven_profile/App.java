package org.demo.maven_profile;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOGGER.info("Hellow world");
    }
}
