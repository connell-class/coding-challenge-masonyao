package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.models.GroceryItems;
import com.example.service.ItemService;
import com.example.service.ListService;

@Controller
@RequestMapping(value="/items")
@CrossOrigin(origins="*")
public class ItemController {
	private ListService list;
	private ItemService item;
	
	@RequestMapping(value="/getAll.app", method=RequestMethod.POST)
	public @ResponseBody List<GroceryItems> getAll(){
		return item.getAll();
	}
	
	public ItemService getItem() {
		return item;
	}
	
	@Autowired
	public void setItem(ItemService item) {
		this.item = item;
	}
	
	public ListService getList() {
		return list;
	}
	
	@Autowired
	public void setList(ListService list) {
		this.list = list;
	}
}
