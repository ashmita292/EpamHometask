
public class Employee {
  private int emp_id;
  public void setEmpId(int emp_id 1)
  {
	  emp_id= emp_id 1;
  }
  public int getEmpId()
  {
	  return emp_id;
  }
}
class company
{
	public static void main(String[] args)
			{
		      Employee e=new Employee();
		      e.setEmpId(101);
		      System.out.println("e.getEmpId");
			}
}
