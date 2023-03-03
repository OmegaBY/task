package by.academy.task1;

import java.sql.SQLOutput;

public class Model {
    private static int divide = 3;
    private byte age;
    private short finger;
    private int height;
    private long experience;
    private float weight;
    private boolean hair;
    private String name;

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age < 0) {
            throw new RuntimeException();

        }
        this.age = age;
    }

    public short getFinger() {
        return finger;
    }

    public void setFinger(short finger) {
        this.finger = finger;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println();
        this.name = name;

    }


}

