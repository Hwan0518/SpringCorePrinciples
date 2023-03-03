package hello.core.member;

public class Member {
    /**
     *  member가 가지고 있는 정보
     */
    private Long id;
    private String name;
    private Grade grade;


    /**
     *  member의 생성자
     * @param id
     * @param name
     * @param grade
     */
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    /**
     * getter setter로 정보를 가져오고 설정함
     * @return
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
