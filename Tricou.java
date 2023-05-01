salariuimport java.util.Objects;

/*

Tricou
ID: String
descriere: String
culoare: String
marime: String (enum)
numarul de bucati: int
*/

public class Tricou {
	/*
	Tricou
	ID: String
	descriere: String
	culoare: String
	marime: String (enum)
	numarul de bucati: int
	 */
	// principiul incapsularii
	// atribute ale clasei
	private String ID;
	private String descriere;
	private String culoare;
	private String marime;
	private int nrBucati;
	
	// constructor(i)
	public Tricou() {} // constructor default JAVA
	
	public Tricou(String iD, String descriere, String culoare, String marime, int nrBucati) {
		// super();
		this.ID = iD;
		this.descriere = descriere;
		this.culoare = culoare;
		this.marime = marime;
		this.nrBucati = nrBucati;
	}

	@Override
	public String toString() {
		return "Tricou [ID=" + ID + ", descriere=" + descriere + ", culoare=" + culoare + ", marime=" + marime
				+ ", nrBucati=" + nrBucati + "]";
	}
	
	

	public int getNrBucati() {
		return nrBucati;
	}

	

	
	public boolean equalsTricou(Tricou obj) {
		
		if(ID.compareTo(obj.ID) == 0 && descriere.compareTo(obj.descriere) == 0 && culoare.compareTo(obj.culoare) == 0 && marime.compareTo(obj.marime) == 0)
			return true;
		return false;
		
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public void setNrBucati(int nrBucati) {
		this.nrBucati = nrBucati;
	}
	
	
	
	

	
	
	
}
