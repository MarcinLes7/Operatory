public class Weather {
    // przeliczanie temperatury
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " stopni Fahrenheita to ... ");
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " stopni Celsiusza\n"); // to \n daje nam dodatkowy odstęp poniżej

        float cel = 33;
        System.out.println(cel + " stopnie Celsiusza to ...");
        cel = cel / 5;
        cel = cel * 9;
        cel = cel + 32;
        System.out.println(cel + " stopni Fahrenheita");

    }
}
