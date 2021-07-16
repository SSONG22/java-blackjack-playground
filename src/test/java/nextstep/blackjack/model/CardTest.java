package nextstep.blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardTest {

    @Test
    void 랜덤_뽑기() {
        Card cards = Card.randomPick();
        assertThat(cards).isNotNull();
    }
}