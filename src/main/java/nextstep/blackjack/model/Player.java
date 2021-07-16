package nextstep.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String playerName;
    private int money;
    private List<Card> cards = new ArrayList<>();

    public Player(String name, int money) {
        this.playerName = name;
        this.money = money;
    }

    public void addCards(Card card) {
        cards.add(card);
    }

}
