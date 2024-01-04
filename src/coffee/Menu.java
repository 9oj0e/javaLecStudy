package coffee;

import java.util.List;

public class Menu {
    private List<String> item;
    // menu는 메뉴를 composition으로 들고 있으면 된다.
    // 객체로 만들 필요가 없다.

    // 메뉴 아이템은, 데이터를 담기 위한 커스텀 자료형이라고 보면 된다.
    public Menu(List<String> item) {
        this.item = item;
    }
}
