import java.util.ArrayList;
import java.util.Collections;

public class TestTricou {

	/*
	 * 
	 * Se da urmatoarea problema: Se considera un magazin de tricouri, fiecare
	 * tricou este caracterizat prin ID, descriere, culoare, marime, si numarul de
	 * bucati. Tricourile intra, se achizitioneaza sau ies (se vand din magazin).
	 * Dorim sa facem un inventar si sa tiparim la consola raportul rezultat dupa un
	 * anumit numar de tranzactii efectuat.
	 * 
	 * Fiecare tranzactie are urmatoarea descriere: - ID-ul tricoului care se
	 * tranzactioneaza; - tipul tranzactiei (vanzare/cumparare); - nr de bucati
	 * tranzactionate. - pret
	 * 
	 * Dorim 2 rapoarte, unu in ordine crescatoare a numarului de bucati si altul in
	 * ordine alfabetica a descrierii.
	 * 
	 * Taskuri diverse: - definirea clasei tricou cu atributele precizate; -
	 * definirea unui container / vector de tipul tricou si afisarea tricourilor cu
	 * ID-ul nr prim; - sortarea tuturor tricourilor din container dupa pret; -
	 * rezolvare operatiilor specifice din magazin
	 */

	public static boolean NrPrim(int nr) // metoda nrprim
	{
		if (nr < 2)
			return false;

		for (int d = 2; d * d <= nr; d++) {
			if (nr % d == 0)
				return false;
		}
		return true;

	}

	public static void customSort(ArrayList<Tricou> arr) {

		// complexitate patratica ( sunt doua for implicate)
		// complexitate liniara( un singur for)

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i).getNrBucati() > arr.get(j).getNrBucati()) {
					Tricou aux;
					aux = arr.get(i);
					// arr.get(i) = arr.get(j);
					arr.set(i, arr.get(j));
					// arr.get(i) = aux;
					arr.set(j, aux);
				}
			}
		}

	}
	// harcodat - deja scris din cod

	public static void main(String[] args) {

		// Tricou obj=new Tricou"123","tricouCeva", "mov", "XL",23;

		ArrayList<Tricou> shop = new ArrayList<Tricou>(); // variatii de constructii
		shop.add(new Tricou("123", "tricouCeva", "mov", "XL", 22));
		shop.add(new Tricou("13", "tricouC", "verde", "L", 24));
		shop.add(new Tricou("143", "tricouCeva", "rosu", "XL", 23));
		shop.add(new Tricou("132", "tricouCeva", "blue", "L", 232));
		shop.add(new Tricou("17", "tricouCeva", "red", "S", 2903));

		Magazin ceva = new Magazin("ShopAdalia", shop);

		//System.out.println(ceva);

		// testare metoda - System.out.println(shop.get(0).equalsTricou(shop.get(1)));

//		Tricou deAdaugat = new Tricou("123", "tricouCeva", "mov", "XL", 2);
//
//		ceva.addTricou(deAdaugat);
//
//		System.out.println(ceva);
//		
		Tricou deSters = new Tricou("13", "tricouC", "verde", "L", 1);
		ceva.deleteTricou(deSters);
		
		System.out.println(ceva);

//		ArrayList<Tricou> shop = new ArrayList<Tricou>(); // variatii de constructii
//		shop.add(new Tricou ("123","tricouCeva", "mov", "XL",23));
//		shop.add(new Tricou ("188","tricouC", "verde", "M",123));
//		shop.add(new Tricou ("14","tricouCeva", "rosu", "L",423));
//		shop.add(new Tricou ("163","tricouCeva", "alb", "S",2923));
//		shop.add(new Tricou ("17","tricouCeva", "albastru", "XLL",1423));
//		
//		
//		Magazin ceva = new Magazin ("ShopAdalia",shop);
//		
//		System.out.println(ceva);

		// testare metoda de comparare tricouri din lista
		// System.out.println(shop.get(0).equalsTricou(shop.get(1)));
//		
//		Tricou deAdaugat = new Tricou ("123","tricouCeva", "mov", "XL",44);
//		
//		ceva.addTricou(deAdaugat);
//		
//		System.out.println(ceva);
//		

		/*
		 * System.out.println(shop.size());
		 * 
		 * for(int i=0;i<shop.size();i++) System.out.println(shop.get(i));
		 * 
		 * System.out.println(" ");
		 * 
		 * 
		 * System.out.println("ID ca si INTEGERS"); for(int i=0;i<shop.size();i++)
		 * System.out.println(shop.get(i).convertIDtoInt());
		 * 
		 * 
		 * System.out.println(" ");
		 * 
		 * System.out.println("Tricourile cu ID urile nr prime"); for(int
		 * i=0;i<shop.size();i++) if(NrPrim(shop.get(i).convertIDtoInt()))
		 * System.out.println(shop.get(i));
		 * 
		 * System.out.println(" ");
		 * 
		 * //customSort(shop);
		 * 
		 * Collections.sort(shop, new ComparatorTricouNrBucati());
		 * 
		 * System.out.println("Sortarea dupa nr de bucati este: "); for(int
		 * i=0;i<shop.size();i++) System.out.println(shop.get(i));
		 * 
		 * 
		 */
	}

}