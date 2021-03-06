package com.pms.dao;

import java.util.List;

import com.pms.domain.Member;

public interface MemberDao {
	
	public void updateProjectMemberRole(int projectid, int userid, int teamid);

	public List<Member> getUserIdByTeamId(int teamid);

	public void updateMember(int projectId, int userid, int teamid);

	public List<Member> getUserIdByProjectIdAndTeamId(int projectid, int teamid);
	
	public List<Member> getProjectIdByUserId(int userid);

}
