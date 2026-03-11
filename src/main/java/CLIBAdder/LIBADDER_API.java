package CLIBAdder;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
public interface LIBADDER_API extends Library
{
	LIBADDER_API INSTANCE = (LIBADDER_API) Native.load("/Concurrent_IO_Server/dll/Assignment_1_-_the_dll.dll", LIBADDER_API.class);
	double do_Add(Pointer obj, float valueA, float valueB);
	Pointer generate_Pprogram();
	float reg_get_Input_Subset_parise0_valueA(Pointer obj);
	float reg_get_Input_Subset_parise0_valueB(Pointer obj);
	void reg_set_Input_Subset_parise0_valueA(Pointer obj, float newValue);
	void reg_set_Input_Subset_parise0_valueB(Pointer obj, float newValue);
}
