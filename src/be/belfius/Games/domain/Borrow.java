package be.belfius.Games.domain;

import java.time.LocalDateTime;

public class Borrow {

	int borrowId;
	int borrowGameId;
	int borrowerId;
	LocalDateTime borrowDate;
	LocalDateTime returnDate;
	public Borrow(int borrowId, int borrowGameId, int borrowerId, LocalDateTime borrowDate, LocalDateTime returnDate) {
		super();
		this.borrowId = borrowId;
		this.borrowGameId = borrowGameId;
		this.borrowerId = borrowerId;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	public int getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}
	public int getBorrowGameId() {
		return borrowGameId;
	}
	public void setBorrowGameId(int borrowGameId) {
		this.borrowGameId = borrowGameId;
	}
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public LocalDateTime getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(LocalDateTime borrowDate) {
		this.borrowDate = borrowDate;
	}
	public LocalDateTime getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "Borrow [borrowId=" + borrowId + ", borrowGameId=" + borrowGameId + ", borrowerId=" + borrowerId
				+ ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + "]";
	}
	
	
	
	
}
