interface Animal
{
	public abstract void eat();
	public abstract void sleep();
}
abstract class Sleeping implements Animal
{
	public void sleep(){
		System.out.println("__________Sleeping....__________");
	}	
}
class Lion extends Sleeping
{
	public void eat()
	{
		System.out.println("lions eat only meat");
	}
}
class Rabbit extends Sleeping
{
	public void eat(){

		System.out.println("Rabbit eats grass,leafy greens");
	}
}
class Jungle
{

	public static void main(String args[])
	{
		Animal a1=new Lion();
		a1.sleep();
		a1.eat();
		System.out.println("_________________________________________________");
		a1=new Rabbit();
		a1.eat();
		a1.sleep();
		System.out.println("_________________________________________________");
	}
}