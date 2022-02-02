package com.todoapp.todoapp.repository;
 
import org.springframework.data.repository.CrudRepository;  
import com.todoapp.todoapp.entity.Item;  
public interface ItemRepository extends CrudRepository<Item, Integer>  
{  
}  