/*
 Escreva um programa que receba a idade de várias pessoas (para teste utilize 10
pessoas). Calcule e imprima: a quantidade de pessoas com até 18 anos; quantidade de
pessoas entre 18 e 65 anos; quantidade de pessoas com mais de 65 anos.
 */

package lista_n2;
import java.util.Scanner;
public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int anos_18 = 0 , de_18_a_65 = 0 , de_65 = 0 ;
        //idades
        int quant_pessoas = 10 , idade ;
        //quantidade de pessas 
        //idade de pessas 
        int contador_idade = 1;
        //contador que me deixa doido
        while (contador_idade <= quant_pessoas){
            System.out.println();
            System.out.printf("informe a idade da pessoa ", contador_idade);
            idade = entrada.nextInt();
            System.out.println();
          
            if (idade < 0 ) {
                System.out.println();
                System.out.println("O numero deve ser positivo");
                System.out.println("tente novamente");
                contador_idade++;
            }
            
            if (idade <= 18) {
               anos_18++;
            
            }else if (idade > 18 && idade < 65){
               de_18_a_65++;
               
            }
            else if ( idade > 65) {
                de_65++;
            }
            contador_idade++;
            System.out.println();
            System.out.println("Pessoas com 18 aanos "+ anos_18);
            System.out.println("Pessoas de 18 a 65 anos de idade "+de_18_a_65);
            System.out.println("Pessoas com 65 anoos "+ de_65);
            System.out.println();
        }
    }
}