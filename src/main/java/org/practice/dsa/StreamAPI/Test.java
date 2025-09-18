package org.practice.dsa.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(60);
        arrayList.add(60);
        System.out.println(arrayList);

        long count = arrayList.stream().distinct().count();
        System.out.println(count);

        List<Integer> collect = arrayList.stream().filter(i -> i>30 ).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = arrayList.stream().filter(i -> i * i == 40).collect(Collectors.toList());
        System.out.println(collect1);


      Function<Integer , Integer> function=x->x*2;
        System.out.println(function.apply(20));




    }
}
