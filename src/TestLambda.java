import java.util.*;
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
		
	}
	
	//Lambda expression
	@Test
	public void test2() {
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
		TreeSet<Integer> ts = new TreeSet<>(com);
	}
	
	List<Employee> employees = Arrays.asList(
			new Employee("a",11,1000),
			new Employee("b",21,4000),
			new Employee("c",31,5000),
			new Employee("d",18,3000),
			new Employee("a2",11,19000)
			);

	
}
