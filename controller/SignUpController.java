package dagachi.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dagachi.service.SignUpService;
import dagachi.dto.SignUpDTO;

@Controller
@RequestMapping("/*")
public class SignUpController {

	private static final Logger logger = LoggerFactory.getLogger(SignUpController.class);

	@Inject
	SignUpService service;

	// 회원가입폼 작성 get
	@RequestMapping(value = "/signupmain", method = RequestMethod.GET)
	public void getRegister() throws Exception {
		logger.info("get register");
	}

	// 회원가입폼 작성 post
	@RequestMapping(value = "/signupmain", method = RequestMethod.POST)
	public void postRegister(SignUpDTO dto) throws Exception {
		logger.info("post resister");
	}
	
	//메인 > 회원가입폼 get
	@GetMapping(value = "/register")
	public void getSignupmain(SignUpDTO dto) throws Exception {
		logger.info("get Signupmain");
	}
	
	//메인 > 회원가입폼 post
	@PostMapping(value = "/register")
	public void postSignupmain(SignUpDTO dto) throws Exception {
		logger.info("post Signupmain");
	}

}