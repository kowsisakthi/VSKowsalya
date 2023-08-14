package Genrices;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Annotation_Genrices {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// Car c = CarContainer.getCar();
		// System.out.println(c);
		Car c1 = Mycontainer1.got();
		c1.addFeature();
		// System.out.println(c1);

	}
}

class CarContainer {
	static Scanner sc = new Scanner(System.in);

	public static Car getCar() {
		Car c1 = null;
		System.out.println("enter the car :: Maruthi or Audi or Suzcki or Safori");
		String name = sc.next();
		if (name.equals("Maruthi")) {
			CarFactory f1 = new MaruthiFactory();
			ShowRoom s1 = new ShowRoom();
			c1 = s1.SellCar(f1);
			// System.out.println(c1);
		}
		if (name.equals("Audi")) {
			CarFactory f1 = new AudiFactory();
			ShowRoom s1 = new ShowRoom();
			c1 = s1.SellCar(f1);
		}
		if (name.equals("Suzcki")) {
			CarFactory f1 = new SuzckiFactory();
			ShowRoom s1 = new ShowRoom();
			c1 = s1.SellCar(f1);

		}
		if (name.equals("Safori")) {
			CarFactory f1 = new SaforiFactory();
			ShowRoom s1 = new ShowRoom();
			c1 = s1.SellCar(f1);

		}
		return c1;
	}
}

class Mycontainer1 {
	public static Car got() throws NoSuchMethodException, SecurityException {
		Car c = CarContainer.getCar();
		Class cl = c.getClass();
		Method m = cl.getDeclaredMethod("addFeature");
		step s1 = (step) m.getDeclaredAnnotation(step.class);
		if (s1 != null) {
			if (c instanceof Maruthi) {
				Maruthi m1 = new Maruthi();
				m1.setF1(new Feature1());
				m1.setF2(new Feature2());
				m1.setF3(new Feature3());
				m1.setSt(s1);
				return m1;
			}
			if (c instanceof Audi) {
				Audi m2 = new Audi();
				m2.setF1(new Feature1());
				m2.setF2(new Feature2());
				m2.setF3(new Feature3());
				m2.setSt(s1);
				return m2;
			}
			if (c instanceof Suzcki) {
				Suzcki m3 = new Suzcki();
				m3.setF1(new Feature1());
				m3.setF2(new Feature2());
				m3.setF3(new Feature3());
				m3.setSt(s1);
				return m3;
			}
			if (c instanceof Safori) {
				Safori m4 = new Safori();
				m4.setF1(new Feature1());
				m4.setF2(new Feature2());
				m4.setF3(new Feature3());
				m4.setSt(s1);
				return m4;
			}
		}
		return c;
	}

}

abstract class Car {

	abstract void addFeature();
}

class Maruthi extends Car {
	Feature1 f1;
	Feature2 f2;
	Feature3 f3;
	step st;

	public void setSt(step st) {
		this.st = st;
	}

	public void setF1(Feature1 f1) {
		this.f1 = f1;
	}

	public void setF2(Feature2 f2) {
		this.f2 = f2;
	}

	public void setF3(Feature3 f3) {
		this.f3 = f3;
	}

	@step
	@Override
	void addFeature() {
		if (st != null) {
			f1.f1();
			f2.f2();
			f3.f3();
			System.out.println("this is maruthi extra Feature...");
		} else {
			System.out.println("this is normal quality...");
		}

	}
}

class Audi extends Car {
	Feature1 f1;
	Feature2 f2;
	Feature3 f3;
	step st;

	public void setSt(step st) {
		this.st = st;
	}

	public void setF1(Feature1 f1) {
		this.f1 = f1;
	}

	public void setF2(Feature2 f2) {
		this.f2 = f2;
	}

	public void setF3(Feature3 f3) {
		this.f3 = f3;
	}

	@step
	@Override
	void addFeature() {
		if (st != null) {
			f1.f1();
			f2.f2();
			f3.f3();
			System.out.println("this is audi extra Feature....");
		} else {
			System.out.println("this is normal quality...");
		}

	}
}

class Suzcki extends Car {
	Feature1 f1;
	Feature2 f2;
	Feature3 f3;
	step st;

	public void setSt(step st) {
		this.st = st;
	}

	public void setF1(Feature1 f1) {
		this.f1 = f1;
	}

	public void setF2(Feature2 f2) {
		this.f2 = f2;
	}

	public void setF3(Feature3 f3) {
		this.f3 = f3;
	}

	@step
	@Override
	void addFeature() {
		if (st != null) {
			f1.f1();
			f2.f2();
			f3.f3();
			System.out.println("this is suzcki extra Feature ");
		} else {
			System.out.println("this is normal quality...");
		}

	}
}

class Safori extends Car {
	Feature1 f1;
	Feature2 f2;
	Feature3 f3;
	step st;

	public void setSt(step st) {
		this.st = st;
	}

	public void setF1(Feature1 f1) {
		this.f1 = f1;
	}

	public void setF2(Feature2 f2) {
		this.f2 = f2;
	}

	public void setF3(Feature3 f3) {
		this.f3 = f3;
	}

	@step
	@Override
	void addFeature() {
		if (st != null) {
			f1.f1();
			f2.f2();
			f3.f3();
			System.out.println("this is safori extra Feature...");
		}

		else {
			System.out.println("this is normal quality...");
		}
	}

}

abstract class Factory {
	public abstract void make();
}

abstract class CarFactory extends Factory {

	@Override
	public void make() {
		makeCar();
	}

	public abstract Car makeCar();
}

class MaruthiFactory extends CarFactory {

	@Override
	public Car makeCar() {
		return new Maruthi();
	}

}

class AudiFactory extends CarFactory {

	@Override
	public Car makeCar() {
		return new Audi();
	}

}

class SuzckiFactory extends CarFactory {

	@Override
	public Car makeCar() {
		return new Suzcki();
	}

}

class SaforiFactory extends CarFactory {

	@Override
	public Car makeCar() {
		return new Safori();
	}

}

abstract class Seller {
	public abstract Car sell(CarFactory fact);
}

abstract class CarSeler extends Seller {

	@Override
	public Car sell(CarFactory fact) {
		return SellCar(fact);
	}

	public abstract Car SellCar(CarFactory fact);
}

class ShowRoom extends CarSeler {

	@Override
	public Car SellCar(CarFactory fact) {
		return fact.makeCar();
	}

}

class Feature1 {
	public void f1() {
		System.out.println("this is the Feature f1.....");
	}
}

class Feature2 {
	public void f2() {
		System.out.println("this is the Feature f2....");
	}
}

class Feature3 {
	public void f3() {
		System.out.println("this is the Feature f3...");
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface step {

}

@Retention(RetentionPolicy.RUNTIME)
@interface step2 {

}

@Retention(RetentionPolicy.RUNTIME)
@interface step3 {

}