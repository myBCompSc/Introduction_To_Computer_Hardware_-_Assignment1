package engine;

import math.*;
import com.sun.jna.Pointer;

public class Execute 
{
	private static Pointer _stat_PGM_LibAdder;
// public.
	public Execute() 
	{
		System.out.printf("entered CLASS Execute()%n");
		stat_CLASS_boot0_DECLAIRE_Execute();
		stat_CLASS_boot1_DEFINE_Execute();
		stat_CLASS_boot3_INITIALISE_Execute();
		stat_REG_boot0_DECLAIRE_Execute();
		System.out.printf("exiting CLASS Execute()%n");
	}
	public void dyn_REG_boot1_DEFINE_Execute(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot1_DEFINE_Execute().%n");
		
		System.out.printf("exiting dyn_REG_boot1_DEFINE_Execute().%n");
	}
	public void dyn_REG_boot2_SUBSTANTIATE_Execute(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
		
		System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
	}
	public void dyn_REG_boot3_INITIALISE_Execute(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot3_INITIALISE_Execute().%n");
		
		System.out.printf("exiting dyn_REG_boot3_INITIALISE_Execute().%n");
	}
	public void dyn_REG_boot4_INSTANTIATE_Execute(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
		
		System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
	}
	public Pointer dyn_PGM_get_LibAdder_ptr()
	{
		return stat_PGM_get_LibAdder();
	}	
	public void stat_CLASS_boot0_DECLAIRE_Execute()
	{
		System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Execute().%n");
		
		System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Execute().%n");
	}
	private static void stat_CLASS_boot1_DEFINE_Execute()
	{
		System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute().%n");
		stat_PGM_boot1_DEFINE_LibraryPrograms();
		System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute().%n");
	}
	private static void stat_CLASS_boot3_INITIALISE_Execute()
	{
		System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute().%n");
		//stat_PGM_boot3_INITIALISE_LibraryPrograms();
		System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute().%n");
	}
	private static void stat_REG_boot0_DECLAIRE_Execute()
	{
		System.out.printf("entered stat_REG_boot0_DECLAIRE_Execute().%n");
		
		System.out.printf("exiting stat_REG_boot0_DECLAIRE_Execute().%n");
	}
// private.
	private static void stat_PGM_boot1_DEFINE_LibraryPrograms()
	{
		System.out.printf("entered Execute initialise_Programs().%n");
		_stat_PGM_LibAdder = null;
		System.out.printf("exiting Execute initialise_Programs().%n");
	}
	private static void stat_PGM_boot3_INITIALISE_LibraryPrograms()
	{
		System.out.printf("entered Execute initialise_Programs().%n");
		LIBADDER_API lib_Adder = LIBADDER_API.INSTANCE;
		_stat_PGM_LibAdder = (Pointer)lib_Adder.app_FUNCT_generate_Program();
		try {
			stat_PGM_get_LibAdder();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		System.out.printf("exiting Execute initialise_Programs().%n");
	}
	private static Pointer stat_PGM_get_LibAdder()
	{
		return _stat_PGM_LibAdder;
	}
}