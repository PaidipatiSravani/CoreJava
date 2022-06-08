package SamplePrograms;

public class AccessModifiers {
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		System.out.println("public:"+obj.a);
		System.out.println("private"+obj.b);
		System.out.println("protected"+obj.c);
		System.out.println("default"+obj.d);

	}

}
  class InPackage{
	 
	AccessModifiers obj=new AccessModifiers();
	
	
}
