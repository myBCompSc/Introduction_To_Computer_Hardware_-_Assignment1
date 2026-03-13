package CLIBWriteEnableForThreadsAtSERVERINPUTACTION;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

import CLIBConcurrentServerIO.LIBSERVERIOCONCURRNECY_API;

public interface LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_API extends Library
{
	LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_API INSTANCE = (LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_API) Native.load("\\dll\\LIB_WriteEnableForThreadsAt_SERVERINPUTACTION.dll", LIBWRITEENABLEFORTHREADSATSERVERINPUTACTION_API.class);
	Pointer generate_Program();
	void write_End(Pointer obj, short threadID);
	void write_Start(Pointer obj, short threadID);
}
