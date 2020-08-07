package PacoteJava;

import java.util.*;

public class reuniao {
	public static void main(String args[])
	{
		int segundostot,hora,min,seg;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento??");
		segundostot= ler.nextInt();
		
		hora= segundostot/3600;
		min= (segundostot%3600)/60;
		seg= ((segundostot%3600)%60);
		
		System.out.println("O evento durou "+hora+" horas, "+min+" minutos e "+seg+" segundos! u.u");
	}
}