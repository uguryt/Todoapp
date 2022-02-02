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
 
@RestController  
public class ItemController   
{  
  
@Autowired  
ItemService itemService;  
  
@GetMapping("/list")  
private List<Item> getAllItem()   
{  
return itemService.getAllItems();  
}  

@GetMapping("/item/{id}")  
private Item getItem(@PathVariable("id") int id)   
{  
return itemService.getItemById(id);  
}  

@DeleteMapping("/delete")  
private void deleteItem(@RequestBody Item id)   
{  
this.itemService.delete(id);  
}  
 
@PostMapping("/item")  
private int saveStudent(@RequestBody Item item)   
{  
this.itemService.saveOrUpdate(item);  
return item.getId();
}  
}  