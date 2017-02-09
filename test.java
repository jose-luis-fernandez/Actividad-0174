

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    private Comida comida1;
    private Comida comida2;
    private Comida comida3;
    private Comida comida4;
    private Comida comida5;
    private Persona persona1;

    
    
    
    

    /**
     * Default constructor for test class test
     */
    public test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        comida1 = new Comida("a", 10);
        comida2 = new Comida("b", 20);
        comida3 = new Comida("c", 30);
        comida4 = new Comida("d", 40);
        comida5 = new Comida("e", 50);
        persona1 = new Persona("Juan", true, 70, 175, 24);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
