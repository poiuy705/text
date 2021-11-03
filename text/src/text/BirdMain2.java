package text;

public class BirdMain2 {
	public static void main(String[] args) 
	{
		Bird bird = null;
		int value;
		bird = new African();
		value = bird.getBaseSpeed();
		System.out.println("value:"+value);
		bird = new Eurpopean();
		value = bird.getBaseSpeed();
		System.out.println("value:"+value);
		bird = new NorweginaBlue();
		value = bird.getBaseSpeed();
		System.out.println("value:"+value);
	}

}
