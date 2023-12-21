//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con n elementi e stamparlo in console.
//        Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creazione lista con N studenti
        List<Student> lista1 = new ArrayList<>();
        lista1.add(new Student("Paolo", 21));
        lista1.add(new Student("Luca", 20));
        // e prima stampa
        System.out.println("Collezione iniziale : " + lista1);

        //Aggiunti 4 elementi alla lista
        lista1.add(new Student("Luigi", 19));
        lista1.add(new Student("Piero", 16));
        lista1.add(new Student("Franco", 15));
        lista1.add(new Student("Marco", 18));
        //Nuova stampa
        System.out.println("Collezione aggiornata : " + lista1);


    }
}
