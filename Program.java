package application;

import java.util.Scanner;

import entitites.Triangle;

public class Program {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();	
		y = new Triangle();
		
		System.out.println("Digite as medidas do tri�ngulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do tri�ngulo Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.println("�rea do tri�ngulo X: " + areaX);
		System.out.println("�rea do tri�ngulo X: " + areaY);
		
		if(areaX > areaY) {
			System.out.println("O maior tri�ngulo � o X");
		}else {
			System.out.println("O maior tri�ngulo � o Y");
			}
	sc.close();	
	}
}
