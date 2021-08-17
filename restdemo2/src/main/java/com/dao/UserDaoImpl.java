package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exception.UserException;
import com.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private UserException userException;
	@Override
	public User getUser() {
		Session    session=sessionFactory.openSession();
	    String query="from User";
	    List<User> users=session.createQuery(query).list();
	        return users.get(0);
		
	}
	@Override
	public User getUserByName(String name) throws UserException {
		Session    session=sessionFactory.openSession();
        String query="from User u where u.userName='"+name+"'";
        List<User> users=session.createQuery(query).list();
            return users.get(0);
		
	}
	@Override
	public User getUserById(int id) throws UserException {
		Session    session=sessionFactory.openSession();
        String query="from User u where u.userId='"+id+"'";
        User user=(User) session.createQuery(query);
            return user;
		
	}
	@Override
	public List<User> getUsers() {
		Session    session=sessionFactory.openSession();
        String query="from User";
        List<User> users=session.createQuery(query).list();
        return users;
		
	}
	@Override
	public User addUsers(User user) {
		Session session= sessionFactory.openSession();
        session.save(user);
        return user;
        
	}
	@Override
	public int updateUser(User user) {
		Session session= sessionFactory.openSession();
        String query="update User u set u.userName='"+user.getUserName()+"',u.password='"+user.getPassword()+"' where u.userId='"+user.getUserId()+"'";
        int status=session.createQuery(query).executeUpdate();
        return status;
	}
	@Override
	public int deleteUser(int id) throws UserException{
        Session session= sessionFactory.openSession();
        String query="delete from User u where u.userId='"+id+"'";
        int temp=session.createQuery(query).executeUpdate();
        return temp;
		
	
	}


}
