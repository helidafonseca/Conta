package caixa;

import java.util.Scanner;
public class Caixa {

    public static void main(String[] args) {
        String nome[] = {"Ana", "Diego", "Joana"};
        int idade[] = {21, 30, 39};
        String endereco[] = {"R. Dois, 89", "R. Pasteur, 57", "R. Natal, 82"};
        String nconta[] = {"243-1", "126-2", "133-1"};
        double sldinicial[] = {1000.00, 3500.00, 4800.00};
        
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<nome.length; i++) {
            System.out.println("Cliente " + (i+1) + "\nNome do cliente: " + nome[i]);
            System.out.println("Idade de " + nome[i] + ": " + idade[i]);
            System.out.println("Endereço de " + nome[i] + ": " + endereco[i]);
            System.out.println("Número de conta: " + nconta[i]);
            System.out.println("Saldo inicial: " + sldinicial[i] + "\n\n      ***     \n");
        }
    }
}
            