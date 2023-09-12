package practica;

import javax.swing.JOptionPane;

public class ejercicio1 {
public static void main(String[]args) {
	/*¬1. Haga un algoritmo que solicite el nombre, documento, edad y profesión de n personas e imprima la siguiente información:
		- Total personas registradas
		- Cantidad de personas ingresadas
		- Cantidad de personas mayores de edad
		- Cantidad de personas menores de edad.*/

	
	int veces = Integer.parseInt(JOptionPane.showInputDialog("ingrese las veces que se quiere registrar"));
	int mayoredad = 0;
	int menordeedad= 0;
	for (int i = 0; i < veces; i++) {
		String nombre = JOptionPane.showInputDialog("ingrese su nombre");
		int documento = Integer.parseInt(JOptionPane.showInputDialog("ingrese su documento"));
		int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad "+nombre));
		String profesion = JOptionPane.showInputDialog("ingrese su profesion "+nombre);
		
		if (edad >= 18) {
			mayoredad++;
		} else {
menordeedad++;
		}
		JOptionPane.showInternalMessageDialog(null,"las veces que se ingreso es de "+veces+"\n");
		JOptionPane.showInternalMessageDialog(null,"la cantidad de mayores de edad es de "+mayoredad+"\n");
		JOptionPane.showInternalConfirmDialog(null,"los menores de edad son "+ menordeedad+"\n");
		System.out.println("su nombre es "+nombre+"\n"+"su numero de documento es de "+documento+"\n"+"Su edad es "+edad+"\n"+"su profesion es "+profesion+"\n");
	}

	
}}
	
	
	
	