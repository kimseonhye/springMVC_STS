package com.ncs.test.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncs.test.member.model.sevice.MemberService;
import com.ncs.test.member.model.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
    private MemberService memberService;
	
	@RequestMapping("/")
	public String toMainPage() {
		return "index";
	}
	
	@RequestMapping("loginMember")
    public String memberLogin(@RequestParam("memberId") String memberId, @RequestParam("memberPwd") String memberPwd, Model model, HttpSession session) {

        Member loginMember = memberService.loginMember(memberId, memberPwd);

        if (loginMember != null) {
            session.setAttribute("loginMember", loginMember);
            return "redirect:/";
        } else {
            model.addAttribute("msg", "로그인 실패");
            return "errorPage";
        }
	}
}
