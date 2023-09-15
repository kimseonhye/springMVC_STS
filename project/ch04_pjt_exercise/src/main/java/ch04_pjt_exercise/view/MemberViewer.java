package ch04_pjt_exercise.view;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import ch04_pjt_exercise.dao.MemberDO;

public class MemberViewer {
	public void showMessage(String line) {
		System.out.print(line);
	}
	
	public void showMember(MemberDO member) {
		this.showMessage(member.getId());
		this.showMessage(member.getPassword());
		this.showMessage(member.getContact());
		this.showMessage(member.getEmail());
		this.showMessage(member.getRegisteredDate());
		this.showMessage(member.getModifiedDate());
	}
	
	public void showAllMembers(Map<String, MemberDO> members) {
		Set<String> keys = members.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println("Member LIST STARTS ----------------");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			MemberDO member= members.get(key);
			System.out.println("| sId: " + member.getId() + "\t");
			System.out.println("| sPw: " + member.getPassword() + "\t");
			System.out.println("| sContact: " + member.getContact() + "\t");
			System.out.println("| sEmail: " + member.getEmail() + "\t");
			System.out.println("| sRegisteredDate: " + member.getRegisteredDate() + "\t");
			System.out.println("| sModifiedDate: " + member.getModifiedDate() + "\t");
		}
		System.out.println("END -----------------------------------");
	}
}
