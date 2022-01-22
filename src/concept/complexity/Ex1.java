package concept.complexity;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(func1(34567));
    }

    public static int func1(int n){
        int ans = 0;
        for (int i = 0; i < n; i ++) {
            if (i % 3 == 0 || i % 5 == 0) {
                ans += i;
            }
        }
        return ans;
    }
}
