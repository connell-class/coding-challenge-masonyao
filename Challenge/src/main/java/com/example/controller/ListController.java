package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.models.GroceryList;
import com.example.service.ItemService;
import com.example.service.ListService;

@Controller
@RequestMapping(value="/list")
@CrossOrigin(origins="*")
public class ListController {
	
	private ListService list;
	private ItemService item;
	
	@RequestMapping(value="/insert.app", method = RequestMethod.POST)
	public @ResponseBody GroceryList insert(@RequestBody GroceryList l) {
		System.out.println(l);
		list.insertList(l);
		return l;
	}
	
	@RequestMapping(value="/update.app", method = RequestMethod.POST)
	public @ResponseBody void updateList(@RequestBody GroceryList l) {
		list.update(l);
	}
	
	public ListService getList() {
		return list;
	}
	
	public ItemService getItem() {
		return item;
	}
	
	@Autowired
	public void setList(ListService list) {
		this.list = list;
	}
	
	@Autowired
	public void getItem(ItemService item) {
		this.item = item;
	}
}
