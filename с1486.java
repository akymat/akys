public class с1486 {
    public static void main(String[] args) {
        int value = 10;
        int[][] arr = new int[value][value];
        int count=1;
        // Инициализация краев массива единицами
///
        for (int i = 0; i < value; i++) {
            arr[i][0] = count++;
        }

        for (int i = 0; i < value; i++) {
            arr[i][value - 1] = count++;
        }

        for (int i = 0; i < value; i++) {
            arr[0][i] = count++;
        }

        for (int i = 0; i < value; i++) {
            arr[value - 1][i] = count++;
        }
        for (int i = 1; i < value-1; i++) {
            arr[i][0] = count++;
        }
        for (int i = 2; i < value-2; i++) {
            arr[i][0] = count++;
        }
        for (int i = 3; i < value-4; i++) {
            arr[i][0] = count++;
        }
        // Вывод массива на экран
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку после вывода каждой строки массива
        }
    }
}
