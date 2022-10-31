public class Inkrementacja {
    public static void main(String[] args) {
        // operatory inkrementacji i dekrementacji

        int x, y, z, zz;
        x = 42;  // x ma wartość 42
        y = x++; // wyświetla wartość x ale zaraz potem dodaje do niej jeden
                // najpierw przypisało do y wartość x, a dopierto potem zwiększyło go o jeden
                // czyli y=42 ale x =43;
        z = x;   // wyswietla wartośc x, która teraz wynosi o jeden więcej
        zz = ++x; // dodaje do x jeden i wyswietla wartość x
                // najpierw dodało do x wartość jeden a potem przypisało nową wartość do zz
                // czyli x zostało podniesione do 44 a potem przypisane do z
                // czyli x = 44 a potem po przyisaniu zz = 44

        System.out.println(y);
        System.out.println(z);
        System.out.println(zz);


        // zadanie
        int a = 0;
        int b;

        b = a++ + a++ + a++ + a++ + a++ + a++;
        System.out.println("a = " + a); // w tym przypadku a = 0, 1, 2, 3, 4, 5,
        System.out.println("b = " + b); // w tym przypadku b = 0, 0, 1, 3, 6, 10, 15,

        // inny przykład
        int aa = 0;
        aa = aa++;
        System.out.println("aa = " + aa); // najpierw zostało wykonane przypisanie a potem zwiększenie zz o jeden

        /* skrócony zapis
         int x = 7;
         int y = 7;
         int z = 7;
         to można zapisać teraz tak
         int x, y, z;
         x = y = z = 7;*/

        // inne skrócone zapisy
        // x = x + 2 to jest to samo co x+=2
        int xxx = 7;
        System.out.println(xxx);
        xxx+=2;
        System.out.println(xxx);

        // operatory relacji
        // negacja !
        // iloczyn logiczny (koniunkcja) &&
        // suma logiczna (alternatywa) ||
        // równoważność ==
        // alternatywa rozłączna XOR !=

        // rozważamy koniunkcję && i alternatywę || - są to operatory WARUNKOWE
        int e = 0;
        int f = 5;
        // sprawdźmy zapisując do zmiennej test typu boolean następujące wyrażenie
        boolean test = (e < 0);
        System.out.println(test); // tu wyjdzie false bo e jest równe 0 a nie mniejsze niż 0
                        // jeżeli miało by być true to w tescie trzeba zapisać e<=0
        // a teraz następnie
        boolean test1 = (e < 0) && (f++ > 3); // jeżeli pierwszy człon jest zły i drugi człon f=5 jest
            // dobry to całośc jest złą. Czyli false && true = false
            // tu finalnie spodziewalibyśmy się, że f wyniesie 6 ale to jest postinkrementacja więc dalej wynosi 5
            // w rzeczywistości przy && kompilator wykonuje tylk opierwszy człon i jak on wydzie false to całość
            // też będzie false, i kompilator nigdy nie wejdzie do tej drugiej części i nigdy nie podniesie f o jeden
            //
        System.out.println(test1); // wynik false
        System.out.println(f); // widzimy, że f = 5
            // chyba, że warunek pierwszy będzie true to wówczas wykona inkrementację w dryugim członie
        boolean test2 = (e <= 0) && (f++ > 3);
        System.out.println(test2); // wynik true
        System.out.println(f); // widzimy, że f = 6

        // Natomiast jeżeli chcemy, żeby kompilator wykonał oba człony niezależnie od tego jaki
        // wynik da pierwszy człon, wówczas stosujemy operatory podobne do operatorów bitowych &
        boolean test3 = (e < 0) & (f++ > 3);
        System.out.println(test3); // tu zastosowano operator bitowy i wykonmał dwa człony
        System.out.println(f); // wynik = 7 czyli podniósł o jeden

        // Operator negacji
        int age = 33;
        boolean test4 = !(age < 25); // negujemy false (wiek mniejszy od 25) czyli otrzymujemy true (wiek
                                    // większy od 25
        System.out.println(test4);




















    }
}
