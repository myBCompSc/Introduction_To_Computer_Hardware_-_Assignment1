package engine;

import praise_sets.Algorithim_praise0;

public class Algorithms 
{
// classes.
	private static Algorithim_praise0 _algorithm_praise0 = null;
	
// registers.
	private static Object[] _list_Of_Subset_For_Algorithm = null;
	
// constructor.
	public Algorithms() 
	{
		System.out.printf("entered CLASS Algorithm()%n");
		stat_CLASS_boot0_DECLAIRE_Algorithims();
		stat_CLASS_boot1_DEFINE_Algorithims();
		stat_CLASS_boot3_INITIALISE_Algorithims();
		stat_REG_boot0_DECLAIRE_Algorithims();
		System.out.printf("exiting CLASS Algorithm()%n");
	}
	public void dyn_REG_boot1_DEFINE_Algorithims(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot1_DEFINE_Algorithims().%n");
		
		System.out.printf("exiting dyn_REG_boot1_DEFINE_Algorithims().%n");
	}
	public void dyn_REG_boot2_SUBSTANTIATE_Algorithims(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Algorithims().%n");
		
		System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Algorithims().%n");
	}
	public void dyn_REG_boot3_INITIALISE_Algorithims(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot3_INITIALISE_Algorithims().%n");
		
		System.out.printf("exiting dyn_REG_boot3_INITIALISE_Algorithims().%n");
	}
	public void dyn_REG_boot4_INSTANTIATE_Algorithims(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Algorithims().%n");
		
		System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Algorithims().%n");
	}
	public void stat_CLASS_boot0_DECLAIRE_Algorithims()
	{
		System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Algorithims().%n");
		
		System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Algorithims().%n");
	}
	private static void stat_CLASS_boot1_DEFINE_Algorithims()
	{
		System.out.printf("entered stat_CLASS_boot1_DEFINE_Algorithims().%n");
		
		System.out.printf("exiting stat_CLASS_boot1_DEFINE_Algorithims().%n");
	}
	private static void stat_CLASS_boot3_INITIALISE_Algorithims()
	{
		System.out.printf("entered stat_CLASS_boot3_INITIALISE_Algorithims().%n");
		
		System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Algorithims().%n");
	}
	private static void stat_REG_boot0_DECLAIRE_Algorithims()
	{
		System.out.printf("entered stat_REG_boot0_DECLAIRE_Algorithims().%n");
		
		System.out.printf("exiting stat_REG_boot0_DECLAIRE_Algorithims().%n");
	}
	public Object dyn_REG_get_Item_On_list_Of_Subset_For_Algorithm(char praiseID)
	{
		return stat_REG_get_Item_On_list_Of_Subset_For_Algorithm(praiseID);
		
	}
		// set.
	public Object dyn_REG_set_Item_On_list_Of_Subset_For_Algorithm(char praiseID, char newValue)
	{
		return stat_REG_get_Item_On_list_Of_Subset_For_Algorithm(praiseID);
		
	}
	// static.
		// get.
		// set.

// private.
	// dynamic.
		// create.
		// get.
		// set.
	// static.
		// create.
	private static void stat_CLASS_create_algorithm_praise0()
	{
		_algorithm_praise0 = new Algorithim_praise0();
		try {
			stat_CLASS_get_algorithm_praise0();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
	private static void stat_REG_create_list_Of_Subset_For_Algorithm()
	{
		stat_CLASS_create_algorithm_praise0();
		_list_Of_Subset_For_Algorithm = new Object[1];
		try {
			stat_REG_get_list_Of_Subset_For_Algorithm();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
		_list_Of_Subset_For_Algorithm[0] = stat_CLASS_get_algorithm_praise0();
	}	
		// get.
	private static Algorithim_praise0 stat_CLASS_get_algorithm_praise0()
	{
		return _algorithm_praise0;
	}
	public static Object stat_REG_get_Item_On_list_Of_Subset_For_Algorithm(char praiseID)
	{
		return _list_Of_Subset_For_Algorithm[praiseID];
		
	}
	public static Object[] stat_REG_get_list_Of_Subset_For_Algorithm()
	{
		return _list_Of_Subset_For_Algorithm;
		
	}
		// set.
	public static void stat_REG_set_Item_On_list_Of_Subset_For_Algorithm(char praiseID, Object newSubClass)
	{
		_list_Of_Subset_For_Algorithm[praiseID] = newSubClass;
		
	}
}