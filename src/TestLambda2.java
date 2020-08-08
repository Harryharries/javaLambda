import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;
public class TestLambda2 {
	
	@Test
	public void test1() {
		int num = 0; //before JDK 1.8, it must be final
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hellooo ! "+num);
				
			}
		};
		Runnable r1 = ()-> System.out.println("Hello");
		r1.run();
	}
	
	@Test
	public void test2() {
		Comparator<Integer> com = (x,y) -> {
			System.out.println("inter");
			return Integer.compare(x, y);
		};
		
		Comparator<Integer> com2 = (Integer x,Integer y) -> Integer.compare(x, y);
		
		List<String> list= new ArrayList<>(); //Type inference
		
		show(new HashMap<>());//Type inference	
	}
	
	public void show(Map<Integer, String> map) {
		
	}

}
