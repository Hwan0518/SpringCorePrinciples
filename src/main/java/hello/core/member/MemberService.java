package hello.core.member;

public interface MemberService {

    /**
     * MemberService 인터페이스에서는
     * 회원가입, 회원조회 기능을 제공한다
     * 회원가입은 반환값이 없고, 회원조회는 Member를 반환해준다
     */
    void join(Member member);

    Member findMember(Long memberId);

}
