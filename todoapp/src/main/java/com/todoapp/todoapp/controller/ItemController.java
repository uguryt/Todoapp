package com.todoapp.todoapp.controller; 
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.todoapp.todoapp.entity.Item;  
import com.todoapp.todoapp.service.ItemService;  
//creating RestController  
@RestController  
public class ItemController   
{  
//Autowired the StudentService class  
@Autowired  
ItemService itemService;  
//creating a get mapping that retrieves all the students detail from the database   
@GetMapping("/list")  
private List<Item> getAllItem()   
{  
return itemService.getAllItems();  
}  
//creating a get mapping that retrieves the detail of a specific student  
@GetMapping("/item/{id}")  
private Item getItem(@PathVariable("id") int id)   
{  
return itemService.getItemById(id);  
}  
//creating a delete mapping that deletes a specific student  
@DeleteMapping("/delete")  
private void deleteItem(@RequestBody Item id)   
{  
this.itemService.delete(id);  
}  
//creating post mapping that post the student detail in the database  
@PostMapping("/item")  
private int saveStudent(@RequestBody Item item)   
{  
this.itemService.saveOrUpdate(item);  
return item.getId();
}  
}  