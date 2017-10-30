package nooo;

public class Dog extends Animal {

	int age;

	public Dog(int DogsAge) {
		 age = DogsAge ;
	}
	
	public void bark() {
		System.out.println("woof!");	
	}
	
	public void run(int feet) {
		System.out.println("your dog ran " + feet + " feet!");
	}
	
	public int getAge() {
		
	   return age;	
	}
	
	public static void main(String[] args) {
		
		Dog spike = new Dog(5);
		spike.bark();
		spike.run(40);
		int spikeAge = spike.getAge();
		System.out.println(spikeAge);
		
		spike.checkStatus();					
	}		
}
