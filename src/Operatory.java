import org.junit.Test;

public class Operatory {

    @Test
    public void examples() {
        int first = 11;
        double firstDouble = 11;
        int second = 2;

        int wynikDodawania = first + second;
        int wynikOdejmowania = first - second;
        int wynikMnożenia = first * second;
        double wynikDzielenia = firstDouble / second;
        int wynikModulo = first%second; //reszta z dzielenia
        //first = first + second; //przypisanie nowej wartości dla pierwszej liczby


        System.out.println(second);
        System.out.println(second++); //wartość zostanie zwiększona o jeden, ale dopiero w kolejnej operacji (postinkrementacja)
        System.out.println(second);
        System.out.println(++second);//wartość zostanie zwiększona o jeden już w tej operacji (preinkrementacja)
        System.out.println(second);
        System.out.println(--second); //dekrementacja - zmiejszanie wartości o jeden
                                      // postdekrementacja a-- , predekrementacja --a;



    }
}
