package exerciciosSeparados;

/* *
 * Calcula a area de um quadrado
 *
 */
import java.util.Scanner;

public class AreaCirculo {
	
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double raio, area;

      System.out.print("Informe o valor do raio(cm): ");
      raio = input.nextDouble();

      area = Math.PI * (Math.pow(raio, 2));

      System.out.printf("String: %s \nInteiro: %d \nArea do Circulo com o raio = (%.2f) : %.2fcm²", "Veio depois da string principal", (3), raio, area);  // format
      /*System.out.println("Area do circulo com o raio = (" + raio + ") : " +  area + "cm²");*/
      
      input.close();
  }
}