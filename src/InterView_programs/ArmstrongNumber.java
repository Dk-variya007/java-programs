package InterView_programs;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, r;
        while (n > 0) {
            r = n % 10; //for reminder
            sum = sum + (r * r * r);
            n = n / 10;
        }
        return temp == sum;
    }

    public static void rangeInArms(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(124));
        System.out.println(isArmstrong(153));
        rangeInArms(1, 10);
    }
}
