package hibernatedemo2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Answer;
import com.model.Department;
import com.model.Person;
import com.model.Question;


public class HibernateDemoMain {
	public static void main(String[] args)
	{
		Configuration config=new Configuration();
	    config.configure("hibernate.cfg.xml");
	    SessionFactory sfg=config.buildSessionFactory(); 
	    Session session=sfg.openSession();
	    Department dept=new Department(1,"cse","Hyd");
	    session.save(dept);
	    org.hibernate.Query query=session.getNamedQuery("findDepartmentByDeptName");
	    Transaction tx=session.beginTransaction();
	    tx.commit();
	    /*Configuration config=new Configuration();
	    config.configure("hibernate.cfg.xml");
	    SessionFactory sfg=config.buildSessionFactory(); 
	    Session session=sfg.openSession();
	    Person p=new Person();
	    p.setFirstname("Udutha");
	    p.setMiddlename("Bhargav");
	    p.setLastname("Yadav");
	    Address a=new Address();
	    a.setCity("Hyd");
	    a.setState("Telangana");
	    a.setCountry("India");
	    p.setAddress(a);
	    session.save(p);
	    Transaction tx=session.beginTransaction();
	    tx.commit();*/
	    
	    
	    
	    /*Question que=new Question();
	    que.setQuestion_name("Name some programming Languages?");
	    Answer ans=new Answer();
	    ans.setAnswer_name("C");
	    Answer ans1=new Answer();
	    ans1.setAnswer_name("Java");
	    List<Answer> ls=new ArrayList<Answer>();
	    ls.add(ans);
	    ls.add(ans1);
	    que.setAnswers(ls);
	    session.save(que);
	    Transaction tx=session.beginTransaction();
	    tx.commit();*/
	}
    
    //-------creation and insertion-------
    //Student std=new Student(1,"Bhargav",22);
    
}

