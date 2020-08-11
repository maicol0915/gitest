package dagachi.service.customer;

import java.util.List;

import dagachi.dto.customer.CboardDTO;

public interface CboardService {

	// 게시물 목록
	public List<CboardDTO> list() throws Exception;

	// 게시물 작성
	public void write(CboardDTO vo) throws Exception;

	// 게시물 조회
	public CboardDTO view(int customer_writeNo) throws Exception;
}