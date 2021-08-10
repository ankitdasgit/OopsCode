package AbstractionInJava;

public class RepairShop {

//	public void repairCar(car car) {
//		System.out.println("car is repaired");
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Wagonr wagnor= new Wagonr();
          Audi audi = new Audi();
          
          wagnor.accelerate();
          audi.breaking();
          audi .racing();
          wagnor.racing();
          
	}

}
