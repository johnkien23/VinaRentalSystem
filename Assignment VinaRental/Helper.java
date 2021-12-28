import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Helper
{
	public static <E extends SimpleKey> 
	E search(Collection<E> collection, String key)
   {
      	for(E e: collection)
      	{
         	if( e.getKey().equals(key) )
         	{
            	return e;
         	}
      	}
      	return null;
   	}


   	public static <E extends CompositeKey> 
	E search(Collection <E> collection, ArrayList<String> key)
   	{
      	for(E e: collection)
      	{
         	if( e.getKey().equals(key))
         	{
            	return e;
         	}
      }
      return null;
   }


    public static Customer search(List<Customer> customerList, boolean dl) {
        return null;
    }
}