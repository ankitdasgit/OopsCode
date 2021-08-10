

class cat{
	int legs,eyes;
	String colour,breed;
	boolean hasFur;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	public void sleep() {
		System.out.println("cat is sleeping");
	}
	public void description() {
		System.out.println("my cat is "+legs+"legs "
				+ "and"+eyes+"eyes");
		
	}

}
class Dog {
	int legs,eyes,ears;
	String breed,color,name;
	public void jump() {
		System.out.println("my dog "+name +"jumped");
		
	}
	
	public void des() {
		System.out.println("my dog name"+name+"and breed "
				+ "is"+breed);
	}
	
}

 

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		cat cat1= new cat();
//		cat cat2= new cat();
//		
//		cat1.eat();
//		cat1.sleep();
//		
//		cat2.walk();
//		cat2.sleep();
		
	Dog husky = new Dog();
	Dog poodle= new Dog();
	
	husky.name= " brownii ";
	poodle.name=" seru ";
	
	husky.breed=" HUsky dog ";
	poodle.breed=" poodle dog ";
	
	husky.des();
	poodle.des();
	husky.jump();
	
	

	}

}

