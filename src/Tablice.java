import org.junit.Test;

public class Tablice {
    //Tablica jednowymiarowa
    @Test
    public void example(){

        String[] planety = new String[8]; //deklaracja tablicy
       // String planety2[] = new String[8]; - druga możliwość deklaracji

        planety[0] = "Merkury";
        planety[1] = "Wenus";
        String firstplanet = planety[0]; //jeśli nie podamy wartości to będzie null

    }
    //Druga, krótsza wersja

    @Test
    public void example2() {

        String[] planety = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        String czwartaPlaneta = planety[3];

    }


    //Tablica dwuwymiarowa
    @Test
    public void example3(){

       int[][] srednicaPlanet = new int[8][2];
       srednicaPlanet[0][0] = 1;
       srednicaPlanet[0][1] = 4879;
       srednicaPlanet[1][0] = 2;
       srednicaPlanet[1][1] = 12104;

    }
    //Druga, krótsza wersja
    @Test
    public void example4(){

        int[][] srednicaPlanet = {{1,4879},{2,12104}};

    }
}
