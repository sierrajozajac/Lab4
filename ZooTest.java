/**
 * Testing class for Product object
 *
 * @author Sierra Jo Sallee
 * @version 2019-02-07
 */
public class ZooTest
{
    /**
     * Test the empty Animal constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
        // Use the default constructor
    	Zoo zoo = new Zoo(3);
    	Animal Ellie = new Animal("pink", "Ellie", 12_000, 108);
    	Animal Cardi = new Animal("red", "Cardi", 0.03, 9);
    	Animal MooMoo = new Animal("black and white", "MooMoo", 1_600, 59);
    	zoo.addAnimal(Ellie);
    	zoo.addAnimal(Cardi);
    	zoo.addAnimal(MooMoo);
    	
        // Test getter methods
    	double totalHeight = 108 + 9 + 59; 
    	double totalWeight = 12_000 + 0.03 + 1_600;
    	double averageWeight = totalWeight / 3; 
    	int avgWeight = (int) Math.round(averageWeight);
    	Assert.assertEquals(zoo.getTotalHeight(), totalHeight);
    	Assert.assertEquals(zoo.getAverageWeight(), avgWeight);
    	int actualDouble = 12000;
    	Assert.assertEquals(zoo.getAverageWeight("pink"), actualDouble);
    	int actualInt = 3;
    	Assert.assertEquals(zoo.getCapacity(), actualInt);
    	
    	// Test toString method
    	String zooString = "These animals live in the zoo: \n" + Ellie.toString() + Cardi.toString() + MooMoo.toString();
    	Assert.assertEquals(zoo.toString(), zooString);
    }
    
    public void internalMethodsTest() throws AssertException
    {
        // Use the default constructor
    	Zoo zoo = new Zoo(3);
    	Animal Ellie = new Animal("pink", "Ellie", 12_000, 108);
    	Animal Cardi = new Animal("red", "Cardi", 0.03, 9);
    	Animal MooMoo = new Animal("black and white", "MooMoo", 1_600, 59);
    	zoo.addAnimal(Ellie);
    	zoo.addAnimal(Cardi);
    	zoo.addAnimal(MooMoo);
    	
    	// Test internal methods
    	Animal Buddy = new Animal("black and white", "Buddy", 20, 11);
    	zoo.addAnimal(Buddy);
    	int averageBlackAndWhiteWeight = (1_600 + 20) / 2; // This is 810.0
    	int actualInt = 6;
    	Assert.assertEquals(zoo.getCapacity(), actualInt);
    	Assert.assertEquals(zoo.getAverageWeight("black and white"), averageBlackAndWhiteWeight);
    }
}