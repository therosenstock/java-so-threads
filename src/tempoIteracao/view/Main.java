package tempoIteracao.view;

import tempoIteracao.controller.ThreadTempo;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) ((Math.random()*100)+1);
        }
        Thread tpar = new ThreadTempo(2, vetor);
        tpar.start();
        Thread timpar = new ThreadTempo(1, vetor);
        timpar.start();
    }
}
