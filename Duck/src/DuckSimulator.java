import duck.Duck;
import duck.MallardDuck;
import duck.RedheadDuck;
import duck.RubberDuck;
import duck.fly.FlyWithRocket;


public class DuckSimulator {
	public static void main(String[] args) {
	      Duck mallard = new MallardDuck();
	      mallard.display();
	      mallard.performQuack();
	      mallard.performFly();
	      System.out.println("------------------");  
	      Duck redhead=new RedheadDuck();
	      redhead.display();
	      redhead.performQuack();
	      redhead.performFly();
	      System.out.println("------------------"); 
	      Duck rubber = new RubberDuck();
	      rubber.display();
	      rubber.performQuack();
	      rubber.performFly();
	      rubber.setFlyBehavior(new FlyWithRocket());  
	      
	   }

}
