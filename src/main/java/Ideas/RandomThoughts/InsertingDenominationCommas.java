package Ideas.RandomThoughts;

public class InsertingDenominationCommas {
    public static void main(String[] args) {
        String money = "10000000";
        StringBuilder result = new StringBuilder();
        int k = 1;
        for (int i = money.length() - 1; i >= 0; i--) {
            if (k == 3) {
                result.insert(0, "," + money.charAt(i));
                k = 1;
            }
            else {
                result.insert(0, money.charAt(i));
                k++;
            }
        }
        System.out.println("result = " + result);
    }
}
