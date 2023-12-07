package task20;

public class Matrix<T extends Number> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    // Метод сложения матриц
    public Matrix<T> add(Matrix<T> otherMatrix) {
        T[][] result = createEmptyMatrix(matrix.length, matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = addElements(matrix[i][j], otherMatrix.getMatrix()[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    // Метод умножения матриц
    public Matrix<T> multiply(Matrix<T> otherMatrix) {
        int rowsA = matrix.length;
        int colsA = matrix[0].length;
        int colsB = otherMatrix.getMatrix()[0].length;

        T[][] result = createEmptyMatrix(rowsA, colsB);

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] = addElements(result[i][j], multiplyElements(matrix[i][k], otherMatrix.getMatrix()[k][j]));
                }
            }
        }

        return new Matrix<>(result);
    }

    // Метод вычитания матриц
    public Matrix<T> subtract(Matrix<T> otherMatrix) {
        T[][] result = createEmptyMatrix(matrix.length, matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = subtractElements(matrix[i][j], otherMatrix.getMatrix()[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    // Метод для создания пустой матрицы
    private T[][] createEmptyMatrix(int rows, int cols) {
        return (T[][]) new Number[rows][cols];
    }

    // Метод для сложения элементов матрицы
    private T addElements(T a, T b) {
        // В зависимости от конкретного типа T реализуйте сложение
        // для различных типов (Integer, Double, etc.)
        if (a instanceof Integer) {
            return (T) Integer.valueOf(((Integer) a) + ((Integer) b));
        } else if (a instanceof Double) {
            return (T) Double.valueOf(((Double) a) + ((Double) b));
        }
        // Добавьте другие случаи для необходимых типов
        return null;
    }

    // Метод для умножения элементов матрицы
    private T multiplyElements(T a, T b) {
        // Реализуйте умножение для различных типов
        if (a instanceof Integer) {
            return (T) Integer.valueOf(((Integer) a) * ((Integer) b));
        } else if (a instanceof Double) {
            return (T) Double.valueOf(((Double) a) * ((Double) b));
        }
        // Добавьте другие случаи для необходимых типов
        return null;
    }

    // Метод для вычитания элементов матрицы
    private T subtractElements(T a, T b) {
        // Реализуйте вычитание для различных типов
        if (a instanceof Integer) {
            return (T) Integer.valueOf(((Integer) a) - ((Integer) b));
        } else if (a instanceof Double) {
            return (T) Double.valueOf(((Double) a) - ((Double) b));
        }
        // Добавьте другие случаи для необходимых типов
        return null;
    }
}

