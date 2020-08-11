package dagachi.dao.customer;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dagachi.dto.customer.CboardDTO;

@Repository
public class CboardDAOImpl implements CboardDAO {

	@Inject
	private SqlSession sql;

	private static String namespace = "question";

	@Override
	public List<CboardDTO> list() throws Exception {
		return sql.selectList(namespace + ".Cquestion");
	}

	@Override
	public void write(CboardDTO vo) throws Exception {

		sql.insert(namespace + ".Cwrite", vo);
	}

	// 게시물 조회
	public CboardDTO view(int customer_writeNo) throws Exception {

		return sql.selectOne(namespace + ".Cview", customer_writeNo);
	}
}