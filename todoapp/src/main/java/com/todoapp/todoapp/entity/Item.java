package com.todoapp.todoapp.entity;  
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import javax.persistence.Table;


//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Item   
{  
//mark id as primary key  
@Id  
//defining id as column name  
@Column
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;  
//defining name as column name
@Column  
private String title;  
//defining age as column name  
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