package ex14;

import java.util.Arrays;
import java.util.List;

class User{
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void changeAge() {
        this.age = this.age - 1;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class StreamEx02 {
    public static void main(String[] args) {
        User u1 = new User(20, "홍길동");
        User u2 = new User(15, "장보고");
        User u3 = new User(30, "이순신");
        List<User> list = Arrays.asList(u1, u2, u3);
        List<User> result = list.stream()
                .map(u -> {
                    u.changeAge();
                    return u;
                })
                .toList();
        result.stream().forEach(u -> System.out.println(u.getAge()));
    }
}
