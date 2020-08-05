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
	@Test
	public void test3() {
		List<Employee> list = filterEmployees2(employees);
		
		for(Employee employee : list) {
			System.out.println(employee);
		}
	}
	
	//get all age >= 20
	public List<Employee> filterEmployees(List<Employee> list){
		List<Employee> emps = new ArrayList<>();
		for (Employee emp: list) {
			if(emp.getAge() >= 20) {
				emps.add(emp);
			}
		}
		return emps;
	}
	//get all salary >= 4000
	public List<Employee> filterEmployees2(List<Employee> list){
		List<Employee> emps = new ArrayList<>();
		for (Employee emp: list) {
			if(emp.getSalary() >= 4000) {
				emps.add(emp);
			}
		}
		return emps;
	}
	
	//optimize 1: 
	public List<Employee> filterEmployeeByAge(List<Employee> list, MyPredicate<Employee> mp){
		List<Employee> emps = new ArrayList<>();
		for (Employee emp: list) {
			if(mp.test(emp)) {
				emps.add(emp);
			}
		}
		return emps;
	}
	
	@Test
	public void test4() {
		List<Employee> list = filterEmployeeByAge(employees, new FilterEmployeeByAge());
		
		for(Employee employee : list) {
			System.out.println(employee);
		}
	}
}
