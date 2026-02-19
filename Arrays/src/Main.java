import java.lang.reflect.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Quantidade de pessoas
        int pessoas = 0;
        double media = 0;

        System.out.printf("Introduza quantas pessoas: ");
        pessoas = sc.nextInt();

        //Variavel para guardar as alturas dos utilizadores
        double[] altura = new double[pessoas];

        for(int i = 0; i < pessoas; i++){
            System.out.printf("Introduza a sua altura (em cm):");
            altura[i] = sc.nextDouble();
        }

        for(int i = 0; i < pessoas; i++){
            //Calculo para realizar a média das alturas
            media += altura[i];
        }

        //Mostrar
        System.out.println(String.format("A média das idades é: %.2f",media/pessoas));

    sc.close();

    }
}