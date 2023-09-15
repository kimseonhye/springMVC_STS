package ch04_pjt_exercise.dao;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {
	private Map<String, MemberDO> memberDB = new HashMap<String, MemberDO>();
	
	public MemberDO select(String id) {
		return memberDB.get(id);
	}
	public void insert(MemberDO member) {
		memberDB.put(member.getId(),member);
	}
	public void delete(String id) {
		memberDB.remove(id);
	}
	public void update(MemberDO member) {
		memberDB.put(member.getId(), member);
	}
	
	public Map<String, MemberDO> getMembers() {
		return memberDB;
	}
}
