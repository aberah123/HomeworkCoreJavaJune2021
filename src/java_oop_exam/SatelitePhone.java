package java_oop_exam;
/* Phone is an interface that has four abstract method interfaceInfo, call, message, camera and 2 non-abstract method - battery and wireless which are implemented. 
 * from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."].
 * When you get a chance to implement interfaceInfo, print out answers for the following questions:
 * [What are the features of Interface you know?
 * Can we create a constructor inside an interface? 
 * Can we write variables inside Interface? 
 * Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods which will be implemented, also print whatever you like. 
 * Do you think we can extends or implements Interface? Single or multiple? 
 * Create two interface Pager and Wakitaki (Phone interface inherit them) and One regular class name LandPhone and one abstract class SatelitePhone. 
 * make a relation of this 4, with Phone if possible*/

// Here phone interface inherit abstract class (stelitephone)
// Here phone is a parent class and satelitephone is a child classor sub class
public abstract class SatelitePhone implements Phone {
	// Those methods are from interface
	@Override
	public abstract void interfaceInfo();

	@Override
	public abstract void call();

	@Override
	public abstract void message();

	@Override
	public abstract void camera();

}
