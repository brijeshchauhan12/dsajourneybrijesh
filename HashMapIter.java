package brijeshdsa;
import java.util.*;
public class HashMapIter {

	public static void main(String args[]) {
		HashMap<Integer,String> hmp=new HashMap<Integer,String>();
		for(int i=0;i<10;i++) {
			hmp.put(i,"brijesh"+i);	
		}
		System.out.println(hmp);
		for(Map.Entry m: hmp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	
	}
}
