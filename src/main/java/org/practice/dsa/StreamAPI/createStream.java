package org.practice.dsa.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class createStream {
    public static void main(String[] args) {
        //1. From Collection

        List<String> list = Arrays.asList("Harish", "Nandini", "Abcd", "Abcd","Rajiv");
        List<String> streamlist = list.stream().map(i->i.toUpperCase()).collect(Collectors.toList());

        System.out.println(streamlist);


        List<String> h = list.stream().filter(i -> i.endsWith("h")).collect(Collectors.toList());
        System.out.println(h);

        List<String> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        
    }
}
