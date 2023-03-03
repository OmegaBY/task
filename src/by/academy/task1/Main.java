package by.academy.task1;

public class Main {
    public static void main(String[] args) {


        byte age = 22;
        short finger =20;
        int height =175;
        long experience = 375;
        float weight = 62.50f ; // mush have "f" in end.
        boolean hair = true ;
        String name = "Jenny";
        Model jenny = new Model();
        registration( age,  finger ,  height,  experience,  weight,  hair,  name , jenny);


    }
    private static void registration(byte age, short finger , int height, long experience, float weight, boolean hair, String name , Model jenny){
        jenny.setAge(age);
        jenny.setFinger(finger);
        jenny.setHeight(height);
        jenny.setExperience(experience);
        jenny.setWeight(weight);
        jenny.setHair(hair);
        jenny.setName(name);

        System.out.println("Новая модель зарегестрированна!");
        System.out.println("Анкетные данные: ");
        System.out.println("Имя " + jenny.getName());
        System.out.println("Возраст " + jenny.getAge());
        System.out.println("Кол-во пальцев " + jenny.getFinger());
        System.out.println("Рост " + jenny.getHeight());
        System.out.println("Вес " + jenny.getWeight());
        System.out.println("Есть ли волосы " );
        System.out.println("Есть ли волосы, вот в чем вопрос!" );



    };
}