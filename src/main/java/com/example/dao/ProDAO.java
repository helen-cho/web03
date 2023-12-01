package com.example.dao;
import java.util.*;
import com.example.domain.*;

public interface ProDAO {
	public List<HashMap<String,Object>> list(QueryVO vo);
	public int total();
	public void insert(ProVO vo);
	public void delete(String pcode);
}
