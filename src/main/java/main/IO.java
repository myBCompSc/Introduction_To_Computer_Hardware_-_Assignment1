package main;

import engine.Framework;
import com.sun.jna.Pointer;
public class IO 
{
// definitions.
	// classes.
	public static Framework _framework = null;
	// registers.
	// programs.
		
// constructor.

// public.
	// dynamic.
	public static Framework generate_Program()
	{
		System.out.printf("entered dll.IO generate_Program().%n");
		stat_CLASS_create_Framework();
		stat_CLASS_get_framework().initalise(stat_CLASS_get_framework());
		System.out.printf("exiting dll.IO generate_Program().%n");
		return stat_CLASS_get_framework();
	}
		// get.
		// set.
// Praise_0.
	public static void set_Input_Subset_praise0_REG_valueA(Framework obj, byte[] bytes)
	{
		//obj.get_App().get_Execute().dyn_PGM_get_LibAdder_ptr();
	}
	public static void set_Input_Subset_praise0_REG_valueB(Framework obj, byte[] bytes)
	{

	}
	public static byte[] get_Output_Subset_praise0_REG_value(Framework obj)
	{
		return null;
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
		_framework = new Framework();
		try {
			stat_CLASS_get_framework();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
		// get.
	private static Framework stat_CLASS_get_framework()
	{
		return _framework;
	}
		// set.
}