package exemplo.controller;
//extends Thread
//parametros run. interrupt,
public class ThreadId extends Thread{
    private int idThread;
    public ThreadId(int idThread){
        this.idThread = idThread;
    }
    @Override
    public void run(){
        //só executa aqui dentro
        System.out.println(idThread);
    }
}
