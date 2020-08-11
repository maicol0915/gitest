package dagachi.dao;

import org.springframework.stereotype.Repository;

import dagachi.dto.SignUpDTO;

@Repository
public interface SignUpDAO {
	public void register(SignUpDTO dto) throws Exception;
}