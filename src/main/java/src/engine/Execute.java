package src.engine;
import com.sun.jna.Pointer;

public class Execute 
{
// classes.
	private static Execute_Control _Execute_Control = null;
// registers.

// programs.

	
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
		stat_create_Execute_Control();
	}
	public void initialise_Programs()
	{
		System.out.printf("entered initialise_Programs().%n");

		System.out.printf("exiting initialise_Programs().%n");
	}
		// get.
	public Execute_Control get_Execute_Control()
	{
		return stat_get_Execute_Control();
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
		// create.
	private static void stat_create_Execute_Control()
	{
		Execute_Control _Execute_Control = new Execute_Control();
		try {
			stat_get_Execute_Control();
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
	private static Execute_Control stat_get_Execute_Control()
	{
		return _Execute_Control;
	}
		// set.
}






