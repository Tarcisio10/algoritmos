/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;

/**
 *
 * @author tbn
 */
public class testeHacker1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            fizzBuzz(i);
            System.out.println();
        }
        

    }

    public static int fizzBuzz(int n) {
        // Write your code here
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
        return n;
    }

}
