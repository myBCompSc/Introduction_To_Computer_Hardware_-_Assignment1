package CLIBWriteEnableForThreadsAtSERVERINPUTACTION;

import com.sun.jna.Pointer;

public class CLIBWriteEnableForThreadsAtSERVERINPUTACTION implements LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_API
{

	@Override
	public Pointer generate_Program() 
	{
		return CLIBWriteEnableForThreadsAtSERVERINPUTACTION.INSTANCE.generate_Program();
	}

	@Override
	public void write_End(Pointer obj, short threadID) 
	{
		CLIBWriteEnableForThreadsAtSERVERINPUTACTION.INSTANCE.write_End(obj, threadID);
	}

	@Override
	public void write_Start(Pointer obj, short threadID) 
	{
		CLIBWriteEnableForThreadsAtSERVERINPUTACTION.INSTANCE.write_Start(obj, threadID);
	}

}
