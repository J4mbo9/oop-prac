package org.food;

import java.util.List;

public class Menu {
    private final List<MenuItem> menuItem;
    public Menu(List<MenuItem> menuItems) {
        this.menuItem = menuItems;
    }

    public MenuItem choose(String name) {
        return this.menuItem.stream()
                .filter(menuItem1 -> menuItem1.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 메뉴 이름입니다."));

    }
}
