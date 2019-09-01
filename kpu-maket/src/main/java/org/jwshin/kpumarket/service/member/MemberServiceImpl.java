package org.jwshin.kpumarket.service.member;

import org.jwshin.kpumarket.domain.member.MemberVO;
import org.jwshin.kpumarket.persistence.member.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired	// 스프링 컨테이너가 만든 dao객체 의존관계 주입
	private MemberDAO memberDAO;

	@Override
	public void addMember(MemberVO vo) {
		memberDAO.add(vo);
	}

	@Override
	public MemberVO readMember(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub

	}

}
