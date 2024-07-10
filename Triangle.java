package entitites;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() { /*o public indica que outra classe pode utilizar esse método*/
                           /*o double indica o tipo de dado que será utilizado pelo método*/
		double p = (a + b + c)/2;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
		
	}
}
