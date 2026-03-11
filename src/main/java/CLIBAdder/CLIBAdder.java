package CLIBAdder;

import com.sun.jna.Pointer;

public class CLIBAdder implements LIBADDER_API 
{

	@Override
	public double do_Add(Pointer obj) 
	{
		return CLIBAdder.INSTANCE.do_Add(obj);
	}

	@Override
	public Pointer generate_Pprogram() 
	{
		return CLIBAdder.INSTANCE.generate_Pprogram();
	}

	@Override
	public float get_Input_Subset_parise0_valueA(Pointer obj) 
	{
		return CLIBAdder.INSTANCE.get_Input_Subset_parise0_valueA(obj);
	}

	@Override
	public float get_Input_Subset_parise0_valueB(Pointer obj) 
	{
		return CLIBAdder.INSTANCE.get_Input_Subset_parise0_valueB(obj);
	}

	@Override
	public void set_Input_Subset_parise0_valueA(Pointer obj, float newValue) 
	{
		CLIBAdder.INSTANCE.set_Input_Subset_parise0_valueA(obj, newValue);		
	}

	@Override
	public void set_Input_Subset_parise0_valueB(Pointer obj, float newValue) 
	{
		CLIBAdder.INSTANCE.set_Input_Subset_parise0_valueB(obj, newValue);
	}

}
