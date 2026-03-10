package CLIBLaunchEnableForConcurrentThreadsAtSERVER;

import com.sun.jna.Pointer;

public class CLIBLaunchEnableForConcurrentThreadsAtSERVER implements LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_API
{

	@Override
	public Pointer generate_Program() 
	{
		return CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.generate_Program();
	}

	@Override
	public void request_Wait_launch(Pointer obj, short concurrentThreadID) 
	{
		CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.request_Wait_launch(obj, concurrentThreadID);
	}

	@Override
	public void thread_End(Pointer obj, short concurrentThreadID) 
	{
		CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.thread_End(obj, concurrentThreadID);
	}

	@Override
	public short get_coreId_To_launch(Pointer obj) 
	{
		return CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.get_coreId_To_launch(obj);
	}

	@Override
	public boolean get_Flag_Active(Pointer obj) 
	{
		return CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.get_Flag_Active(obj);
	}

	@Override
	public boolean get_Flag_ConcurrentCoreState(Pointer obj, short concurrentThreadID) 
	{
		return CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.get_Flag_ConcurrentCoreState(obj, concurrentThreadID);
	}

	@Override
	public boolean get_Flag_Idle(Pointer obj) 
	{
		return CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.get_Flag_Idle(obj);
	}

	@Override
	public boolean get_State_launchBit(Pointer obj) 
	{
		return CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.get_State_launchBit(obj);
	}

	@Override
	public void set_Flag_ConcurrentCoreState(Pointer obj, short concurrentThreadID) 
	{
		CLIBLaunchEnableForConcurrentThreadsAtSERVER.INSTANCE.get_Flag_ConcurrentCoreState(obj, concurrentThreadID);		
	}

}
