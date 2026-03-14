package src.engine;

import com.sun.jna.Pointer;

import src.CLIBAdder.*;
import src.Main.Framework_Ptr;

public class Execute 
{
// definitions.
	// classes.
	private static Execute_Control _CLASS_Execute_Control = null;
	// registers.

	// programs.
	private static Pointer _PGM_LibAdder = null;
	private static PGM_LibAdder_Ptr _Ptr_PGM_LibAdder = null;
	
// constructor.
	public Execute()
	{
		System.out.printf("entered CLASS Execute()%n");
		
		System.out.printf("exiting CLASS Execute()%n");
	}
	
// public.
	// dynamic.
	public void initalise_Control(Execute obj)
	{
		stat_CLASS_create_Execute_Control();
	}
	public void initialise_Programs(Framework_Ptr obj)
	{
		System.out.printf("entered initialise_Programs().%n");
		System.out.printf("entered dll.IO generate_Program().%n");
		Pointer _PGM_LibAdder = LIBADDER_API.INSTANCE.generate_Program();
		try {
			stat_PGM_get_LibAdder();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		
		try {
			stat_Ptr_PGM_create_LibAdder(stat_PGM_get_LibAdder());
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		try {
			//stat_Ptr_PGM_get_LibAdder().initalise(stat_Ptr_PGM_get_LibAdder());
		} 
		catch (NullPointerException e) {
			System.out.printf("wait for constructor(s) under top level.%n");
		}
		System.out.printf("exiting initialise_Programs().%n");
	}
		// get.
	public Execute_Control class_get_Execute_Control()
	{
		return stat_CLASS_get_Execute_Control();
	}
	public Pointer _PGM_get_LibAdder_ptr()
	{
		return stat_PGM_get_LibAdder();
	}
		// set.
	// static.
		// get.
		// set.

//private.
	// dynamic.
		// create.
	    // get.
	    // set.
	// static.
		// classes.
			// create.
	private static void stat_CLASS_create_Execute_Control()
	{
		Execute_Control _Execute_Control = new Execute_Control();
		try {
			stat_CLASS_get_Execute_Control();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
			// get.
			// set.
		// registers.
			// create.
			// get.
	private static Execute_Control stat_CLASS_get_Execute_Control()
	{
		return _CLASS_Execute_Control;
	}
	private static Pointer stat_PGM_get_LibAdder()
	{
		return _PGM_LibAdder;
	}
	private static PGM_LibAdder_Ptr stat_Ptr_PGM_get_LibAdder()
	{
		return _Ptr_PGM_LibAdder;
	}
			// set.
		// programs.
			// create.
	private static void stat_PGM_create_LibAdder()
	{
		Pointer _PGM_LibAdder = CLIBAdder.INSTANCE.generate_Program();
	}
	private static void stat_Ptr_PGM_create_LibAdder(Pointer p)
	{
		PGM_LibAdder_Ptr _PGM_LibAdder_ptr = new PGM_LibAdder_Ptr(p);
		//while(stat_Ptr_PGM_get_LibAdder() == null) { }//high level hardware.
		try {
			stat_Ptr_PGM_get_LibAdder();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}//high level software.
	}
			// get.
			// set.

}