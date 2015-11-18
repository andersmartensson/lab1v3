/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Anders
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String name = UserDB.getName();
        //System.out.println("namn: " + name);


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
        EntityManager em = emf.createEntityManager();

        User u = new User();

        u.setName("oliver");
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
    
}
