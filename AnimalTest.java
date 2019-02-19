// Post creation of extra remote
/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // Test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException 
    {
    	// Create animal
    	Animal animal = new Animal("pink", "Ellie", 12_000, 108);
    	
    	// Test getter methods
    	Assert.assertEquals(animal.getColor(), "pink");
    	Assert.assertEquals(animal.getName(), "Ellie");
    	double actual = 108;
    	Assert.assertEquals(animal.getHeight(), actual);
    	actual = 12_000;
    	Assert.assertEquals(animal.getWeight(), actual);
    	
    	// Test toString method
    	Assert.assertEquals(animal.toString(), "Ellie, a pink-colored animal. 12000.0 pounds, 108.0 inches\n");
    }
    
    // Test equals method
    public void equalsMethodTest() throws AssertException
    {
    	// Create animals
    	Animal animal1 = new Animal("red", "Cardi", 0.03, 9);
    	Animal animal2 = new Animal("red", "Cardi", 0.03, 9);
    	
    	// Test equals method
    	Assert.assertEquals(animal1.equals(animal2), true);
    }
}

