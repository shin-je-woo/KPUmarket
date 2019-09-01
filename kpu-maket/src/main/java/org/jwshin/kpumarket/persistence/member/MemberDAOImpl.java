package org.jwshin.kpumarket.persistence.member;

import org.apache.ibatis.session.SqlSession;
import org.jwshin.kpumarket.domain.member.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession sqlSession;

	@Override
	public MemberVO read(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(MemberVO vo) {
		sqlSession.insert("member.addMember", vo);
	}

	@Override
	public void update(MemberVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String userid) {
		// TODO Auto-generated method stub

	}

}
