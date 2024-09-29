public class PositiveInteger {
    private int num;


    public static void main(String[] args) {
        PositiveInteger pos = new PositiveInteger(153);
        System.out.println(pos.isPerfect());
        System.out.println(pos.isAbundant());
        System.out.println(pos.isNarcissistic());
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
// A positive integer is said to be abundant if the sum of its unique factors (aside from the number itself) is greater than the number itself.
    public boolean isAbundant(){
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
            if (sum > num) {
                return true;
            }
            }
        return false;
        }
// A positive integer is said to be narcissistic if it is equal to the sum of its own digits each raised to the power of n, where n is the total number of digits.
    public boolean isNarcissistic(){
        if (num < 10) {
            return true;
        } else {
            String str = String.valueOf(num);
            int pow = str.length();
            int len = str.length();
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += Math.pow(Character.getNumericValue(str.charAt(i)), pow);
            }
            return sum == num;
        }
    }
}