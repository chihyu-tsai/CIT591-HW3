public class PositiveInteger {
    private int num;


    public static void main(String[] args) {
        PositiveInteger pos = new PositiveInteger(28);
        System.out.println(pos.isPerfect());
    }


    public PositiveInteger(int number) {
        num = number;
    }

    public boolean isPerfect() {
        int sum = 0;
        if (num <= 1) {
            return false;
        } else {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
                if (sum == num) {
                    return true;
                }
            }
        }
        return false;
    }
}