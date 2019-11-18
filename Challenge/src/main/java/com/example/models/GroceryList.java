package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grocery_list")
public class GroceryList {
	@Id
	@Column(name="list_id")
	private int list_id;
	@Column(name="list_length")
	private int list_length;
	public int getList_id() {
		return list_id;
	}
	public void setList_id(int list_id) {
		this.list_id = list_id;
	}
	public int getList_length() {
		return list_length;
	}
	public void setList_length(int list_length) {
		this.list_length = list_length;
	}
	@Override
	public String toString() {
		return "GroceryList [list_id=" + list_id + ", list_length=" + list_length + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + list_id;
		result = prime * result + list_length;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		if (list_id != other.list_id)
			return false;
		if (list_length != other.list_length)
			return false;
		return true;
	}
	public GroceryList(int list_id, int list_length) {
		super();
		this.list_id = list_id;
		this.list_length = list_length;
	}
	public GroceryList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
