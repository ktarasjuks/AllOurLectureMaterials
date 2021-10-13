package lecture3;

public class SampleSwitch {

    public static void main(String[] args) {

        String drink = "milk";
        switch (drink) {
            case "milk":
                System.out.println("i will drink Milk");
                break;
            case "tea":
            case "teacup":
            case "coffee":
            case "coffeee":
                System.out.println("i will drink Coffeee");
                System.out.println("i will drink Coffeee");
                System.out.println("i will drink Coffeee");
                System.out.println("i will drink Coffeee");
                break;

            default:
                System.out.println("Say what???");
        }
    }
}
