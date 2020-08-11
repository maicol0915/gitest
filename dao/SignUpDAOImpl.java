package dagachi.dao;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dagachi.dto.SignUpDTO;

@Repository
public class SignUpDAOImpl implements SignUpDAO {

	// 데이터베이스
	@Inject
	private SqlSession sql;

	//매퍼
	private static String namespace = "memberMapper";

	//회원가입
	@Override
	public void register(SignUpDTO dto) throws Exception {
		sql.insert(namespace + ".signupmain", dto);
	}
	
	
}