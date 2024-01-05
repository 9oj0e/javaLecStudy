package ex14.example1;

import java.time.LocalDateTime;

// data transfer object
class JoinDTO {
    private String username; // ssar
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
}
class Member {
    private int no; // auto_increments가 없으니까 일단은 manual하게.
    private String username;
    private String password;
    private String email;
    private String createdAt; // 생성일자 넣기

    public Member(int no, JoinDTO jInstance) {
        this.no = no;
        this.username = jInstance.getUsername();
        this.password = jInstance.getPassword();
        this.email = jInstance.getEmail();
        this.createdAt = new String(String.valueOf(LocalDateTime.now()));
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("55ar", "2345", "55ar@nate.com");
        Member m1 = new Member(1, d1);
        Member m2 = new Member(2, d2);
        System.out.println();
        System.out.println(m1);
        System.out.println(m2);
    }
}
