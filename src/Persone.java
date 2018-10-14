
public class Persone 
{
	 String nome;
	 String cognome;
	 int eta;
	 char sesso;
	
	public Persone(String cognome, String nome, int eta, char sesso)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
		this.sesso=sesso;
	}

	@Override
	public String toString() {
		return "Persone [cognome=" + cognome + ", nome=" + nome + ", eta=" + eta + ", sesso=" + sesso + "]";
	}
	
	
}
