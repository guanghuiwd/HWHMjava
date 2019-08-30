package com.ithuawei05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerSortDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        ArrayList<Integer> array = new ArrayList<Integer>();
        String[] colors = {"♦", "♥", "♠", "♣"};

        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2"};

        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index,number+color);
                array.add(index);
                index++;

            }
        }
        hm.put(index,"BlackJoker");
        array.add(index);
        index++;
        hm.put(index,"RedJoker");
        array.add(index);

        Collections.shuffle(array);

        TreeSet<Integer> lghSet = new TreeSet<>();
        TreeSet<Integer> sjwSet = new TreeSet<>();
        TreeSet<Integer> gxSet = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();

        for (int i = 0; i < array.size(); i++) {
            Integer x = array.get(i);
            if(i >= array.size()-3){
                dpSet.add(x);
            }else if(i%3==0){
                lghSet.add(x);
            }else if(i%3==1){
                sjwSet.add(x);
            }else if(i%3==2){
                gxSet.add(x);
            }
        }
        lookPoker("LGH",lghSet,hm);
        lookPoker("SJW",sjwSet,hm);
        lookPoker("GX",gxSet,hm);
        lookPoker("DIPAI",dpSet,hm);
    }
    public static void lookPoker(String name ,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.println(name + " cards: ");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
