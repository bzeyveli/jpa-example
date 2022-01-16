package jpa.FactoryImpl;

import com.example.jpa.Factory.Factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class JpaFactoryImpl implements Factory {

    private EntityManager entityManager = null;

    @Override
    public EntityManager getEntityManager() {
        EntityManagerFactory entityManagerFactory = entityManager.getEntityManagerFactory();
        this.entityManager = entityManagerFactory.createEntityManager();
        return  entityManager;
    }
    @Override
    public EntityTransaction getEntityTransaction() {
        EntityTransaction transaction = this.entityManager.getTransaction();
        return transaction;
    }
}
