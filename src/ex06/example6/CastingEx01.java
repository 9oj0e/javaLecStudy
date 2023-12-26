package ex06.example6;

class Protoss{
}
class Zealot extends Protoss {
    public void attack() {
        System.out.println("Zealot attacks");
    }
}
class Dragoon extends Protoss {
    public void attack() {
        System.out.println("Dragoon attacks");
    }
}

public class CastingEx01 {
    public static void start(Protoss p){
        if(p instanceof Zealot){ // type 검사
            Zealot u = (Zealot) p;
            u.attack();
        }
        if(p instanceof Dragoon){
            Dragoon u = (Dragoon) p;
            u.attack();
        }
    }

    public static void main(String[] args) {
        start(new Zealot());
    }
}
