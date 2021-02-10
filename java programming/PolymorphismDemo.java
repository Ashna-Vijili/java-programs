package practiceexercise;

class Animal
{
	void property() {
		System.out.println("Each Animal have a specific characteristics");
	}
	void shout()
	{
		System.out.println("Animals generally shout");
	}
}

class Dog extends Animal
{
	void shout()
	{
		System.out.println("Dogs usually Barks");
	}
}
class Horse extends Animal
{
	void shout()
	{
		System.out.println("Horses usually Neigh");
	}
}
class Cat extends Animal
{
	void shout()
	{
		System.out.println("Cats usually make Meows sound");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		Animal a=new Dog();
		a.property();
		a.shout();
		Animal b=new Horse();
		b.shout();
		Animal c=new Cat();
		c.shout();

	}

}
