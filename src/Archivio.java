import java.util.Arrays;

public class Archivio 
{
	private Persone [] listaPersone;
	
	public Archivio(int dim)
	{
		listaPersone = new Persone [dim];
	}
	
	public boolean stampa()
	{
		for (Persone p:listaPersone)
		{
			if (p!=null) System.out.println(p);
		}
		return false;
	}

	public boolean addPersone(Persone p)
	{
		for (int i=0;i<listaPersone.length;i++)
		{
			if (listaPersone[i]==null)
			{
				listaPersone[i]=p;
				return true;
			}
		}
		return false;
	}
	
	public boolean remPersone(String cognome)
	{
		for(int i=0;i<listaPersone.length;i++)
		{
			if(cognome.equals(listaPersone[i].cognome))
			{
				listaPersone[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public boolean cerca(String cognome)
	{
		
		for(Persone p:listaPersone)
		{
			if(cognome.equals(p.cognome))
			{
				System.out.println(p);
				return true;
			}
		}
		return false;
	}
	
	public boolean contaPersone()
	{
		int conta=0;
		for(Persone p:listaPersone)
		{
			if(p!=null)
			{
				conta++;
			}
		}
		System.out.println("In questo archivio sono registrate "+conta+" persone.");
		return false;
	}
}
