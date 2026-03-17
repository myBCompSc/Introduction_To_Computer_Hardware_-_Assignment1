package math;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface LIBADDER_API extends Library
{
	LIBADDER_API INSTANCE = (LIBADDER_API) Native.load("Assignment_1_-_the_dll", LIBADDER_API.class);
	void app_do_Add(Pointer obj);
	Pointer generate_Program();
	void terminate_Program();
	byte[] get_Output_Subset_praise0_value(Pointer obj);
	void set_Input_Subset_praise0_valueA(Pointer obj, byte[] bytes);
	void set_Input_Subset_praise0_valueB(Pointer obj, byte[] bytes);
}