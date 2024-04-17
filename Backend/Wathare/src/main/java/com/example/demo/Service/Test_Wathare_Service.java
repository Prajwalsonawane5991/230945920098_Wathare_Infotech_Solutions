package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Wathare;
import com.example.demo.Repositary.Test_Wathare_Repo;

@Service
public class Test_Wathare_Service {

  @Autowired
  Test_Wathare_Repo  testrepo;

public List<Wathare> findall() {
	
	return testrepo.findAll();
}

}
