package lang.print.gaps.task2;

public class JavaVariableNames {
    public static void main(String[] args) {
        int tomorrow = 0;
        int money = 10;
        int hundred = 100;
        int back = 1000;
        int underscore = 10000;
        int sharp = 100000;
        int star = 1000000;
        int badExampleOfVarName = 1000000;

        System.out.println("0 x 0 = " + tomorrow);
        System.out.println("Give me a " + money + " dollars!");
        System.out.println(hundred);
        System.out.println(back);
        System.out.println(underscore);
        System.out.println(sharp);
        System.out.println(star);
        System.out.println(badExampleOfVarName);

        AdvancedNamingConvention namingConvention = new AdvancedNamingConvention();
        namingConvention.callByNumber(sharp);
        namingConvention.callToFriend();

    }
}
