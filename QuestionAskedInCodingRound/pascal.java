public class pascal {
    public static int pascalTriangle(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        return pascalTriangle(n - 1, r - 1) + pascalTriangle(n - 1, r);
    }
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle(i, j) + " ");
            }
            System.out.println();
        }
    }
}
