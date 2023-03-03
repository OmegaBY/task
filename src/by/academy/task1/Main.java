package by.academy.task1;

public class Main {
    public static int divide = 3;

    public static void main(String[] args) {


        byte age = -22;
        short finger = 20;
        int height = 599;
        long experience = 375;
        float weight = 62.50f; // mush have "f" in end.
        boolean hair = true;
        String name = "Jenny";
        Model jennyOld = new Model();
        Model jenny = new Model();

//        jenny.setAge(age);
        jenny.setFinger(finger);
        jenny.setHeight(height);
        jenny.setExperience(experience);
        jenny.setWeight(weight);
        jenny.setHair(hair);
        jenny.setName(name);
        registration(jenny);


        //convert
        System.out.println(Math.max(jenny.getHeight(),experience));

    }

    private static void registration(Model jenny) {
        System.out.println("Новая модель зарегестрированна!");
        System.out.println("Анкетные данные: ");
        System.out.println("Имя " + jenny.getName());
        System.out.println("Возраст " + jenny.getAge());
        System.out.println("Кол-во пальцев " + jenny.getFinger());
        System.out.println("Рост " + jenny.getHeight());
        System.out.println("Вес " + jenny.getWeight());
        System.out.println("Есть ли волосы ");
        System.out.println("Есть ли волосы, вот в чем вопрос!");


    }

    ;
}