package com.lms.Modals;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="LMS_TBL")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="PURCHASE_DATE")
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Book(long id, String bookName, String author, Date purchaseDate) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.purchaseDate = purchaseDate;
	}

	public Book() {
		super();
	}
	
	

}
