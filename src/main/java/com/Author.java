package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	
	
	@Id
	int id;
	String AuthorName;
	
	
	
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", AuthorName=" + AuthorName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	
	

}
