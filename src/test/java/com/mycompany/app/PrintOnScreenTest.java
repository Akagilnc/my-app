package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by deronlee on 3/3/16.
 */
public class PrintOnScreenTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrintOnScreenTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrintOnScreenTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrintOnScreen()
    {
        boolean result;
        PrintOnScreen printOnScreen = new PrintOnScreen();
        result = printOnScreen.print("Hello World");

        assertTrue( result );
    }
}
