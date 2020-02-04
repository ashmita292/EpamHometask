
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
	class XYZ implements IA
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
			XYZ X=new XYZ();
			X.show();
		}
	}

