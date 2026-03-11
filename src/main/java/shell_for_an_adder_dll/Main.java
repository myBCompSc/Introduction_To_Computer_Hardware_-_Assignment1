package shell_for_an_adder_dll;

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
		Pointer pgmID_Adder = IO.generate_Program();
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
		IO.set_Input_Subset_parise0_valueA(pgmID_Adder, (float)4.6);
		IO.set_Input_Subset_parise0_valueB(pgmID_Adder, (float)1.2);
		double ans = IO.do_Add(pgmID_Adder);
		System.out.printf("answer = " + ans + "%n");
	}
		// get.
		// set.
}









