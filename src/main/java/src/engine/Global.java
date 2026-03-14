package src.engine;

import src.engine.Framework;

import com.sun.jna.Pointer;
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
	public static float bytesToFloat(byte[] bytes) 
	{
	    ByteBuffer buf = ByteBuffer.allocate(4);
	    buf.put(bytes);
	    buf.rewind();
	    return buf.getFloat();
	}
    public static byte[] floatToBytes(float value, ByteOrder order) 
    {
        ByteBuffer buffer = ByteBuffer.allocate(4).order(order);
        buffer.putFloat(value);
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
		char _numberOfCores = 4;
	}
	private static void stat_REG_create_numberOfPraises()
	{
		System.out.printf("entering member function stat_REG_create_numberOfPraises()%n");
		char _numberOfPraises = 1;
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