package lecture2;

public class Task5 {
    public static void main(String[] args) {
        Task5Person person = new Task5Person();

        System.out.println("Name " + person.getName());
        System.out.println("Age " + person.getAge());
        System.out.println("Weight " + person.getWeight());
        System.out.println("isHungry " + person.isHungry());

        person.setName("Rex");
        person.setAge(7);
        person.setWeight(30.5);
        person.setHungry(true);

        System.out.println("Name " + person.getName());
        System.out.println("Age " + person.getAge());
        System.out.println("Weight " + person.getWeight());
        System.out.println("isHungry " + person.isHungry());
    }
}
