package com.base.clone;


import java.io.*;

public class TestDeepClone {


    public static void main(String[] args) throws IOException {


        Bird bird = new Bird();
        bird.setName("麻雀");
        bird.setFood(new Food("米粒1222222"));
        Bird bird1 = copy(bird);
        System.out.println("bird1 hashCode:" + bird1.hashCode());
        System.out.println("bird1 toString:" + bird1.toString());

        System.out.println("bird1 food hashCode:" + bird1.getFood().hashCode());
        System.out.println("bird1 food:" + bird1.getFood());

        Bird bird2 = copy(bird);
        System.out.println("bird2 hashCode:" + bird2.hashCode());
        System.out.println("bird2 toString:" + bird2.toString());

        System.out.println("bird2 food hashCode:" + bird2.getFood().hashCode());
        System.out.println("bird2 food:" + bird2.getFood());


    }

    public static <T extends Serializable> T copy(T input) throws IOException {
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(input);
            oos.flush();

            byte[] bytes = baos.toByteArray();
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);
            Object result = ois.readObject();
            return (T) result;
        } catch (IOException e) {
            throw new IllegalArgumentException("Object can't be copied", e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Unable to reconstruct serialized object due to invalid class definition", e);
        } finally {
            ois.close();
            bis.close();
            oos.close();
            baos.close();
        }
    }


}
