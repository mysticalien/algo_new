package pac2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        int numPlayers;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество игроков: ");
            numPlayers = scanner.nextInt();

            if (numPlayers < 1) {
                System.out.println("Некорректное количество игроков.");
                return;
            }
        }


        List<String> deck = generateDeck();
        shuffleDeck(deck);

        int cardsPerPlayer = 5;

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Игрок " + (i + 1) + " получает карты:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                String card = drawCard(deck);
                System.out.println(card);
            }
            System.out.println();
        }
    }

    private static List<String> generateDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                String card = rank + " " + suit;
                deck.add(card);
            }
        }

        return deck;
    }

    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    private static String drawCard(List<String> deck) {
        if (deck.isEmpty()) {
            return "Колода пуста";
        }

        return deck.remove(0);
    }
}

