package org.jwshin.kpumarket.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.jwshin.kpumarket.domain.member.MemberVO;
import org.jwshin.kpumarket.service.member.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemberAddTest {

	@Autowired
	private MemberService memberService;
	
	private static Logger logger = LoggerFactory.getLogger(MemberAddTest.class);
	
	@Test
	public void testAddMember() {
		
		MemberVO vo = new MemberVO();
		vo.setUserid("testid");
		vo.setPasswd("testpw");
		vo.setUsername("testusername");
		vo.setDepart("testdepart");
		vo.setMobile("testmobile");
		vo.setEmail("testemail");
		vo.setAddress("testaddr");
		memberService.addMember(vo);
		logger.info("testAddMember()완료 " + vo.toString());
	}

}
