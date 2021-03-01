package com.xxjsmile.bean;

public class Dog {

    private Integer age;

    public Dog dog;


    public Dog(Integer age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println(Dog.this);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(12);
        Dog dog2 = new Dog(13);
        dog1.dog = dog2;
        System.out.println(dog1.dog);
        dog2 = new Dog(14);
        dog1.dog = dog2;
        System.out.println(dog1.dog);


    }


}
