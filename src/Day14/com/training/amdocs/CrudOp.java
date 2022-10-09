package Day14.com.training.amdocs;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CrudOp {
	public void insertEntity() {
		EntityManagerFactory studFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = studFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		Student stud=new Student("Joe", "A");
		stud.setStudName("Harshit Raj");
		stud.setStudGrade("B+");
		stud.setStudName("Sweta Raj");
		stud.setStudGrade("D");
		stud.setStudName("Nitesh");
		stud.setStudGrade("A");
		stud.setStudName("Prashant");
		stud.setStudGrade("D");
		stud.setStudName("Saurabh");
		stud.setStudGrade("B+");
		stud.setStudName("Rajesh");
		stud.setStudGrade("B+");
		entity.persist(stud);
		entity.getTransaction().commit();
		entity.close();
		studFactoryObj.close();
	}
	
	public void updateEntity() {
		EntityManagerFactory studFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = studFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		Student stud = entity.find(Student.class, 1);
		
		stud.setStudGrade("B");
		entity.getTransaction().commit();
		entity.close();
		studFactoryObj.close();
	
	}
	
	public void findEntity() {
		EntityManagerFactory studFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = studFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		Student stud = entity.find(Student.class, 1);
		System.out.println("student Name: "+stud.getStudName());
		entity.getTransaction().commit();
		entity.close();
		studFactoryObj.close();
		
	}
	
	public void removeEntity() {
		EntityManagerFactory studFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = studFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		Student stud = entity.find(Student.class, 1);
		
		entity.remove(stud);
		entity.getTransaction().commit();
		entity.close();
		studFactoryObj.close();
		
	}

}
