package ex04.example.model;

public class User {
    public int id;
    public String name;
    public String email;

    public User(int id, String name, String email) { // 초기화 해야되니까 생성자 필요.
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
