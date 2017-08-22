import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Kullanard");
		list1.add("Sittichok");
		list1.add("Patthamaphon");
		
		for(String list:list1){
			System.out.println(list);
		}
		Collections.sort(list1);
		

		for(String list:list1){
			System.out.println(list);
	}
	}
}
