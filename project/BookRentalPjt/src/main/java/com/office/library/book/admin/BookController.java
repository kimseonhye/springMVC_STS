package com.office.library.book.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.office.library.book.BookVO;
import com.office.library.book.admin.util.UploadFileService;

@Controller
@RequestMapping("/book/admin")
public class BookController {
	
	
	@Autowired
	BookService bookService;
	
	@Autowired
	UploadFileService uploadFileService;
	
	@GetMapping("/registerBookForm")
	public String registerBookForm() {
		System.out.println("[BookController] registerBookForm()");
		
		String nextPage = "admin/book/register_book_form";
		
		return nextPage;
	}
	
	@PostMapping("/registerBookConfirm")
	public String registerBookConfirm(BookVO bookVO,
										@RequestParam("file") MultipartFile file) {
		System.out.println("[BookController] registerBookConfirm()");
		String nextPage = "admin/book/register_book_ok";
		
		String savedFileName = uploadFileService.upload(file);
		
		if(savedFileName != null) {
			bookVO.setB_thumnail(savedFileName);
			int result = bookService.registerBookConfirm(bookVO);
			
			if(result <= 0) {
				nextPage = "admin/book/register_book_ng";
			}  
		} else {
			nextPage = "admin/book/register_book_ng";
		}
		return nextPage;
	}

}
