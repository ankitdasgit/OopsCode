package encapsulation;

  class StudentInfo {

	
	private String name;
	 private int age;
	 
	  public int getAge() {
		  return age;
	  }
   public void setAge(int age) {
	   if(age>20) {
		   System.out.println("you are not eligible");
	   }else
	   this.age=age;
   }
	

}
