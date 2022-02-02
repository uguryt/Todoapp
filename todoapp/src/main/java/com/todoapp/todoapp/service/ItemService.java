package com.todoapp.todoapp.service;
  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.todoapp.todoapp.entity.Item;  
import com.todoapp.todoapp.repository.ItemRepository;  
@Service  
public class ItemService   
{  
@Autowired  
ItemRepository itemRepository;  
//getting all student records  
public List<Item> getAllItems()   
{  
List<Item> items = new ArrayList<Item>();  
itemRepository.findAll().forEach(item -> items.add(item));  
return items;  
}  
//getting a specific record  
public Item getItemById(int id)   
{  
return itemRepository.findById(id).get();  
}  
public void saveOrUpdate(Item item)   
{  
this.itemRepository.save(item);  
}  
//deleting a specific record  
public void delete(Item item)   
{  
this.itemRepository.delete(item);  
}  
}  