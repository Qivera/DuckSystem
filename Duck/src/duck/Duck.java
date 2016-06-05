package duck;

import duck.fly.FlyBehavior;
import duck.quack.QuackBehavior;

//Ѽ�ӵĳ�����
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	// Ѽ�ӵ���ò
	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("");

	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
