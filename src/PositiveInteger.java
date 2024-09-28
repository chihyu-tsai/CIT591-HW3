public class PositiveInteger {
    private int num;


    public static void main(String[] args) {
        PositiveInteger pos = new PositiveInteger(1);
        System.out.println(pos.isPerfect());
        System.out.println(pos.isAbundant());
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



}