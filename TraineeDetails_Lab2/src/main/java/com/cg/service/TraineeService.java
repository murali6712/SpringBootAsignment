package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeDao;
import com.cg.dao.TraineeDaoI;
import com.cg.entity.Trainee;

@Service
public class TraineeService implements TraineeServiceI{
	
	@Autowired
	private TraineeDaoI traineedao;

	@Override
	public void create(Trainee trainee) {
		// TODO Auto-generated method stub
		boolean b = traineedao.create(trainee);
		if (b == true)
		{
			System.out.println("Trainee Details Added Successfully");
		}
		else
		{
			System.out.println("Trainee Details Not Added Successfully");
		}
	}

	@Override
	public List<Trainee> reterive() {
		// TODO Auto-generated method stub
		List<Trainee> list = traineedao.reterive();
		return list;
	}

	@Override
	public Trainee findById(int id) {
		// TODO Auto-generated method stub
		Trainee trainee = traineedao.findById(id);
		return trainee;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		traineedao.delete(id);
	}

	@Override
	public void update(int id, String name, String domain, String location) {
		// TODO Auto-generated method stub
		traineedao.update(id, name, domain, location);
	}

}
