public class ccicaiya {
    public static void main(String[] args) {
        int value =1;
        int[][] arr = new int[value][value];

        // Заполнение краевых клеток единицами
        for (int i = 0; i < value; i++) {
            arr[i][0] = 1;
            arr[i][value - 1] = 1;
            arr[0][i] = 1;
            arr[value - 1][i] = 1;
        }


        System.out.println();
    }
}
