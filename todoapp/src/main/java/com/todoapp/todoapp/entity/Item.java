package com.todoapp.todoapp.entity;  
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import javax.persistence.Table;


  
@Entity  
@Table  
public class Item   
{  

@Id   
@Column
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;  

@Column  
private String title;  
 
@Column  
private String content;  

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
}