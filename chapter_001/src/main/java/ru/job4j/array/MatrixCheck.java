package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i != data.length; i++) {
            //внутренний цикл для первой диагонали.
            for (int j = 0; j != data.length; j++){
                if (data[i][j] != data[i+1][j+1]){
                    break;
                }
                result = false;
            }

            //внутренний цикл для второй диагонали.
            for (int j = data.length - 1; j >= 0; j = j - 1){
                if (data[i][j] != data[i+1][j-1]){
                    break;
                }
                result = false;
            }
        }
        return result;
    }
}