package CLIBConcurrentServerIO;

import com.sun.jna.Pointer;

public class CLIBConcurrentServerIO implements LIBSERVERIOCONCURRNECY_API 
{

	@Override
	public Pointer generate_Program() 
	{
		return CLIBConcurrentServerIO.INSTANCE.generate_Program();
	}

	@Override
	public void initalise_Program(Pointer obj) 
	{
		CLIBConcurrentServerIO.INSTANCE.initalise_Program(obj);
	}

	@Override
	public void flip_Input_DoubleBuffer(Pointer obj) 
	{
		CLIBConcurrentServerIO.INSTANCE.flip_Input_DoubleBuffer(obj);
	}

	@Override
	public boolean get_flag_isStackLoaded_Server_InputAction(Pointer obj) 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_flag_isStackLoaded_Server_InputAction(obj);
	}

	@Override
	public boolean get_flag_isLoaded_Stack_OutputSend(Pointer obj) 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_flag_isLoaded_Stack_OutputSend(obj);
	}

	@Override
	public boolean get_flag_IsInitialised_OpenAvrilConcurrencyConcurrency(Pointer obj) 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_flag_IsInitialised_OpenAvrilConcurrencyConcurrency(obj);
	}

	@Override
	public Pointer get_program_WriteEnableStack_ServerInputAction(Pointer obj) 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_program_WriteEnableStack_ServerInputAction(obj);
	}

	@Override
	public Pointer get_program_WriteEnableStack_ServerOutputRecieve(Pointer obj) 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_program_WriteEnableStack_ServerOutputRecieve(obj);
	}

	@Override
	public void pop_From_Stack_Of_Output(Pointer obj) 
	{
		CLIBConcurrentServerIO.INSTANCE.pop_From_Stack_Of_Output(obj);
	}

	@Override
	public void push_To_Stack_Of_Input(Pointer obj) 
	{
		CLIBConcurrentServerIO.INSTANCE.push_To_Stack_Of_Input(obj);
	}

	@Override
	public void select_set_Intput_Subset(Pointer obj, short praiseID) 
	{
		CLIBConcurrentServerIO.INSTANCE.select_set_Intput_Subset(obj, praiseID);
	}

	@Override
	public short get_PraiseEventId(Pointer obj) 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_PraiseEventId(obj);
	}

	@Override
	public void set_PraiseEventId(Pointer obj, short newPraiseID) 
	{
		CLIBConcurrentServerIO.INSTANCE.set_PraiseEventId(obj, newPraiseID);
	}

	@Override
	public float get_Input_Subset_praise0_REG_valueA() 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_Input_Subset_praise0_REG_valueA();
	}

	@Override
	public float get_Input_Subset_praise0_REG_valueB() 
	{
		return CLIBConcurrentServerIO.INSTANCE.get_Input_Subset_praise0_REG_valueB();
	}

	@Override
	public void set_Input_Subset_praise0_REG_valueA(float newValue) 
	{
		CLIBConcurrentServerIO.INSTANCE.set_Input_Subset_praise0_REG_valueA(newValue);
	}

	@Override
	public void set_Input_Subset_praise0_REG_valueB(float newValue)
	{
		CLIBConcurrentServerIO.INSTANCE.set_Input_Subset_praise0_REG_valueB(newValue);
	}

}
