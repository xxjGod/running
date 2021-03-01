//package com.base.clone;
//
//public class TestShallowClone {
//
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Bird bird = new Bird();
//        bird.setName("麻雀");
//        bird.setFood(new Food("米粒1222222"));
//        Bird bird1 = (Bird) bird.clone();
//        System.out.println("bird1 hashCode:"+bird1.hashCode());
//        System.out.println("bird1 toString:"+bird1.toString());
//
//        System.out.println("bird1 food hashCode:"+bird1.getFood().hashCode());
//        System.out.println("bird1 food:"+bird1.getFood());
//        bird1.getFood().setName("小虫子");
//
//        Bird bird2 = (Bird) bird.clone();
//        System.out.println("bird2 hashCode:"+bird2.hashCode());
//        System.out.println("bird2 toString:"+bird2.toString());
//
//        System.out.println("bird2 food hashCode:"+bird2.getFood().hashCode());
//        System.out.println("bird2 food:"+bird2.getFood());
//
//    }
//}
