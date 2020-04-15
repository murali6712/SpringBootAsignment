package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.cg.entity.Trainee;

@Transactional
@Repository
public class TraineeDao implements TraineeDaoI{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public boolean create(Trainee trainee) {
		entityManager.persist(trainee);
		return true;
	}

	@Override
	public List<Trainee> reterive() {
		// TODO Auto-generated method stub
		String Qstr="SELECT trainee FROM Trainee trainee";
		TypedQuery<Trainee> query=entityManager.createQuery(Qstr,Trainee.class);
		return query.getResultList();
	}

	@Override
	public Trainee findById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Trainee.class, id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Trainee trainee=entityManager.find(Trainee.class, id);
		
		/*
		System.out.println(trainee.getTraineeId() + " " + trainee.getTraineeName() + " " + trainee.getTraineeDomain() + " " + trainee.getTraineeLocation() 
			+ "is removed");
		*/
		
		entityManager.remove(trainee);
	}

	@Override
	public void update(int id, String name, String domain, String location) 
	{
		// TODO Auto-generated method stub
		Trainee trainer= entityManager.find(Trainee.class, id);
		trainer.setTraineeName(name);
		trainer.setTraineeDomain(domain);
		trainer.setTraineeLocation(location);
	    entityManager.flush();  
	}

}
