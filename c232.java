public class c232 {
    public static void main(String[] args) {
        int value = 10;
        int[][] arr = new int[value][value];
        int num = 1;
        int top = 0, bottom = value - 1, left = 0, right = value - 1;

        while (true) {
            if (left > right) break;
            for (int i = left; i <= right; i++) arr[top][i] = num++;
            top++;

            if (top > bottom) break;
            for (int i = top; i <= bottom; i++) arr[i][right] = num++;
            right--;

            if (left > right) break;
            for (int i = right; i >= left; i--) arr[bottom][i] = num++;
            bottom--;

            if (top > bottom) break;
            for (int i = bottom; i >= top; i--) arr[i][left] = num++;
            left++;
        }

        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
