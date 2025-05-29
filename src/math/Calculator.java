package math;

public class Calculator {

    /*
    Descrição: Implemente uma função que calcule o fatorial de um número inteiro não negativo.
    Exemplo: fatorial(5) deve retornar 120.
    */
    public void factorial(long number){
        long fact=1;

        if (number <= 0){

            throw new RuntimeException("Numero negativo não permitido");

        }

        for (long i = 1; i <= number; i++) {

            fact = fact * i;

        }

        System.out.println(fact);

    }
}
