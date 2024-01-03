package oops;
class Course{
	public int cid;
	public String cname;
	public String duraction;
	public Course(int cid, String cname, String duraction) {
		this.cid = cid;
		this.cname = cname;
		this.duraction = duraction;
	}
	
}
class Student {
	public int sid;
	public String sname;
	public Course course;//Here is the association property
	public Student(int sid, String sname, Course course) {
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	
	
}
public class AssociationDemo {

	public static void main(String[] args) {
		Course c1 = new Course(100,"java","120 Hours");
		Student s1 = new Student(1,"abc",c1);
		System.out.println("Student Id   : "+s1.sid);
		System.out.println("Student Name : "+s1.sname);
		System.out.println("Course Name  : "+s1.course.cname);
		System.out.println("Course Duraction : "+s1.course.duraction);

	}

}
