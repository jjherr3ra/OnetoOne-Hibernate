/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.persistenceTest;

/**
 *
 * @author MACJuanJara
 */


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import una.ac.cr.OnetoOne.model.PassportDetail;
import una.ac.cr.OnetoOne.model.Person;
import una.ac.cr.persistencehibernate.HibernateUtil;

public class TestHibernate {

    public TestHibernate() {
    }
    
    @Before
    public void setUp(){
    }
    
    //All the test must has @Test annotation
    @Test
    public void testSave(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        // begin a transaction 
        session.beginTransaction();
        
        //creating a PassportDetail object
        PassportDetail passport = new PassportDetail();
        passport.setPassportno("1");
        
        //Saving passport object
        session.save(passport);
        System.out.println("Passport has been created! ID: " + passport.getPassportno());
        
        
        //creating a Person object
        Person person = new Person();
        person.setName("Juan Jara Herrera");
        person.setPassportno(passport);
        
        
        //Saving person object
        session.save(person);
        System.out.println("Person has been created! ID: " + person.getId());
        
        //commit transaccion start
        session.getTransaction().commit();

        session.close();
        HibernateUtil.shutdown();
        
        
    }
}
