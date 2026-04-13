package introduction_to_hardware.assignment_1__the_dll;

import engine.Framework;
import engine.Global;
import main.Math;

public class Assignment_1__the_dll {

    	private static Framework pgmPtr_MathApp = null;
	
	public static void main(String[] args) 
	{
		System.out.printf("entered first member function, main()%n");
		pgmPtr_MathApp = Math.app_generate_Program();
		System.out.printf("%n");
		System.out.printf("        ,     \\      /      ,%n");
		System.out.printf("       / \\    )\\ __ /(     / \\ %n");
		System.out.printf("      /   \\   (_\\  /_)    /   \\ %n");
		System.out.printf("____ / ____\\__ \\@  @/ ___/_____\\_____%n");
		System.out.printf("|              |\\../|               |%n");
		System.out.printf("|               \\VV/                |%n");
		System.out.printf("| Introduction To Computer Systmes  |%n");
		System.out.printf("|  - High Level Hardware Language.  |%n");
		System.out.printf("|      A Dynamic Link Library.      |%n");
		System.out.printf("|___________________________________|%n");
		System.out.printf("|    / \\ /        \\\\        \\ /\\    |%n");
		System.out.printf("|  /    V          ))        V   \\  |%n");
		System.out.printf("|/                //               \\|%n");
		System.out.printf("`                 V                 '%n");
		System.out.printf("%n");
		System.out.printf("==========%n");
		System.out.printf("decliration.%n");
		System.out.printf("definition.%n");
		System.out.printf("substanciation.%n");
		System.out.printf("initialisation.%n");
		System.out.printf("instanciation.%n");
		System.out.printf("running.%n");
		System.out.printf("==========%n");
		System.out.printf("SIMULATION%n");

		Math.app_PRAISE_set_Input_value_a(Global.stat_CONVERT_Float_To_Bytes((float)(1.2)));
		Math.app_PRAISE_set_Input_value_b(Global.stat_CONVERT_Float_To_Bytes((float)(2.6)));

		Math.app_FUNCT_add_a_b();
		System.out.printf("a + b = " + Global.stat_CONVERT_Bytes_To_Double(Math.app_PRAISE_get_Output_value()));

		Math.app_FUNCT_divide_a_b();
		System.out.printf("a / b = " + Global.stat_CONVERT_Bytes_To_Double(Math.app_PRAISE_get_Output_value()));

		Math.app_FUNCT_multiply_a_b();
		System.out.printf("a * b = " + Global.stat_CONVERT_Bytes_To_Double(Math.app_PRAISE_get_Output_value()));

		Math.app_FUNCT_multiply_a_b();
		System.out.printf("a - b = " + Global.stat_CONVERT_Bytes_To_Double(Math.app_PRAISE_get_Output_value()));
	}
}
