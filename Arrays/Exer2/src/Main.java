import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza a quantidade de produtos: ");
        int n = sc.nextInt();

        Entidades [] produtos = new Entidades[n];

        for(int i = 0; i < n ; i++){

            System.out.println("Introduza o seu do produto: ");
            String nome = sc.next();

            System.out.println("Introduza o preço do produto: ");
            double preco = sc.nextDouble();

            produtos[i] = new Entidades(nome, preco);
        }

        double soma = 0.0;
        for(int i = 0; i < n ; i++){
            //Faço a soma dos preços de todos os produtos
            soma += produtos[i].getPreco();
        }


    System.out.println(String.format("A média dos preços é %.2f", soma/n));


    sc.close();
    }
}