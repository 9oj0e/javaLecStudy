package ex08.example2;

class Repository2 { // 책임 : 데이터베이스 상호작용
    void insert(String id, String pw) throws Exception { // return 할 필요 없이 그냥 터트려버린다.
        System.out.println("레포지토리 insert 호출됨");
        if (id.length() < 4) {
            throw new RuntimeException("DB : id 길이가 4자 이상이어야 합니다.");
        }
        if (pw.length() > 50) {
            throw new RuntimeException("DB : pw 길이가 50자 미만이어야 합니다.");
        }
    }
}

class Controller2 { // 책임 : 유효성 검사
    void join(String id, String pw) throws Exception {
        System.out.println("컨트롤러 회원가입 호출됨");
        if (id.length() < 4) {
            throw new RuntimeException("Controller : id 길이가 4자 이상이어야 합니다.");
        }
        Repository2 repo = new Repository2();
        repo.insert(id, pw);
    }
}

public class TryEx04 {
    public static void main(String[] args) {
        Controller2 con = new Controller2();
        try {
            con.join("ssa", "1234");
            System.out.println("회원가입 성공");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}