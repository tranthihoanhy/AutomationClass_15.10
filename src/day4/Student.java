package day4;

public class Student {

	public static void main(String[] args) {
		Person student = new Person();
		student.setName("Nguyễn Hạnh Phúc");
		student.setAge(25);
		
		System.out.println(student.getName() +" , tuổi: "+ student.getAge());
	}
}
