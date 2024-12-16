public class ThreadSum implements Runnable {
  private int threadId;
  private int inicio;
  private int fim;
  private static int[] array;
  private static int soma = 0;
  private static Object lock = new Object();
  
  public ThreadSum(int threadId, int[] array) {
    this.threadId = threadId;
    ThreadSum.array = array;
    int tamanhoArray = array.length;
    this.inicio = threadId * (tamanhoArray / Main.NUM_THREADS);
    this.fim = inicio + (tamanhoArray / Main.NUM_THREADS);
  }
  
  @Override
  public void run() {
    int somaLocal = 0;
    
    System.out.println("Thread " + threadId + " somando elementos de " + inicio + " a " + (fim - 1));
    for (int i = inicio; i < fim; i++) {
      somaLocal += array[i];
      System.out.println("Thread " + threadId + " somando elemento: " + array[i]);
    }
    
    synchronized (lock) {
      soma += somaLocal;
    }
  }
  
  public static int getSoma() {
    return soma;
  }
}