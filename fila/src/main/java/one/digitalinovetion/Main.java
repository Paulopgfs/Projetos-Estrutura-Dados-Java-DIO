package one.digitalinovetion;

public class Main {

    public static void main(String[] args) {

//        Fila minhaFila = new Fila(); //refatorado
//codigo refatorado logo baixo abaixo....
/*
        minhaFila.enqueue(new No("Primeiro"));
        minhaFila.enqueue(new No("Segundo"));
        minhaFila.enqueue(new No("Terceiro"));
        minhaFila.enqueue(new No("Quarto"));

 */
// Onde está escrito "<String" pode ser trocado por: Int, boolean, long etc...
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

//      minhaFila.enqueue(new No("Ultimo")); //refatorado
        minhaFila.enqueue("Ultimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}
