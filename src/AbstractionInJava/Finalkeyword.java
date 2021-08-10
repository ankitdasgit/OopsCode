package AbstractionInJava;



public class Finalkeyword {
	
//	public  void student() {
//		String name = "ankit ";
//	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		 final int rollNo =23;
		// rollNo=4;
		System.out.println(rollNo);
          
//		student s= new student();
		final Student s= new Student();
		Student s1= new Student();
		s1.name= "rohit";

	}

}
