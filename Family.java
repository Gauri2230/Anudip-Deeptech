class Parent
{
	void p()
	{
		System.out.println("This is parent class");
	}
}
class Child extends Parent
{
	 void c()
	{
		System.out.println("This is child class");
	}
}
class Family
{
	public static void main(String args[])
	{
		Child b=new Child();
		b.p();
		b.c();
	}
}
