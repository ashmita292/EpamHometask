
public interface IA {
    void display();
}
abstract class Test 
{
	abstract void display() throws Runtime Exception
	void show()
	{
		System.out.println("1");
	}
}
	class ABC implements IA
	{
		public void display()
		{
			
		}
		void show()
		{
			System.out.println("2");
		}
		public static void main(String[] args)
		{
			ABC X=new ABC();
			X.show();
		}
	}

