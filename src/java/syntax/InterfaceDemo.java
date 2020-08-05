package java.syntax;

//public interface InterfaceDemo {
//	// 1. abstract method 
//	// defaultly add "public abstract"
//	void run(); // public abstract void run();
//	
//	//2. constant:
//	// in interface, it will defaultly add "public static final"
//	//public static final String SCHOOL_NAME = "BEST";
//	String SCHOOL_NAME = "BEST";
//}

// JDK 1.8 ADD 2 new function
/**
 * 1. default method: instance method --add default -- can be call by calss object
 * 2. Static method:  add static --interface's static method only can be used by itself's class name
 */
public interface InterfaceDemo {
	//default method: same as instance method
	default void run() {
		System.out.println("asd");
	}
	// Static method:
	static void inAddr() {
		System.out.println("d");
	}
}

