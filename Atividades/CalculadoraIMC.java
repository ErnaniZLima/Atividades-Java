import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraIMC{
    public static void main(String[] args) throws Exception{
        Scanner  Teclado = new Scanner(System.in);
        float altura, peso, imc;

        try{
            System.out.print("Qual e o seu peso: ");
            peso = Teclado.nextFloat();

            System.out.print("Qual e a sua altura: ");
            altura =  Teclado.nextFloat();

            imc =  peso / (altura * altura);


            //laco de if que compara em qual grau voce se encontra de imc
            if (imc >= 40){
            
                System.out.printf("Seu IMC e de: %.2f", imc);
                System.out.println("\nObesidade de grau III - (Obesidade morbida)");

            }else  if(imc <= 39.99 && imc >= 35){
                
                System.out.printf("Seu IMC e de: %.2f", imc);
                System.out.println("\nObesidade de grau II ");

            }else if(imc <= 34.99 && imc >= 30){

                System.out.printf("Seu IMC e de: %.2f", imc);
                System.out.println("\nObesidade de grau I ");

            }else if(imc <= 29.99 && imc >= 25){

                System.out.printf("Seu IMC e de: %.2f", imc);
                System.out.println("\nSobrepeso ");
            }else if(imc <= 24.99 && imc >= 18.5){

                System.out.printf("Seu IMC e de: %.2f", imc);
                System.out.println("\nPeso Normal ");

            }else if (imc <=18.49){

                System.out.printf("Seu IMC e de: %.2f", imc);
                System.out.println("\nAbaixo do peso ");
            }

            //caso ocorra erro de input vai entrar nesse catch
        }catch(InputMismatchException erro){
            System.out.printf("O numero deve ser um float, nao utilize pontos! %s", erro);
        }catch (Exception erroDesconhecido){
            System.out.printf("Erro Desconhecido: %s", erroDesconhecido);
        }
        Teclado.close();
    }
}