package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("BMW"));

        System.out.println(queueCarros.add(new Carro("Peugoet")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renalt")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros);

        System.out.println(queueCarros.size());
        System.out.println(queueCarros);



        //System.out.println(queueCarros.empty());

    }
}
