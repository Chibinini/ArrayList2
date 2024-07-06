import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student studente1 = new Student("Wesker", 28);
        Student studente2 = new Student ("Costanza", 30);
        Student studente3 = new Student("Marco", 44);
        Student studente4 = new Student ("Francesco", 33);
        Student studente5 = new Student("Luca", 28);
        Student studente6 = new Student ("Chiara", 35);
        Student studente7 = new Student ("Diana", 12);
        Student studente8 = new Student ("Eleonor", 11);
        Student studente9 = new Student ("Clara", 13);
        Student studente10 = new Student ("Anna", 32);
        Student studente11 = new Student ("Jane", 15);
        Student studente12 = new Student ("Maria", 35);


        ArrayList<Student> studenti = new ArrayList<Student>();
        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);
        studenti.add(studente5);
        studenti.add(studente6);
        studenti.add(studente7);
        studenti.add(studente8);
        studenti.add(studente9);
        studenti.add(studente10);
        studenti.add(studente11);
        studenti.add(studente12);

        studenti.sort(Comparator.comparingInt(Student::getAge));
        studenti.forEach(System.out::println);



    }
}

//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato