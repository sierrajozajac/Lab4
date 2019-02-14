/**
 * Testing class for Product object
 *
 * @author Sierra Jo Sallee
 * @version 2019-02-07
 */
public class EquipmentTest
{
    /**
     * Test the empty Animal constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
        // Use the default constructor
        Equipment equipment = new Equipment("Computer/1,5,1000,Powerful and confusing.");

        // Test getter methods
        Assert.assertEquals(equipment.getName(), "Computer");
        int actualInt = 1;
        Assert.assertEquals(equipment.getCount(), actualInt);
        double actualDouble = 5;
        Assert.assertEquals(equipment.getTotalWeight(), actualDouble);
        actualDouble = 1000;
        Assert.assertEquals(equipment.getTotalPrice(), actualDouble);
        Assert.assertEquals(equipment.getDescription(), "Powerful and confusing.");
        
        // Test toString method
        String actual = "Name: Computer, Number: 1, Weight: 5.00 lbs, Price: $1000.00 - Powerful and confusing.";
        Assert.assertEquals(equipment.toString(), actual);
    }
    
    // Test equals method
    public void equalsMethodTest() throws AssertException
    {
    	// Create equipment
    	Equipment equip1 = new Equipment("Mjolnir/1,42.3,20000,not for you");
    	Equipment equip2 = new Equipment("Mjolnir/1,42.3,20000,not for you");
    	
    	// Test equals method
    	Assert.assertEquals(equip1.equals(equip2), true);
    }
}