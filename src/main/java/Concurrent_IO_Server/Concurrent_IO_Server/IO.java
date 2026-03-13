package Concurrent_IO_Server.Concurrent_IO_Server;

import src.engine.Framework;
import src.engine.Framework_Ptr;

import com.sun.jna.Pointer;

import CLIBConcurrentServerIO.CLIBConcurrentServerIO;

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
	public static void flip_Input_DoubleBuffer(Pointer obj)
	{
		CLIBConcurrentServerIO.INSTANCE.flip_Input_DoubleBuffer(obj);
	}
	public static void pop_From_Stack_Of_Output(Pointer obj)
	{
		CLIBConcurrentServerIO.INSTANCE.pop_From_Stack_Of_Output(obj);
	}
	public static void push_To_Stack_Of_Input(Pointer obj)
	{
		CLIBConcurrentServerIO.INSTANCE.push_To_Stack_Of_Input(obj);
	}
	public static void select_set_Intput_Subset(short praiseID)
	{
		CLIBConcurrentServerIO.INSTANCE.select_set_Intput_Subset(stat_get_Framework_Ptr(), praiseID);
	}
		// get.
	public static Pointer dyn_get_Framework_Ptr()
	{
		return stat_get_Framework_Ptr();
	}
	public static boolean get_flag_isStackLoaded_Server_InputAction(Pointer obj)
	{
		return CLIBConcurrentServerIO.INSTANCE.get_flag_isStackLoaded_Server_InputAction(obj);
	}
	public static boolean get_flag_isLoaded_Stack_OutputSend(Pointer obj)
	{
		return CLIBConcurrentServerIO.INSTANCE.get_flag_isLoaded_Stack_OutputSend(obj);
	}
	public static boolean get_flag_IsInitialised_OpenAvrilConcurrencyConcurrency(Pointer obj)
	{
		return CLIBConcurrentServerIO.INSTANCE.get_flag_IsInitialised_OpenAvrilConcurrencyConcurrency(obj);
	}
	public static Pointer get_program_WriteEnableStack_ServerInputAction(Pointer obj)
	{
		return CLIBConcurrentServerIO.INSTANCE.get_program_WriteEnableStack_ServerInputAction(obj);
	}
	public static Pointer get_program_WriteEnableStack_ServerOutputRecieve(Pointer obj)
	{
		return CLIBConcurrentServerIO.INSTANCE.get_program_WriteEnableStack_ServerOutputRecieve(obj);
	}
		// set.
// Praise Event Id
	public static short get_PraiseEventId(Pointer obj) 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_PraiseEventId(obj);
	}
	public static void set_PraiseEventId(Pointer obj, short newPraiseID)
	{
		CLIBConcurrentServerIO.INSTANCE.set_PraiseEventId(obj, newPraiseID);
	}
// Praise_0.
	public static float get_Input_Subset_praise0_REG_valueA()
	{
		return CLIBConcurrentServerIO.INSTANCE.get_Input_Subset_praise0_REG_valueA();
	}
	public static float get_Input_Subset_praise0_REG_valueB()
	{
		return CLIBConcurrentServerIO.INSTANCE.get_Input_Subset_praise0_REG_valueB();
	}
	public static void set_Input_Subset_praise0_REG_valueA(float newValue)
	{
		CLIBConcurrentServerIO.INSTANCE.set_Input_Subset_praise0_REG_valueA(newValue);;
	}
	public static void set_Input_Subset_praise0_REG_valueB(float newValue)
	{
		CLIBConcurrentServerIO.INSTANCE.set_Input_Subset_praise0_REG_valueB(newValue);;
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