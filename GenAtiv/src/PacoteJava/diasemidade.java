package PacoteJava;

import java.util.*;

public class diasemidade {
	public static void main(String args[])
	{
		int ano, mes, dia, tot;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Quantos dias voc� tem?");
		tot= ler.nextInt();
		
		ano= tot/365;
		mes= (tot%365)/12;
		dia= mes%30;
		
		System.out.println("Voc� tem "+ano+" anos, "+mes+" meses, e "+dia+" dias de vida!!");
	}
}