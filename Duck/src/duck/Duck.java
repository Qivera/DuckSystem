package duck;

import duck.fly.FlyBehavior;
import duck.quack.QuackBehavior;

//鸭子的抽象类
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	// 鸭子的外貌
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
