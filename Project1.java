/**Implementation of Hash Map ,Tree Map and HashSet
 * @author Arindam
 * @since	2019-07-20
 * @place	India
 * @problem	Collect unique symbols from set of cards
 */
import java.util.*;
public class Wipro_Minii_Project1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s=0;
		LinkedHashMap<String,Integer> ob=new LinkedHashMap<>();
		TreeMap<String,Integer> ob1=new TreeMap<>();
		
		HashSet<String> p=new HashSet<>();
		while(p.size()<4) {
			
			System.out.println("Enter the card");
			
			ob.put(sc.next(), sc.nextInt());
			s++;
			Set<Map.Entry<String, Integer>> x=ob.entrySet();
			for(Map.Entry<String, Integer> b:x)
			{
				if(!ob1.containsKey(b.getKey())) {
					ob1.put(b.getKey(),b.getValue());
					p.add(b.getKey());
					
				}
				
			}
		
		}
		System.out.println("Four symbols gathered in "+s+" cards");
		System.out.println("Cards in the set are :--- ");
		Set<Map.Entry<String, Integer>> v=ob1.entrySet();
		for(Map.Entry<String, Integer> b:v)
		{
			System.out.println(b.getKey()+" "+b.getValue());
		}
		

}
}
