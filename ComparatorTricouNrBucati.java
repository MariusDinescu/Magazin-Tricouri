import java.util.Comparator;


public class ComparatorTricouNrBucati implements Comparator<Tricou> {

	@Override
	public int compare(Tricou o1, Tricou o2) {
		
		if(o1.getNrBucati()>o2.getNrBucati())
			return 1;
		if(o1.getNrBucati()<o2.getNrBucati())
			return -1;
		
		return 0;
	}
	
	

}
