package by.academy;

public class Cat {

    private String name ;
    private byte age ;
    {
        name= "bill";
        age =5;
        int a = 5;
        System.out.println(
                a++
        );
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
