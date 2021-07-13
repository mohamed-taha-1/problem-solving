
public class Student extends Abstract_class{
	

   private int studentId;
	public Student(String nam, String gen , int id) {
		super(nam,gen);
		this.studentId=id;
	}
	@Override
	public void styding() {
		// TODO Auto-generated method stub
		if(studentId==0) {
			System.out.println("Not stdying !");
		}else {
			System.out.println("degree in bachelor od engineering  and His Id : "+this.studentId);
		}
	}
	
	public static void main(String args[]) {
		Abstract_class student = new Student("ahemd","mail",0);
		Abstract_class student1 = new Student("mohamed ","mail",3);
		student.styding();
		student1.styding();

	
	}
	
	

}
