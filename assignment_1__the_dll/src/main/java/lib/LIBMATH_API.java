package lib;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface LIBMATH_API extends Library
{
    LIBMATH_API INSTANCE = (LIBMATH_API)Native.load("CLIBMath", LIBMATH_API.class);
    void app_FUNCT_add_a_b();
    void app_FUNCT_divide_a_b();
    Pointer app_FUNCT_generate_Program();
    void app_FUNCT_multiply_a_b();
    void app_FUNCT_subtract_a_b();
    void app_FUNCT_terminate_Program();
    byte[] app_PRAISE_get_Output_value();
    byte[] app_PRAISE_get_Input_value_a();
    byte[] app_PRAISE_get_Input_value_b();
    void app_PRAISE_set_Output_value(byte[] bytes);
    void app_PRAISE_set_Input_value_a(byte[] bytes);
    void app_PRAISE_set_Input_value_b(byte[] bytes);
}
