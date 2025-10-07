import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
  
        int frenteMts, lateralMts;
        float valorMetroQuadrado, valorTerreno;
        try{
            System.out.print("Digite a metragem da frente do terreno: ");
            frenteMts = teclado.nextInt();

            System.out.print("Digite a metragem da lateral do terreno: ");
            lateralMts = teclado.nextInt();

            System.out.print("Digite o valor do metro quadrado: ");
            valorMetroQuadrado = teclado.nextFloat();


            //calculando o valor do terreno
            valorTerreno = frenteMts * lateralMts * valorMetroQuadrado;


            if (frenteMts == lateralMts) { 
                //condicao para ver se é um quadrado
                //este bloco é executado se a condição (frenteMts == lateralMts) for verdadeira 
                //que o valor do terreno seja acrescido em 10%
                //valorTerreno = (valorTerreno * 0.1f) + valorTerreno;
                valorTerreno = (valorTerreno * 1.1f);
            } else {
                //se nao for quadrado da um desconto
                //este bloco é executado se a condição (frenteMts == lateralMts) for falsa 
                //valorTerreno = (valorTerreno * 0.02f) - valorTerreno;
                valorTerreno = (valorTerreno * 0.98f);
            }

        System.out.printf("O valor do terreno é: R$ %.2f reais", valorTerreno);
        }catch(InputMismatchException erro){
            System.out.printf("O valor deve ser um numero inteiro, erro: %s", erro);
        }catch(Exception ErroDesconhecido){
            System.out.printf("Erro", ErroDesconhecido);
        }
        teclado.close();
    }
}
