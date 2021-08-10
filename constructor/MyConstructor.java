package constructor;


class vehicle{
	int wheels;
	int headLights;

	public vehicle(){
		wheels=4;
		headLights=2;
	}
	public vehicle(int a, int b){
		wheels= 2;
		headLights=3;
		
	}
}

public class MyConstructor {
	
//	   MyConstructor(){
//	    	 System.out.println("object is now created");
//	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		vehicle car= new vehicle();
	    System.out.println("car wheels "+car.wheels);
	    
	    vehicle motorCycle= new vehicle(2,3);
	    
	    System.out.println("motor cycle wheels "+motorCycle.wheels );
	    System.out.println( " and headlights "+motorCycle.headLights);
		 
	}

}
