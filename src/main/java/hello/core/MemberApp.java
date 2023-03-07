package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        /**
         * AppConfig로 모든 구현체를 다루기 때문에, AppConfig를 만들어줘야 한다
         */
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        // appConfig.memberService()를 호출 >> new MemberServiceImpl을 return함
//        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
