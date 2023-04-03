import org.junit.Test;

public class ZmienneiString {
    //Jeśli zmienna jest deklarowana w ciele klasy to będzie miała wartość domyślną
    int noValue;
    @Test
    public void examples(){

        byte number = 8;
        int Value = 30;
        long longNumer = 2345L;
        float floatNumer = 234.343F;
        double doubleNumer= 6672.33D;
        boolean isTrue = true;
        char letterA = 'a';
        char alsoLetterA = '\u0061';


        System.out.println(Value);
        System.out.println(noValue);
        System.out.println(alsoLetterA);


        String text = "Tekst \"Jeśli chce cudzysłów w tekście to tak trzeba zrobić\""; //Gdy nie ma przypisanej wartości to będzie null, nie ma tutaj wartości domyślnej


        //Jeśli zmienna jest deklarowana w metodzie to nie będzie miała wartości domyślnej
    }
}
