package ch04_pjt_exercise;

import org.springframework.context.support.GenericXmlApplicationContext;

import ch04_pjt_exercise.controller.MemberController;
import ch04_pjt_exercise.dao.MemberDO;
import ch04_pjt_exercise.utils.InitSampleData;


public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] ids= initSampleData.getIds();
		String[] passwords= initSampleData.getPasswords();
		String[] contacts= initSampleData.getContacts();
		String[] emails= initSampleData.getEmails();
		String[] registeredDates= initSampleData.getRegisteredDates();
		String[] modifiedDates = initSampleData.getModifiedDates();
		
		MemberController mc = 
				ctx.getBean("memberController", MemberController.class);
		for(int i = 0 ; i < ids.length ; i++) {
			mc.insert(new MemberDO(ids[i],passwords[i],contacts[i],emails[i],registeredDates[i],modifiedDates[i]));
		}
		
		mc.showAllMembers();
		
		ctx.close();
	}

}
