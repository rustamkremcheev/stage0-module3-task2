package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    void callToFriend() {
        System.out.println("Age: " + getAge());
        System.out.println("Num: " + getPhoneNumber());
    }

    void callByNumber(int number) {
        setAge(ADULT_AGE);
        setPhoneNumber(number);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
