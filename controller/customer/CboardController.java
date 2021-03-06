package dagachi.controller.customer;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dagachi.dto.customer.CboardDTO;
import dagachi.service.customer.CboardService;

@Controller
@RequestMapping
public class CboardController {

	@Inject
	private CboardService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {

		List<CboardDTO> list = null;
		list = service.list();
		model.addAttribute("list", list);
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWirte() throws Exception {

	}

	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String posttWirte(CboardDTO vo) throws Exception {
		service.write(vo);

		return "redirect:/board/list";
	}

	// 게시물 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("customer_writeNo") int customer_writeNo, Model model) throws Exception {

		CboardDTO vo = service.view(customer_writeNo);

		model.addAttribute("view", vo);

	}

}