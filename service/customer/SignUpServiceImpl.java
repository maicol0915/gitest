package dagachi.service.customer;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import dagachi.dao.SignUpDAO;
import dagachi.dto.SignUpDTO;
@Service
public class SignUpServiceImpl implements SignUpService{
	
	@Inject
	SignUpDAO dao;

	//회원가입
	@Override
	public void register(SignUpDTO dto) throws Exception {
		dao.register(dto);
	}
}