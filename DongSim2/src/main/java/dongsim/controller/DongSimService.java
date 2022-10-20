package dongsim.controller;

import java.util.List;


import dongsim.bean.DongSimDTO;



public interface DongSimService {
    
	   
	  // 리스트
	   public List<DongSimDTO> selectAll();
	   
	   //총 갯수
	   public int getTotal();
}