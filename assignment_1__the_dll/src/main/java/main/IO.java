package main;


import engine.Framework;
import engine.Global;
import lib.DllLoader;

public class IO 
{
	public static Framework _stat_CLASS_framework;

// public.
        public static Framework app_generate_Program()
	{
		System.out.printf("entered DESKTOP APPLICATION generate_Program().%n");
		
		System.out.printf("started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");
		stat_CLASS_boot1_DEFINE_framework();
		stat_CLASS_boot3_INITIALISE_framework();
		System.out.printf("done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

		System.out.printf("started Records - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

		System.out.printf("done Records - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");
		
		System.out.printf("started Registers - DEFINE.%n");
		stat_CLASS_get_Framework().dyn_REG_boot1_DEFINE_Framework_App(stat_CLASS_get_Framework());
		System.out.printf("done Registers - DEFINE.%n");

		System.out.printf("started Registers - SUBSTANTIATE.%n");
		stat_CLASS_get_Framework().dyn_REG_boot2_SUBSTANTIATE_Framework_App(stat_CLASS_get_Framework());
		System.out.printf("done Registers - SUBSTANTIATE.%n");

		System.out.printf("started Registers - INITIALISE.%n");
		stat_CLASS_get_Framework().dyn_REG_boot3_INITIALISE_Framework_App(stat_CLASS_get_Framework());
		System.out.printf("done Registers - INITIALISE.%n");

		System.out.printf("started Program - INSTANTIATE.%n");
		stat_CLASS_get_Framework().dyn_REG_boot4_INSTANTIATE_Framework_App(stat_CLASS_get_Framework());
		System.out.printf("done Program - INSTANTIATE.%n");

		System.out.printf("exiting DESKTOP APPLICATION generate_Program().%n");
		return stat_CLASS_get_Framework();
	}
        public static void  app_FUNCT_do_Add(Framework obj)
        {
            try {
                DllLoader.LIBADDER_API.INSTANCE.app_FUNCT_do_Add(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_PGM_get_LibAdder_ptr());
            }
            catch (NullPointerException e) {
                    System.out.printf("NullPointerException.%n");
            }
        }
	// Praise_0.
	public static void dyn_REG_set_praise0_Input_valueA(Framework obj, float newFloat)
	{
            try {
                DllLoader.LIBADDER_API.INSTANCE.app_FUNCT_set_Input_Subset_praise0_valueA(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_PGM_get_LibAdder_ptr(), Global.stat_CONVERT_Float_To_Bytes(newFloat));
            } 
            catch (NullPointerException e) {
                    System.out.printf("NullPointerException.%n");
            }
	}
	public static void dyn_REG_set_praise0_Input_valueB(Framework obj, float newFloat)
	{
            try {
                DllLoader.LIBADDER_API.INSTANCE.app_FUNCT_set_Input_Subset_praise0_valueB(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_PGM_get_LibAdder_ptr(), Global.stat_CONVERT_Float_To_Bytes(newFloat));
            } 
            catch (NullPointerException e) {
                    System.out.printf("NullPointerException.%n");
            }
	}
	public static double dyn_REG_get_praise0_Output_value(Framework obj)
	{
            double tempDouble = 0.0;
            try {
                tempDouble = Global.stat_CONVERT_Bytes_To_Double(DllLoader.LIBADDER_API.INSTANCE.app_FUNCT_get_Output_Subset_praise0_value(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_PGM_get_LibAdder_ptr()));
            } 
            catch (NullPointerException e) {
                    System.out.printf("NullPointerException.%n");
            }
            return tempDouble;
	}
// private.
	private static void stat_CLASS_boot1_DEFINE_framework()
	{
		System.out.printf("entered stat_CLASS_boot1_DEFINE_framework().%n");
		_stat_CLASS_framework = null;
		System.out.printf("exiting stat_CLASS_boot1_DEFINE_framework().%n");
	}
	private static void stat_CLASS_boot3_INITIALISE_framework()
	{
		System.out.printf("entered stat_CLASS_boot3_INITIALISE_framework().%n");
		_stat_CLASS_framework = new Framework();
		try {
			stat_CLASS_get_Framework();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		System.out.printf("exiting stat_CLASS_boot3_INITIALISE_framework().%n");
	}
	private static Framework stat_CLASS_get_Framework()
	{
		return _stat_CLASS_framework;
	}
}