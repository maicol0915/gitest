package dagachi.service;

import dagachi.dto.SignUpDTO;

public interface SignUpService {
	//회원가입
	public void register(SignUpDTO dto) throws Exception;

}