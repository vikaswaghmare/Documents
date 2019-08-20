r
public class college 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();//instance variable is created
		System.out.println("************Student Details*************"); 
		s1.sno=101;
		s1.sname="Balaji waghmare";
		s1.course="Core java";
		s1.fee=1100;


		System.out.println(" Student No:\t"+s1.sno+"\n student Name:\t"+s1.sname+"\n Name of the course:\t"+s1.course+"\n course fees:\t"+s1.fee+"\n\n");
		
		Student s2=new Student();

		s2.sno=102;
		s2.sname="vikas waghmare";
		s2.course="Advance java";
		s2.fee=1200;
		System.out.println(" Student No:\t"+s2.sno+"\n student Name:\t"+s2.sname+"\n Name of the course:\t"+s2.course+"\n course fees:\t"+s2.fee);

	}
}
