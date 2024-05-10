public class SpiralMatrix {
    public static void main(String[] args) {
        int rows = 10; ///это размеры массива
        int cols = 10; ///это размеры массива
        int[][] matrix = new int[rows][cols]; /// это я создал двумерный массив
        fillSpiral(matrix, rows, cols);/// это как я понял мы задаем переменные
        printMatrix(matrix);
    }

    public static void fillSpiral(int[][] matrix, int rows, int cols) { ///тут мы объявили метод
        int value = 1; ///тут присваеваем значения, это означает что матрица начнется с одного
        int min = 0; ///это границы слоя по горизонтали
        int max = cols - 1; ///это границы слоя по вертикали
        int minRow = 0;///это границы слоя по горизонтали
        int maxRow = rows - 1; ///это границы слоя по вертикали

        while (value <= rows * cols) {  ///это цикл для того что бы все клетки матрицы были заполнены
            for (int i = min; i <= max; i++) {
                matrix[minRow][i] = value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                matrix[i][max] = value++;
            }

            for (int i = max - 1; i >= min; i--) {
                matrix[maxRow][i] = value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                matrix[i][min] = value++;
            }

            min++; ///сужения границ внешнего слоя матрицы
            minRow++;
            max--;
            maxRow--;
        }
    }

    public static void printMatrix(int[][] matrix) { /// это мы выводим матрицу
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%5d", val);
            }
            System.out.println();
        }
    }
}