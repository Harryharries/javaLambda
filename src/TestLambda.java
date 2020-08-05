import java.util.Comparator;

import java.util.TreeSet;
import org.junit.Test;
public class TestLambda {
	//Inner anonymous class
	@Test
	public void test1() {
		
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		TreeSet<Integer> ts = new TreeSet<>(com);
		System.out.print("asd");
		
	}
	
	//Lambda expression
	@Test
	public void test2() {
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
		TreeSet<Integer> ts = new TreeSet<>(com);
	}
}
