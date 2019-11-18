package com.example.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="grocery_items")
public class GroceryItems {
	@Id
	@Column(name="item_id")
	private int item_id;
	@Column(name="item_type")
	private String item_type;
	@Column(name="item_name")
	private String item_name;
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="list_id")
	private int item_list;
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_list() {
		return item_list;
	}
	public void setItem_list(int item_list) {
		this.item_list = item_list;
	}
	@Override
	public String toString() {
		return "GroceryItems [item_id=" + item_id + ", item_type=" + item_type + ", item_name=" + item_name
				+ ", item_list=" + item_list + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + item_id;
		result = prime * result + item_list;
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		result = prime * result + ((item_type == null) ? 0 : item_type.hashCode());
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
		GroceryItems other = (GroceryItems) obj;
		if (item_id != other.item_id)
			return false;
		if (item_list != other.item_list)
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (item_type == null) {
			if (other.item_type != null)
				return false;
		} else if (!item_type.equals(other.item_type))
			return false;
		return true;
	}
	public GroceryItems(int item_id, String item_type, String item_name, int item_list) {
		super();
		this.item_id = item_id;
		this.item_type = item_type;
		this.item_name = item_name;
		this.item_list = item_list;
	}
	public GroceryItems() {
		super();
		// TODO Auto-generated constructor stub
	}
}
