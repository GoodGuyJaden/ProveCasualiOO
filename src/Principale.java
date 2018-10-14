import java.util.Scanner;

public class Principale
{	
	static Scanner sc= new Scanner(System.in);
	static Archivio a;
	
	private static void menu()
	{
		System.out.println("Scegli la dimensione dell'archivio: ");
		a = new Archivio(sc.nextInt());
		String scelta = " ";
		do 
		{
		System.out.println("Inserisci 1 per aggiungere una persona all'archivio");
		System.out.println("Inserisci 2 per cercare una persona inserendo il cognome");
		System.out.println("Inserisci 3 per rimuovere una persona inserendo il cognome");
		System.out.println("Inserisci 4 per stampare l'archivio");
		System.out.println("Inserisci 5 per contare quante persone ci sono nell'archivio");
		System.out.println("Inserisci x per uscire");
		scelta=sc.next();
		}
		while(scelta.equals("x"));
		opzioni(scelta);
	}
	
	private static void opzioni(String scelta)
	{
		switch(scelta)
		{
			case "1":
					sc.nextLine();
					System.out.println("Inserisci cognome, nome, età e sesso separandoli con un invio");
					a.addPersone(new Persone(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.next().charAt(0)));
					break;
					  
			case "2":
					break;
				
			case "3":
				  	break;
				  
			case "4":
					break;
				  
			case "5":
				  	break;
				  
			case "x":
				  	break;
		}
	}
	public static void main(String[]args)
	{
		menu();
		a.stampa();
		a.contaPersone();
	}
}
