package CLIBConcurrentServerIO;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface LIBSERVERIOCONCURRNECY_API extends Library
{
	LIBSERVERIOCONCURRNECY_API INSTANCE = (LIBSERVERIOCONCURRNECY_API) Native.load("\\dll\\LIBConcurrentIOServer.dll", LIBSERVERIOCONCURRNECY_API.class);
	Pointer generate_Program();
	void initalise_Program(Pointer obj);
	void flip_Input_DoubleBuffer(Pointer obj);
	boolean get_flag_isStackLoaded_Server_InputAction(Pointer obj);
	boolean get_flag_isLoaded_Stack_OutputSend(Pointer obj);
	boolean get_flag_IsInitialised_OpenAvrilConcurrencyConcurrency(Pointer obj);
	Pointer get_program_WriteEnableStack_ServerInputAction(Pointer obj);
	Pointer get_program_WriteEnableStack_ServerOutputRecieve(Pointer obj);
	void pop_From_Stack_Of_Output(Pointer obj);
	void push_To_Stack_Of_Input(Pointer obj);
	void select_set_Intput_Subset(Pointer obj, short praiseID);
// Praise Event Id
	short get_PraiseEventId(Pointer obj);
	void set_PraiseEventId(Pointer obj, short newPraiseID);
// TODO: add your methods here.
	// Praise 0 Data
	float get_Input_Subset_praise0_REG_valueA();
	float get_Input_Subset_praise0_REG_valueB();
	void set_Input_Subset_praise0_REG_valueA(float newValue);
	void set_Input_Subset_praise0_REG_valueB(float newValue);
}
