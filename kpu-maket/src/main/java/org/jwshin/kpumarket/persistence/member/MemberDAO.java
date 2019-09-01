package org.jwshin.kpumarket.persistence.member;

import java.util.List;

import org.jwshin.kpumarket.domain.member.MemberVO;

public interface MemberDAO {

	public MemberVO read(String userid);
	public void add(MemberVO vo);
	public void update(MemberVO vo);
	public void delete(String userid);

}
