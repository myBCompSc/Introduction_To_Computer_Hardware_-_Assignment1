package shell_for_an_adder_dll;

import CLIBAdder.CLIBAdder;
import src.engine.Framework;
import src.engine.Framework_Ptr;
import com.sun.jna.Pointer;

public class IO 
{
// classes.
	public static Framework _framework = null;
	
// registers.

// pointers.
	public static Pointer _framework_Ptr = null;
		
// constructor.

// public.
	// dynamic.
	public static Pointer generate_Program()
	{
		System.out.printf("entered dll.IO generate_Program().%n");
		stat_create_Framework();
		try {
			stat_get_Framework().initalise(stat_get_Framework());
		} 
		catch (NullPointerException e) {
			System.out.printf("wait for constructor(s) under top level.%n");
		}
		try {
			stat_create_framework_Ptr(_framework_Ptr);
		} 
		catch (IllegalArgumentException e) {
			System.out.printf("wait for top level obj_Pointer to not be null.%n");
		}
		System.out.printf("exiting dll.IO generate_Program().%n");
		return stat_get_Framework_Ptr();
	}
	public static double do_Add(Pointer obj)
	{
		return CLIBAdder.INSTANCE.do_Add(obj);
	}
	public static float get_Input_Subset_praise0_valueA(Pointer obj)
	{
		return CLIBAdder.INSTANCE.get_Input_Subset_praise0_valueA(obj);
	}
	public static float get_Input_Subset_praise0_valueB(Pointer obj)
	{
		return CLIBAdder.INSTANCE.get_Input_Subset_praise0_valueB(obj);
	}
	public static void set_Input_Subset_praise0_valueA(Pointer obj, float newValue)
	{
		CLIBAdder.INSTANCE.set_Input_Subset_praise0_valueA(obj, newValue);
	}
	public static void set_Input_Subset_praise0_valueB(Pointer obj, float newValue)
	{
		CLIBAdder.INSTANCE.set_Input_Subset_praise0_valueB(obj, newValue);
	}
// private.
	// dynamic.
		// create.
		// get.
		// set.
	// static.
		// create.
	private static void stat_create_Framework() 
	{
		Framework _framework = new Framework();
		try {
			stat_get_Framework();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
	private static void stat_create_framework_Ptr(Pointer p) 
	{
		Framework_Ptr _framework_Ptr = new Framework_Ptr(p);
		while(stat_get_Framework_Ptr() == null) { }//high level hardware.
		/*
		try {
			stat_get_Framework();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}//high level software.
		 */
	}
		// get.
	private static Framework stat_get_Framework()
	{
		return _framework;
	}
	public static Pointer stat_get_Framework_Ptr()
	{
		return _framework_Ptr;
	}
		// set.
}