package CLIBLaunchEnableForConcurrentThreadsAtSERVER;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

import CLIBConcurrentServerIO.LIBSERVERIOCONCURRNECY_API;

public interface LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_API extends Library
{
	LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_API INSTANCE = (LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_API) Native.load("\\dll\\LIB_LaunchEnableForConcurrentThreadsAt_SERVER.dll", LAUNCHENABLEFORCONCURRENTTHREADSATSERVER_API.class);
	Pointer generate_Program();
	void request_Wait_launch(Pointer obj, short concurrentThreadID);
	void thread_End(Pointer obj, short concurrentThreadID);
	short get_coreId_To_launch(Pointer obj);
	boolean get_Flag_Active(Pointer obj);
	boolean get_Flag_ConcurrentCoreState(Pointer obj, short concurrentThreadID);
	boolean get_Flag_Idle(Pointer obj);
	boolean get_State_launchBit(Pointer obj);
	void set_Flag_ConcurrentCoreState(Pointer obj, short concurrentThreadID);
}
