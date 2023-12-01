package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProDAO;
import com.example.domain.ProVO;
import com.example.domain.QueryVO;

@RestController
@RequestMapping("/pro")
public class ProRestController {
	@Autowired
	ProDAO dao;
	
	@GetMapping("/list.json")
	public HashMap<String,Object> list(QueryVO vo){
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total());
		return map;
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody ProVO vo) {
		dao.insert(vo);
	}
}
