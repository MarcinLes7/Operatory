import org.w3c.dom.ls.LSOutput;

public class Operatory {
    public static void main(String[] args) {
        // == równy   x==3;
        // != różny   x!=3;
        // < mniejszy x<3;
        // > większy x>3;
        // <= mniejszy lub równy x<=3;
        // >== większy lub równy x >=3;

        // Operatory relacji
        boolean isHip;
        int age = 37;
        isHip = age < 25;

        // operatory jednoargumentowe
        // - zmiana znaku na przeciwny
        // ++ inkrementacja (pre lub post);
        // -- dekrementacja (pre lub post);
        int a = -1;
        a++;
        int b = --a;

        // inkrementacja przedrostkowa - najpierw zwiększy lub zmniejszy wartość o jeden,
        // dopiero potem zwróci aktualną wartość,
        // inkrementacja przyrostkowa - najpierw zostaje zwrócona aktualna wartość a potem
        // zostaje zwiększona lub zmniejszona o jeden oraz zapisana ponownie w zmiennej
        int x, y, z; // deklaracja x, y, z
        x = 42;      // x otrzymuje wartość 42
        System.out.println("x = " + x);
        y = x++;     // y otrzymuje wartość x (czyli 42), następnie x zostaje zwiększone do 43
        System.out.println("y = " + y);
        System.out.println("a teraz x ma wartość: " + x);
        z = ++x;     // x zostaje zwiększome do 44 a następnie z otrzymuje wartość x
        System.out.println("z = " + z);


        // Złożone operatory przypisania: x+=y -> x=x+y; x-=y -> x=x-y; x*=y -> x=x*y; x/=y -> x=x/y

        // Operatory logiczne
        // && iloczyn logiczny AND; jeżeli coś i coś to zrób to
        // || suma logiczna OR jeżeli coś lub coś to zrób to
        // != alternatywa rozłączna XOR
        // ! negacja

        int c = 4;
        int d = 0;
        boolean test = (c > 0) && (d < 4);
        System.out.println(test);

        // Operatory bitowe - działają na pojedynczych bitach lub każdej parze odpowiedających sobie bitów
        // & iloczyn bitowy AND
        // | suma bitowa OR
        // ^ bitowa rócznica symetryczna XOR
        // ~ negacja

        // przesunięcie bitowe >> w prawo, << w lewo, >>> w prawo bez znaku,
        // operatory na łancuchach
        // rozszerzony operator konkatenacji +
        String napis = "Ala";
        napis = napis + " ma kota";
        System.out.println(napis);
        napis += " i psa";
        System.out.println(napis);

        // ? operator warunkowy if - else;
        // wyrażenie logiczne? wyrażenie true:wyrażenie false
        // x > 5 ? y = 0 : y = 1;
        // jeżeli x jest większe od 5, to pod y podstaw 0, a jeżeli nie jest, to pod y podstaw 1

        // operatory konkatenacji + oraz += to operatory przeciążone
        int n = 10;
        String str, str1, str2, str3, str4;
        str = "napis";
        str1 = str + n;
        System.out.println(str1);
        str2 = str + n + n;
        System.out.println(str2);
        str3 = str + (n + n);
        System.out.println(str3);
        str4 = n + n + str;
        System.out.println(str4);

        int g = 5;
        g = g + 2;
        int h = 4;
        System.out.println(g / h); // otrzymujemy 1 ponieważ g i h są integerami i w domysle wynik jest int
                                    // inaczej: wynik całkowity bo operandy całkowite
                                    // ale my chcemy otrzymać wynik z liczbami po przecinku
        System.out.println(g / (double)h); // rzutujemy do double jeden z operandów - h
        // ciekawe czy to się uda z wszystkimi
        System.out.println((double)(g / h)); // tak sie tego nie da
        // tak samo jak dzielimy 3 przez 2 to dostaniemy 1, ale jak dodamy kropkę po 2 to już sugeruje,
        // że to nie jest int tylko double i wówczas mamy wynik w double
        // wystarczy, ze jeden z argumentów będzie liczbą zmiennoprzecinkowa
        System.out.println(3 / 2);
        System.out.println(3 / 2.);

        // wynik dzielenia modulo - całości nas nie interesują tylko interesuje nas reszta
        System.out.println(5 % 2); // 5 % 2 to jest w całości 4 i reszta 1
        System.out.println(5 % 3); // 5 % 3 to jest w całości 3 i reszta 2

        // operatory jednoargumentowe
        int aaa = 5;
        int bbb = -aaa;
        System.out.println(aaa);
        System.out.println(bbb);














    }
}
