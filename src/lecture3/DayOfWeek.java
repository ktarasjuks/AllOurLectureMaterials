package lecture3;

public class DayOfWeek {

    public static void main(String[] args) {
        int dayOfWeek =5; // 1 - 7 = "Monday" 2= Tuesday; 7 = Sunday 1-7 = say what??

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Ōooops wrong day");
        }
    }
}
