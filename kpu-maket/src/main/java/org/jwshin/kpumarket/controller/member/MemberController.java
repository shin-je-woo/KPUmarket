package org.jwshin.kpumarket.controller.member;

import org.jwshin.kpumarket.domain.member.MemberVO;
import org.jwshin.kpumarket.service.member.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = {"/signup.do"}, method = RequestMethod.GET)
	public String createMemberGet() throws Exception {
		logger.info(" /signup.do URL GET method called. then forward signup.jsp.");
		return "member/signup";
	}
	
    
    @RequestMapping(value = {"/signup.do"}, method = RequestMethod.POST)
	public String createMemberPost( @ModelAttribute("member") MemberVO vo) throws Exception {
		memberService.addMember(vo);
		logger.info(vo.toString());
		logger.info(" /signup.do URL POST method called. then createMember method executed.");
		return "home";
	}
}
