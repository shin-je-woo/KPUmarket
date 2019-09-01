package org.jwshin.kpumarket.service.member;

import org.jwshin.kpumarket.domain.member.MemberVO;

public interface MemberService {

	public void addMember(MemberVO vo);
	public MemberVO readMember(String userid);
	public void deleteMember(String userid);
	public void updateMember(MemberVO vo);
	
}
