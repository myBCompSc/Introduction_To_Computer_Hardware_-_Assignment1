package engine;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Global
{
// definitions.
	// classes.
	// registers.
	private static char _numberOfCores;
	private static char _numberOfPraises;
	// programs.
	
// constructor.
	public Global() 
	{
		System.out.printf("entering Global()%n");
		stat_REG_create_numberOfCores();
		stat_REG_create_numberOfPraises();
		System.out.printf("exiting Global()%n");
	}
	
// public.
	// dynamic.
	public static float stat_BytesToFloat(byte[] bytes) 
	{
        // Ensure the array is exactly 4 bytes long, as a float is 32 bits (4 bytes)
        if (bytes.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.");
        }
        
        // Wrap the byte array in a ByteBuffer
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        
        // Set the byte order (optional, default is BIG_ENDIAN)
        // Use ByteOrder.LITTLE_ENDIAN if your source data requires it
        // buffer.order(ByteOrder.LITTLE_ENDIAN); 
        
        // Get the float value
        return buffer.getFloat();
	}
    public static byte[] stat_FloatToBytes(float value) 
    {
        // Allocate a ByteBuffer with 4 bytes (size of a float)
        ByteBuffer buffer = ByteBuffer.allocate(Float.BYTES);
        
        // Set to little-endian order
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        
        // Put the float into the buffer
        buffer.putFloat(value);
        // Return the byte array
        return buffer.array();
    }
		// get.
    public static char dyn_REG_get_numberOfCores()
	{
		return stat_REG_get_numberOfCores();
		
	}
    public static char dyn_REG_get_numberOfPraises()
	{
		return stat_REG_get_numberOfPraises();
	}
		// set.
	// static.
		// get.
		// set.

// private.
    // dynamic.
        // get.
        // set.
    // static.
		// classes.
			// create.
				// get.
			// set.
		// registers.
			// create.
	private static void stat_REG_create_numberOfCores()
	{
		System.out.printf("entering member function stat_REG_create_numberOfCores()%n");
		_numberOfCores = 4;
	}
	private static void stat_REG_create_numberOfPraises()
	{
		System.out.printf("entering member function stat_REG_create_numberOfPraises()%n");
		_numberOfPraises = 1;
	}
			// get.
	private static char stat_REG_get_numberOfCores() 
	{
		return _numberOfCores;
	}
	private static char stat_REG_get_numberOfPraises()
	{
		return _numberOfPraises;
	}
			// set.
		// programs.
			// create.
			// get.
			// set.
}