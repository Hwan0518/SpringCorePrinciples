package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;


/**
 * 프로젝트에서 역할과 구현체 선정을 전반적으로 담당하는 기능을 한다, 즉 실제 동작에 필요한 구현 객체를 생성한다고 보면 된다
 * how?
 * 생성자 주입 : 구현체에서 직접 역할을 선정하지 않고 생성자만 만들어두면, AppConfig에서 구현체를 생성하고, 구현체의 역할(다른 구현체)을 인자로 설정해주면 된다
 * >>> 따라서 역할을 바꿀때 AppConfig만 수정하면 된다!
 */
public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

}
