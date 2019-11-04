/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
~sendo que o primeiro valor tem peso 2, 
o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha.
Cada N linha a seguir contém um caso de teste com 
três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
3
6.5 4.3 6.2             5.7
5.1 4.2 8.1             6.3
8.0 9.0 10.0            9.3




 */

package uri_lab;
import java.util.Scanner;
public class x1079 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n ;
        float a , b , c , r;
        
        n = entrada.nextInt();
        for (int i = 0; i < n; i++) {
            a = entrada.nextFloat();
            b = entrada.nextFloat();
            c = entrada.nextFloat();
            
            r = ((a*2f)+(b*3f)+(c*5f))/10f;
            System.out.printf("%.1f\n",r);
        }
    }
    
}
