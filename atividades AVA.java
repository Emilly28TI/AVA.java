/*Questão 1 - Contagem até N
*
Crie um programa em Java que solicite ao usuário um número inteiro positivo N.

Utilizando a estrutura for, exiba todos os números iniciando em 1 até chegar ao valor informado.

Exemplo:

Se N = 5, a saída deverá apresentar:

1
2
3
4
5

Utilize obrigatoriamente:

• Scanner;
• System.out.print e/ou System.out.println;
• for.*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        int n = input.nextInt();
        for(int i=1; i<=n;i++){
        System.out.println(i);
            
        }
        
    }
}



