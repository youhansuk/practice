package dongsim.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dongsim.bean.DongSimDTO;

@Controller
public class DongSimController {
	
	@Autowired
	private DongSimService dongsimService;
	
	
	 @RequestMapping("/Quiz/quizList.do")
	   public ModelAndView quizList(HttpServletRequest request) {
		
		    
			List<DongSimDTO> list = dongsimService.selectAll();
			int total = dongsimService.getTotal();
			
			
			
			ModelAndView mv = new ModelAndView();
		    mv.addObject("list",list);
		    mv.addObject("total", total);
			mv.setViewName("quizList");
			return mv;
		}

}