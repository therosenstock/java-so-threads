package tempoIteracao.controller;

public class ThreadTempo extends Thread{
    private int value;
    private int [] vetor;

    public ThreadTempo(int value, int[] vetor){
        this.value = value;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        long startTime = System.nanoTime();
        String tipo = "";
        if(value % 2 == 0){
            tipo = "Par";
            for(int i = 0; i < vetor.length; i++){
                //apenas percorre
            }
        } else{
            tipo = "Impar";
            for(int valor: vetor){
                //apenas percorre
            }
        }
        long endTime = System.nanoTime();

        double seconds = (double) (endTime - startTime);
        System.out.println("Tempo para percorrer "+tipo+": "+seconds+" nanosegundos.");
    }
}
