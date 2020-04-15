package com.cg.dao;

import java.util.List;

import com.cg.entity.Trainee;

public interface TraineeDaoI {
	
	public boolean create(Trainee trainee);
	
	public List<Trainee> reterive();
	
	public Trainee findById(int id);
	
	public void delete(int id);
	
	public void update(int id, String name, String domain, String location);

}
