package dongsim.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dongsim.bean.DongSimDTO;

@Repository("dao")
public class DongSimDAO  {
	
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<DongSimDTO> selectAll()  {
		return sqlSession.selectList("mybatis.DongSimMapper.selectAll");
	}
    
	public int getTotal() {
		return sqlSession.selectOne("mybatis.DongSimMapper.getTotal");
	}
	
}