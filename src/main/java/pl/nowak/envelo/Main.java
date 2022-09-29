package pl.nowak.envelo;

import pl.nowak.envelo.service.QuoteService;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuoteService quoteService = new QuoteService();
        Scanner scan = new Scanner(System.in);

        //Zadanie 3
        System.out.println("Wpisz next aby wyświetlić cytat ");
        String s = scan.nextLine();
        while (!s.equals("stop")) {
            if (s.equals("next")) {
                System.out.println(quoteService.nextQuote());
            }
            System.out.println("\"next\" - nastepny cytat | \"stop\" - zakończ program");
            s = scan.nextLine();
        }
    }

    //zadanie 2
    private boolean search(int[] numbers, int x) {
        return Arrays.stream(numbers).anyMatch(i -> i == x);
    }
    //zadanie 1 (Postaram sie opisać własnymi słowami , jak to rozumiem ;) )

//    1.A. W jakim celu używa się klas abstrakcyjnych, a w jakim interfejsów?
//    Klas abstrakcyjnych możemy użyć gdy mamy kilka klas które mają wspólne cechy(pola) np produkty w sklepie,
//    każdy z nich posiada nazwę i kod kreskowy (abstract class product z polami nazwa i kodkreskowy)
//    , a reszta klas np produkty spożywcze mają dodatkowe pola(np.termin ważności) ale dziedziczy po klasie produkt resztę danych(nazwa, kod kreskowy).
//    Klasy abstrakcyje mogą zawierać metody z implementacją, w razie ewentualnych zmian wystarczy edytować tylko metodę w klasie abstrakcyjnej
//    bez konieczności dokonywania zmian w klasach dziedziczących.
//    Upraszcza to strukturę programu, kod staje sie bardziej czytelny i prostrzy do zmiany.
//    Interfejsów używamy gdy chcemy dodać jakiąś funkcjonalność(metody) do naszych klas, klasy mogą implementować wiele interfejsów,
//    np klasa User może implementować interfejs SendMail który pozwala wysyłać wiadomości
//    i nasze inne klasy Admin,SuperAdmin również mogą implementowac dany interfejs.
//
//    1.B. Czym różni się tablica od listy liniowej?
//    Tablice mają określoną wielkość, dane przechowują pod konkretnymi indexami. Gdy chcemy dodań nowe elementy musimy stworzyć nową wiekszą tabele.
//    W pamieci wszytkie elementy tabeli znajdują sie w jednym miejscu +do szybkości odczytu.
//    Natomiast w listach elementy mogą zanjdować sie w różnych miejscach pamięci, daltego każdy element posiada informacje o kolejnym,
//    Listy nie mają określonej wielkości, można je dynamicznie powiększać o nowe elementy.


}
