package com.example.dao;

import java.util.HashMap;
import java.util.List;

public interface StuDAO {
	public List<HashMap<String,Object>> list();
	public List<HashMap<String,Object>> listEnroll(String scode);
}
