package nextstep.blackjack.view;

import nextstep.blackjack.model.Card;
import nextstep.blackjack.model.Player;
import nextstep.fp.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String INPUT_START_NAME = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    private static final String INPUT_START_BATTING = "의 배팅 금액은?";
    private static Scanner scanner = new Scanner(System.in);


    public void startGame() {
        System.out.println(INPUT_START_NAME);
        String inputNames = scanner.nextLine();
        String[] names = inputNames.split(",");

        List<Player> players = new ArrayList<>();
        for (String name : names) {
            System.out.println(String.format("%s의 배팅 금액은?", name));
            int money = scanner.nextInt();
            players.add(new Player(name, money));
        }
    }

//    public void cardSetting(List<Player> players){
//        for(Player player : players){
//            player.addCards(Card.randomPick());
//            player.addCards(Card.randomPick());
//        }
//    }
}
