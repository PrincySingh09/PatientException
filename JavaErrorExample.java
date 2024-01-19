public class JavaErrorExample
{
    public static void main(String[] args) 
    {
        try
        {
            createOutOfMemory();
        } catch (OutOfMemoryError e) 
        {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }
    }
    private static void createOutOfMemory() 
    {
        int arraySize = Integer.MAX_VALUE;
        int[] largeArray = new int[arraySize];
    }
}

