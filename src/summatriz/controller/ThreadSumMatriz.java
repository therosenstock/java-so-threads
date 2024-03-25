package summatriz.controller;

public class ThreadSumMatriz extends Thread {
    private int[] row;
    private int rowIndex;

    public ThreadSumMatriz(int[] row, int rowIndex) {
        this.row = row;
        this.rowIndex = rowIndex;
    }

    public void run() {
        int sum = 0;
        for (int value : row) {
            sum += value;
        }
        System.out.println("Thread #"+rowIndex+ " - Soma da linha = "+ sum);
    }
}
