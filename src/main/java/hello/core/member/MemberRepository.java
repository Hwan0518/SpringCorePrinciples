package hello.core.member;

public interface MemberRepository {

    /**
     * Repository는 CRUD 기능을 해야한다
     * 따라서 create인 save기능과
     *      read인 findById 기능을 가진다
     */
    void save(Member member);

    Member findById(Long memberId);
}
