package langpack;

class Student implements Cloneable{
	public int sid;
	public String sname;
	public int marks;
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
public class CloneTest {

	public static void main(String[] args) {
		Student s1 = new Student(100,"abc",90);
		try {
			Student s2 = (Student)s1.clone();
			System.out.println("Original Object s1 : "+s1.sid+" "+s1.sname+" "+s1.marks);
			System.out.println("Original Object s2 : "+s2.sid+" "+s2.sname+" "+s2.marks);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
