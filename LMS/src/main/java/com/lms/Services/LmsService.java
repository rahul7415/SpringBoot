package com.lms.Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lms.Modals.Book;
import com.lms.Dao.BookDao;

@Service
public class LmsService {
	
	@Autowired
	private BookDao bookdao;
	
	public Collection<Book> findAllbook(){
		List<Book> books= new ArrayList<Book>();
		for (Book book : bookdao.findAll()) {
			Book bk= new Book();
			bk.setId(book.getId());
			bk.setBookName(book.getBookName());
			bk.setAuthor(book.getAuthor());
			bk.setPurchaseDate(book.getPurchaseDate());
			books.add(bk);
		}
		return books;
		
	}
	
	public void deleteRecord(long id){
		
		bookdao.delete(id);
	}
	
	public Book getRecord(long id){
		Book books= bookdao.findOne(id);
		return books;
	}
	
	public void updateRecored(Book bk) {
		bookdao.save(bk);
	}

}


