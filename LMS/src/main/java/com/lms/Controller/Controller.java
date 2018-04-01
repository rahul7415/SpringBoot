package com.lms.Controller;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lms.Modals.Book;
import com.lms.Services.LmsService;


@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private LmsService lmsService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping("/getAll")
	public String getAllBook(final Model model){
		model.addAttribute("list", lmsService.findAllbook());
		return "success" ;
	}
	@RequestMapping("/delete")
	public String deleteRecord(@RequestParam long id,final Model model) {
		
		lmsService.deleteRecord(id);
		model.addAttribute("list", lmsService.findAllbook());
		return "success" ;
	}
	
	@RequestMapping("/edit")
	public String editRecord(@RequestParam long id,Map<String, Object> m,final Model model,HttpServletRequest req) {
		m.put("book", new Book());
		//model.addAttribute("record", lmsService.getRecord(id));
		Book bk=lmsService.getRecord(id);
		System.out.println("details=="+bk.getAuthor()+" == "+bk.getBookName());
		
		req.setAttribute("Book",bk );
		return "NewCustomer" ;
	}
	
	/*@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(
	            dateFormat, false));
	}*/
	@RequestMapping("/update")
	public String updateRecord(@ModelAttribute Book book,Model model,Errors errors,HttpServletRequest req)throws Exception {
		
		/*if(errors.hasErrors()) {
			req.setAttribute("msg","There is something error in your form");
			return "NewCustomer" ;	
			
		}*/
		
		
		
		lmsService.updateRecored(book);
		model.addAttribute("list", lmsService.findAllbook());
		return "success" ;
		
	}
	

}
