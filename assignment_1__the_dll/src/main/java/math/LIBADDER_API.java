package math;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface LIBADDER_API extends Library
{
	LIBADDER_API INSTANCE = (LIBADDER_API) Native.load("Assignment_1_-_the_dll", LIBADDER_API.class);
	void  app_FUNCT_do_Add(Pointer obj);
	Pointer app_FUNCT_generate_Program();
	void app_FUNCT_terminate_Program();
	byte[] app_FUNCT_get_Output_Subset_praise0_value(Pointer obj);
	void  app_FUNCT_set_Input_Subset_praise0_valueA(Pointer obj, byte[] bytes);
	void app_FUNCT_set_Input_Subset_praise0_valueB(Pointer obj, byte[] bytes);
}