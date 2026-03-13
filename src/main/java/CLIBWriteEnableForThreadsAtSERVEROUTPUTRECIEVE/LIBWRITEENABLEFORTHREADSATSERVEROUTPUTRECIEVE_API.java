package CLIBWriteEnableForThreadsAtSERVEROUTPUTRECIEVE;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

import CLIBConcurrentServerIO.LIBSERVERIOCONCURRNECY_API;

public interface LIBWRITEENABLEFORTHREADSATSERVEROUTPUTRECIEVE_API extends Library
{
	LIBWRITEENABLEFORTHREADSATSERVEROUTPUTRECIEVE_API INSTANCE = (LIBWRITEENABLEFORTHREADSATSERVEROUTPUTRECIEVE_API) Native.load("\\dll\\LIB_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE.dll", LIBWRITEENABLEFORTHREADSATSERVEROUTPUTRECIEVE_API.class);
	Pointer generate_Program();
	void write_End(Pointer obj, short threadID);
	void write_Start(Pointer obj, short threadID);
}
