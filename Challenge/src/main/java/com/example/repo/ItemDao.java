package com.example.repo;

import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.models.GroceryItems;

@Transactional
@Repository
public class ItemDao {

	private DataSource dataSource;
	private SessionFactory sesFact;
	
	public void insert(GroceryItems i) {
		sesFact.getCurrentSession().save(i);
	}

	public List<GroceryItems> findAll() {
		Session ses = sesFact.getCurrentSession();
		return ses.createQuery("from GroceryItems", GroceryItems.class).list();
	}
	
	public void deleteItem(int item_id) {
		sesFact.getCurrentSession().delete(item_id);
	}

}
