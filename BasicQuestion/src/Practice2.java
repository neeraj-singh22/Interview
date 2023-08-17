

public class Practice2 extends Practice{
static String name="Neeraj";

static Practice pp=new Practice2();


	public static void main(String[] ar) {
		newMethod();
		newMethod("News");
		System.out.println("New");
		pp.newMethod();
		
	}
	
	public static void newMethod() {
		System.out.println(name);
	}
	
	public static void newMethod(String names) {
		System.out.println(names);
	}
	
}
