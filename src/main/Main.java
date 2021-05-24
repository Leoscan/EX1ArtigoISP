package main;

import classes.Quadrado;
import classes.Trapezio;
import classes.Triangulo;

public class Main {

	public static void main(String[] args) {
		Trapezio T = new Trapezio(8, 3, 5);
		System.out.println("Nome da figura: "+T.getNomeFigura());
		System.out.println("Área da figura: "+T.getAreaFigura());
		
		Quadrado Q = new Quadrado(3);
		System.out.println("Nome da figura: "+Q.getNomeFigura());
		System.out.println("Área da figura: "+Q.getAreaFigura());

		Triangulo TAngulo = new Triangulo(10, 12);
		System.out.println("Nome da figura: "+TAngulo.getNomeFigura());
		System.out.println("Área da figura: "+TAngulo.getAreaFigura());
	}

}
