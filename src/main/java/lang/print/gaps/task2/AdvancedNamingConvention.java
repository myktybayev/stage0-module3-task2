package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;


    void callToFriend() {
        //some code
        age = 19;
        System.out.println(ADULT_AGE+" year old!");
    }

    void callByNumber(int number) {
        //some code
        phoneNumber = number;
        System.out.println("Phone number is: "+phoneNumber);
    }
}
