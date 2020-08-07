package PacoteJava;

import java.util.*;

public class Idadeemdias {
	public static void main(String args[])
	{
		int ano, mes, dia, tot;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		ano= ler.nextInt();
		System.out.println("Quantos mesess você tem?");
		mes= ler.nextInt();
		System.out.println("Quantos dias você tem?");
		dia= ler.nextInt();
		
		tot = ano*365+mes*30+dia;
		
		System.out.println("Você tem "+tot+" dias de vida!!");
	}
}
