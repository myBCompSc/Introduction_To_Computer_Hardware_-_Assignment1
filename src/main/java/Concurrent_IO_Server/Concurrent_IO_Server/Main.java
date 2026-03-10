package Concurrent_IO_Server.Concurrent_IO_Server;

import com.sun.jna.Pointer;

public class Main {
// classes.

// registers.

// constructor.

// public.
	// dynamic.
		// get.
		// set.
	// static.
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.printf("entered first member function, main().%n");
		Pointer pgmID_ConcurrentServer = IO.generate_Program();
		System.out.printf("==========%n");
		System.out.printf("decliration.%n");
		System.out.printf("definition.%n");
		System.out.printf("substanciation.%n");
		System.out.printf("initialisation.%n");
		System.out.printf("instanciation.%n");
		System.out.printf("running.%n");
		System.out.printf("==========%n");
		System.out.printf("SIMULATION%n");
		
		//SIMULATION TestBench.
		try {
			IO.set_PraiseEventId(pgmID_ConcurrentServer, (short) 0);
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		catch (NoClassDefFoundError e) {
			System.out.printf("NoClassDefFoundError.%n");
		}
		try {
			IO.select_set_Intput_Subset((short)Short.toUnsignedInt(IO.get_PraiseEventId(pgmID_ConcurrentServer)));
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		try {
			IO.set_Input_Subset_praise0_REG_valueA((float) 1.2);
		}
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		try {
			IO.set_Input_Subset_praise0_REG_valueB((float) 4.6);
		}
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		try {
			IO.flip_Input_DoubleBuffer(pgmID_ConcurrentServer);
		}
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		try {
			IO.push_To_Stack_Of_Input(pgmID_ConcurrentServer);
		}
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		
	}
		// get.
		// set.
}









