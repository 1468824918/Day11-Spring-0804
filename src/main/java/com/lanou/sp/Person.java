package com.lanou.sp;

/**
 * Created by dllo on 17/11/6.
 */
public class Person {
    private String name;
    private int age;
    private float height;

    private Knife knife;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void kill(){
        knife.attack();
    }

    public void say(){
        System.out.println("大家都喜欢唱歌");
    }
    public void init(){

    }
    public void destroy(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Knife getKnife() {
        return knife;
    }

    public void setKnife(Knife knife) {
        this.knife = knife;
    }
}
