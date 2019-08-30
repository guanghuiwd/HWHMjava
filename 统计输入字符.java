package com.ithuawei04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT:");
        String line = sc.nextLine();

        TreeMap<Character, Integer> hm = new TreeMap<>();

        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            Integer value = hm.get(key);
            if(value == null){
                hm.put(key,1);
            }else{
                value++;
                hm.put(key,value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key : keySet) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        System.out.println(sb.toString());
    }
}
