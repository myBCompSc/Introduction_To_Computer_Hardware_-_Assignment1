package CLIBAdder;

import com.sun.jna.Pointer;

public class CLIBAdder implements LIBADDER_API 
{

	@Override
	public double do_Add(Pointer obj, float valueA, float valueB) 
	{
		return CLIBAdder.INSTANCE.do_Add(obj, valueA, valueB);
	}

	@Override
	public Pointer generate_Pprogram() 
	{
		return CLIBAdder.INSTANCE.generate_Pprogram();
	}

	@Override
	public float reg_get_Input_Subset_parise0_valueA(Pointer obj) 
	{
		return CLIBAdder.INSTANCE.reg_get_Input_Subset_parise0_valueA(obj);
	}

	@Override
	public float reg_get_Input_Subset_parise0_valueB(Pointer obj) 
	{
		return CLIBAdder.INSTANCE.reg_get_Input_Subset_parise0_valueB(obj);
	}

	@Override
	public void reg_set_Input_Subset_parise0_valueA(Pointer obj, float newValue) 
	{
		CLIBAdder.INSTANCE.reg_set_Input_Subset_parise0_valueA(obj, newValue);		
	}

	@Override
	public void reg_set_Input_Subset_parise0_valueB(Pointer obj, float newValue) 
	{
		CLIBAdder.INSTANCE.reg_set_Input_Subset_parise0_valueB(obj, newValue);
	}

}
