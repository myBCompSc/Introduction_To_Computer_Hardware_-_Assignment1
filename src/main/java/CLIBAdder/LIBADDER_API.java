package CLIBAdder;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
public interface LIBADDER_API extends Library
{
	LIBADDER_API INSTANCE = (LIBADDER_API) Native.load("Assignment_1_-_the_dll", LIBADDER_API.class);
	double do_Add(Pointer obj);
	Pointer generate_Pprogram();
	float get_Input_Subset_parise0_valueA(Pointer obj);
	float get_Input_Subset_parise0_valueB(Pointer obj);
	void set_Input_Subset_parise0_valueA(Pointer obj, float newValue);
	void set_Input_Subset_parise0_valueB(Pointer obj, float newValue);
}
