package br.gov.sc.epagri.jpautil;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {

    private EntityManagerFactory factory;

    public JPAUtil() {
        this.factory = Persistence.createEntityManagerFactory("epagri");
    }


    public EntityManager createEntityManager() {
        return factory.createEntityManager();
    }

    public void closeEntityManager(EntityManager manager) {
        manager.close();
    }

}