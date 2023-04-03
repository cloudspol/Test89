import org.junit.Test;

public class Konkatenacja {

    @Test
    public void example(){

        //łączenie zmiennych
        String firstS = "Na obiad zjadłam dzisiaj ";
        String secondS = "pizze ";
        String thirdS = "z szynką";

        String tekst = firstS + secondS + thirdS;

        System.out.println(tekst);

        int liczba = 12;

        String tekstzLiczbą = tekst + liczba; //Jak dodajemy liczbę do stringa to całe to się staje stringiem



    }
}
 // ! negacja
// && koniunkcja
// != aleternatywa rozłączna
// == równoważność
// || alternatywa
