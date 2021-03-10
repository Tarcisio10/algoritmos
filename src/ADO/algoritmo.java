
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tbn
 */
public class algoritmo {

    public static void main(String[] args) {
        opcoes();
    }

    public static void opcoes() {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Selecione o Algoritmo de Substituicao Desejado");
        System.out.println("1 - FIFO");
        System.out.println("2 - LRU");
        System.out.println("3 - Segunda Chance");
        System.out.println("4 - Otimo");

        num = input.nextInt();

        switch (num) {
            case 1:
                FIFO();
                break;

            case 2:
                LRU();
                break;

            case 3:
                SegundaChance();
                break;

            case 4:
                Otimo();
                break;

        }

    }
}