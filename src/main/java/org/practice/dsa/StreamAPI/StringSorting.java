package org.practice.dsa.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorting {
    public static void main(String[] args) {
        String[] arr={"bhsi" ,"fsdf","ks","sdf","sdufh","abc" };
        List<String> collect = Arrays.stream(arr).sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(collect);
    }
}
