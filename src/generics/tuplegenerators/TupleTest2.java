package generics.tuplegenerators;

import generics.tuple.TwoTuple;
import inhcompos.inherit.convert.task.Amphibian;

import util.*;
import static util.Tuple.*;

public class TupleTest2 {
    static util.TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static util.TwoTuple<String, Integer> f2() {
        return tuple("hi", 47);
    }

    static util.ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(),
                "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        util.TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}