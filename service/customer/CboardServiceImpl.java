package dagachi.service.customer;

import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import dagachi.dao.customer.CboardDAO;
import dagachi.dto.customer.CboardDTO;

@Component
public class CboardServiceImpl implements CboardService {

	@Inject
	private CboardDAO dao;

	// 게시물 목록
	public List<CboardDTO> list() throws Exception {
		return dao.list();
	}

	// 게시물 작성
	@Override
	public void write(CboardDTO vo) throws Exception {

		dao.write(vo);
	}

	// 게시물 조회
	@Override
	public CboardDTO view(int customer_writeNo) throws Exception {

		return dao.view(customer_writeNo);
	}

}