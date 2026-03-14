package src.Main;

import com.sun.jna.Pointer;

import src.CLIBAdder.CLIBAdder;
import src.CLIBAdder.LIBADDER_API;
import src.engine.Framework;
import src.engine.Global;

public class IO 
{
// definitions.
	// classes.
	public static Pointer _framework = null;
	// registers.
	// programs.
	public static Framework_Ptr _PGM_Framework_Ptr = null;
		
// constructor.

// public.
	// dynamic.
	public static Pointer generate_Program()
	{
		System.out.printf("entered dll.IO generate_Program().%n");
		stat_CLASS_create_Framework();
		try {
			stat_PTR_create_Framework(stat_CLASS_get_Framework());
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		return stat_CLASS_get_Framework();
	}
		// get.
		// set.
// Praise Event Id
	public static short get_PraiseEventId(Framework_Ptr obj) 
	{
		return 0;//stat_CLASS_get_Framework().;
	}
	public static void set_PraiseEventId(Framework_Ptr obj, short newPraiseID)
	{
		//stat_CLASS_get_Framework().;
	}
// Praise_0.
	public static void set_Input_Subset_praise0_REG_valueA(Framework_Ptr obj, String valueMangle)
	{
		byte[] bytes = valueMangle.getBytes();
		//stat_CLASS_get_Framework().;
	}
	public static void set_Input_Subset_praise0_REG_valueB(Framework_Ptr obj, String valueMangle)
	{
		byte[] bytes = valueMangle.getBytes();
		//stat_CLASS_get_Framework().;
	}
	public static float get_Output_Subset_praise0_REG_value(Framework_Ptr obj)
	{
		return 0;//stat_CLASS_get_Framework().;
	}
// private.
	// dynamic.
		// create.
		// get.
		// set.
	// static.
		// create.
	private static void stat_CLASS_create_Framework() 
	{
		Framework _framework = new Framework();
		try {
			stat_CLASS_get_Framework();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
	private static void stat_PTR_create_Framework(Pointer p)
	{
		Framework_Ptr _PGM_LibMath_Ptr = new Framework_Ptr(p);
		while (stat_PGM_get_Framework_Ptr() == null) { }
	}
		// get.
	private static Pointer stat_CLASS_get_Framework()
	{
		return _framework;
	}
	public static Framework_Ptr stat_PGM_get_Framework_Ptr()
	{
		return _PGM_Framework_Ptr;
	}
		// set.
}