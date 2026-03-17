package engine;

import math.*;
import com.sun.jna.Pointer;

public class Execute 
{
// definitions.
	// classes.
	private static Execute_Control _CLASS_Execute_Control = null;
	// registers.

	// programs.
	private static Pointer _PGM_LibAdder = null;
	
// constructor.
	public Execute()
	{
		System.out.printf("entered CLASS Execute()%n");
		
		System.out.printf("exiting CLASS Execute()%n");
	}
	
// public.
	// dynamic.
	public void initalise_Control()
	{
		stat_CLASS_create_Execute_Control();
	}
	public void initialise_Programs()
	{
		System.out.printf("entered Execute initialise_Programs().%n");
		LIBADDER_API lib_Adder = LIBADDER_API.INSTANCE;
		_PGM_LibAdder = (Pointer)lib_Adder.generate_Program();
		try {
			stat_PGM_get_LibAdder();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		System.out.printf("exiting Execute initialise_Programs().%n");
	}
		// get.
	public Execute_Control dyn_CLASS_get_Execute_Control()
	{
		return stat_CLASS_get_Execute_Control();
	}

	public Pointer dyn_PGM_get_LibAdder_ptr()
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
		_CLASS_Execute_Control = new Execute_Control();
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
			// set.
		// programs.
			// create.
			// get.
			// set.
}