package be.intecbrussel.notebooks.jpa;

import be.intecbrussel.notebooks.jpa.entity.Student;
import be.intecbrussel.notebooks.jpa.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CRUDOperations {
    public void insertEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Student student = new Student("Rame","Fadatare","rames@javaguides.com");
        entityManager.persist(student);
        transaction.commit();
        entityManager.close();
    }

    public void findEntity(int id) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        Student student = entityManager.find(Student.class, id);
        System.out.println(student);
        entityManager.close();
    }

    public void updateEntity(int id) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Student student = entityManager.find(Student.class, id);
        student.setFirstName("Ram");
        student.setLastName("jadhav");
        transaction.commit();
        entityManager.close();
    }

    public void removeEntity(int id) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
        transaction.commit();
        entityManager.close();
    }
}
