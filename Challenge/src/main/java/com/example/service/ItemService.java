package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.GroceryItems;
import com.example.repo.ItemDao;

@Service
public class ItemService {
	
	private ItemDao Itda;
	
	public void insertItem(GroceryItems i) {
		Itda.insert(i);
	}
	
	public List<GroceryItems> getAll(){
		return Itda.findAll();
	}
		
	public ItemDao getItda() {
		return Itda;
	}
	
	public void deleteItem(int item_id) {
		Itda.deleteItem(item_id);
	}

	@Autowired
	public void setItda(ItemDao Itda) {
		this.Itda = Itda;
	}
	
	
}
