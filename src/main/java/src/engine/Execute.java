package src.engine;
import com.sun.jna.Pointer;

import CLIBConcurrentServerIO.CLIBConcurrentServerIO;
import CLIBLaunchEnableForConcurrentThreadsAtSERVER.CLIBLaunchEnableForConcurrentThreadsAtSERVER;
import CLIBWriteEnableForThreadsAtSERVERINPUTACTION.CLIBWriteEnableForThreadsAtSERVERINPUTACTION;
import CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE.CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE;
import Concurrent_IO_Server.Concurrent_IO_Server.IO;

public class Execute 
{
// classes.
	private static Execute_Control _Execute_Control = null;
	private static Pointer _CLIBConcurrentServerIO = null;
	private static Pointer _CLIBLaunchEnableForConcurrentThreadsAtSERVER = null;
	private static Pointer _CLIBWriteEnableForThreadsAtSERVERINPUTACTION = null;
	private static Pointer _CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE = null;
// registers.

// programs.
	private static Pointer _pgmID_ConcurrentServer;
	
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

		stat_REG_create_pgmID_CLIBLaunchEnableForConcurrentThreadsAtSERVER();
		try {
			stat_REG_get_pgmID_CLIBLaunchEnableForConcurrentThreadsAtSERVER();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		
		stat_REG_create_CLIBWriteEnableForThreadsAtSERVERINPUTACTION();
		try {
			stat_REG_get_pgmID_CLIBWriteEnableForThreadsAtSERVERINPUTACTION();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		
		stat_REG_create_CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE();
		try {
			stat_REG_get_pgmID_CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		
		stat_CLASS_create_CLIBConcurrentServerIO();
		try {
			stat_CLASS_get_CLIBConcurrentServerIO();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
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
	private static void stat_CLASS_create_CLIBConcurrentServerIO()
	{
		CLIBConcurrentServerIO _CLIBConcurrentServerIO = new CLIBConcurrentServerIO();
		try {
			stat_CLASS_get_CLIBConcurrentServerIO();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
	private static void stat_REG_create_pgmID_CLIBLaunchEnableForConcurrentThreadsAtSERVER()
	{
		CLIBLaunchEnableForConcurrentThreadsAtSERVER _CLIBLaunchEnableForConcurrentThreadsAtSERVER = new CLIBLaunchEnableForConcurrentThreadsAtSERVER();
		try {
			stat_REG_get_pgmID_CLIBLaunchEnableForConcurrentThreadsAtSERVER();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
	private static void stat_REG_create_CLIBWriteEnableForThreadsAtSERVERINPUTACTION()
	{
		CLIBWriteEnableForThreadsAtSERVERINPUTACTION _CLIBWriteEnableForThreadsAtSERVERINPUTACTION = new CLIBWriteEnableForThreadsAtSERVERINPUTACTION();
		try {
			stat_REG_get_pgmID_CLIBWriteEnableForThreadsAtSERVERINPUTACTION();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
	private static void stat_REG_create_CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE()
	{
		CLIBConcurrentServerIO _CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE = new CLIBConcurrentServerIO();
		try {
			stat_REG_get_pgmID_CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
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
	public static Pointer stat_CLASS_get_CLIBConcurrentServerIO() 
	{
		return _CLIBConcurrentServerIO;
	}
	private static Pointer stat_REG_get_pgmID_CLIBLaunchEnableForConcurrentThreadsAtSERVER()
	{
		return _CLIBLaunchEnableForConcurrentThreadsAtSERVER;
	}
	private static Pointer stat_REG_get_pgmID_CLIBWriteEnableForThreadsAtSERVERINPUTACTION()
	{
		return _CLIBWriteEnableForThreadsAtSERVERINPUTACTION;
	}
	private static Pointer stat_REG_get_pgmID_CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE()
	{
		return _CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE;
	}
	private static Execute_Control stat_get_Execute_Control()
	{
		return _Execute_Control;
	}
		// set.
}






