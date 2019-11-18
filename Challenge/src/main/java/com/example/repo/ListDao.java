package com.example.repo;

import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.example.models.GroceryList;

@Transactional
@Repository
public class ListDao {
	
	@Autowired
	private DataSource dataSource;
	private SessionFactory sesFact;
	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public List<GroceryList> findAll() {
		Session ses = sesFact.getCurrentSession();
		return ses.createQuery("from GroceryList", GroceryList.class).list();
	}

	public GroceryList findById(int list_id) {
		Session ses = sesFact.getCurrentSession();
		GroceryList l = ses.get(GroceryList.class, list_id);
		return l;
	}

	public void update(GroceryList l) {
		sesFact.getCurrentSession().update(l);
	}

	public void insert(GroceryList l) {
		sesFact.getCurrentSession().save(l);
	}

	public void delete(GroceryList l) {
		sesFact.getCurrentSession().delete(l);
		
	}

	public void updateHibernate(GroceryList l) {
		template.update(l);
	}
	
	@Autowired
	public ListDao(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}

}
