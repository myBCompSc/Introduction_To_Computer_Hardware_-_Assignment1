package engine;

import com.sun.jna.Pointer;
import lib.LIBMATH_API;
import main.Math;

public class Execute 
{
	private static Pointer _stat_PGM_LibMath;
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
	public void dyn_REG_boot4_INSTANTIATE_Execute()
	{
		System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
		Math.app_FUNCT_add_a_b();
		Math.app_FUNCT_divide_a_b();
		//Math.app_FUNCT_generate_Program();
		Math.app_FUNCT_multiply_a_b();
		Math.app_FUNCT_subtract_a_b();
		Math.app_FUNCT_terminate_Program();
		var temp0 = Math.app_PRAISE_get_Output_value();
		var temp1 = Math.app_PRAISE_get_Input_value_a();
		var temp2 = Math.app_PRAISE_get_Input_value_b();
		byte[] bytes = Global.stat_CONVERT_Double_To_Bytes(Double.MAX_VALUE);
		Math.app_PRAISE_set_Output_value(bytes);
		bytes = Global.stat_CONVERT_Float_To_Bytes(Float.MAX_VALUE);
		Math.app_PRAISE_set_Input_value_a(bytes);
		Math.app_PRAISE_set_Input_value_b(bytes);
		System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
	}
	public Pointer dyn_PGM_get_LibAdder_ptr()
	{
		return stat_PGM_get_LibAdder();
	}	
	static private void stat_CLASS_boot0_DECLAIRE_Execute()
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
		stat_PGM_boot3_INITIALISE_LibraryPrograms();
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
		_stat_PGM_LibMath = null;
		System.out.printf("exiting Execute initialise_Programs().%n");
	}
	private static void stat_PGM_boot3_INITIALISE_LibraryPrograms()
	{
		System.out.printf("entered Execute stat_PGM_boot3_INITIALISE_LibraryPrograms().%n");
		try {
			_stat_PGM_LibMath = LIBMATH_API.INSTANCE.app_FUNCT_generate_Program();
		}
		catch (UnsatisfiedLinkError e) {
			System.out.printf("UnsatisfiedLinkError.%n");
		}
                catch (NoClassDefFoundError e) {
			System.out.printf("NoClassDefFoundError.%n");
		}
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		System.out.printf("exiting Execute stat_PGM_boot3_INITIALISE_LibraryPrograms().%n");
	}
	private static Pointer stat_PGM_get_LibAdder()
	{
		return _stat_PGM_LibMath;
	}
}