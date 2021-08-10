package AbstractionInJava;

public class Wagonr extends car {
 
	
	
	public void breaking() {
		System.out.println("wagonr is breaking");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("wagonr is accelerating");
	}

	@Override
	public void racing() {
		// TODO Auto-generated method stub
		System.out.println("wagonr is racing");
	}
}
