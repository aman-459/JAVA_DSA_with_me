package Functions;


import java.util.ArrayList;
import java.util.List;

public class PrimeINARange {
    public static boolean isPrime(int a) {
        if(a == 1) return false;
        if(a == 2) return true;
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i == 0) return false;
        }
        return true;
    }
    public static List<Integer> primeRange(int s, int l) {
        List<Integer> ans = new ArrayList<>();
        for(int i = s; i <= l; i++) {
          if(isPrime(i)) ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int start = 2;
        int end = 150;
        System.out.println(primeRange(start, end));

    }
}
