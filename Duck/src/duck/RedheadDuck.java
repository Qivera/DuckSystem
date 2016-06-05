package duck;

import duck.fly.FlyWithRocket;
import duck.quack.MuteQuack;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithRocket();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Redhead duck!");
	}

}
