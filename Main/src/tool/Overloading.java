package tool;

class Any {
	int a;
	static int b = 5;

	void meth() {
		System.out.println("meth");
	}

	void meth(int a) {
		System.out.println("meth" + a);
	}
}

class Any2 extends Any {
	@Override
	void meth() {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("overriding");
	}
	void meth(int a) {
		System.out.println("meth" + a);
	}
}

public class Overloading {
	public static void main(String[] args) {
		Any any = new Any();
		any.a = 5;
		any.meth(4);
		System.out.println(Any.b);
		any.meth();
		any.meth(3);
		
		
	}
}
