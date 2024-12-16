import java.util.Random;

public class Main {
  public static final int NUM_THREADS = 4;
  public static final int ARRAY_SIZE = 20;
  
  public static void main(String[] args) {
    int[] array = new int[ARRAY_SIZE];
    Random random = new Random();
    
    // Preencher o array com valores aleatórios
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array[i] = random.nextInt(100); // Valores entre 0 e 99
    }
    
    // Criar e iniciar as threads
    Thread[] threads = new Thread[NUM_THREADS];
    for (int i = 0; i < NUM_THREADS; i++) {
      threads[i] = new Thread(new ThreadSum(i, array));
      threads[i].start();
    }
    
    // Aguardar todas as threads terminarem
    for (int i = 0; i < NUM_THREADS; i++) {
      try {
        threads[i].join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    // Imprimir o resultado final
    System.out.println("Soma total: " + ThreadSum.getSoma());
  }
}