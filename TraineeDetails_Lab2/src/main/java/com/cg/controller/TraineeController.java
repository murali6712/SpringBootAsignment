package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Trainee;
import com.cg.service.TraineeServiceI;

@RestController
@RequestMapping("/trainerDetails")

public class TraineeController {
	
	@Autowired
	private TraineeServiceI traineeService;
	
	
	@PostMapping("/trainer")
	public ResponseEntity<Object> saveBook(@RequestBody Trainee tr) {
		traineeService.create(tr);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping("/gettrainerDetails")
    public ResponseEntity<List<Trainee>> getTrainerlist() {
			List<Trainee> list = traineeService.reterive();
			return new ResponseEntity<List<Trainee>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/deleteTrainer/{id}")
	public ResponseEntity<Object> deleteTrainer(@PathVariable("id") int id)
	{
		traineeService.delete(id);
		return new ResponseEntity<>("Dleted",HttpStatus.NO_CONTENT);
	}
	@GetMapping("/viewTrainer/{id}")
	public ResponseEntity<Trainee> viewTrainer(@PathVariable("id") int id)
	{
		Trainee tr=traineeService.findById(id);
		return new ResponseEntity<Trainee>(tr,HttpStatus.OK);
		
	}
	@PutMapping("/updateTrainer/{id}")
	public ResponseEntity<Object> updateTrainer(@PathVariable("id") int id,@RequestBody Trainee tr)
	{
		traineeService.update(id, tr.getTraineeName(), tr.getTraineeDomain(), tr.getTraineeLocation());
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
