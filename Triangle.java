package entitites;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() { /*o public indica que outra classe pode utilizar esse m�todo*/
                           /*o double indica o tipo de dado que ser� utilizado pelo m�todo*/
		double p = (a + b + c)/2;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
		
	}
}
