import java.lang.*;

class CloneDemo
{
    public static void main(String A[]) 
    {
        try
        {
            Employee eobj1 = new Employee(101,"Rahul",11000);
            Employee eobj2 = (Employee)eobj1.clone();

            System.out.println("Name of the first Emoloyee: "+eobj1.Name);
            System.out.println("Name of the Second Emoloyee: "+eobj2.Name);
        
            System.out.println("Salary of the first Emoloyee: "+eobj1.Salary);
            System.out.println("Salary of the Second Emoloyee: "+eobj2.Salary);
        
            eobj1.Name = "Sagar";

            System.out.println("Name of the first Emoloyee: "+eobj1.Name);
            System.out.println("Name of the Second Emoloyee: "+eobj2.Name);
        }
        catch(CloneNotSupportedException obj)
        {

        }
    }
}
class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;

    public Employee(int No, String str, int Value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salary = Value;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
