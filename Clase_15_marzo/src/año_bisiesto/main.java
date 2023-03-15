package año_bisiesto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int año;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el año");
		año= scan.nextInt();
		if(año % 400==0) {
			System.out.println("Es bisiesto");
		}
		else if(año%4==0 && año%100!=0) {
			System.out.println("Es bisiesto");
		}
		else
		{
			System.out.println("No es bisiesto");
		}
		

	}

}
