package main;

import engine.Framework;
import engine.Global;
import lib.LIBMATH_API;
import com.sun.jna.Pointer;

public class Math
{
    public static Framework _stat_CLASS_framework;
    private static Pointer _JavaLIBMath;
// public.
    public static void app_FUNCT_add_a_b()
    {
        try {
            LIBMATH_API.INSTANCE.app_FUNCT_add_a_b();
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_divide_a_b()
    {
        try {
            LIBMATH_API.INSTANCE.app_FUNCT_divide_a_b();
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    public static Framework app_generate_Program()
    {
        System.out.printf("entered DESKTOP APPLICATION generate_Program().%n");

        System.out.printf("started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");
        stat_CLASS_boot1_DEFINE_framework();
        stat_CLASS_boot3_INITIALISE_framework();
        System.out.printf("done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

        System.out.printf("started Records - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

        System.out.printf("done Records - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

        System.out.printf("started Registers - DEFINE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot1_DEFINE_Framework_App(stat_CLASS_get_Framework());
        System.out.printf("done Registers - DEFINE.%n");

        System.out.printf("started Registers - SUBSTANTIATE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot2_SUBSTANTIATE_Framework_App(stat_CLASS_get_Framework());
        System.out.printf("done Registers - SUBSTANTIATE.%n");

        System.out.printf("started Registers - INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot3_INITIALISE_Framework_App(stat_CLASS_get_Framework());
        System.out.printf("done Registers - INITIALISE.%n");

        System.out.printf("started Program - INSTANTIATE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot4_INSTANTIATE_Framework_App(stat_CLASS_get_Framework());
        System.out.printf("done Program - INSTANTIATE.%n");

        System.out.printf("exiting DESKTOP APPLICATION generate_Program().%n");
        return stat_CLASS_get_Framework();
    }
    public static void app_FUNCT_multiply_a_b()
    {
        try {
            LIBMATH_API.INSTANCE.app_FUNCT_multiply_a_b();
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_subtract_a_b()
    {
        try {
            LIBMATH_API.INSTANCE.app_FUNCT_subtract_a_b();
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_terminate_Program()
    {
        try {
            LIBMATH_API.INSTANCE.app_FUNCT_terminate_Program();
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    public static byte[] app_PRAISE_get_Output_value()
    {
        try {
            return LIBMATH_API.INSTANCE.app_PRAISE_get_Output_value();
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        return Global.stat_CONVERT_Double_To_Bytes((double)(Double.MAX_VALUE));
    }
    public static byte[] app_PRAISE_get_Input_value_a()
    {
        try {
            return LIBMATH_API.INSTANCE.app_PRAISE_get_Input_value_a();
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        return Global.stat_CONVERT_Float_To_Bytes((float)(Float.MAX_VALUE));
    }
    public static byte[] app_PRAISE_get_Input_value_b()
    {
        try {
            return LIBMATH_API.INSTANCE.app_PRAISE_get_Input_value_b();
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        return Global.stat_CONVERT_Float_To_Bytes((float)(Float.MAX_VALUE));
    }
    public static void app_PRAISE_set_Output_value(byte[] bytes)
    {
        try {
            LIBMATH_API.INSTANCE.app_PRAISE_set_Output_value(bytes);
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    public static void app_PRAISE_set_Input_value_a(byte[] bytes)
    {
        try {
            LIBMATH_API.INSTANCE.app_PRAISE_set_Input_value_a(bytes);
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    public static void app_PRAISE_set_Input_value_b(byte[] bytes)
    {
        try {
            LIBMATH_API.INSTANCE.app_PRAISE_set_Input_value_b(bytes);
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
// private.
    private static void stat_CLASS_boot1_DEFINE_framework()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_framework().%n");
        _stat_CLASS_framework = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_framework().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_framework()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_framework().%n");
        _stat_CLASS_framework = new Framework();
        try {
            stat_CLASS_get_Framework();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_framework().%n");
    }
    private static Framework stat_CLASS_get_Framework()
    {
        return _stat_CLASS_framework;
    }
}
