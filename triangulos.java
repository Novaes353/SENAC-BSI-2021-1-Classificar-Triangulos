package senac.bsi;
import java.util.Scanner;


/** Gabriel Novaes
Escreva um algoritmo em Java que solicite ao usuário a entrada de 3 números. Considere que estes números são os lados de um triângulo.
Seu algoritmo deverá:
Indicar se "realmente" são lados de um triângulo
Se os lados compõem um triângulo, identifique qual sua classificação:
Equilátero
Isósceles
Escaleno
Sua resposta deverá ser enviada através de um PULL REQUEST a este repositório.
 */
public class triagulos {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float prim, seg, ter;
    
    System.out.print("Digite aqui o primeiro número:");
    prim=leitor.nextFloat();
    System.out.print("Digite aqui o segundo número:");
    seg=leitor.nextFloat();
    System.out.print("Digite aqui o terceiro número:");
    ter=leitor.nextFloat();
    
            if(prim==seg || prim==ter || seg==ter){
            System.out.println("O triangulo é Isosceles");
            } 
        
            if(prim==seg || seg==ter){
            System.out.println("O triangulo é equilátero");
            }
            if(prim!=seg || prim!=ter || seg!=ter){
            System.out.println("O triangulo é escaleno");
    
    
    
    }
}
}