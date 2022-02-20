package com.lucasmarques.leetcode;

import java.util.ArrayList;
import java.util.List;

public class StaticTest {
    public List<Double> list = new ArrayList<>();

    public void populateList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new StaticTest().populateList();
    }

    public class Test {

    }

}


