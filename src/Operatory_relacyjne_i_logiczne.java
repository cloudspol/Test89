import org.junit.Test;

public class Operatory_relacyjne_i_logiczne {

    @Test
    public void example(){

        int firstZ = 2;
        int secondZ = 4;
        int thirdZ = 2;

        boolean warunek = firstZ == thirdZ;
        boolean warunek2 = 2 == 2;
        boolean warunek3 = firstZ != thirdZ;
        boolean warunek4 = firstZ < secondZ;

        boolean prawda = true;
        boolean fałsz = false;

        boolean warunek5 =!prawda; //zaprzeczenie
        boolean warunek6 = prawda && prawda; //koniunkcja, obie strony muszą być prawdą, żeby wyszła prawda
        boolean warunek7 = fałsz || prawda; //alternatywa, wystarczy, że jedna strona jest prawdziwa wtedy jest prawda





    }
}



