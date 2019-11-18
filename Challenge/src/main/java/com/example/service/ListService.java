package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.GroceryList;
import com.example.repo.ListDao;


@Service
public class ListService {
	private ListDao ld;
	
	public List<GroceryList> getAll(){
		return ld.findAll();
	}
	
	public GroceryList getById(int list_id) {
		return ld.findById(list_id);
	}
	
	public void update(GroceryList l) {
		ld.update(l);
	}
	
	public void insertList(GroceryList l) {
		ld.insert(l);
	}
	
	public void deleteList(GroceryList l) {
		ld.delete(l);
	}
	
	public void hibernateUpdate(GroceryList l) {
		ld.updateHibernate(l);
	}
	
	public ListDao getLd() {
		return ld;
	}
	
	@Autowired
	public void setLd(ListDao ld) {
		this.ld=ld;
	}
	
}
