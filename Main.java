
import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        // A üzeri b yi bulacak bi fonksiyon sordu çok bi detay yok
        System.out.println(aOverB(2, 1));
        System.out.println();
        System.out.println(isPolyndrome("kayak"));
        int[] nums = new int[]{5,4,3,2,1};
        BigDecimal a = new BigDecimal("123.456");
        System.out.println(a);
        System.out.println(findSecondBiggest(nums));
    }

    static boolean findSecondBiggest(int[] nums){
        //find biggest, and than call function without biggest
        //sorted mi nasıl bulursun?
        boolean isSortedAsc = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]<nums[i+1]) {
                isSortedAsc = true;
            }
        }
        return isSortedAsc;
    }
    static boolean isPolyndrome(String metin) {
        boolean val = true;
        for (int i = 0; i < metin.length() / 2; i++) {
            if (metin.charAt(i)!=metin.charAt(metin.length()-1-i)) {
                val = false;
            }
        }
        return val;
    }

    static int aOverB(int a, int b) {
        if (b == 0)
            return 1;
        if (a == 0)
            throw new Error("A 0 olamaz");
        int res = 1;
        for (int i = 0; i < b; i++) {
            res = res * a;
        }
        return res;
    }
}

