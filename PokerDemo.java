package com.ithuawei05;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        String[] colors = {"♦", "♥", "♠", "♣"};

        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);

            }
        }
        array.add("BlackJoker");
        array.add("RedJoker");
        Collections.shuffle(array);

        ArrayList<String> lghArray = new ArrayList<>();
        ArrayList<String> sjwArray = new ArrayList<>();
        ArrayList<String> gxArray = new ArrayList<>();
        ArrayList<String> bottomArray = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                bottomArray.add(poker);
            } else if (i % 3 == 0) {
                lghArray.add(poker);
            } else if (i % 3 == 1) {
                sjwArray.add(poker);
            } else if (i % 3 == 2) {
                gxArray.add(poker);
            }

        }
        lookPoker("LGH", lghArray);
        lookPoker("SJW", sjwArray);
        lookPoker("GX", gxArray);
        lookPoker("bottoms", bottomArray);

    }

    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.println(name + " cards: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
