package com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class HomeController {
	
	@Autowired
	BookRepo repo;
	
	
	@Autowired
	AuthorRepo arepo;
	
	
	
	//Comment
	
	
	@PostMapping(path="/add",consumes = {"application/json"})
	public Book addBook(@RequestBody Book book)
	{
		repo.save(book);
		return book;
	}
	
	@GetMapping(path="/books" )
	@ResponseBody
	public List<Book> getAll()
	{
		return repo.findAll();
	}
	
	@GetMapping("/book/{id}")
	@ResponseBody
	public Optional<Book> getBook(@PathVariable int id)
	{

		return repo.findById(id);
				
	}
	
	@GetMapping(path="/authors" )
	@ResponseBody
	public List<Author> getAuthors()
	{
		return arepo.findAll();
	}
	
	@DeleteMapping("/book/{id}")
	public String delete(@PathVariable int id)
	{
		Book b=repo.getById(id);
		repo.delete(b);
		
		return "deleted";
	}
	
	@PutMapping(path="/edit",consumes = {"application/json"})
	public Book saveOrUpdateBook(@RequestBody Book book)
	{
		repo.save(book);
		return book;
	}
	



}
