package Abstraction;

abstract class Animal {
	public abstract void animalsound();
	 void sleep() {
		System.out.println("Zzzzzzzzzz");
	}
}

	class PetAnimal extends Animal {
	 public void animalsound() {
	System.out.println("PetAnimal Sounds");
}
	public void petsleep() {
		System.out.println("PetAnimal Sleeping");
	}


	public static void main(String[] args) {
			PetAnimal Dog = new PetAnimal();
			Dog.sleep();
			Dog.animalsound();
			Dog.petsleep();
			

	}

}
