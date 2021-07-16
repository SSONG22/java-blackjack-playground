package nextstep.blackjack.model;

import java.util.Arrays;

public enum Card {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ACE(1),
    KING(10),
    QUEEN(10),
    JACK(10);
    private int score;

    Card(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public boolean isAce() {
        return this == ACE;
    }

    // 랜덤 뽑기
//    public static Card randomPick() {
//        Card cards = Arrays.stream(Card.values())
//                .filter(card -> card.getCnt() > 0)
//                .findAny()
//                .get();
//        cards.minus();
//        return cards;
//    }
}
