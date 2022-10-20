package dongsim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dongsim.bean.DongSimDTO;
import dongsim.dao.DongSimDAO;

@Service
public class DongSimServiceImpl implements DongSimService {
	
	@Autowired
	private DongSimDAO dao;

	
	@Override
	public List<DongSimDTO>  selectAll() {
		return dao.selectAll();
	}
    
	@Override
	public int getTotal() {
		return dao.getTotal();
	}

}