package com.jspider.moviedetails.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.moviedetails.dto.Movie;


@Repository
public class MovieRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveRegisterDetails(Movie movie) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(movie);
		transaction.commit();
		
	}
	
	public List<Movie> getMovieAll() {
		Session session = sessionFactory.openSession();
		String hql="from Movie";
		Query query=session.createQuery(hql);
		List<Movie> list = query.list();
		return list;
	}

	public Movie getMovieById(Long id) {
	Session session = sessionFactory.openSession();
	String hql="from Movie where id=:i";
	Query query=session.createQuery(hql);
	query.setParameter("i", id);
	return (Movie) query.uniqueResult();
	
	}
	@Transactional
	public int deleteMovieByName(String moviename) {
		Session session = sessionFactory.openSession();
		String hql="delete from Movie where moviename=:i";
		Query query=session.createQuery(hql);
		query.setParameter("i", moviename);
		Transaction transaction = session.beginTransaction();
		int i=query.executeUpdate();
		transaction.commit();
		return i;
		
		}

}
