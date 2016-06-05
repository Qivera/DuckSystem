package duck;

import duck.fly.FlyNoWay;
import duck.quack.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Rubber duck!");
	}
}
