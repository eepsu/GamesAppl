package be.belfius.Games.repository;

import java.util.ArrayList;
import java.util.List;
import be.belfius.Games.domain.Borrower;

public class BorrowerRepository {

	private List<Borrower>borrowers = new ArrayList<>();
	
	public BorrowerRepository(){
		borrowers.add(new Borrower(2,"Jan Peeters","Begonialaan","25","A",2440,"Geel","014572810","jan.peeters@khk.be"));
		borrowers.add(new Borrower(1,"Wim Jaspers","Namensebaan","146",null,3000,"Leuven","015456456","wim@hotmail.com"));
		borrowers.add(new Borrower(3,"Emiel Hanssen","Terkolder","15",null,2400,"Mol","014142310","emiel.hanssen@telenet.be"));
	}
	public Borrower getFirstBorrower() {
		int first = 1;
		Borrower firstBorrower = null;
		for (Borrower foundBorrower : borrowers) {
			if (foundBorrower.getBorrowerId() == first){
				firstBorrower = foundBorrower;
				break;
			}
		}
		return firstBorrower;
		
		
	}
}
