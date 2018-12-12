package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMp {
public static void main(String[] args) {
	Map<String, String> map=new HashMap<>();
	map.put("1", "guyan");
	map.put("2", "gao");
	map.put("3", "fei");
	Set entrySet = map.entrySet();
	if(entrySet !=null){
		Iterator iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Map.Entry<String, String> entry = (Entry<String, String>) iterator.next();
			String key = entry.getKey();
			System.out.println("key="+key);
			String value = entry.getValue();
			System.out.println("value="+value);
		}
		
	}

}

}
