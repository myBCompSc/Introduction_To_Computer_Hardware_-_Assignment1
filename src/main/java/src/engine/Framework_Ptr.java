package src.engine;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;

public class Framework_Ptr extends Structure
{
// classes.

// registers.

// constructor.
	public Framework_Ptr(Pointer p) 
	{
		super(p);
		System.out.printf("entered CONSTRUCTOR Framework_Ptr(Pointer p)%n");
		read();
		System.out.printf("exiting CONSTRUCTOR Framework_Ptr(Pointer p)%n");
	}

// public.
	// dynamic.
		// get.
		// set.
	// static.
		// get.
		// set.

// private.
	// dynamic.
		// get.
		// set.
	// static.
		// get.
		// set.
}