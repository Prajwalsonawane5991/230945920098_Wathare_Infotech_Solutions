package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Wathare;
import com.example.demo.Service.Test_Wathare_Service;
@CrossOrigin("*")
@RestController
@RequestMapping("test/")
public class Test_Wathare_Controller {
	  @Autowired
	  Test_Wathare_Service wser;

	@GetMapping("api")
	public ResponseEntity<List<Wathare>> getmachinestatus()
	{
		{
			 List<Wathare> content = wser.findall();

		        if (content.isEmpty()) {
		            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		        } else {
		            return new ResponseEntity<>(content, HttpStatus.OK);
		        }
		}
		
	}
}
